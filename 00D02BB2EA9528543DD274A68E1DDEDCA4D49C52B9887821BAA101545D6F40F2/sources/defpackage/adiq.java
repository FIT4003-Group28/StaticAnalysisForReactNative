package defpackage;

import android.view.View;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import java.util.Map;
/* compiled from: PG */
/* renamed from: adiq  reason: default package */
/* loaded from: classes2.dex */
public class adiq extends aczs implements adim {
    public final gga a;
    public final bvjj b;
    public final dxio<qbt> c;
    public final dxio<bvvw> d;
    @dzsi
    public dqbe f;
    private final btvo h;
    private boolean i;
    public Map<dqaz, jad> g = dcmn.a;
    @dzsi
    public Runnable e = null;

    public adiq(gga ggaVar, bvjj bvjjVar, btvo btvoVar, dxio<qbt> dxioVar, dxio<bvvw> dxioVar2, cqhn cqhnVar) {
        this.a = ggaVar;
        this.b = bvjjVar;
        this.h = btvoVar;
        this.c = dxioVar;
        this.d = dxioVar2;
    }

    @Override // defpackage.adim
    public Boolean a() {
        dqbe dqbeVar;
        dktp dktpVar = this.h.getPassiveAssistParameters().a().E;
        if (dktpVar == null) {
            dktpVar = dktp.e;
        }
        int a = dkto.a(dktpVar.b);
        if (a == 0 || a != 4 || (dqbeVar = this.f) == null || (dqbeVar.a & 16) == 0) {
            return false;
        }
        for (becp becpVar : ((becr) this.b.L(bvjk.gc, (dssr) becr.b.cu(7), becr.b)).a) {
            if (becpVar.b.equals(dqbeVar.h)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.adim
    public String b() {
        dqbe dqbeVar = this.f;
        return dqbeVar == null ? "" : dqbeVar.d;
    }

    @Override // defpackage.adim
    public String c() {
        dqbe dqbeVar = this.f;
        return dqbeVar == null ? "" : dqbeVar.e;
    }

    @Override // defpackage.aczr
    public cjtd e() {
        cjta b = cjtd.b();
        b.d = dtxo.cs;
        return b.a();
    }

    @Override // defpackage.adim
    public View.OnClickListener f() {
        return new View.OnClickListener(this) { // from class: adio
            private final adiq a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                adiq adiqVar = this.a;
                if (adiqVar.g.containsKey(dqaz.DETAILS)) {
                    adiqVar.g.get(dqaz.DETAILS).c();
                } else if (!adiqVar.g.containsKey(dqaz.CONTACT_MERCHANT)) {
                } else {
                    adiqVar.g.get(dqaz.CONTACT_MERCHANT).c();
                }
            }
        };
    }

    @Override // defpackage.adim
    @dzsi
    public jad g() {
        if (this.g.containsKey(dqaz.RUNNING_LATE)) {
            return this.g.get(dqaz.RUNNING_LATE);
        }
        if (this.g.containsKey(dqaz.DIRECTIONS)) {
            return this.g.get(dqaz.DIRECTIONS);
        }
        if (this.g.containsKey(dqaz.DETAILS)) {
            return this.g.get(dqaz.DETAILS);
        }
        if (!this.g.containsKey(dqaz.CONTACT_MERCHANT)) {
            return null;
        }
        return this.g.get(dqaz.CONTACT_MERCHANT);
    }

    @Override // defpackage.adim
    public Boolean h() {
        boolean z = true;
        if (!this.g.containsKey(dqaz.RUNNING_LATE) && !this.g.containsKey(dqaz.DIRECTIONS)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.adim
    @dzsi
    public jic j() {
        dqbe dqbeVar = this.f;
        if (dqbeVar == null || (dqbeVar.a & 64) == 0) {
            return null;
        }
        return new jic(dqbeVar.f, ckqc.FULLY_QUALIFIED, (cqtd) null, 250);
    }

    @Override // defpackage.adim
    public Boolean k() {
        return Boolean.valueOf(this.i);
    }

    @Override // defpackage.adim
    public View.OnClickListener l() {
        return new View.OnClickListener(this) { // from class: adin
            private final adiq a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                adiq adiqVar = this.a;
                dqbe dqbeVar = adiqVar.f;
                if (dqbeVar == null) {
                    Toast.makeText(adiqVar.a, (int) R.string.UNKNOWN_ERROR, 0).show();
                    return;
                }
                String str = dqbeVar.h;
                becq bZ = becr.b.bZ();
                beco bZ2 = becp.c.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                becp becpVar = (becp) bZ2.b;
                str.getClass();
                becpVar.a |= 1;
                becpVar.b = str;
                becp bK = bZ2.bK();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                becr becrVar = (becr) bZ.b;
                bK.getClass();
                dsrj<becp> dsrjVar = becrVar.a;
                if (!dsrjVar.a()) {
                    becrVar.a = dsqw.cl(dsrjVar);
                }
                becrVar.a.add(bK);
                adiqVar.b.al(bvjk.gc, bZ.bK());
                Runnable runnable = adiqVar.e;
                if (runnable != null) {
                    runnable.run();
                } else {
                    Toast.makeText(adiqVar.a, (int) R.string.UNKNOWN_ERROR, 0).show();
                }
            }
        };
    }

    @Override // defpackage.adim
    public String m() {
        return this.a.getString(R.string.DISMISS);
    }

    public void n(Runnable runnable) {
        this.e = runnable;
    }

    public void o(dqbe dqbeVar) {
        this.f = dqbeVar;
        this.i = false;
        dcdg p = dcdn.p();
        dqbe dqbeVar2 = this.f;
        if (dqbeVar2 != null) {
            for (dqba dqbaVar : dqbeVar2.g) {
                dqaz b = dqaz.b(dqbaVar.e);
                if (b == null) {
                    b = dqaz.UNKNOWN_LINK_TYPE;
                }
                if (b == dqaz.DISMISS) {
                    this.i = (dqbeVar2.a & 128) != 0;
                } else {
                    dqaz b2 = dqaz.b(dqbaVar.e);
                    if (b2 == null) {
                        b2 = dqaz.UNKNOWN_LINK_TYPE;
                    }
                    if (b2 == dqaz.DIRECTIONS) {
                        int i = dqbeVar2.a;
                        if ((i & 256) != 0 && (i & 512) != 0) {
                        }
                    }
                    dqaz b3 = dqaz.b(dqbaVar.e);
                    if (b3 == null) {
                        b3 = dqaz.UNKNOWN_LINK_TYPE;
                    }
                    p.f(b3, new adip(this, dqbaVar));
                }
            }
        }
        this.g = p.b();
    }
}
