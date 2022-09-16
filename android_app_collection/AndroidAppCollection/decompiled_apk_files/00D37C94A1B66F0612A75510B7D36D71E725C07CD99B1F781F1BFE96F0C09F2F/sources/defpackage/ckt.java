package defpackage;
/* compiled from: PG */
/* renamed from: ckt  reason: default package */
/* loaded from: classes2.dex */
public final class ckt implements cku, cvi {
    private static final jk a = cvk.b(20, new cmg(1));
    private final cvl b = cvl.a();
    private cku c;
    private boolean d;
    private boolean e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ckt d(cku ckuVar) {
        ckt cktVar = (ckt) a.a();
        hy.N(cktVar);
        cktVar.e = false;
        cktVar.d = true;
        cktVar.c = ckuVar;
        return cktVar;
    }

    @Override // defpackage.cku
    public final int a() {
        return this.c.a();
    }

    @Override // defpackage.cku
    public final Class b() {
        return this.c.b();
    }

    @Override // defpackage.cku
    public final Object c() {
        return this.c.c();
    }

    @Override // defpackage.cku
    public final synchronized void e() {
        this.b.b();
        this.e = true;
        if (!this.d) {
            this.c.e();
            this.c = null;
            a.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f() {
        this.b.b();
        if (this.d) {
            this.d = false;
            if (!this.e) {
                return;
            }
            e();
            return;
        }
        throw new IllegalStateException("Already unlocked");
    }

    @Override // defpackage.cvi
    public final cvl jX() {
        return this.b;
    }
}
