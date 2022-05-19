import Head from 'next/head'
import Link from 'next/link'
import Layout from '../../components/layout'
import { getServerSideProps } from '../../lib/data'

export async function getServerProps() {
  const allServerData = getServerSideProps()
  return {
    props: {
      allServerData
    }
  }
}


export default function FirstPost({allServerData}) {
    return (
      <Layout>
        <Head>
          <title>First Post</title>
        </Head>
        <h1>First Post</h1>
        <section>
            {allServerData}
      </section>
        <h2>
          <Link href="/">
            <a>Back to home</a>
          </Link>
        </h2>
      </Layout>
    )
  }