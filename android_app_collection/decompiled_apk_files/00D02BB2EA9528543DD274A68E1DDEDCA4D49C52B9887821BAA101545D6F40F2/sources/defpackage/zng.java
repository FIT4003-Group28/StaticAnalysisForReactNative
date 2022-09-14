package defpackage;
/* compiled from: PG */
/* renamed from: zng  reason: default package */
/* loaded from: classes7.dex */
class zng implements zdp {
    final /* synthetic */ znh a;
    private final ddho b;
    private final ddho c;
    private final znf d;

    public zng(znh znhVar, ddho ddhoVar, ddho ddhoVar2, znf znfVar) {
        this.a = znhVar;
        this.b = ddhoVar;
        this.c = ddhoVar2;
        this.d = znfVar;
    }

    @Override // defpackage.zdp
    public cjtd a() {
        return cjtd.a(this.b);
    }

    @Override // defpackage.zdp
    public cjtd b() {
        return cjtd.a(this.c);
    }

    @Override // defpackage.zdp
    public cqkl c() {
        znh znhVar = this.a;
        znhVar.b();
        znhVar.a = null;
        this.d.a();
        return cqkl.a;
    }
}
