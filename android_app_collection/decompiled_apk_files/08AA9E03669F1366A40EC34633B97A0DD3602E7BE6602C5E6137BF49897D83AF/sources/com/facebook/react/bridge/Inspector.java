package com.facebook.react.bridge;
@com.facebook.k.a.a
/* loaded from: classes.dex */
public class Inspector {

    @com.facebook.k.a.a
    /* loaded from: classes.dex */
    public static class LocalConnection {
        public native void disconnect();

        public native void sendMessage(String str);
    }

    @com.facebook.k.a.a
    /* loaded from: classes.dex */
    public interface RemoteConnection {
    }

    private native LocalConnection connectNative(int i, RemoteConnection remoteConnection);

    private native Page[] getPagesNative();

    private static native Inspector instance();

    static {
        ai.a();
    }

    @com.facebook.k.a.a
    /* loaded from: classes.dex */
    public static class Page {

        /* renamed from: a  reason: collision with root package name */
        private final int f3201a;

        /* renamed from: b  reason: collision with root package name */
        private final String f3202b;

        public String toString() {
            return "Page{mId=" + this.f3201a + ", mTitle='" + this.f3202b + "'}";
        }

        @com.facebook.k.a.a
        private Page(int i, String str) {
            this.f3201a = i;
            this.f3202b = str;
        }
    }
}
