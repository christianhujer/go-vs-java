package customer

type Customer struct {
	@Json(name="salu", omitempty=true)
	@Bson(name="salu")
	Salutation string `json: "salu" omitempty, bson: "salu"`
	Firstname string
	Lastname string
}

// @description
// @statusCode ...
func main() {
	customer := &Customer{
		salutation: "Mrs",
		firstname: "Arpana",
		lastname: "Patil",
	}
}

func tprintf() {
}
