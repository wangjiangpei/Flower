package com.dscs.flower.p

import android.os.Handler
import android.os.Message
import java.io.Serializable

/**
 *
 */

object MainActivityAsC {
    class Category(var categoryName: String, var urls: List<String>):Serializable
    class DataBean(var courseName: String,
                   var categorys: List<Category>):Serializable

    fun getData(handler: Handler?) {
            Thread(Runnable {
                getDatas(handler)}).start()
    }

    fun getDatas(handler: Handler?) {
        val list = ArrayList<DataBean>()
        var urls0101 = ArrayList<String>()
        urls0101.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_2.jpg")
        urls0101.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_3.jpg")
        urls0101.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_4.jpg")
        urls0101.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_5.jpg")
        urls0101.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_6.jpg")
        urls0101.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_7.jpg")
        urls0101.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_8.jpg")
        urls0101.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_9.jpg")
        urls0101.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_10.jpg")
        urls0101.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_11.jpg")
        urls0101.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_12.jpg")
        urls0101.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_13.jpg")
        urls0101.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_14.jpg")
        urls0101.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_15.jpg")
        urls0101.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_16.jpg")
        urls0101.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_17.jpg")
        urls0101.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_18.jpg")
        urls0101.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_19.jpg")
        urls0101.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_20.jpg")

        urls0101.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_102.jpg")
        urls0101.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_103.jpg")
        urls0101.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_104.jpg")
        urls0101.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_105.jpg")
        urls0101.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_106.jpg")
        urls0101.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_107.jpg")
        urls0101.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_108.jpg")
        urls0101.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_109.jpg")
        var urls0102 = ArrayList<String>()
        urls0102.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_21.jpg")
        urls0102.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_22.jpg")
        urls0102.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_23.jpg")
        urls0102.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_24.jpg")
        urls0102.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_25.jpg")
        urls0102.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_26.jpg")
        urls0102.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_27.jpg")
        urls0102.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_28.jpg")
        urls0102.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_29.jpg")

        urls0102.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_131.jpg")
        urls0102.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_132.jpg")


        var urls0103 = ArrayList<String>()
        urls0103.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_30.jpg")
        urls0103.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_31.jpg")
        urls0103.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_32.jpg")
        urls0103.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_33.jpg")
        urls0103.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_34.jpg")
        urls0103.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_35.jpg")
        urls0103.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_36.jpg")
        urls0103.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_37.jpg")
        urls0103.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_38.jpg")
        urls0103.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_39.jpg")
        urls0103.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_40.jpg")
        urls0103.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_41.jpg")
        urls0103.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_42.jpg")
        urls0103.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_43.jpg")

        urls0103.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_122.jpg")
        urls0103.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_123.jpg")
        urls0103.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_124.jpg")
        urls0103.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_125.jpg")
        var urls0104 = ArrayList<String>()
        urls0104.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_44.jpg")
        urls0104.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_45.jpg")
        urls0104.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_46.jpg")
        urls0104.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_47.jpg")
        urls0104.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_48.jpg")
        urls0104.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_49.jpg")
        urls0104.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_50.jpg")
        urls0104.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_51.jpg")
        urls0104.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_52.jpg")
        urls0104.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_53.jpg")

        urls0104.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_110.jpg")
        urls0104.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_111.jpg")
        urls0104.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_112.jpg")
        urls0104.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_113.jpg")
        urls0104.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_114.jpg")
        urls0104.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_115.jpg")
        urls0104.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_116.jpg")
        urls0104.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_117.jpg")
        var urls0105 = ArrayList<String>()
        urls0105.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_54.jpg")
        urls0105.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_55.jpg")
        urls0105.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_56.jpg")
        urls0105.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_57.jpg")

        urls0105.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_129.jpg")
        urls0105.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_130.jpg")

        var urls0106 = ArrayList<String>()
        urls0106.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_58.jpg")
        urls0106.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_59.jpg")
        urls0106.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_60.jpg")
        var urls0107 = ArrayList<String>()
        urls0107.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_61.jpg")
        urls0107.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_62.jpg")
        urls0107.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_63.jpg")
        var urls0108 = ArrayList<String>()
        urls0108.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_64.jpg")
        urls0108.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_65.jpg")
        urls0108.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_66.jpg")

        urls0108.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_126.jpg")
        urls0108.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_127.jpg")
        urls0108.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_128.jpg")

        var urls0109 = ArrayList<String>()
        urls0109.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_67.jpg")
        urls0109.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_68.jpg")

        urls0109.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_134.jpg")

        var urls0110 = ArrayList<String>()
        urls0110.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_69.jpg")

        urls0110.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_118.jpg")
        urls0110.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_119.jpg")
        urls0110.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_120.jpg")
        urls0110.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_121.jpg")


        var urls0111 = ArrayList<String>()
        urls0111.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_70.jpg")
        urls0111.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_71.jpg")
        urls0111.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_72.jpg")
        urls0111.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_73.jpg")

        urls0111.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_135.jpg")
        var urls0112 = ArrayList<String>()
        urls0112.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_133.jpg")
        var urls0201 = ArrayList<String>()
        urls0201.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_74.jpg")
        urls0201.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_75.jpg")
        urls0201.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_76.jpg")
        urls0201.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_77.jpg")
        urls0201.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_78.jpg")
        urls0201.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_79.jpg")
        urls0201.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_70.jpg")
        urls0201.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_81.jpg")
        urls0201.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_82.jpg")

        urls0201.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_143.jpg")
        urls0201.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_144.jpg")
        urls0201.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_145.jpg")
        urls0201.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_146.jpg")
        urls0201.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_147.jpg")
        urls0201.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_148.jpg")

        var urls0301 = ArrayList<String>()
        urls0301.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_82.jpg")
        urls0301.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_83.jpg")
        urls0301.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_84.jpg")
        urls0301.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_85.jpg")
        urls0301.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_86.jpg")
        urls0301.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_87.jpg")
        urls0301.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_88.jpg")
        urls0201.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_89.jpg")
        var urls0302 = ArrayList<String>()
        urls0302.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_90.jpg")
        urls0302.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_91.jpg")
        urls0302.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_92.jpg")

        urls0302.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_136.jpg")
        urls0302.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_137.jpg")
        urls0302.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_138.jpg")
        urls0302.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_139.jpg")
        urls0302.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_140.jpg")
        urls0302.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_141.jpg")
        urls0302.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_142.jpg")

        var urls0401 = ArrayList<String>()
        urls0401.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_93.jpg")
        urls0401.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_94.jpg")
        urls0401.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_95.jpg")

        urls0401.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_149.jpg")
        urls0401.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_150.jpg")

        var urls0501 = ArrayList<String>()
        urls0501.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_96.jpg")
        urls0501.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_97.jpg")
        urls0501.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_98.jpg")

        urls0501.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_151.jpg")
        var urls0601 = ArrayList<String>()
        urls0501.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_99.jpg")
        urls0501.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_100.jpg")
        urls0501.add("http://image71.360doc.cn/DownloadImg/2014/04/0515/40527490_101.jpg")
        var data01 = ArrayList<Category>()
        data01.add(Category("石莲花属", urls0101))
        data01.add(Category("莲花掌属", urls0102))
        data01.add(Category("青锁龙属", urls0103))
        data01.add(Category("景天属", urls0104))
        data01.add(Category("伽蓝菜属", urls0105))
        data01.add(Category("长生草属", urls0106))
        data01.add(Category("银波锦属", urls0107))
        data01.add(Category("厚叶草属", urls0108))
        data01.add(Category("瓦松属", urls0109))
        data01.add(Category("风车草属", urls0110))
        data01.add(Category("其他属种", urls0111))
        data01.add(Category("仙女杯属", urls0110))
        var data02 = ArrayList<Category>()
        data02.add(Category("番杏科无属类", urls0201))
        var data03 = ArrayList<Category>()
        data03.add(Category("百合科无属类属", urls0301))
        data03.add(Category("百合科十二卷属", urls0302))
        var data04 = ArrayList<Category>()
        data04.add(Category("菊科无属类", urls0401))
        var data05 = ArrayList<Category>()
        data05.add(Category("马齿苋科无属类", urls0501))
        var data06 = ArrayList<Category>()
        data06.add(Category("其他科属无属类", urls0601))
        list.add(DataBean("景天科", data01))
        list.add(DataBean("番杏科", data02))
        list.add(DataBean("百合科", data03))
        list.add(DataBean("菊科", data04))
        list.add(DataBean("马齿苋科", data05))
        list.add(DataBean("他科属", data06))
        var msg: Message = Message();
        msg.what = 1
        msg.obj = list
        handler!!.sendMessage(msg)
    }

}
