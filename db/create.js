db = new Mongo().getDB("admin");
db.createUser({
    user: "admin",
    pwd: "password",
    roles: [
      {
        role: "clusterAdmin",
        db: "admin"
      }
    ]
  });
db = new Mongo().getDB("data");
db.createCollection("userData")
db.userData.insert({"name":"John", "phone": 2390932493})
db.userData.insert({"name":"kenny","phone":3892637832})