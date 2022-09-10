package defpackage;
/* compiled from: PG */
/* renamed from: bgto  reason: default package */
/* loaded from: classes3.dex */
final class bgto implements bnij {
    final /* synthetic */ bgtp a;

    public bgto(bgtp bgtpVar) {
        this.a = bgtpVar;
    }

    @Override // defpackage.bnij
    public final void a(String str, boolean z) {
        if (str.isEmpty() || !z) {
            return;
        }
        bgtp bgtpVar = this.a;
        bgqt g = bgqt.g(bgtpVar.c, bgtpVar.d);
        this.a.b.l(bege.DIRECTORY, g);
        g.d.j(str);
    }
}
