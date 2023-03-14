FROM node:latest
RUN mkdir -p /src/app
WORKDIR /src/app
COPY GitHub-file/.github/workflows .
RUN gradle install
EXPOSE 3003
CMD [ "gradle", "start" ]
