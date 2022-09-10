package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: caeu  reason: default package */
/* loaded from: classes4.dex */
final class caeu extends cagi<dkdg, dkdm> implements nxk {
    public dkde a;
    private boolean h;
    private boolean i;

    private caeu() {
        dkde dkdeVar = dkde.UNKNOWN_KEY;
        throw null;
    }

    @Override // defpackage.nxk
    public final void Ru(String str, List<dwfa> list) {
        dwfl dwflVar;
        nvg nvgVar = this.b;
        if (nvgVar == null || (dwflVar = nvgVar.f.get(str)) == null) {
            return;
        }
        LinkedHashMap<String, dwfl> linkedHashMap = nvgVar.f;
        dsqp dsqpVar = (dsqp) dwflVar.cu(5);
        dsqpVar.bC(dwflVar);
        dwfi dwfiVar = (dwfi) dsqpVar;
        if (dwfiVar.c) {
            dwfiVar.bF();
            dwfiVar.c = false;
        }
        ((dwfl) dwfiVar.b).r = dwfl.ck();
        dwfiVar.a(list);
        linkedHashMap.put(str, dwfiVar.bK());
    }

    @Override // defpackage.nxk
    public final void a(nxj nxjVar) {
        if (nxjVar != nxj.a) {
            return;
        }
        j();
    }

    @Override // defpackage.nxk
    public final void b(String str, dqjh dqjhVar) {
        nvg nvgVar = this.b;
        if (nvgVar == null) {
            return;
        }
        nvgVar.m(str, dqjhVar);
    }

    @Override // defpackage.cagi
    protected final dssr<dkdg> c() {
        return (dssr) dkdg.j.cu(7);
    }

    @Override // defpackage.cagi
    public final void d(duld duldVar) {
        dkdg dkdgVar = (dkdg) this.e;
        if (dkdgVar == null) {
            return;
        }
        duvp duvpVar = duldVar.b;
        if (duvpVar == null) {
            duvpVar = duvp.b;
        }
        dkdg dkdgVar2 = duvpVar.a;
        if (dkdgVar2 == null) {
            dkdgVar2 = dkdg.j;
        }
        dsqp dsqpVar = (dsqp) dkdgVar2.cu(5);
        dsqpVar.bC(dkdgVar2);
        dkcz dkczVar = (dkcz) dsqpVar;
        duls dulsVar = dkdgVar.b;
        if (dulsVar == null) {
            dulsVar = duls.g;
        }
        if (dkczVar.c) {
            dkczVar.bF();
            dkczVar.c = false;
        }
        dkdg dkdgVar3 = (dkdg) dkczVar.b;
        dulsVar.getClass();
        dkdgVar3.b = dulsVar;
        dkdgVar3.a |= 1;
        dkdf dkdfVar = dkdgVar.e;
        if (dkdfVar == null) {
            dkdfVar = dkdf.c;
        }
        if (dkczVar.c) {
            dkczVar.bF();
            dkczVar.c = false;
        }
        dkdg dkdgVar4 = (dkdg) dkczVar.b;
        dkdfVar.getClass();
        dkdgVar4.e = dkdfVar;
        dkdgVar4.a |= 16;
        dkdb dkdbVar = dkdgVar.f;
        if (dkdbVar == null) {
            dkdbVar = dkdb.c;
        }
        if (dkczVar.c) {
            dkczVar.bF();
            dkczVar.c = false;
        }
        dkdg dkdgVar5 = (dkdg) dkczVar.b;
        dkdbVar.getClass();
        dkdgVar5.f = dkdbVar;
        dkdgVar5.a |= 32;
        if (this.h) {
            dulh dulhVar = dkdgVar.c;
            if (dulhVar == null) {
                dulhVar = dulh.b;
            }
            dsqp dsqpVar2 = (dsqp) dulhVar.cu(5);
            dsqpVar2.bC(dulhVar);
            dulg dulgVar = (dulg) dsqpVar2;
            if (this.h) {
                dulgVar.a(dulf.VIEW_PHOTOS_PLAY_VIDEOS);
            }
            if (dkczVar.c) {
                dkczVar.bF();
                dkczVar.c = false;
            }
            dkdg dkdgVar6 = (dkdg) dkczVar.b;
            dulh bK = dulgVar.bK();
            bK.getClass();
            dkdgVar6.c = bK;
            dkdgVar6.a |= 2;
        }
        if (this.i) {
            drcb bZ = drcc.c.bZ();
            drcd bZ2 = drce.c.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            drce drceVar = (drce) bZ2.b;
            drceVar.b = 1;
            drceVar.a |= 1;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            drcc drccVar = (drcc) bZ.b;
            drce bK2 = bZ2.bK();
            bK2.getClass();
            drccVar.b = bK2;
            drccVar.a |= 1;
            if (dkczVar.c) {
                dkczVar.bF();
                dkczVar.c = false;
            }
            dkdg dkdgVar7 = (dkdg) dkczVar.b;
            drcc bK3 = bZ.bK();
            bK3.getClass();
            dkdgVar7.h = bK3;
            dkdgVar7.a |= 128;
        }
        k(dkczVar.bK());
    }

    @Override // defpackage.cagi
    protected final /* bridge */ /* synthetic */ void e(dkdm dkdmVar) {
        duld duldVar;
        dkdm dkdmVar2 = dkdmVar;
        loop0: while (true) {
            duldVar = null;
            for (dkdl dkdlVar : dkdmVar2.b) {
                for (dulb dulbVar : (dkdlVar.a == 1 ? (dkdk) dkdlVar.b : dkdk.e).c) {
                    this.b.p(l(dulbVar), dkdmVar2.d);
                }
                if (((dkdlVar.a == 1 ? (dkdk) dkdlVar.b : dkdk.e).a & 1) != 0) {
                    duldVar = (dkdlVar.a == 1 ? (dkdk) dkdlVar.b : dkdk.e).d;
                    if (duldVar == null) {
                        duldVar = duld.f;
                    }
                }
            }
        }
        this.c = duldVar;
        nvg nvgVar = this.b;
        dccx F = dcdc.F();
        for (dkdl dkdlVar2 : dkdmVar2.b) {
            if (dkdlVar2.a == 1) {
                F.i(((dkdk) dkdlVar2.b).b);
            }
        }
        nvgVar.k(F.f());
        this.b.g = this;
        if ((dkdmVar2.a & 1) != 0) {
            this.g = dkdmVar2.c;
        }
    }

    @Override // defpackage.cagi
    public final void f(Bundle bundle) {
        super.f(bundle);
        bundle.putInt("arg_key_image_ordering_key", this.a.d);
    }

    @Override // defpackage.cagi
    public final void g(Bundle bundle) {
        super.g(bundle);
        this.b.g = this;
        this.a = dkde.b(bundle.getInt("arg_key_image_ordering_key"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public caeu(buvg buvgVar, nvg nvgVar, boolean z, boolean z2) {
        super(buvgVar, nvgVar);
        this.a = dkde.CAPTURE_TIMESTAMP;
        this.h = z;
        this.i = z2;
    }
}
