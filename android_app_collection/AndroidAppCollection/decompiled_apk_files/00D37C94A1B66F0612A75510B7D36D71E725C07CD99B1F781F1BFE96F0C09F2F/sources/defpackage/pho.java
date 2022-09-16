package defpackage;
/* compiled from: PG */
/* renamed from: pho  reason: default package */
/* loaded from: classes4.dex */
final class pho implements pwj {
    public final phn b;
    public pkd c;
    public pwj d;
    public boolean f;
    public final pxb a = new pxb();
    public boolean e = true;

    public pho(phn phnVar) {
        this.b = phnVar;
    }

    public final void d() {
        this.f = false;
        this.a.f();
    }

    @Override // defpackage.pwj
    public final long jF() {
        if (this.e) {
            return this.a.jF();
        }
        pwj pwjVar = this.d;
        ptx.a(pwjVar);
        return pwjVar.jF();
    }

    @Override // defpackage.pwj
    public final pjt jG() {
        pwj pwjVar = this.d;
        return pwjVar != null ? pwjVar.jG() : this.a.a;
    }

    @Override // defpackage.pwj
    public final void jH(pjt pjtVar) {
        pwj pwjVar = this.d;
        if (pwjVar != null) {
            pwjVar.jH(pjtVar);
            pjtVar = this.d.jG();
        }
        this.a.jH(pjtVar);
    }
}
