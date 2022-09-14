package com.facebook.react.views.text;
/* loaded from: classes.dex */
public class k extends com.facebook.react.uimanager.b0 {
    private String z = null;

    public String R() {
        return this.z;
    }

    @com.facebook.react.uimanager.e1.a(name = "text")
    public void setText(String str) {
        this.z = str;
        M();
    }

    @Override // com.facebook.react.uimanager.b0
    public String toString() {
        return m() + " [text: " + this.z + "]";
    }

    @Override // com.facebook.react.uimanager.b0, com.facebook.react.uimanager.a0
    public boolean y() {
        return true;
    }
}
