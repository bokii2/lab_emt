function Categories({ props }) {
  return (
    <div>
      <div className={"table-responsive"}>
        <div className={"table table-striped"}>
          <table>
            <thead>
              <tr>
                <th scope={"col"}>Name</th>
              </tr>
            </thead>
            <tbody>
              {props.map((item) => {
                return (
                  <tr>
                    <td>{item.name}</td>
                  </tr>
                );
              })}
            </tbody>
          </table>
        </div>
      </div>
    </div>
  );
}

export default Categories;
