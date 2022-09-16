package defpackage;
/* compiled from: PG */
/* renamed from: yiy  reason: default package */
/* loaded from: classes4.dex */
public final class yiy implements yiw {
    private volatile yiw a;

    private yiy(yiw yiwVar) {
        this.a = yiwVar;
    }

    public static yiy c(yiw yiwVar) {
        return new yiy(yiwVar);
    }

    @Override // defpackage.yiw
    public final void a(Object obj, Exception exc) {
        if (this.a == null) {
            return;
        }
        try {
            this.a.a(obj, exc);
        } catch (NullPointerException unused) {
        }
    }

    @Override // defpackage.yiw
    public final void b(Object obj, Object obj2) {
        if (this.a == null) {
            return;
        }
        try {
            this.a.b(obj, obj2);
        } catch (NullPointerException unused) {
        }
    }

    public final void d() {
        this.a = null;
    }

    public final boolean e() {
        return this.a == null;
    }
}
