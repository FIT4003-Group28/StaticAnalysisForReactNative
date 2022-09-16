package defpackage;

import android.app.Activity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cgxn  reason: default package */
/* loaded from: classes4.dex */
public class cgxn extends chal implements cgvm {
    private final cgxb a;
    private final List<cgvb> b;
    private final cgxm c;
    @dzsi
    private cgvh d;
    private boolean e;
    @dzsi
    private dwpk f;

    public cgxn(cgxb cgxbVar, cgum cgumVar, cgsk cgskVar, bwrs<ilo> bwrsVar, cgxm cgxmVar, List<dwrg> list, dwql dwqlVar, chak chakVar) {
        super(cgskVar, bwrsVar, list, dwqlVar, chakVar, cgumVar);
        this.a = cgxbVar;
        this.b = new ArrayList();
        this.e = false;
        this.c = cgxmVar;
    }

    @Override // defpackage.cgwg
    public void B() {
        c();
        cgvh cgvhVar = this.d;
        if (cgvhVar != null) {
            cgvhVar.e();
        }
        cqkx.p(this);
    }

    @Override // defpackage.chal, defpackage.cgwg
    public Boolean C() {
        cgvh cgvhVar = this.d;
        boolean z = false;
        if (cgvhVar != null && cgvhVar.d().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cgwg
    @dzsi
    public Serializable D() {
        c();
        cgvh cgvhVar = this.d;
        if (cgvhVar != null) {
            return cgvhVar.f();
        }
        return null;
    }

    @Override // defpackage.cgwg
    public void E(Object obj) {
        c();
        cgvh cgvhVar = this.d;
        if (cgvhVar != null) {
            cgvhVar.g(obj);
        }
    }

    @Override // defpackage.cgwg
    public void K() {
    }

    @Override // defpackage.chal, defpackage.cgwg
    public Boolean O() {
        return Boolean.valueOf(this.d instanceof cgvc);
    }

    @Override // defpackage.cgvm
    public List<cgvb> a() {
        c();
        return this.b;
    }

    @Override // defpackage.cgvm
    @dzsi
    public dwpk b() {
        Serializable D;
        if (!O().booleanValue() && (D = D()) != null) {
            dwph bZ = dwpk.d.bZ();
            dwpc dwpcVar = this.i.a().b;
            if (dwpcVar == null) {
                dwpcVar = dwpc.e;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwpk dwpkVar = (dwpk) bZ.b;
            dwpcVar.getClass();
            dwpkVar.b = dwpcVar;
            dwpkVar.a |= 1;
            dwpf bZ2 = dwpg.c.bZ();
            String str = (String) D;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dwpg dwpgVar = (dwpg) bZ2.b;
            str.getClass();
            dwpgVar.a = 3;
            dwpgVar.b = str;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwpk dwpkVar2 = (dwpk) bZ.b;
            dwpg bK = bZ2.bK();
            bK.getClass();
            dwpkVar2.c = bK;
            dwpkVar2.a |= 2;
            this.f = bZ.bK();
        }
        return this.f;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    final void c() {
        dnms dnmsVar;
        int i;
        dnmo dnmoVar;
        cgvb cgxlVar;
        dnmk dnmkVar;
        dnmg dnmgVar;
        dnmc dnmcVar;
        dnlz dnlzVar;
        dnmm dnmmVar;
        dnmi dnmiVar;
        if (this.e) {
            return;
        }
        dwqf dwqfVar = this.i.a().c;
        if (dwqfVar == null) {
            dwqfVar = dwqf.g;
        }
        doqw doqwVar = dwqfVar.b;
        if (doqwVar == null) {
            doqwVar = doqw.c;
        }
        if (doqwVar.a == 10) {
            dnmsVar = (dnms) doqwVar.b;
        } else {
            dnmsVar = dnms.e;
        }
        dnmr dnmrVar = dnmsVar.b;
        if (dnmrVar == null) {
            dnmrVar = dnmr.b;
        }
        for (dnmp dnmpVar : dnmrVar.a) {
            cgxb cgxbVar = this.a;
            cgsk cgskVar = this.i;
            cgxm cgxmVar = this.c;
            int i2 = dnmpVar.a;
            switch (i2) {
                case 0:
                    i = 8;
                    break;
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 4;
                    break;
                case 4:
                    i = 5;
                    break;
                case 5:
                    i = 6;
                    break;
                case 6:
                    i = 3;
                    break;
                case 7:
                    i = 7;
                    break;
                default:
                    i = 0;
                    break;
            }
            int i3 = i - 1;
            cgxj cgxjVar = null;
            if (i != 0) {
                switch (i3) {
                    case 0:
                        Activity activity = cgxbVar.a;
                        List<dwpp> W = W();
                        if (dnmpVar.a == 1) {
                            dnmoVar = (dnmo) dnmpVar.b;
                        } else {
                            dnmoVar = dnmo.c;
                        }
                        cgxlVar = new cgxl(activity, W, dnmoVar);
                        break;
                    case 1:
                        Activity activity2 = cgxbVar.a;
                        if (i2 == 2) {
                            dnmkVar = (dnmk) dnmpVar.b;
                        } else {
                            dnmkVar = dnmk.b;
                        }
                        cgxlVar = new cgxi(activity2, dnmkVar, cgxbVar.d);
                        break;
                    case 2:
                        Activity activity3 = cgxbVar.a;
                        bbut bbutVar = cgxbVar.b;
                        if (i2 == 6) {
                            dnmgVar = (dnmg) dnmpVar.b;
                        } else {
                            dnmgVar = dnmg.b;
                        }
                        cgxlVar = new cgxg(activity3, bbutVar, dnmgVar);
                        break;
                    case 3:
                        Activity activity4 = cgxbVar.a;
                        if (i2 == 3) {
                            dnmcVar = (dnmc) dnmpVar.b;
                        } else {
                            dnmcVar = dnmc.b;
                        }
                        cgxlVar = new cgxe(activity4, cgskVar, dnmcVar);
                        break;
                    case 4:
                        Activity activity5 = cgxbVar.a;
                        if (i2 == 4) {
                            dnlzVar = (dnlz) dnmpVar.b;
                        } else {
                            dnlzVar = dnlz.d;
                        }
                        cgxlVar = new cgxc(activity5, this, dnlzVar);
                        break;
                    case 5:
                        Activity activity6 = cgxbVar.a;
                        ddho ddhoVar = dtyd.aM;
                        String str = cgskVar.a().e;
                        cgxa cgxaVar = new cgxa(this);
                        cjqy cjqyVar = cgxbVar.c;
                        if (dnmpVar.a == 5) {
                            dnmmVar = (dnmm) dnmpVar.b;
                        } else {
                            dnmmVar = dnmm.b;
                        }
                        cgxjVar = new cgxj(activity6, 1, ddhoVar, str, cgxaVar, cjqyVar, dnmmVar);
                        cgxlVar = cgxjVar;
                        break;
                    case 6:
                        String str2 = this.m;
                        if (i2 == 7) {
                            dnmiVar = (dnmi) dnmpVar.b;
                        } else {
                            dnmiVar = dnmi.c;
                        }
                        cgxlVar = new cgxh(cgxmVar, str2, cgskVar, dnmiVar);
                        break;
                    default:
                        cgxlVar = cgxjVar;
                        break;
                }
                if (cgxlVar != null) {
                    this.b.add(cgxlVar);
                    if (cgxlVar instanceof cgvh) {
                        this.d = (cgvh) cgxlVar;
                    }
                }
            } else {
                throw null;
            }
        }
        this.e = true;
    }

    public void d(dwpg dwpgVar) {
        dwph bZ = dwpk.d.bZ();
        dwpc dwpcVar = this.i.a().b;
        if (dwpcVar == null) {
            dwpcVar = dwpc.e;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwpk dwpkVar = (dwpk) bZ.b;
        dwpcVar.getClass();
        dwpkVar.b = dwpcVar;
        int i = dwpkVar.a | 1;
        dwpkVar.a = i;
        dwpgVar.getClass();
        dwpkVar.c = dwpgVar;
        dwpkVar.a = i | 2;
        this.f = bZ.bK();
        u(cgwf.EDIT_COMPLETED);
    }

    @Override // defpackage.chal, defpackage.cgwg
    public void u(cgwf cgwfVar) {
        super.u(cgwfVar);
        c();
        cgvh cgvhVar = this.d;
        if (cgvhVar != null) {
            cgvhVar.h(cgwfVar);
        }
        if (cgwfVar == cgwf.POSTED) {
            this.f = null;
        }
    }

    @Override // defpackage.cgwg
    public void y(cqiv cqivVar) {
        cqivVar.a(new cggj(), this);
    }
}
