package com.facebook.react.bridge;

import c.d.l.a.a;
@a
/* loaded from: classes.dex */
public interface JavaJSExecutor {

    /* loaded from: classes.dex */
    public interface Factory {
        JavaJSExecutor create();
    }

    /* loaded from: classes.dex */
    public static class ProxyExecutorException extends Exception {
        public ProxyExecutorException(Throwable th) {
            super(th);
        }
    }

    void close();

    @a
    String executeJSCall(String str, String str2);

    @a
    void loadApplicationScript(String str);

    @a
    void setGlobalVariable(String str, String str2);
}
