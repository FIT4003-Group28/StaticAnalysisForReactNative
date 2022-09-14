package defpackage;
/* compiled from: PG */
/* renamed from: avoo  reason: default package */
/* loaded from: classes3.dex */
public final class avoo {
    private static final dcqe b = dcqe.c("avoo");
    public final avon a;

    public avoo(avon avonVar) {
        this.a = avonVar;
    }

    public static void b(String str, Exception exc) {
        bvoo.h("Unexpected exception from the native infrastructure in %s: %s", str, exc);
    }

    public final double a(dlug dlugVar, double d, double d2) {
        try {
            return this.a.a(dlugVar.bS(), d, d2);
        } catch (Exception e) {
            throw new avlo(drtc.UNKNOWN, e);
        }
    }
}
