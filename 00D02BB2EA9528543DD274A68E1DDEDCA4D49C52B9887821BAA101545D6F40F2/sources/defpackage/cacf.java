package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: cacf  reason: default package */
/* loaded from: classes4.dex */
public class cacf extends bzzg implements cafm {
    public final docg d;
    private final jax e;
    private final cace f;

    public cacf(Activity activity, btvo btvoVar, dwul dwulVar, bzzf bzzfVar) {
        super(activity, btvoVar, dwulVar, bzzfVar);
        dwuk dwukVar;
        dwts dwtsVar = this.b;
        if (dwtsVar.b == 1) {
            dwukVar = (dwuk) dwtsVar.c;
        } else {
            dwukVar = dwuk.d;
        }
        dvyw dvywVar = dwukVar.a;
        dvywVar = dvywVar == null ? dvyw.bv : dvywVar;
        doco docoVar = dvywVar.aU;
        this.d = (docoVar == null ? doco.k : docoVar).b.get(0);
        this.e = t(dvywVar);
        this.f = new cace(this);
    }

    @Override // defpackage.cafn
    public void a(cqiv cqivVar) {
        cqivVar.a(new camq(), this);
    }

    @Override // defpackage.cafn
    public cjtd b() {
        return cjtd.a(dtya.dD);
    }

    @Override // defpackage.cafn
    public cjtd c() {
        return cjtd.a(dtya.dE);
    }

    @Override // defpackage.cafn
    public cjtd d() {
        return cjtd.a(r().booleanValue() ? dtya.dF : dtya.dG);
    }

    @Override // defpackage.cafm
    public void e(cqiv cqivVar) {
        cqivVar.a(new camp(), this.f);
    }

    @Override // defpackage.cafn
    public Boolean f() {
        return false;
    }

    @Override // defpackage.cafm
    public jax g() {
        return this.e;
    }

    @Override // defpackage.cafm
    public String h() {
        dwuk dwukVar;
        dwts dwtsVar = this.b;
        if (dwtsVar.b == 1) {
            dwukVar = (dwuk) dwtsVar.c;
        } else {
            dwukVar = dwuk.d;
        }
        return dwukVar.c;
    }

    @Override // defpackage.cafm
    public jic i() {
        dwuk dwukVar;
        dwts dwtsVar = this.b;
        if (dwtsVar.b == 1) {
            dwukVar = (dwuk) dwtsVar.c;
        } else {
            dwukVar = dwuk.d;
        }
        return new jic(dwukVar.b, ckqc.FULLY_QUALIFIED, (cqtd) null, 0);
    }
}
