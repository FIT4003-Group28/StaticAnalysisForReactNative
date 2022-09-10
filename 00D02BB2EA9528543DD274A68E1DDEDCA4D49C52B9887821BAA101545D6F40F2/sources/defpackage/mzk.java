package defpackage;
/* compiled from: PG */
/* renamed from: mzk  reason: default package */
/* loaded from: classes7.dex */
public class mzk implements mzc {
    private mzj a;
    @dzsi
    private final mzi b;
    @dzsi
    private final dbty<cjtd> c;

    public mzk(mzj mzjVar, @dzsi mzi mziVar, @dzsi dbty<cjtd> dbtyVar) {
        this.a = mzjVar;
        this.b = mziVar;
        this.c = dbtyVar;
        mzjVar.e();
    }

    @Override // defpackage.mzc
    public CharSequence a() {
        return this.a.b();
    }

    @Override // defpackage.mzc
    public CharSequence b() {
        return npn.b(this.a.a() + 1);
    }

    @Override // defpackage.mzc
    public Boolean c() {
        return Boolean.valueOf(this.a.e().a() != koa.NO_BATTERY_INFORMATION);
    }

    @Override // defpackage.mzc
    @dzsi
    public CharSequence d() {
        return this.a.d();
    }

    @Override // defpackage.mzc
    public Boolean e() {
        return Boolean.valueOf(this.a.f());
    }

    @Override // defpackage.mzc
    public Boolean f() {
        boolean z = false;
        if (this.a.a() == 0 && this.a.f()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.mzc
    public cqkl g() {
        mzi mziVar = this.b;
        if (mziVar != null) {
            mziVar.a(this.a.a());
        }
        return cqkl.a;
    }

    @Override // defpackage.mzc
    public cjtd h() {
        dbty<cjtd> dbtyVar = this.c;
        if (dbtyVar != null) {
            return dbtyVar.a();
        }
        return cjtd.b;
    }

    public boolean i(mzj mzjVar) {
        if (this.a.equals(mzjVar)) {
            return false;
        }
        this.a = mzjVar;
        mzjVar.e();
        return true;
    }
}
