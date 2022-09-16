package defpackage;
/* compiled from: PG */
/* renamed from: ulp  reason: default package */
/* loaded from: classes4.dex */
final class ulp extends qn {
    final /* synthetic */ amuk a;
    final /* synthetic */ ulr b;

    public ulp(ulr ulrVar, amuk amukVar) {
        this.b = ulrVar;
        this.a = amukVar;
    }

    @Override // defpackage.qn
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.qn
    public final int b() {
        return this.b.f.size();
    }

    @Override // defpackage.qn
    public final boolean c(int i, int i2) {
        return ((umd) this.b.f.get(i)).equals(this.a.get(i2));
    }

    @Override // defpackage.qn
    public final boolean d(int i, int i2) {
        return c(i, i2);
    }
}
