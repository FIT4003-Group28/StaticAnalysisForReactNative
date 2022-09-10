package defpackage;
/* compiled from: PG */
/* renamed from: crhx  reason: default package */
/* loaded from: classes5.dex */
public final class crhx {
    public final int a;
    @dzsi
    public final amvh b;
    public final int c;

    private crhx(int i, int i2) {
        this.c = i2;
        this.a = i;
        this.b = null;
    }

    private crhx(amvh amvhVar) {
        dbsk.s(amvhVar);
        this.b = amvhVar;
        this.a = -1;
        this.c = -1;
    }

    public static crhx a(amvh amvhVar) {
        return new crhx(amvhVar);
    }

    public static crhx b(int i, int i2) {
        boolean z = false;
        if (i >= 0 && i < i2) {
            z = true;
        }
        dbsk.a(z);
        return new crhx(i, i2);
    }

    public final boolean c() {
        return this.b != null;
    }

    public final boolean d() {
        return this.b == null;
    }
}
