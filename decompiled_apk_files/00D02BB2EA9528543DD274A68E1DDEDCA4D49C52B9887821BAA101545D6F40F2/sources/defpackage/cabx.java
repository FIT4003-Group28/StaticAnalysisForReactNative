package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: cabx  reason: default package */
/* loaded from: classes4.dex */
public class cabx extends bzzg implements cafm {
    private final jax d;
    private final cabw e;

    public cabx(Activity activity, btvo btvoVar, dwul dwulVar, bzzf bzzfVar) {
        super(activity, btvoVar, dwulVar, bzzfVar);
        dwug dwugVar;
        dwts dwtsVar = this.b;
        if (dwtsVar.b == 6) {
            dwugVar = (dwug) dwtsVar.c;
        } else {
            dwugVar = dwug.e;
        }
        dvyw dvywVar = dwugVar.a;
        this.d = t(dvywVar == null ? dvyw.bv : dvywVar);
        this.e = new cabw(this);
    }

    @Override // defpackage.cafn
    public void a(cqiv cqivVar) {
        cqivVar.a(new camq(), this);
    }

    @Override // defpackage.cafn
    public cjtd b() {
        return cjtd.a(dtxy.ck);
    }

    @Override // defpackage.cafn
    public cjtd c() {
        return cjtd.a(dtxy.cl);
    }

    @Override // defpackage.cafn
    public cjtd d() {
        return cjtd.a(r().booleanValue() ? dtxy.cm : dtxy.cn);
    }

    @Override // defpackage.cafm
    public void e(cqiv cqivVar) {
        cqivVar.a(new camk(), this.e);
    }

    @Override // defpackage.cafn
    public Boolean f() {
        return false;
    }

    @Override // defpackage.cafm
    public jax g() {
        return this.d;
    }

    @Override // defpackage.cafm
    public String h() {
        dwug dwugVar;
        dwts dwtsVar = this.b;
        if (dwtsVar.b == 6) {
            dwugVar = (dwug) dwtsVar.c;
        } else {
            dwugVar = dwug.e;
        }
        return dwugVar.d;
    }

    @Override // defpackage.cafm
    public jic i() {
        dwug dwugVar;
        dwts dwtsVar = this.b;
        if (dwtsVar.b == 6) {
            dwugVar = (dwug) dwtsVar.c;
        } else {
            dwugVar = dwug.e;
        }
        return new jic(dwugVar.c, ckqc.FULLY_QUALIFIED, (cqtd) null, 0);
    }
}
