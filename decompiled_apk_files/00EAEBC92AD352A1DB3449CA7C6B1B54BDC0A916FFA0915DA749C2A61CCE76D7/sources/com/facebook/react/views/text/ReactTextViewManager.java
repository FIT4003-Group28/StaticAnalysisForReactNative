package com.facebook.react.views.text;

import android.content.Context;
import android.text.Spannable;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.uimanager.c0;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.k0;
import java.util.Map;
@com.facebook.react.d0.a.a(name = ReactTextViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactTextViewManager extends ReactTextAnchorViewManager<r, p> implements com.facebook.react.uimanager.f {
    public static final String REACT_CLASS = "RCTText";

    private int getTextBreakStrategy(String str) {
        if (str != null) {
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1924829944) {
                if (hashCode == -902286926 && str.equals("simple")) {
                    c2 = 0;
                }
            } else if (str.equals("balanced")) {
                c2 = 1;
            }
            if (c2 == 0) {
                return 0;
            }
            if (c2 == 1) {
                return 2;
            }
        }
        return 1;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance  reason: collision with other method in class */
    public p mo328createShadowNodeInstance() {
        return new p();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public r mo345createViewInstance(k0 k0Var) {
        return new r(k0Var);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return com.facebook.react.common.f.a("topTextLayout", com.facebook.react.common.f.a("registrationName", "onTextLayout"), "topInlineViewLayout", com.facebook.react.common.f.a("registrationName", "onInlineViewLayout"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<p> getShadowNodeClass() {
        return p.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f2, com.facebook.yoga.n nVar, float f3, com.facebook.yoga.n nVar2) {
        return a0.a(context, readableMap, readableMap2, f2, nVar, f3, nVar2);
    }

    @Override // com.facebook.react.uimanager.f
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(r rVar) {
        super.onAfterUpdateTransaction((ReactTextViewManager) rVar);
        rVar.d();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void setPadding(r rVar, int i, int i2, int i3, int i4) {
        rVar.setPadding(i, i2, i3, i4);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(r rVar, Object obj) {
        q qVar = (q) obj;
        if (qVar.a()) {
            y.a(qVar.j(), rVar);
        }
        rVar.setText(qVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(r rVar, c0 c0Var, j0 j0Var) {
        ReadableNativeMap state = j0Var.getState();
        ReadableNativeMap mo210getMap = state.mo210getMap("attributedString");
        ReadableNativeMap mo210getMap2 = state.mo210getMap("paragraphAttributes");
        Spannable b2 = a0.b(rVar.getContext(), mo210getMap);
        rVar.setSpanned(b2);
        w wVar = new w(c0Var);
        return new q(b2, state.hasKey("mostRecentEventCount") ? state.getInt("mostRecentEventCount") : -1, false, wVar.c(), getTextBreakStrategy(mo210getMap2.getString("textBreakStrategy")), 0);
    }
}
