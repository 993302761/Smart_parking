window.onload= function () {


    var chartDom = document.getElementById('pm');
    var myChart = echarts.init(chartDom);
    var option;

    option = {
        title: {
            text: '车位流量表'
        },
        tooltip: {
            trigger: 'axis'
        },
        legend: {
            data: ['APP预定用户', '游客', '总计']
        },
        grid: {
            left: '3%',
            right: '4%',
            bottom: '3%',
            containLabel: true
        },
        toolbox: {
            feature: {
                saveAsImage: {}
            }
        },
        xAxis: {
            type: 'category',
            boundaryGap: false,
            data: ['1月', '2月', '3月', '4月', '5月', '6月', '7月', '8月', '9月', '10月', '11月', '12月']
        },
        yAxis: {
            type: 'value'
        },
        series: [
            {
                name: 'APP预定用户',
                type: 'line',
                stack: '总量',
                data: [120, 132, 101,123,213,132,156,157,184,135,211,124]
            },
            {
                name: '游客',
                type: 'line',
                stack: '总量',
                data: [220, 182, 191,158,136,156,127,151,131,125,164,157]
            },
            {
                name: '总计',
                type: 'line',
                stack: '总量',
                data: [340, 350, 300,290,310,333,321,324,300,321,305,299]
            }
        ]
    };

    myChart.setOption(option);
}


