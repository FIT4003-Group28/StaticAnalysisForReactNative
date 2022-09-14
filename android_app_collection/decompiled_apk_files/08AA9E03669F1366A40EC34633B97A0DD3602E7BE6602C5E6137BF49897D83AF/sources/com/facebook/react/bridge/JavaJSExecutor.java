package com.facebook.react.bridge;
@com.facebook.k.a.a
/* loaded from: classes.dex */
public interface JavaJSExecutor {

    /* loaded from: classes.dex */
    public static class a extends Exception {
    }

    void a();

    @com.facebook.k.a.a
    String executeJSCall(String str, String str2);

    @com.facebook.k.a.a
    void loadApplicationScript(String str);

    @com.facebook.k.a.a
    void setGlobalVariable(String str, String str2);
}
