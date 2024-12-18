// logika.js

function showTarikTunai() {
    const content = document.getElementById('content');
    content.innerHTML = `
        <h2>Tarik Tunai</h2>
        <form id="tarikForm">
            <label for="tarikJumlah">Masukkan jumlah:</label>
            <input type="number" id="tarikJumlah" name="tarikJumlah" required>
            <button type="button" onclick="tarikTunai()">Tarik</button>
        </form>
        <div id="tarikResult"></div>
    `;
}

function showSetorTunai() {
    const content = document.getElementById('content');
    content.innerHTML = `
        <h2>Setor Tunai</h2>
        <form id="setorForm">
            <label for="setorJumlah">Masukkan jumlah:</label>
            <input type="number" id="setorJumlah" name="setorJumlah" required>
            <button type="button" onclick="setorTunai()">Setor</button>
        </form>
        <div id="setorResult"></div>
    `;
}

function cekSaldo() {
    const content = document.getElementById('content');
    content.innerHTML = `
        <h2>Cek Saldo</h2>
        <p>Saldo Anda saat ini: ${saldo}</p>
    `;
}

function keluar() {
    const content = document.getElementById('content');
    content.innerHTML = `
        <h2>Terima kasih sudah menggunakan aplikasi ini!</h2>
    `;
}

let saldo = 0;

function tarikTunai() {
    const tarikJumlah = document.getElementById('tarikJumlah').value;
    const result = document.getElementById('tarikResult');
    if (saldo >= tarikJumlah) {
        saldo -= parseInt(tarikJumlah);
        result.innerHTML = `<p>Anda berhasil menarik ${tarikJumlah}. Saldo tersisa: ${saldo}</p>`;
    } else {
        result.innerHTML = `<p>Saldo tidak cukup untuk menarik ${tarikJumlah}</p>`;
    }
}

function setorTunai() {
    const setorJumlah = document.getElementById('setorJumlah').value;
    const result = document.getElementById('setorResult');
    if (setorJumlah > 0) {
        saldo += parseInt(setorJumlah);
        result.innerHTML = `<p>Anda berhasil menyetor ${setorJumlah}. Saldo sekarang: ${saldo}</p>`;
    } else {
        result.innerHTML = `<p>Jumlah setor tidak valid</p>`;
    }
}
