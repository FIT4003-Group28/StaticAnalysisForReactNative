package defpackage;
/* compiled from: PG */
/* renamed from: bdre  reason: default package */
/* loaded from: classes3.dex */
public class bdre implements bdrc {
    public boolean a;
    private final apnj b = new bdrd(this);
    @dzsi
    private bbtj c;
    private boolean d;

    public bdre(cqhn cqhnVar) {
    }

    @Override // defpackage.bdrc
    public Boolean a() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.bdrc
    public Boolean b() {
        bbtj bbtjVar = this.c;
        if (bbtjVar == null) {
            return false;
        }
        return Boolean.valueOf(bbtjVar.b().equals(bbti.VIDEO));
    }

    @Override // defpackage.bdrc
    public String c() {
        bbtj bbtjVar = this.c;
        return bbtjVar == null ? "" : bbtjVar.a().toString();
    }

    @Override // defpackage.bdrc
    public String d() {
        return g().a;
    }

    @Override // defpackage.bdrc
    public apnj e() {
        return this.b;
    }

    @Override // defpackage.bdrc
    public Boolean f() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.bdrc
    public jic g() {
        ckql ckqlVar = new ckql();
        ckqlVar.e = true;
        bbtj bbtjVar = this.c;
        return new jic(bbtjVar == null ? "" : bbtjVar.a().toString(), ckqc.FULLY_QUALIFIED, cqta.f(), 0, false, null, ckqlVar);
    }

    public void h(bbtj bbtjVar, boolean z) {
        this.c = bbtjVar;
        this.d = z;
        this.a = z;
        cqkx.p(this);
    }
}
