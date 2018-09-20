package com.quiz.rodrigues.quizlife;


public class Questoes {

    public String nQuestoes[] = {

            "Ao redigir uma ata de reunião realizada na empresa em que trabalha , um secretário executivo precisou   traduzir para o inglês o trecho “todas as  informações necessárias para realização de determinada ação”  e a palavra “orçamento”\n" +
                    "\n" +
                    "Esse trecho sublinhado e a palavra “orçamento” pode ser adequado  e respectivamente traduzido  por:\n",
            "A função gerencial  faz  parte da rotina  secretarial ,ainda que na hierarquia os secretários assumam a função de assessoria.\n" +
                    "Assinale a opção correta que exemplifica, prioritariamente, a atribuição da função de assessoramento.\n", "A postura profissional  e expressa pelo conjuntos competências e habilidades técnicas e humanas que compõem o perfil do profissional.Tal postura   deve ser adequada ao ambiente organizacional, em consonância com o código da organização, e baseada na cordialidade e responsabilidade. O secretário executivo deve desenvolver habilidades de escuta (de si mesmo e do outro) para a tomada de decisões sensatas e, ainda, exercitar a capacidade de suportar as pressões do ambiente, tanto interno quanto externo.\n" +
            "Assinale a opção que indica competências e habilidades relacionadas à postura descrita.\n","Planejamento da  organização  são palavras chaves  quando se deseja realizar um evento. Conforme as características peculiares que apresentam, cada evento requer a aplicação de uma técnica  específica.Em reuniões  brainstorming é uma técnica\n" +
            "utilizada para:\n","A respeito  do  que dispõem as normas que regem a redação de correspondências oficiais\n" +
            "de acordo  com o Manual da Presidência da República (Brasil,2002),assinale opção correta \n","De acordo com o Decreto  nº 70.274/1972, que aprova as normas do cerimonial  público e a ordem geral de precedência ,a bandeira nacional","De acordo com o Decreto  nº 70.274/1972, que aprova as normas do cerimonial  público e a ordem geral de precedência ,a bandeira nacional\n"

    };

    private String nEscolhas[][] = {

            {"Budget e Order","Scope e Receipt","Briefing e Budget","Briefing e Broad Band","Benchmark e Business Plan"},
            {"Utilizar técnicas  secretariais,sendo  essas  os   aspectos mais importantes","Planejar  ,organizar  e controlar  a infraestrutura secretarial em diversos níveis gerenciais","Desenvolver ações comando como atividade sem fim","Operacionalizar arquivos, agenda, follow-up, reuniões e eventos","Implantar processos gerenciais inovadores na organização"},
            {"Flexibilidade, resiliência e racionalidade.", "Etiqueta ,inteligência emocional e resiliência","Marketing pessoal ,resiliência e flexibilidade ","Etiqueta,inteligência emocional  e flexibilidade ","Marketing pessoal, inteligência emocional e flexibilidade"},
            {"Esclarecer determinado tema ou tomar alguma decisão.","Defender um  ponto de vista,a partir da discussão  entre dois oradores.","Estimular a  livre produção de  ideias sobre determinado assunto","Debater assuntos de grande interesse de grupos, de classes  profissionais,de representantes  de países, regiões ou estados.","Apresentar temas informativo(geral,técnico ou científico) de autoridade de determinado  assunto para  um grande  número de pessoas."},
            {"Em comunicações  oficiais,o nome e o cargo da autoridade que as expede devem constar abaixo do local da assinatura,inclusive nas assinadas pelo Presidente da República.","Em ofícios,além do nome e do cargo  da pessoa a quem é dirigida a comunicação ,deve-se incluir também o endereço.","Em ofícios, o local e a data em foi assinado devem ser abreviado e alinhado à  margem esquerda do papel ","Em comunicação endereçadas a autoridades de hierarquia superior,incluindo-se o Presidente da República, o fecho Atenciosamente deve ser empregado .","Em comunicação  oficiais, a inteligibilidade do texto e a marca de pessoalidades são requisitos técnicos e formais."},
            {"Pode ser usada em todas as manifestações do sentimento patriótico dos brasileiros,oficiais ou públicas ,mas não nas de caráter partículas.","Pode ser hasteada durante o dia,mas não à noite e ,normalmente ,faz-se o hasteamento às 8 horas e o arriamento às 18 horas.","Ocupa lugar de honra entre outras bandeiras,devendo ocupar posição central ou  mais próxima do  centro e à esquerda deste.","É a primeira a atingir o  topo  e a última a dele descer,quando hasteada ou arriada simultaneamente com outras bandeiras.","É hasteada às segundas-feiras no topo  de  um mastro especial,construído na  Praça dos Três Poderes, em Brasília-DF"},
            {"A é necessária a presença de pessoal técnico qualificado para preparar a infraestrutura e operar com recursos tecnológicos.","É necessário emitir convites impressos, como em qualquer outro tipo de evento","É desnecessário providenciar a decoração do espaço, já que o evento ocorre a distância.","É desnecessário utilizar o check-list, pois se trata de evento com programação a distância.","É desnecessária a reserva de local específico para o público e conferencistas, já que o evento ocorre a distância."},



    };

    private String nRespostaCorreta[] = {"Briefing e Budget","Planejar  ,organizar  e controlar  a infraestrutura secretarial em diversos níveis gerenciais"," Etiqueta ,inteligência emocional e resiliência","Estimular a  livre produção de  ideias sobre determinado assunto","Em ofícios,além do nome e do cargo  da pessoa a quem é dirigida a comunicação ,deve-se incluir também o endereço.","É a primeira a atingir o  topo  e a última a dele descer,quando hasteada ou arriada simultaneamente com outras bandeiras.","A é necessária a presença de pessoal técnico qualificado para preparar a infraestrutura e operar com recursos tecnológicos."};



    public String getQuestao(int a) {
        String questao = nQuestoes[a];
        return questao;
    }

    public String getEscolha1(int a) {
        String escolha = nEscolhas[a][0];
        return escolha;
    }

    public String getEscolha2(int a) {
        String escolha = nEscolhas[a][1];
        return escolha;
    }

    public String getEscolha3(int a) {
        String escolha = nEscolhas[a][2];
        return escolha;
    }

    public String getEscolha4(int a) {
        String escolha = nEscolhas[a][3];
        return escolha;
    }

    public String getRespostaCorreta(int a) {
        String respostaCorreta = nRespostaCorreta[a];
        return respostaCorreta;

    }
}