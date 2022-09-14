package com.facebook.react.views.text;

import com.facebook.react.uimanager.x;
import org.spongycastle.i18n.TextBundle;
/* compiled from: ReactRawTextShadowNode.java */
/* loaded from: classes.dex */
public class f extends x {

    /* renamed from: a  reason: collision with root package name */
    private String f4084a = null;

    @Override // com.facebook.react.uimanager.x, com.facebook.react.uimanager.w
    public boolean isVirtual() {
        return true;
    }

    @com.facebook.react.uimanager.a.a(a = TextBundle.TEXT_ENTRY)
    public void setText(String str) {
        this.f4084a = str;
        markUpdated();
    }

    public String a() {
        return this.f4084a;
    }
}
