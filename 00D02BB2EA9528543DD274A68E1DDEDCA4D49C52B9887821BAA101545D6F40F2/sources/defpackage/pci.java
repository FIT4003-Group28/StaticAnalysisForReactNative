package defpackage;

import android.os.Bundle;
import android.util.Base64;
import com.google.android.apps.gmm.base.service.workmanager.GmmWorkerWrapper;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: pci  reason: default package */
/* loaded from: classes7.dex */
public final class pci implements pai {
    private static final dcqe a = dcqe.c("pci");
    private static final String b = pci.class.getSimpleName();
    private final pcy c;
    private final auhq d;
    private final dxio<akfa> e;
    private final dxio<ckcw> f;
    private final pck g;

    public pci(pcy pcyVar, auhq auhqVar, dxio<akfa> dxioVar, dxio<ckcw> dxioVar2, pck pckVar) {
        this.c = pcyVar;
        this.d = auhqVar;
        this.e = dxioVar;
        this.f = dxioVar2;
        this.g = pckVar;
    }

    @Override // defpackage.pai
    public final boolean a(Bundle bundle) {
        dehn a2;
        daxg daxgVar = null;
        if ("guns".equals(bundle.getString("type")) && bundle.containsKey("ht")) {
            try {
                daxgVar = (daxg) dsqw.cq(daxg.e, Base64.decode(bundle.getString("ht"), 1));
            } catch (dsrm unused) {
            }
        }
        if (daxgVar == null) {
            return false;
        }
        if ((daxgVar.a & 1) == 0) {
            bvoo.h("No target user in the notification.", new Object[0]);
        } else if (this.e.a().n(daxgVar.b) != null) {
            String str = daxgVar.b;
            if ((daxgVar.a & 2) != 0) {
                daxe daxeVar = daxgVar.d;
                if (daxeVar == null) {
                    daxeVar = daxe.c;
                }
                int a3 = daxd.a(daxeVar.a);
                if (a3 == 0) {
                    a3 = 1;
                }
                if (a3 - 1 == 3) {
                    dsrj<String> dsrjVar = daxeVar.b;
                    try {
                        final pck pckVar = this.g;
                        try {
                            bbo bboVar = new bbo();
                            bboVar.e("worker_name_key", "GunsNotificationFetcherWorker");
                            bboVar.e("roid", str);
                            bboVar.a.put("ktf", (String[]) dsrjVar.toArray(new String[0]));
                            bboVar.a.put("st", Long.valueOf(pckVar.c.e()));
                            bbp a4 = bboVar.a();
                            bbk bbkVar = new bbk();
                            bbkVar.c = 2;
                            bbkVar.a = false;
                            final bcb f = new bca(GmmWorkerWrapper.class).d("guns.notification.fetcher").c(a4).b(bbkVar.a()).f();
                            a2 = deew.h(pckVar.a.a(f).a(), new dbrn(pckVar, f) { // from class: pcj
                                private final pck a;
                                private final bcb b;

                                {
                                    this.a = pckVar;
                                    this.b = f;
                                }

                                @Override // defpackage.dbrn
                                public final Object a(Object obj) {
                                    pck pckVar2 = this.a;
                                    try {
                                        return this.b.a;
                                    } catch (RuntimeException e) {
                                        pckVar2.b.c(9, e);
                                        return bbx.c();
                                    }
                                }
                            }, dege.a);
                        } catch (RuntimeException e) {
                            pckVar.b.c(9, e);
                            a2 = deha.a(bbx.c());
                        }
                        a2.get();
                        ((ckcn) this.f.a().a(ckht.aP)).a();
                    } catch (InterruptedException | ExecutionException unused2) {
                    }
                }
            } else {
                b(daxgVar.c, str);
            }
        }
        return true;
    }

    public final void b(List<dawm> list, String str) {
        int a2;
        dbsg dbsgVar;
        for (dawm dawmVar : list) {
            pat bZ = pau.f.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            pau pauVar = (pau) bZ.b;
            str.getClass();
            int i = pauVar.a | 1;
            pauVar.a = i;
            pauVar.b = str;
            long j = dawmVar.e;
            int i2 = i | 2;
            pauVar.a = i2;
            pauVar.c = j;
            String str2 = dawmVar.b;
            str2.getClass();
            pauVar.a = i2 | 4;
            pauVar.d = str2;
            pau pauVar2 = (pau) bZ.b;
            pauVar2.e = 2;
            pauVar2.a |= 8;
            pau bK = bZ.bK();
            int a3 = dawl.a(dawmVar.d);
            if (a3 != 0 && a3 == 2 && !dawmVar.f && (dawmVar.a & 4) != 0) {
                daww dawwVar = dawmVar.c;
                if (dawwVar == null) {
                    dawwVar = daww.e;
                }
                if ((dawwVar.a & 32) != 0) {
                    daww dawwVar2 = dawmVar.c;
                    if (dawwVar2 == null) {
                        dawwVar2 = daww.e;
                    }
                    dawq dawqVar = dawwVar2.d;
                    if (dawqVar == null) {
                        dawqVar = dawq.a;
                    }
                    dspj J = dspj.J(dawqVar.bS());
                    try {
                        a2 = J.a();
                    } catch (IOException e) {
                        bvoo.j(e);
                        bvoo.h("Failed to parse notification.", new Object[0]);
                    }
                    if (a2 != 0) {
                        int b2 = dsut.b(a2);
                        Iterator<pcx<? extends dssj>> it = this.c.a.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                pcx<? extends dssj> next = it.next();
                                if (next.a(b2)) {
                                    dbsgVar = dbsg.i(next);
                                    break;
                                }
                            } else {
                                dbsgVar = dbpy.a;
                                break;
                            }
                        }
                        if (dbsgVar.a()) {
                            auhq auhqVar = this.d;
                            pcx pcxVar = (pcx) dbsgVar.b();
                            dssj o = J.o(pcxVar.b(), dsqa.b());
                            auhqVar.e(pcxVar.c(o));
                            pan bZ2 = pas.d.bZ();
                            daws dawsVar = dawwVar2.b;
                            if (dawsVar == null) {
                                dawsVar = daws.c;
                            }
                            if ((dawsVar.a & 1) != 0) {
                                pao bZ3 = pap.d.bZ();
                                daws dawsVar2 = dawwVar2.b;
                                if (dawsVar2 == null) {
                                    dawsVar2 = daws.c;
                                }
                                dawy dawyVar = dawsVar2.b;
                                if (dawyVar == null) {
                                    dawyVar = dawy.d;
                                }
                                if ((dawyVar.a & 2) != 0) {
                                    daws dawsVar3 = dawwVar2.b;
                                    if (dawsVar3 == null) {
                                        dawsVar3 = daws.c;
                                    }
                                    dawy dawyVar2 = dawsVar3.b;
                                    if (dawyVar2 == null) {
                                        dawyVar2 = dawy.d;
                                    }
                                    String str3 = dawyVar2.b;
                                    if (bZ3.c) {
                                        bZ3.bF();
                                        bZ3.c = false;
                                    }
                                    pap papVar = (pap) bZ3.b;
                                    str3.getClass();
                                    papVar.a |= 1;
                                    papVar.b = str3;
                                }
                                daws dawsVar4 = dawwVar2.b;
                                if (dawsVar4 == null) {
                                    dawsVar4 = daws.c;
                                }
                                dawy dawyVar3 = dawsVar4.b;
                                if (dawyVar3 == null) {
                                    dawyVar3 = dawy.d;
                                }
                                if ((dawyVar3.a & 4) != 0) {
                                    daws dawsVar5 = dawwVar2.b;
                                    if (dawsVar5 == null) {
                                        dawsVar5 = daws.c;
                                    }
                                    dawy dawyVar4 = dawsVar5.b;
                                    if (dawyVar4 == null) {
                                        dawyVar4 = dawy.d;
                                    }
                                    String str4 = dawyVar4.c;
                                    if (bZ3.c) {
                                        bZ3.bF();
                                        bZ3.c = false;
                                    }
                                    pap papVar2 = (pap) bZ3.b;
                                    str4.getClass();
                                    papVar2.a |= 2;
                                    papVar2.c = str4;
                                }
                                pap bK2 = bZ3.bK();
                                if (bZ2.c) {
                                    bZ2.bF();
                                    bZ2.c = false;
                                }
                                pas pasVar = (pas) bZ2.b;
                                bK2.getClass();
                                pasVar.b = bK2;
                                pasVar.a |= 1;
                            }
                            dawu dawuVar = dawwVar2.c;
                            if (dawuVar == null) {
                                dawuVar = dawu.c;
                            }
                            if ((dawuVar.a & 1) != 0) {
                                paq bZ4 = par.d.bZ();
                                dawu dawuVar2 = dawwVar2.c;
                                if (dawuVar2 == null) {
                                    dawuVar2 = dawu.c;
                                }
                                daxa daxaVar = dawuVar2.b;
                                if (daxaVar == null) {
                                    daxaVar = daxa.d;
                                }
                                if ((daxaVar.a & 1) != 0) {
                                    dawu dawuVar3 = dawwVar2.c;
                                    if (dawuVar3 == null) {
                                        dawuVar3 = dawu.c;
                                    }
                                    daxa daxaVar2 = dawuVar3.b;
                                    if (daxaVar2 == null) {
                                        daxaVar2 = daxa.d;
                                    }
                                    String str5 = daxaVar2.b;
                                    if (bZ4.c) {
                                        bZ4.bF();
                                        bZ4.c = false;
                                    }
                                    par parVar = (par) bZ4.b;
                                    str5.getClass();
                                    parVar.a |= 1;
                                    parVar.b = str5;
                                }
                                dawu dawuVar4 = dawwVar2.c;
                                if (dawuVar4 == null) {
                                    dawuVar4 = dawu.c;
                                }
                                daxa daxaVar3 = dawuVar4.b;
                                if (daxaVar3 == null) {
                                    daxaVar3 = daxa.d;
                                }
                                if ((daxaVar3.a & 2) != 0) {
                                    dawu dawuVar5 = dawwVar2.c;
                                    if (dawuVar5 == null) {
                                        dawuVar5 = dawu.c;
                                    }
                                    daxa daxaVar4 = dawuVar5.b;
                                    if (daxaVar4 == null) {
                                        daxaVar4 = daxa.d;
                                    }
                                    String str6 = daxaVar4.c;
                                    if (bZ4.c) {
                                        bZ4.bF();
                                        bZ4.c = false;
                                    }
                                    par parVar2 = (par) bZ4.b;
                                    str6.getClass();
                                    parVar2.a |= 2;
                                    parVar2.c = str6;
                                }
                                par bK3 = bZ4.bK();
                                if (bZ2.c) {
                                    bZ2.bF();
                                    bZ2.c = false;
                                }
                                pas pasVar2 = (pas) bZ2.b;
                                bK3.getClass();
                                pasVar2.c = bK3;
                                pasVar2.a |= 2;
                            }
                            pcxVar.d(bK, bZ2.bK(), o);
                        } else {
                            ((ckcn) this.d.a.a(ckht.E)).a();
                        }
                    }
                }
            }
        }
    }
}
