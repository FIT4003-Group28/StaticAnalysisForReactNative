package defpackage;

import android.text.TextUtils;
import com.google.ar.core.ImageMetadata;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cwwo  reason: default package */
/* loaded from: classes5.dex */
public final class cwwo {
    public final cwwl a;
    public final dzsj<cwwt> b;
    public final cxfb c;
    private final cwuc d;
    private final Executor e;

    public cwwo(cwwl cwwlVar, dzsj<cwwt> dzsjVar, cwuc cwucVar, cxfc cxfcVar, Executor executor, dxio<? extends cwuw> dxioVar, dzsj<cxfg> dzsjVar2) {
        this.a = cwwlVar;
        this.d = cwucVar;
        this.b = dzsjVar;
        this.e = executor;
        Executor a = cxfcVar.a.a();
        cxfc.a(a, 1);
        cxfc.a(dxioVar, 2);
        this.c = new cxfb(a, dxioVar, dzsjVar2);
    }

    public final boolean a() {
        if (!this.d.b) {
            cxfb cxfbVar = this.c;
            if (cxfbVar.b.c()) {
                return false;
            }
            return cxfbVar.c == 3 && cxfbVar.a.b();
        }
        return false;
    }

    public final boolean b() {
        cxfb cxfbVar = this.c;
        return cxfbVar.c == 3 && cxfbVar.a.a();
    }

    public final dehn<Void> c(final cwwj cwwjVar) {
        if (this.d.b) {
            return deha.c();
        }
        return deha.e(new Runnable(this, cwwjVar) { // from class: cwwn
            private final cwwo a;
            private final cwwj b;

            {
                this.a = this;
                this.b = cwwjVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cwwo cwwoVar = this.a;
                cwwj cwwjVar2 = this.b;
                if (!cwwoVar.b()) {
                    return;
                }
                cwwt a = cwwoVar.b.a();
                eacd c = cwwjVar2.c();
                dsqp dsqpVar = (dsqp) c.cu(5);
                dsqpVar.bC(c);
                eacc eaccVar = (eacc) dsqpVar;
                eaay bZ = eaba.g.bZ();
                int i = a.i;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                eaba eabaVar = (eaba) bZ.b;
                eabaVar.d = i - 1;
                int i2 = eabaVar.a | 4;
                eabaVar.a = i2;
                String str = a.b;
                if (str != null) {
                    str.getClass();
                    eabaVar.a = i2 | 1;
                    eabaVar.b = str;
                }
                if (cwwt.g != null) {
                    long longValue = cwwt.g.longValue();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    eaba eabaVar2 = (eaba) bZ.b;
                    eabaVar2.a |= 8;
                    eabaVar2.e = longValue;
                }
                String str2 = a.d;
                if (str2 != null) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    eaba eabaVar3 = (eaba) bZ.b;
                    str2.getClass();
                    eabaVar3.a |= 2;
                    eabaVar3.c = str2;
                }
                String str3 = a.c;
                if (str3 != null) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    eaba eabaVar4 = (eaba) bZ.b;
                    str3.getClass();
                    eabaVar4.a |= 16;
                    eabaVar4.f = str3;
                }
                if (eaccVar.c) {
                    eaccVar.bF();
                    eaccVar.c = false;
                }
                eacd eacdVar = (eacd) eaccVar.b;
                eaba bK = bZ.bK();
                eacd eacdVar2 = eacd.u;
                bK.getClass();
                eacdVar.f = bK;
                eacdVar.a |= 16;
                if (cqvm.c(a.a)) {
                    eabg bZ2 = eabh.d.bZ();
                    long freeSpace = a.e.a().getFreeSpace() / 1024;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    eabh eabhVar = (eabh) bZ2.b;
                    eabhVar.a |= 1;
                    eabhVar.b = freeSpace;
                    long longValue2 = a.f.a().longValue();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    eabh eabhVar2 = (eabh) bZ2.b;
                    eabhVar2.a |= 2;
                    eabhVar2.c = longValue2;
                    if (eaccVar.c) {
                        eaccVar.bF();
                        eaccVar.c = false;
                    }
                    eacd eacdVar3 = (eacd) eaccVar.b;
                    eabh bK2 = bZ2.bK();
                    bK2.getClass();
                    eacdVar3.r = bK2;
                    eacdVar3.a |= 4194304;
                }
                dbty<cwsv> dbtyVar = a.h;
                RuntimeException runtimeException = null;
                String str4 = dbtyVar == null ? null : dbtyVar.a().a;
                if (!TextUtils.isEmpty(str4)) {
                    eaax eaaxVar = c.q;
                    if (eaaxVar == null) {
                        eaaxVar = eaax.c;
                    }
                    dsqp dsqpVar2 = (dsqp) eaaxVar.cu(5);
                    dsqpVar2.bC(eaaxVar);
                    eaaw eaawVar = (eaaw) dsqpVar2;
                    if (((eaax) eaawVar.b).b.isEmpty()) {
                        if (eaawVar.c) {
                            eaawVar.bF();
                            eaawVar.c = false;
                        }
                        eaax eaaxVar2 = (eaax) eaawVar.b;
                        str4.getClass();
                        eaaxVar2.a |= 1;
                        eaaxVar2.b = str4;
                    } else {
                        String str5 = str4 + "::" + ((eaax) eaawVar.b).b;
                        if (eaawVar.c) {
                            eaawVar.bF();
                            eaawVar.c = false;
                        }
                        eaax eaaxVar3 = (eaax) eaawVar.b;
                        str5.getClass();
                        eaaxVar3.a |= 1;
                        eaaxVar3.b = str5;
                    }
                    if (eaccVar.c) {
                        eaccVar.bF();
                        eaccVar.c = false;
                    }
                    eacd eacdVar4 = (eacd) eaccVar.b;
                    eaax bK3 = eaawVar.bK();
                    bK3.getClass();
                    eacdVar4.q = bK3;
                    eacdVar4.a |= ImageMetadata.SHADING_MODE;
                }
                eacd bK4 = eaccVar.bK();
                dsqp dsqpVar3 = (dsqp) bK4.cu(5);
                dsqpVar3.bC(bK4);
                eacc eaccVar2 = (eacc) dsqpVar3;
                eaby eabyVar = cwwoVar.c.a.a;
                int a2 = eabx.a(eabyVar.c);
                if (a2 != 0 && a2 != 1) {
                    if (eaccVar2.c) {
                        eaccVar2.bF();
                        eaccVar2.c = false;
                    }
                    eacd eacdVar5 = (eacd) eaccVar2.b;
                    eabyVar.getClass();
                    eacdVar5.t = eabyVar;
                    eacdVar5.a |= 67108864;
                }
                String a3 = cwwjVar2.a();
                if (cwwjVar2.b()) {
                    if (a3 != null) {
                        if (eaccVar2.c) {
                            eaccVar2.bF();
                            eaccVar2.c = false;
                        }
                        eacd eacdVar6 = (eacd) eaccVar2.b;
                        a3.getClass();
                        eacdVar6.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                        eacdVar6.o = a3;
                    } else {
                        if (eaccVar2.c) {
                            eaccVar2.bF();
                            eaccVar2.c = false;
                        }
                        eacd eacdVar7 = (eacd) eaccVar2.b;
                        eacdVar7.a &= -65537;
                        eacdVar7.o = eacd.u.o;
                    }
                } else if (a3 == null) {
                    if (eaccVar2.c) {
                        eaccVar2.bF();
                        eaccVar2.c = false;
                    }
                    eacd eacdVar8 = (eacd) eaccVar2.b;
                    eacdVar8.a &= -5;
                    eacdVar8.d = eacd.u.d;
                } else {
                    if (eaccVar2.c) {
                        eaccVar2.bF();
                        eaccVar2.c = false;
                    }
                    eacd eacdVar9 = (eacd) eaccVar2.b;
                    a3.getClass();
                    eacdVar9.a |= 4;
                    eacdVar9.d = a3;
                }
                dzze d = cwwjVar2.d();
                if (d != null) {
                    if (eaccVar2.c) {
                        eaccVar2.bF();
                        eaccVar2.c = false;
                    }
                    eacd eacdVar10 = (eacd) eaccVar2.b;
                    d.getClass();
                    eacdVar10.m = d;
                    eacdVar10.a |= 8192;
                }
                String e = cwwjVar2.e();
                if (e != null) {
                    eaaw bZ3 = eaax.c.bZ();
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    eaax eaaxVar4 = (eaax) bZ3.b;
                    e.getClass();
                    eaaxVar4.a |= 1;
                    eaaxVar4.b = e;
                    if (eaccVar2.c) {
                        eaccVar2.bF();
                        eaccVar2.c = false;
                    }
                    eacd eacdVar11 = (eacd) eaccVar2.b;
                    eaax bK5 = bZ3.bK();
                    bK5.getClass();
                    eacdVar11.q = bK5;
                    eacdVar11.a |= ImageMetadata.SHADING_MODE;
                }
                cwwl cwwlVar = cwwoVar.a;
                eacd bK6 = eaccVar2.bK();
                for (cxfn cxfnVar : cwwlVar.a.a()) {
                    try {
                        cxfnVar.a(bK6);
                    } catch (RuntimeException e2) {
                        if (runtimeException == null) {
                            runtimeException = e2;
                        } else {
                            deki.a(runtimeException, e2);
                        }
                    }
                }
                if (runtimeException != null) {
                    throw runtimeException;
                }
                cwwoVar.c.b.d();
            }
        }, this.e);
    }
}
