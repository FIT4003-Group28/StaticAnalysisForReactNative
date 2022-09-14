package com.facebook.react.fabric;

import com.facebook.react.views.image.ReactImageManager;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.slider.ReactSliderManager;
import com.facebook.react.views.text.ReactRawTextManager;
import com.facebook.react.views.text.ReactTextViewManager;
import com.facebook.react.views.view.ReactViewManager;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, String> f5475a = new HashMap();

    static {
        f5475a.put("View", ReactViewManager.REACT_CLASS);
        f5475a.put("Image", ReactImageManager.REACT_CLASS);
        f5475a.put("ScrollView", ReactScrollViewManager.REACT_CLASS);
        f5475a.put("Slider", ReactSliderManager.REACT_CLASS);
        f5475a.put("ModalHostView", ReactModalHostManager.REACT_CLASS);
        f5475a.put("Paragraph", ReactTextViewManager.REACT_CLASS);
        f5475a.put("Text", "RCText");
        f5475a.put("RawText", ReactRawTextManager.REACT_CLASS);
        f5475a.put("ActivityIndicatorView", ReactProgressBarViewManager.REACT_CLASS);
        f5475a.put("ShimmeringView", "RKShimmeringView");
        f5475a.put("TemplateView", "RCTTemplateView");
        f5475a.put("AxialGradientView", "RCTAxialGradientView");
        f5475a.put("Video", "RCTVideo");
        f5475a.put("StickerInputView", "RCTStickerInputView");
        f5475a.put("Map", "RCTMap");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str) {
        String str2 = f5475a.get(str);
        return str2 != null ? str2 : str;
    }
}
