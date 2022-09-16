package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.io.Serializable;
import java.util.List;
/* compiled from: PG */
/* renamed from: cgxq  reason: default package */
/* loaded from: classes4.dex */
public abstract class cgxq extends chal implements cgvn {
    public final cgen a;
    protected final Activity b;
    private final buke c;
    private dosq d;

    public cgxq(Activity activity, buke bukeVar, cgen cgenVar, cgsk cgskVar, bwrs<ilo> bwrsVar, List<dwrg> list, dwql dwqlVar, chak chakVar, cgum cgumVar) {
        super(cgskVar, bwrsVar, list, dwqlVar, chakVar, cgumVar);
        this.d = dosq.VOTE_UNKNOWN;
        this.b = activity;
        this.c = bukeVar;
        this.a = cgenVar;
        this.i = cgskVar;
    }

    private final void g(dosq dosqVar) {
        this.d = dosqVar;
        dwpf bZ = dwpg.c.bZ();
        dosq dosqVar2 = dosq.VOTE_UNKNOWN;
        int ordinal = dosqVar.ordinal();
        if (ordinal == 0) {
            dwpi bZ2 = dwpj.c.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dwpj dwpjVar = (dwpj) bZ2.b;
            dwpjVar.a = 1;
            dwpjVar.b = false;
            dwpj bK = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwpg dwpgVar = (dwpg) bZ.b;
            bK.getClass();
            dwpgVar.b = bK;
            dwpgVar.a = 1;
        } else if (ordinal == 1) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwpg dwpgVar2 = (dwpg) bZ.b;
            dwpgVar2.a = 2;
            dwpgVar2.b = false;
        } else if (ordinal == 2) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwpg dwpgVar3 = (dwpg) bZ.b;
            dwpgVar3.a = 2;
            dwpgVar3.b = true;
        } else if (ordinal == 3) {
            dwpi bZ3 = dwpj.c.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dwpj dwpjVar2 = (dwpj) bZ3.b;
            dwpjVar2.a = 1;
            dwpjVar2.b = true;
            dwpj bK2 = bZ3.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwpg dwpgVar4 = (dwpg) bZ.b;
            bK2.getClass();
            dwpgVar4.b = bK2;
            dwpgVar4.a = 1;
        }
        buke bukeVar = this.c;
        djzl bZ4 = djzm.c.bZ();
        dwph bZ5 = dwpk.d.bZ();
        dwpc dwpcVar = this.i.a().b;
        if (dwpcVar == null) {
            dwpcVar = dwpc.e;
        }
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dwpk dwpkVar = (dwpk) bZ5.b;
        dwpcVar.getClass();
        dwpkVar.b = dwpcVar;
        dwpkVar.a |= 1;
        dwpg bK3 = bZ.bK();
        bK3.getClass();
        dwpkVar.c = bK3;
        dwpkVar.a |= 2;
        dwpk bK4 = bZ5.bK();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        djzm djzmVar = (djzm) bZ4.b;
        bK4.getClass();
        djzmVar.b = bK4;
        djzmVar.a |= 1;
        bukeVar.a(bZ4.bK(), new cgxp(this), bvrj.BACKGROUND_THREADPOOL);
        u(cgwf.POSTED);
    }

    @Override // defpackage.cgwg
    public void B() {
    }

    @Override // defpackage.cgwg
    @dzsi
    public Serializable D() {
        return null;
    }

    @Override // defpackage.cgwg
    public void E(Object obj) {
    }

    @Override // defpackage.cgwg
    public void K() {
    }

    @Override // defpackage.chal, defpackage.cgwg
    public Boolean O() {
        return true;
    }

    @Override // defpackage.cgwk
    public cjtd RA() {
        return cjtd.a(dtyd.aR);
    }

    @Override // defpackage.cgvn
    public CharSequence e() {
        dosq dosqVar = dosq.VOTE_UNKNOWN;
        int ordinal = this.d.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return this.b.getString(R.string.VERIFY_TRANSLATION_VOTE_YES);
            }
            return ordinal != 3 ? "" : this.b.getString(R.string.VERIFY_TRANSLATION_VOTE_NOT_SURE);
        }
        return this.b.getString(R.string.VERIFY_TRANSLATION_VOTE_NO);
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
        g(dosq.VOTE_CORRECT);
        return cqkl.a;
    }

    @Override // defpackage.cgwk
    public cqkl p() {
        g(dosq.VOTE_INCORRECT);
        return cqkl.a;
    }

    @Override // defpackage.cgwk
    public cqkl q() {
        g(dosq.VOTE_ABSTAIN);
        return cqkl.a;
    }

    @Override // defpackage.cgwk
    public cjtd r() {
        return cjtd.a(dtyd.aS);
    }

    @Override // defpackage.cgwk
    public cjtd s() {
        return cjtd.a(dtyd.aQ);
    }

    @Override // defpackage.cgwg
    public void y(cqiv cqivVar) {
        cqivVar.a(new cghq(), this);
    }
}
