package defpackage;
/* compiled from: PG */
/* renamed from: bxqf  reason: default package */
/* loaded from: classes4.dex */
class bxqf implements izi {
    final /* synthetic */ bxqh a;

    public bxqf(bxqh bxqhVar) {
        this.a = bxqhVar;
    }

    @Override // defpackage.izi
    @dzsi
    public cqtd c() {
        Integer num = this.a.h;
        if (num == null) {
            return null;
        }
        return cqrt.f(num.intValue());
    }

    @Override // defpackage.izi
    public Boolean d() {
        return Boolean.valueOf(this.a.g);
    }

    @Override // defpackage.izi
    public cqkl e() {
        if (!d().booleanValue()) {
            return cqkl.a;
        }
        this.a.f.g();
        return cqkl.a;
    }

    @Override // defpackage.izi
    public CharSequence f() {
        bxqh bxqhVar = this.a;
        Integer num = bxqhVar.i;
        return num != null ? bxqhVar.e.getString(num.intValue()) : "";
    }

    @Override // defpackage.izi
    public cjtd h() {
        cjtd cjtdVar = this.a.j;
        return cjtdVar != null ? cjtdVar : cjtd.b;
    }

    @Override // defpackage.izi
    public Boolean i() {
        return false;
    }
}
