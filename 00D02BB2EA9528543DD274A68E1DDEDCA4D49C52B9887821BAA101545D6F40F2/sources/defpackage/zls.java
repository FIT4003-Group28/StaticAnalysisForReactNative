package defpackage;
/* compiled from: PG */
/* renamed from: zls  reason: default package */
/* loaded from: classes7.dex */
class zls implements zeo {
    final /* synthetic */ dpan a;
    final /* synthetic */ vtj b;

    public zls(dpan dpanVar, vtj vtjVar) {
        this.a = dpanVar;
        this.b = vtjVar;
    }

    @Override // defpackage.zeo
    public jhk a() {
        douj doujVar = this.a.d;
        if (doujVar == null) {
            doujVar = douj.h;
        }
        return new jhk(doujVar.c, this.b);
    }

    @Override // defpackage.zeo
    public String b() {
        return this.a.c;
    }
}
