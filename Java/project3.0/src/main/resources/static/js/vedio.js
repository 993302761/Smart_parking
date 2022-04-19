
    function getMedia() {
		console.log("开启摄像头1")
        let constraints = {
            video: {width: 600, height: 300},
            audio: true
        };
        //获得video摄像头区域
        let video = document.getElementById("video");
        //这里介绍新的方法，返回一个 Promise对象
        // 这个Promise对象返回成功后的回调函数带一个 MediaStream 对象作为其参数
        // then()是Promise对象里的方法
        // then()方法是异步执行，当then()前的方法执行完后再执行then()内部的程序
        // 避免数据没有获取到
        let promise = navigator.mediaDevices.getUserMedia(constraints);
        promise.then(function (MediaStream) {
            video.srcObject = MediaStream;
            video.play();
        });
    }
    function getMedia1() {
        let constraints = {
            video: {width: 600, height: 300},
            audio: true
        };
        //获得video摄像头区域
        let video1 = document.getElementById("video1");
        //这里介绍新的方法，返回一个 Promise对象
        // 这个Promise对象返回成功后的回调函数带一个 MediaStream 对象作为其参数
        // then()是Promise对象里的方法
        // then()方法是异步执行，当then()前的方法执行完后再执行then()内部的程序
        // 避免数据没有获取到
        let promise = navigator.mediaDevices.getUserMedia(constraints);
        promise.then(function (MediaStream) {
            video1.srcObject = MediaStream;
            video1.play();
        });
    }
	
	function getMedia2() {
		console.log("开启摄像头1")
	    let constraints = {
	        video: {width: 600, height: 300},
	        audio: true
	    };
	    //获得video摄像头区域
	    let video = document.getElementById("video2");
	    //这里介绍新的方法，返回一个 Promise对象
	    // 这个Promise对象返回成功后的回调函数带一个 MediaStream 对象作为其参数
	    // then()是Promise对象里的方法
	    // then()方法是异步执行，当then()前的方法执行完后再执行then()内部的程序
	    // 避免数据没有获取到
	    let promise = navigator.mediaDevices.getUserMedia(constraints);
	    promise.then(function (MediaStream) {
	        video.srcObject = MediaStream;
	        video.play();
	    });
	}
	function getMedia3() {
		console.log("开启摄像头1")
	    let constraints = {
	        video: {width: 600, height: 300},
	        audio: true
	    };
	    //获得video摄像头区域
	    let video = document.getElementById("video3");
	    //这里介绍新的方法，返回一个 Promise对象
	    // 这个Promise对象返回成功后的回调函数带一个 MediaStream 对象作为其参数
	    // then()是Promise对象里的方法
	    // then()方法是异步执行，当then()前的方法执行完后再执行then()内部的程序
	    // 避免数据没有获取到
	    let promise = navigator.mediaDevices.getUserMedia(constraints);
	    promise.then(function (MediaStream) {
	        video.srcObject = MediaStream;
	        video.play();
	    });
	}
	function getMedia4() {
		console.log("开启摄像头1")
	    let constraints = {
	        video: {width: 600, height: 300},
	        audio: true
	    };
	    //获得video摄像头区域
	    let video = document.getElementById("video4");
	    //这里介绍新的方法，返回一个 Promise对象
	    // 这个Promise对象返回成功后的回调函数带一个 MediaStream 对象作为其参数
	    // then()是Promise对象里的方法
	    // then()方法是异步执行，当then()前的方法执行完后再执行then()内部的程序
	    // 避免数据没有获取到
	    let promise = navigator.mediaDevices.getUserMedia(constraints);
	    promise.then(function (MediaStream) {
	        video.srcObject = MediaStream;
	        video.play();
	    });
	}
	function getMedia5() {
		console.log("开启摄像头1")
	    let constraints = {
	        video: {width: 600, height: 300},
	        audio: true
	    };
	    //获得video摄像头区域
	    let video = document.getElementById("video5");
	    //这里介绍新的方法，返回一个 Promise对象
	    // 这个Promise对象返回成功后的回调函数带一个 MediaStream 对象作为其参数
	    // then()是Promise对象里的方法
	    // then()方法是异步执行，当then()前的方法执行完后再执行then()内部的程序
	    // 避免数据没有获取到
	    let promise = navigator.mediaDevices.getUserMedia(constraints);
	    promise.then(function (MediaStream) {
	        video.srcObject = MediaStream;
	        video.play();
	    });
	}
	function getMedia6() {
		console.log("开启摄像头1")
	    let constraints = {
	        video: {width: 600, height: 300},
	        audio: true
	    };
	    //获得video摄像头区域
	    let video = document.getElementById("video6");
	    //这里介绍新的方法，返回一个 Promise对象
	    // 这个Promise对象返回成功后的回调函数带一个 MediaStream 对象作为其参数
	    // then()是Promise对象里的方法
	    // then()方法是异步执行，当then()前的方法执行完后再执行then()内部的程序
	    // 避免数据没有获取到
	    let promise = navigator.mediaDevices.getUserMedia(constraints);
	    promise.then(function (MediaStream) {
	        video.srcObject = MediaStream;
	        video.play();
	    });
	}
	function getMedia7() {
		console.log("开启摄像头1")
	    let constraints = {
	        video: {width: 600, height: 300},
	        audio: true
	    };
	    //获得video摄像头区域
	    let video = document.getElementById("video7");
	    //这里介绍新的方法，返回一个 Promise对象
	    // 这个Promise对象返回成功后的回调函数带一个 MediaStream 对象作为其参数
	    // then()是Promise对象里的方法
	    // then()方法是异步执行，当then()前的方法执行完后再执行then()内部的程序
	    // 避免数据没有获取到
	    let promise = navigator.mediaDevices.getUserMedia(constraints);
	    promise.then(function (MediaStream) {
	        video.srcObject = MediaStream;
	        video.play();
	    });
	}
	function getMedia8() {
		console.log("开启摄像头1")
	    let constraints = {
	        video: {width: 600, height: 300},
	        audio: true
	    };
	    //获得video摄像头区域
	    let video = document.getElementById("video8");
	    //这里介绍新的方法，返回一个 Promise对象
	    // 这个Promise对象返回成功后的回调函数带一个 MediaStream 对象作为其参数
	    // then()是Promise对象里的方法
	    // then()方法是异步执行，当then()前的方法执行完后再执行then()内部的程序
	    // 避免数据没有获取到
	    let promise = navigator.mediaDevices.getUserMedia(constraints);
	    promise.then(function (MediaStream) {
	        video.srcObject = MediaStream;
	        video.play();
	    });
	}
	function getMediaMain(){
		getMedia();
		getMedia1();
		getMedia2();
		getMedia3();
		getMedia4();
		getMedia5();
		getMedia6();
		getMedia7();
		getMedia8();
	}
	
	