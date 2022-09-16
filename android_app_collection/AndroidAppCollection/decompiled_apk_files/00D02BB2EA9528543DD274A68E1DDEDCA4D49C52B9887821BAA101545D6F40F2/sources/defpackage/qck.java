package defpackage;
/* compiled from: PG */
/* renamed from: qck  reason: default package */
/* loaded from: classes7.dex */
public abstract class qck {
    public abstract qcl a();

    public abstract void b(boolean z);

    public final qcl c() {
        qcl a = a();
        if (a.a() == null && a.b() == null && a.c() == null && !a.d()) {
            throw new IllegalStateException();
        }
        return a;
    }

    @dzsi
    public final qcl d() {
        try {
            return c();
        } catch (IllegalStateException unused) {
            return null;
        }
    }
}
