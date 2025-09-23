// divide.js
function divide() {
  let a = parseFloat(document.getElementById("a").value);
  let b = parseFloat(document.getElementById("b").value);

  if (isNaN(a) || isNaN(b)) {
    document.getElementById("result").innerText = "Vui lòng nhập số hợp lệ!";
    return;
  }

  if (b === 0) {
    document.getElementById("result").innerText = "Không thể chia cho 0!";
    return;
  }

  let result = a / b;
  document.getElementById("result").innerText = "Kết quả chia: " + result;
}