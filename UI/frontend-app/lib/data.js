
  
  // This gets called on every request
  export async function getServerSideProps() {
    // Fetch data from external API
    const res = await fetch(`{process.env.apiUrl}/api/data`)
    const data = await res.json()
  
    // Pass data to the page via props
    return { props: { data } }
  }
  
