FROM mongo

# create.js will be executed when the mongo instance runs

COPY ./create.js ./docker-entrypoint-initdb.d

EXPOSE 27017
EXPOSE 28017