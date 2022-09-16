package com.BaiduMaps;

import com.facebook.react.uimanager.ao;
import java.util.HashMap;
/* compiled from: BaiduSizeReportingShadowNode.java */
/* loaded from: classes.dex */
public class f extends com.facebook.react.uimanager.g {
    @Override // com.facebook.react.uimanager.x
    public void onCollectExtraUpdates(ao aoVar) {
        super.onCollectExtraUpdates(aoVar);
        HashMap hashMap = new HashMap();
        hashMap.put("width", Float.valueOf(getLayoutWidth()));
        hashMap.put("height", Float.valueOf(getLayoutHeight()));
        aoVar.a(getReactTag(), hashMap);
    }
}
