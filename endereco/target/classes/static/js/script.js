document.addEventListener('DOMContentLoaded', function() {
    fetch('/api/users')
        .then(response => response.json())
        .then(users => {
            const userTableBody = document.querySelector('#userTable tbody');
            users.forEach(user => {
                const row = document.createElement('tr');

                const nameCell = document.createElement('td');
                nameCell.textContent = user.nome;
                row.appendChild(nameCell);

                const addressCell = document.createElement('td');
                addressCell.textContent = user.endereco;
                row.appendChild(addressCell);

                userTableBody.appendChild(row);
            });
        })
        .catch(error => console.error('Erro ao carregar usuários:', error));
});
