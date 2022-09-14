package com.airbnb.android.react.maps;

import com.facebook.react.uimanager.ao;
import java.util.HashMap;
/* compiled from: SizeReportingShadowNode.java */
/* loaded from: classes.dex */
public class l extends com.facebook.react.uimanager.g {
    @Override // com.facebook.react.uimanager.x
    public void onCollectExtraUpdates(ao aoVar) {
        super.onCollectExtraUpdates(aoVar);
        HashMap hashMap = new HashMap();
        hashMap.put("width", Float.valueOf(getLayoutWidth()));
        hashMap.put("height", Float.valueOf(getLayoutHeight()));
        aoVar.a(getReactTag(), hashMap);
    }
}
