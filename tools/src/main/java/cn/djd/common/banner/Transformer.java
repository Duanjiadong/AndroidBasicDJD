package cn.djd.common.banner;

import android.support.v4.view.ViewPager.PageTransformer;

import cn.djd.common.banner.transformer.AccordionTransformer;
import cn.djd.common.banner.transformer.BackgroundToForegroundTransformer;
import cn.djd.common.banner.transformer.CubeInTransformer;
import cn.djd.common.banner.transformer.CubeOutTransformer;
import cn.djd.common.banner.transformer.DefaultTransformer;
import cn.djd.common.banner.transformer.DepthPageTransformer;
import cn.djd.common.banner.transformer.FlipVerticalTransformer;
import cn.djd.common.banner.transformer.ForegroundToBackgroundTransformer;
import cn.djd.common.banner.transformer.RotateDownTransformer;
import cn.djd.common.banner.transformer.RotateUpTransformer;
import cn.djd.common.banner.transformer.ScaleInOutTransformer;
import cn.djd.common.banner.transformer.StackTransformer;
import cn.djd.common.banner.transformer.TabletTransformer;
import cn.djd.common.banner.transformer.ZoomInTransformer;
import cn.djd.common.banner.transformer.ZoomOutSlideTransformer;
import cn.djd.common.banner.transformer.ZoomOutTranformer;
import cn.djd.common.banner.transformer.FlipHorizontalTransformer;

public class Transformer {
    public static Class<? extends PageTransformer> Default = DefaultTransformer.class;
    public static Class<? extends PageTransformer> Accordion = AccordionTransformer.class;
    public static Class<? extends PageTransformer> BackgroundToForeground = BackgroundToForegroundTransformer.class;
    public static Class<? extends PageTransformer> ForegroundToBackground = ForegroundToBackgroundTransformer.class;
    public static Class<? extends PageTransformer> CubeIn = CubeInTransformer.class;
    public static Class<? extends PageTransformer> CubeOut = CubeOutTransformer.class;
    public static Class<? extends PageTransformer> DepthPage = DepthPageTransformer.class;
    public static Class<? extends PageTransformer> FlipHorizontal = FlipHorizontalTransformer.class;
    public static Class<? extends PageTransformer> FlipVertical = FlipVerticalTransformer.class;
    public static Class<? extends PageTransformer> RotateDown = RotateDownTransformer.class;
    public static Class<? extends PageTransformer> RotateUp = RotateUpTransformer.class;
    public static Class<? extends PageTransformer> ScaleInOut = ScaleInOutTransformer.class;
    public static Class<? extends PageTransformer> Stack = StackTransformer.class;
    public static Class<? extends PageTransformer> Tablet = TabletTransformer.class;
    public static Class<? extends PageTransformer> ZoomIn = ZoomInTransformer.class;
    public static Class<? extends PageTransformer> ZoomOut = ZoomOutTranformer.class;
    public static Class<? extends PageTransformer> ZoomOutSlide = ZoomOutSlideTransformer.class;
}
