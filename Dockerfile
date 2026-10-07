FROM ubuntu:22.04

WORKDIR /klm/app

RUN apt-get update && appt-get install -y  openjdk-17-jdk  wget  unzip && rm -rf /var/lib/apt/lists/*

USER root

CMD ["bash"]