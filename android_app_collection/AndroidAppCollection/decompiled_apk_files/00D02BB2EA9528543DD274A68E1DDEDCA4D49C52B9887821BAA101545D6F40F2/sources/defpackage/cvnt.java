package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cvnt  reason: default package */
/* loaded from: classes5.dex */
public final class cvnt extends cvob<dryj, dryl> {
    private final cvki b;
    private final cvmy c;

    public cvnt(cvmy cvmyVar, cvki cvkiVar) {
        this.c = cvmyVar;
        this.b = cvkiVar;
    }

    @Override // defpackage.cvob
    protected final String a() {
        return "BatchUpdateThreadStateCallback";
    }

    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v26 */
    @Override // defpackage.cvob
    public final cvmr<dryj, dryl> b(Bundle bundle) {
        int i;
        int i2;
        boolean z;
        String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        List<cvkh> b = this.b.b(string, 100);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<cvkh> it = b.iterator();
        while (true) {
            i = 1;
            i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            try {
                cvtg cvtgVar = (cvtg) dsqw.cq(cvtg.f, it.next().c());
                dsef dsefVar = cvtgVar.c;
                if (dsefVar == null) {
                    dsefVar = dsef.f;
                }
                String str = cvtgVar.e;
                int a = drxe.a(cvtgVar.d);
                if (a != 0) {
                    i = a;
                }
                cvnr cvnrVar = new cvnr(dsefVar, str, i);
                if (!linkedHashMap.containsKey(cvnrVar)) {
                    linkedHashMap.put(cvnrVar, new HashSet());
                }
                ((Set) linkedHashMap.get(cvnrVar)).addAll(cvtgVar.b);
            } catch (dsrm unused) {
                cvlw.e("BatchUpdateThreadStateHandler", "Unable to parse SdkBatchedUpdate message", new Object[0]);
            }
        }
        ArrayList<cvtg> arrayList = new ArrayList();
        Iterator it2 = linkedHashMap.keySet().iterator();
        while (true) {
            int i3 = 2;
            if (it2.hasNext()) {
                cvns cvnsVar = (cvns) it2.next();
                cvtf bZ = cvtg.f.bZ();
                dsef a2 = cvnsVar.a();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                cvtg cvtgVar2 = (cvtg) bZ.b;
                a2.getClass();
                cvtgVar2.c = a2;
                cvtgVar2.a |= 1;
                String b2 = cvnsVar.b();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                cvtg cvtgVar3 = (cvtg) bZ.b;
                b2.getClass();
                cvtgVar3.a = 4 | cvtgVar3.a;
                cvtgVar3.e = b2;
                Iterable iterable = (Iterable) linkedHashMap.get(cvnsVar);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                cvtg cvtgVar4 = (cvtg) bZ.b;
                cvtgVar4.b();
                dsod.bv(iterable, cvtgVar4.b);
                int c = cvnsVar.c();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                cvtg cvtgVar5 = (cvtg) bZ.b;
                int i4 = c - 1;
                if (c == 0) {
                    throw null;
                }
                cvtgVar5.d = i4;
                cvtgVar5.a |= 2;
                arrayList.add(bZ.bK());
            } else {
                cvmy cvmyVar = this.c;
                cvmw cvmwVar = cvmyVar.a;
                dryi bZ2 = dryj.d.bZ();
                String a3 = cvmwVar.a.a();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dryj dryjVar = (dryj) bZ2.b;
                a3.getClass();
                dryjVar.a |= 1;
                dryjVar.b = a3;
                for (cvtg cvtgVar6 : arrayList) {
                    dsef dsefVar2 = cvtgVar6.c;
                    if (dsefVar2 == null) {
                        dsefVar2 = dsef.f;
                    }
                    String str2 = cvtgVar6.e;
                    int a4 = drxe.a(cvtgVar6.d);
                    if (a4 == 0) {
                        a4 = 1;
                    }
                    dsrj<dsbc> dsrjVar = cvtgVar6.b;
                    dryg bZ3 = dryh.e.bZ();
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = i2;
                    }
                    dryh dryhVar = (dryh) bZ3.b;
                    dsefVar2.getClass();
                    dryhVar.c = dsefVar2;
                    dryhVar.a |= i;
                    drxg bZ4 = drxj.e.bZ();
                    try {
                        dsay a5 = cvmwVar.b.a();
                        if (bZ4.c) {
                            bZ4.bF();
                            bZ4.c = i2;
                        }
                        drxj drxjVar = (drxj) bZ4.b;
                        a5.getClass();
                        drxjVar.b = a5;
                        drxjVar.a = i3;
                    } catch (cvml unused2) {
                        cvlw.f("BatchUpdateThreadStateRequestBuilder", "Failed to create target for analyticsinfo", new Object[i2]);
                        Object[] objArr = new Object[1];
                        objArr[i2] = cvmwVar.a.a();
                        String format = String.format("Chime Android SDK - Client Id [%s]", objArr);
                        if (bZ4.c) {
                            bZ4.bF();
                            bZ4.c = i2;
                        }
                        drxj drxjVar2 = (drxj) bZ4.b;
                        format.getClass();
                        drxjVar2.a = 1;
                        drxjVar2.b = format;
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        drxc bZ5 = drxf.e.bZ();
                        if (bZ5.c) {
                            bZ5.bF();
                            bZ5.c = i2;
                        }
                        drxf drxfVar = (drxf) bZ5.b;
                        char c2 = 65535;
                        drxfVar.d = a4 - 1;
                        drxfVar.a |= 4;
                        int hashCode = str2.hashCode();
                        if (hashCode != -522037453) {
                            if (hashCode != 742466871) {
                                if (hashCode == 1647722549 && str2.equals("com.google.android.libraries.notifications.NOTIFICATION_CLICKED")) {
                                    c2 = 0;
                                }
                            } else if (str2.equals("com.google.android.libraries.notifications.NOTIFICATION_DISMISSED")) {
                                c2 = 1;
                            }
                        } else if (str2.equals("com.google.android.libraries.notifications.NOTIFICATION_EXPIRED")) {
                            c2 = 2;
                        }
                        if (c2 == 0) {
                            drxf drxfVar2 = (drxf) bZ5.b;
                            drxfVar2.b = 2;
                            drxfVar2.a |= 1;
                        } else if (c2 == 1) {
                            drxf drxfVar3 = (drxf) bZ5.b;
                            drxfVar3.b = 3;
                            drxfVar3.a |= 1;
                        } else if (c2 == 2) {
                            drxf drxfVar4 = (drxf) bZ5.b;
                            drxfVar4.b = 4;
                            drxfVar4.a |= 1;
                        } else {
                            drxf drxfVar5 = (drxf) bZ5.b;
                            drxfVar5.b = 1;
                            int i5 = drxfVar5.a | 1;
                            drxfVar5.a = i5;
                            str2.getClass();
                            drxfVar5.a = i5 | 2;
                            drxfVar5.c = str2;
                        }
                        if (bZ4.c) {
                            bZ4.bF();
                            bZ4.c = false;
                        }
                        drxj drxjVar3 = (drxj) bZ4.b;
                        drxf bK = bZ5.bK();
                        bK.getClass();
                        drxjVar3.d = bK;
                        drxjVar3.c = 4;
                    }
                    drxj bK2 = bZ4.bK();
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dryh dryhVar2 = (dryh) bZ3.b;
                    bK2.getClass();
                    dryhVar2.d = bK2;
                    dryhVar2.a |= 2;
                    dryh dryhVar3 = (dryh) bZ3.b;
                    dsrj<dsbc> dsrjVar2 = dryhVar3.b;
                    if (!dsrjVar2.a()) {
                        dryhVar3.b = dsqw.cl(dsrjVar2);
                    }
                    dsod.bv(dsrjVar, dryhVar3.b);
                    if (bZ2.c) {
                        bZ2.bF();
                        z = false;
                        bZ2.c = false;
                    } else {
                        z = false;
                    }
                    dryj dryjVar2 = (dryj) bZ2.b;
                    dryh bK3 = bZ3.bK();
                    bK3.getClass();
                    dsrj<dryh> dsrjVar3 = dryjVar2.c;
                    if (!dsrjVar3.a()) {
                        dryjVar2.c = dsqw.cl(dsrjVar3);
                    }
                    dryjVar2.c.add(bK3);
                    i = 1;
                    i3 = 2;
                    i2 = z;
                }
                dryj bK4 = bZ2.bK();
                cvty<dryl> f = cvmyVar.b.f(string, bK4);
                cvmyVar.a(string, f, 17);
                cvmr<dryj, dryl> f2 = cvmr.f(bK4, f);
                if (!f2.e() || !f2.d()) {
                    this.b.c(string, b);
                }
                return f2;
            }
        }
    }

    @Override // defpackage.cvle
    public final String c() {
        return "RPC_BATCH_UPDATE_THREAD_STATE";
    }
}
