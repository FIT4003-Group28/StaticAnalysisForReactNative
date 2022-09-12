package defpackage;
/* compiled from: PG */
/* renamed from: qpc  reason: default package */
/* loaded from: classes7.dex */
class qpc implements qnf {
    final /* synthetic */ String a;
    final /* synthetic */ cjtd b;
    final /* synthetic */ ddho c;
    final /* synthetic */ String d;
    private boolean e = false;

    public qpc(String str, cjtd cjtdVar, ddho ddhoVar, String str2) {
        this.a = str;
        this.b = cjtdVar;
        this.c = ddhoVar;
        this.d = str2;
    }

    @Override // defpackage.qnf
    public String a() {
        return this.a;
    }

    @Override // defpackage.qnf
    public cjtd b() {
        return this.b;
    }

    @Override // defpackage.qnf
    @dzsi
    public ddho c() {
        return this.c;
    }

    @Override // defpackage.qnf
    public String d() {
        return this.d;
    }

    @Override // defpackage.qnf
    public Boolean e() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.qnf
    public void f(boolean z) {
        this.e = z;
    }
}
