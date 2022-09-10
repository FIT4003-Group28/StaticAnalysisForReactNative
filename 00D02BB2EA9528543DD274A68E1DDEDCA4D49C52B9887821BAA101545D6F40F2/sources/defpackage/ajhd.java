package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajhd  reason: default package */
/* loaded from: classes2.dex */
public final class ajhd implements dyzq {
    final /* synthetic */ btlu a;
    final /* synthetic */ ajhm b;

    public ajhd(ajhm ajhmVar, btlu btluVar) {
        this.b = ajhmVar;
        this.a = btluVar;
    }

    @Override // defpackage.dyzq
    public final void a(dzak dzakVar) {
        this.b.aA.b(dzakVar);
        this.b.au = 1;
    }

    @Override // defpackage.dyzq
    public final void b() {
        ajhm ajhmVar = this.b;
        ajhmVar.au = 2;
        ajhmVar.i(this.a);
    }

    @Override // defpackage.dyzq
    public final void c(Throwable th) {
        if (th instanceof ahwp) {
            this.b.au = 3;
        } else {
            this.b.au = 4;
        }
        this.b.i(this.a);
    }
}
