package defpackage;
/* compiled from: PG */
/* renamed from: ctsw  reason: default package */
/* loaded from: classes5.dex */
public final class ctsw {
    private static ctsw a;

    private ctsw() {
    }

    public static synchronized void a() {
        synchronized (ctsw.class) {
            if (a == null) {
                a = new ctsw();
            }
        }
    }
}
