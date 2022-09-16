package defpackage;
/* compiled from: PG */
/* renamed from: ahaw  reason: default package */
/* loaded from: classes.dex */
final class ahaw implements afwa {
    final /* synthetic */ String a;
    final /* synthetic */ attp b;
    final /* synthetic */ acti c;
    final /* synthetic */ atpy d;
    final /* synthetic */ ahbb e;

    public ahaw(ahbb ahbbVar, String str, attp attpVar, acti actiVar, atpy atpyVar) {
        this.e = ahbbVar;
        this.a = str;
        this.b = attpVar;
        this.c = actiVar;
        this.d = atpyVar;
    }

    @Override // defpackage.afwa
    public final void a() {
        this.e.l(2);
    }

    @Override // defpackage.afwa
    public final void b() {
        this.e.b(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.afwa
    public final void c(Exception exc) {
        this.e.a.e(exc);
    }
}
