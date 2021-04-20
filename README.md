# api_rest_concierge
Projeto de gerenciamento de encomendas para condominios  

# Ambiente Docker EC2 

*para teste de connexão deve ser verificar o AllowPublicKeyRetrieval como true. 

docker run -p 3306:3306 --name mysql_j -e MYSQL_ROOT_PASSWORD=MrJack@System -d mysql:latest


#Create maquina na EC2 - Docker container 

Exemplo:

ssh -i "EC2-Development.pem" ubuntu@ec2-00-000-00-00.us-east-2.compute.amazonaws.com




