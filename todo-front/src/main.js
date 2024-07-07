import 'element-plus/dist/index.css'
import { createApp } from 'vue'
import App from './App.vue'
import ElementPlus from 'element-plus'


const app = createApp(App)//这里一开始没写对，导致根本渲染不出来ElementPlus的组件

app.use(ElementPlus);
app.mount('#app');