package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: cgxc  reason: default package */
/* loaded from: classes4.dex */
public class cgxc implements cgvc {
    private final Activity a;
    private final cgxn b;
    private final dnlz c;
    private dosq d = dosq.VOTE_UNKNOWN;

    public cgxc(Activity activity, cgxn cgxnVar, dnlz dnlzVar) {
        this.a = activity;
        this.b = cgxnVar;
        this.c = dnlzVar;
    }

    @Override // defpackage.cgwk
    public cjtd RA() {
        cjta b = cjtd.b();
        b.d = dtyd.aG;
        b.g(this.b.m);
        return b.a();
    }

    @Override // defpackage.cgvb
    public void a(cqiv cqivVar) {
        cqivVar.a(new cgfz(), this);
    }

    @Override // defpackage.cgvc
    public Boolean b() {
        return this.b.v();
    }

    @Override // defpackage.cgvc
    public String c() {
        dosq dosqVar = dosq.VOTE_UNKNOWN;
        int ordinal = this.d.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return i();
            }
            return ordinal != 3 ? "" : k();
        }
        return j();
    }

    @Override // defpackage.cgvh
    public Boolean d() {
        return Boolean.valueOf(this.d != dosq.VOTE_UNKNOWN);
    }

    @Override // defpackage.cgvh
    public void e() {
        this.d = dosq.VOTE_UNKNOWN;
        cqkx.p(this);
    }

    @Override // defpackage.cgvh
    @dzsi
    public Serializable f() {
        return null;
    }

    @Override // defpackage.cgvh
    public void g(Object obj) {
    }

    @Override // defpackage.cgvh
    public void h(cgwf cgwfVar) {
        cqkx.p(this);
    }

    public String i() {
        dnlz dnlzVar = this.c;
        return (dnlzVar.a & 2) != 0 ? dnlzVar.b : this.a.getString(R.string.FACTUAL_MODERATION_VOTE_YES);
    }

    public String j() {
        dnlz dnlzVar = this.c;
        return (dnlzVar.a & 4) != 0 ? dnlzVar.c : this.a.getString(R.string.FACTUAL_MODERATION_VOTE_NO);
    }

    public String k() {
        return this.a.getString(R.string.FACTUAL_MODERATION_VOTE_NOT_SURE);
    }

    @Override // defpackage.cgwk
    public Boolean l() {
        return Boolean.valueOf(this.d == dosq.VOTE_CORRECT);
    }

    @Override // defpackage.cgwk
    public Boolean m() {
        return Boolean.valueOf(this.d == dosq.VOTE_INCORRECT);
    }

    @Override // defpackage.cgwk
    public Boolean n() {
        return Boolean.valueOf(this.d == dosq.VOTE_ABSTAIN);
    }

    @Override // defpackage.cgwk
    public cqkl o() {
        this.d = dosq.VOTE_CORRECT;
        cgxn cgxnVar = this.b;
        dwpf bZ = dwpg.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwpg dwpgVar = (dwpg) bZ.b;
        dwpgVar.a = 2;
        dwpgVar.b = true;
        cgxnVar.d(bZ.bK());
        return cqkl.a;
    }

    @Override // defpackage.cgwk
    public cqkl p() {
        this.d = dosq.VOTE_INCORRECT;
        cgxn cgxnVar = this.b;
        dwpf bZ = dwpg.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwpg dwpgVar = (dwpg) bZ.b;
        dwpgVar.a = 2;
        dwpgVar.b = false;
        cgxnVar.d(bZ.bK());
        return cqkl.a;
    }

    @Override // defpackage.cgwk
    public cqkl q() {
        this.d = dosq.VOTE_ABSTAIN;
        cgxn cgxnVar = this.b;
        dwpf bZ = dwpg.c.bZ();
        dwpi bZ2 = dwpj.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dwpj dwpjVar = (dwpj) bZ2.b;
        dwpjVar.a = 1;
        dwpjVar.b = true;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwpg dwpgVar = (dwpg) bZ.b;
        dwpj bK = bZ2.bK();
        bK.getClass();
        dwpgVar.b = bK;
        dwpgVar.a = 1;
        cgxnVar.d(bZ.bK());
        return cqkl.a;
    }

    @Override // defpackage.cgwk
    public cjtd r() {
        cjta b = cjtd.b();
        b.d = dtyd.aH;
        b.g(this.b.m);
        return b.a();
    }

    @Override // defpackage.cgwk
    public cjtd s() {
        cjta b = cjtd.b();
        b.d = dtyd.aF;
        b.g(this.b.m);
        return b.a();
    }
}
