package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kyx  reason: default package */
/* loaded from: classes3.dex */
public final class kyx implements ajql {
    final /* synthetic */ kyz a;

    public kyx(kyz kyzVar) {
        this.a = kyzVar;
    }

    @Override // defpackage.ymy
    public final void d(int i, int i2) {
        this.a.b.postDelayed(new kyw(this, i, this), 300L);
    }

    @Override // defpackage.ymy
    public final void e(int i, int i2) {
    }

    @Override // defpackage.ajql
    public final void pi() {
    }

    @Override // defpackage.ymy
    public final void pj(int i, int i2) {
    }

    @Override // defpackage.ymy
    public final void pk(int i, int i2) {
        this.a.b.postDelayed(new kyw(this, i, this, 1), 300L);
    }
}
