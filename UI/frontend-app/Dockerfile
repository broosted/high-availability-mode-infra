FROM node:alpine

RUN mkdir -p /usr/src/app
ENV PORT 3000

WORKDIR /usr/src/app

COPY package.json /usr/src/app
COPY . ./

# building the app
RUN npm i
RUN npm run build

# Running the app
CMD [ "npm", "start" ]