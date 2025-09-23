// plus.js
function plus() {
  let a = parseFloat(document.getElementById("a").value);
  let b = parseFloat(document.getElementById("b").value);

  if (isNaN(a) || isNaN(b)) {
    document.getElementById("result").innerText = "Vui lòng nhập số hợp lệ!";
    return;
  }

  let result = a + b;
  document.getElementById("result").innerText = "Kết quả cộng: " + result;
}