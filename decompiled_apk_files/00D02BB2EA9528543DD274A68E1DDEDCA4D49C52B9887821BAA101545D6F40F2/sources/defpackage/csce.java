package defpackage;
/* compiled from: PG */
/* renamed from: csce  reason: default package */
/* loaded from: classes5.dex */
public final class csce extends cscg {
    public boolean a;

    public csce(float f) {
        super(80.0f, f);
        this.a = true;
    }

    private static final float i(float f) {
        float f2 = f % 6.2831855f;
        return f2 < 0.0f ? f2 + 6.2831855f : f2;
    }

    @Override // defpackage.cscf
    public final void a(float f) {
        super.a(i(f));
    }

    @Override // defpackage.cscf
    public final void b(float f, float f2) {
        super.b(f, f2);
        this.c = i(this.c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cscf
    public final float c() {
        float c = super.c();
        if (Math.abs(c) < 0.3926991f) {
            return c;
        }
        float f = 6.2831855f + c;
        return Math.abs(f) < 0.3926991f ? f : this.a ? c < -0.3926991f ? f : c : c > 0.3926991f ? c - 6.2831855f : c;
    }

    public final void d(float f) {
        this.c = i(this.c + f);
        this.b = i(this.b + f);
    }
}
