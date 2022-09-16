package defpackage;
/* compiled from: PG */
/* renamed from: azyh  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class azyh {
    public static final int a = Runtime.getRuntime().availableProcessors();

    public static final String a(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
