package defpackage;
/* compiled from: PG */
/* renamed from: zlt  reason: default package */
/* loaded from: classes7.dex */
class zlt implements zeo {
    final /* synthetic */ dpia a;
    final /* synthetic */ vtj b;
    private final douj c;

    public zlt(dpia dpiaVar, vtj vtjVar) {
        this.a = dpiaVar;
        this.b = vtjVar;
        douj doujVar = dpiaVar.a;
        this.c = doujVar == null ? douj.h : doujVar;
    }

    @Override // defpackage.zeo
    public jhk a() {
        return new jhk(this.c.c, this.b);
    }

    @Override // defpackage.zeo
    public String b() {
        return this.c.e;
    }
}
