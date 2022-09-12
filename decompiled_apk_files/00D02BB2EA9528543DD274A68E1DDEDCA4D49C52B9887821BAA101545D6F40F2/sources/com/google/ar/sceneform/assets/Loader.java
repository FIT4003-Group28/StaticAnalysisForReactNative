package com.google.ar.sceneform.assets;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class Loader extends dbdo {
    public static String a;

    static {
        a();
    }

    public static boolean a() {
        try {
            String str = a;
            if (str == null) {
                str = "ar-runtime-jni";
            }
            System.loadLibrary(str);
            return true;
        } catch (UnsatisfiedLinkError unused) {
            return false;
        }
    }

    @Override // defpackage.dbdo
    public final /* bridge */ /* synthetic */ String toString() {
        throw null;
    }
}
