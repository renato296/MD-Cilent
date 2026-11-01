# MD Client — Forge 1.8.9

Projeto-base de um cliente Minecraft 1.8.9 com Forge, em Java 8.

## Requisitos
- JDK 8 (não use Java 17/21 para este projeto antigo)
- Gradle wrapper ou Gradle 2.7
- Internet na primeira compilação para baixar ForgeGradle/dependências

## Compilar
Na pasta do projeto, execute:

```bash
gradle setupDecompWorkspace
gradle build
```

No Windows, se tiver Gradle instalado, use `gradle.bat setupDecompWorkspace` e depois `gradle.bat build`.
O JAR será criado em `build/libs/MDClient-1.0.0.jar`.

Para abrir o ambiente de desenvolvimento:
```bash
gradle runClient
```

## O que já está implementado
- Mod Forge identificado como MD Client.
- Botão **MD Mods** no menu de pausa, logo abaixo de Desconectar.
- Menu próprio com lista de módulos e ativação/desativação.
- Atalhos configuráveis pelo código (tecla Right Shift abre o menu).
- Módulos funcionais básicos: FPS, coordenadas, relógio, direção, ping,
  toggle sprint, toggle sneak e fullbright.
- Os outros módulos aparecem na lista e podem ser ativados/desativados;
  alguns são pontos de extensão/placeholder e ainda precisam de implementação própria.

## Observações
Este é um projeto inicial, não um cliente comercial pronto. O módulo FPS Boost oferece
ajustes simples de renderização, mas não substitui otimizações profundas como OptiFine.
Teste em uma instalação separada do Minecraft. Não inclui bibliotecas ou mods de terceiros.
