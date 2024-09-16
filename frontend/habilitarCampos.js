// Função para habilitar campos
function habilitarCampos() {
    document.getElementById('mes').value = '';
    document.getElementById('ano').value = '';
    document.getElementById('produto').value = '';
    document.getElementById('cosif').value = '';
    document.getElementById('valor').value = '';
    document.getElementById('descricao').value = '';
    document.getElementById('mes').focus();
}

// Função para configurar eventos após o DOM estar carregado
window.onload = function () {
    // Verifica se o formulário existe antes de atribuir o evento
    const form = document.getElementById('formMovimentoManual');
    if (form) {
        form.onsubmit = function (event) {
            event.preventDefault();
            const mes = document.getElementById('mes').value;
            const ano = document.getElementById('ano').value;
            const produto = document.getElementById('produto').value;
            const cosif = document.getElementById('cosif').value;
            const valor = document.getElementById('valor').value;
            const descricao = document.getElementById('descricao').value;

            // Exemplo de adição ao grid
            const grid = document.getElementById('grid');
            const item = document.createElement('div');
            item.textContent = `${mes} - ${ano} - ${produto} - ${cosif} - ${valor} - ${descricao}`;
            grid.appendChild(item);
        };
    } else {
        console.error('Formulário "formMovimentoManual" não encontrado.');
    }
};
