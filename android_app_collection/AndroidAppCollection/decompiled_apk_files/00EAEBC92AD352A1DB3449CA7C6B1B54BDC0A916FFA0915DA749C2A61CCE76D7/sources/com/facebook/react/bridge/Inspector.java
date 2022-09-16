package com.facebook.react.bridge;

import c.d.l.a.a;
import com.facebook.jni.HybridData;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
@a
/* loaded from: classes.dex */
public class Inspector {
    private final HybridData mHybridData;

    @a
    /* loaded from: classes.dex */
    public static class LocalConnection {
        private final HybridData mHybridData;

        private LocalConnection(HybridData hybridData) {
            this.mHybridData = hybridData;
        }

        public native void disconnect();

        public native void sendMessage(String str);
    }

    @a
    /* loaded from: classes.dex */
    public static class Page {
        private final int mId;
        private final String mTitle;
        private final String mVM;

        @a
        private Page(int i, String str, String str2) {
            this.mId = i;
            this.mTitle = str;
            this.mVM = str2;
        }

        public int getId() {
            return this.mId;
        }

        public String getTitle() {
            return this.mTitle;
        }

        public String getVM() {
            return this.mVM;
        }

        public String toString() {
            return "Page{mId=" + this.mId + ", mTitle='" + this.mTitle + "'}";
        }
    }

    @a
    /* loaded from: classes.dex */
    public interface RemoteConnection {
        @a
        void onDisconnect();

        @a
        void onMessage(String str);
    }

    static {
        ReactBridge.staticInit();
    }

    private Inspector(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public static LocalConnection connect(int i, RemoteConnection remoteConnection) {
        try {
            return instance().connectNative(i, remoteConnection);
        } catch (UnsatisfiedLinkError e2) {
            c.d.d.e.a.b("ReactNative", "Inspector doesn't work in open source yet", e2);
            throw new RuntimeException(e2);
        }
    }

    private native LocalConnection connectNative(int i, RemoteConnection remoteConnection);

    public static List<Page> getPages() {
        try {
            return Arrays.asList(instance().getPagesNative());
        } catch (UnsatisfiedLinkError e2) {
            c.d.d.e.a.b("ReactNative", "Inspector doesn't work in open source yet", e2);
            return Collections.emptyList();
        }
    }

    private native Page[] getPagesNative();

    private static native Inspector instance();
}
