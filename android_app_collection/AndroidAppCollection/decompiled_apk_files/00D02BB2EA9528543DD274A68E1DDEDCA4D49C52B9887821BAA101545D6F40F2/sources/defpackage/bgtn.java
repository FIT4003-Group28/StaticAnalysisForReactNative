package defpackage;
/* compiled from: PG */
/* renamed from: bgtn  reason: default package */
/* loaded from: classes3.dex */
final class bgtn implements bgsg {
    final /* synthetic */ bgtp a;

    public bgtn(bgtp bgtpVar) {
        this.a = bgtpVar;
    }

    @Override // defpackage.bgsg
    public final void a(qjc qjcVar, dhnl dhnlVar) {
        if (!dhnlVar.equals(dhnl.b)) {
            bgtp bgtpVar = this.a;
            bgqt i = bgqt.i(bgtpVar.c, bgtpVar.d, dhnlVar, qjcVar.a());
            this.a.b.l(bege.DIRECTORY, i);
            i.d.e().d(this);
        }
    }
}
