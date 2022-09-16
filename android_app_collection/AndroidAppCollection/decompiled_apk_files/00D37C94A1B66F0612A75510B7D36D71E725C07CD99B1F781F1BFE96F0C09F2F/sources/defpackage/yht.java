package defpackage;
/* compiled from: PG */
/* renamed from: yht  reason: default package */
/* loaded from: classes4.dex */
final class yht implements afwa {
    final /* synthetic */ yhw a;

    public yht(yhw yhwVar) {
        this.a = yhwVar;
    }

    @Override // defpackage.afwa
    public final void a() {
        this.a.dismiss();
    }

    @Override // defpackage.afwa
    public final void b() {
        this.a.d.show();
        this.a.aH();
    }

    @Override // defpackage.afwa
    public final void c(Exception exc) {
        this.a.aj.e(exc);
        this.a.dismiss();
    }
}
