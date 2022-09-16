package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: cvoc  reason: default package */
/* loaded from: classes5.dex */
public final class cvoc extends cvob<drzq, drzs> {
    private final cvki b;
    private final cvmy c;

    public cvoc(cvmy cvmyVar, cvki cvkiVar) {
        this.c = cvmyVar;
        this.b = cvkiVar;
    }

    @Override // defpackage.cvob
    protected final String a() {
        return "SetUserPrereferenceCallback";
    }

    @Override // defpackage.cvob
    public final cvmr<drzq, drzs> b(Bundle bundle) {
        cvmr<drzq, drzs> a;
        dsae bK;
        cviy cviyVar;
        drxx drxxVar;
        cvja cvjaVar;
        String str;
        String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        int i = bundle.getInt("com.google.android.libraries.notifications.internal.scheduled.impl.INTENT_EXTRA_INCLUDE_TARGET");
        List<cvkh> b = this.b.b(string, 6);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<cvkh> it = b.iterator();
        while (true) {
            String str2 = "";
            boolean z = false;
            if (!it.hasNext()) {
                ArrayList arrayList = new ArrayList(linkedHashMap.values());
                if (!arrayList.isEmpty()) {
                    cvmy cvmyVar = this.c;
                    cvjc cvjcVar = new cvjc();
                    cvjcVar.a = arrayList;
                    if (cvjcVar.a == null) {
                        str2 = " preferenceEntries";
                    }
                    if (!str2.isEmpty()) {
                        throw new IllegalStateException(str2.length() != 0 ? "Missing required properties:".concat(str2) : new String("Missing required properties:"));
                    }
                    cvjd cvjdVar = new cvjd(cvjcVar.a);
                    try {
                        cvnk cvnkVar = cvmyVar.i;
                        drzp bZ = drzq.e.bZ();
                        String a2 = cvnkVar.a.a();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        drzq drzqVar = (drzq) bZ.b;
                        a2.getClass();
                        drzqVar.a |= 1;
                        drzqVar.b = a2;
                        for (cvje cvjeVar : cvjdVar.a) {
                            dsad bZ2 = dsae.d.bZ();
                            cvjg a3 = cvjeVar.a();
                            drxw bZ3 = drxx.d.bZ();
                            String a4 = a3.a();
                            if (bZ3.c) {
                                bZ3.bF();
                                bZ3.c = z;
                            }
                            drxx drxxVar2 = (drxx) bZ3.b;
                            a4.getClass();
                            drxxVar2.a |= 1;
                            drxxVar2.b = a4;
                            if (!TextUtils.isEmpty(a3.b())) {
                                String b2 = a3.b();
                                if (bZ3.c) {
                                    bZ3.bF();
                                    bZ3.c = false;
                                }
                                drxx drxxVar3 = (drxx) bZ3.b;
                                b2.getClass();
                                drxxVar3.a |= 2;
                                drxxVar3.c = b2;
                            }
                            drxx bK2 = bZ3.bK();
                            if (bZ2.c) {
                                bZ2.bF();
                                bZ2.c = false;
                            }
                            dsae dsaeVar = (dsae) bZ2.b;
                            bK2.getClass();
                            dsaeVar.b = bK2;
                            dsaeVar.a |= 1;
                            int b3 = cvjeVar.b();
                            int i2 = b3 - 1;
                            if (b3 == 0) {
                                throw null;
                            }
                            int i3 = i2 != 1 ? i2 != 2 ? 1 : 2 : 3;
                            if (bZ2.c) {
                                bZ2.bF();
                                bZ2.c = false;
                            }
                            dsae dsaeVar2 = (dsae) bZ2.b;
                            dsaeVar2.c = i3 - 1;
                            dsaeVar2.a |= 2;
                            dsae bK3 = bZ2.bK();
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            drzq drzqVar2 = (drzq) bZ.b;
                            bK3.getClass();
                            dsrj<dsae> dsrjVar = drzqVar2.c;
                            if (!dsrjVar.a()) {
                                drzqVar2.c = dsqw.cl(dsrjVar);
                            }
                            drzqVar2.c.add(bK3);
                            z = false;
                        }
                        if (i == 1) {
                            dsay a5 = cvnkVar.b.a();
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            drzq drzqVar3 = (drzq) bZ.b;
                            a5.getClass();
                            drzqVar3.d = a5;
                            drzqVar3.a |= 4;
                        }
                        drzq bK4 = bZ.bK();
                        cvty<drzs> i4 = cvmyVar.b.i(string, bK4);
                        cvmyVar.a(string, i4, 22);
                        a = cvmr.f(bK4, i4);
                    } catch (cvml e) {
                        cvmp g = cvmr.g();
                        g.c = e;
                        g.b(true);
                        a = g.a();
                    }
                } else {
                    cvmp g2 = cvmr.g();
                    g2.c = new IllegalArgumentException("No preferences to set.");
                    g2.b(false);
                    a = g2.a();
                }
                if (!a.e() || !a.d()) {
                    this.b.c(string, b);
                }
                return a;
            }
            cvkh next = it.next();
            try {
                dsae dsaeVar3 = dsae.d;
                dsqp dsqpVar = (dsqp) dsaeVar3.cu(5);
                dsqpVar.bC(dsaeVar3);
                bK = ((dsad) ((dsad) dsqpVar).by(next.c())).bK();
                cviyVar = new cviy();
                drxxVar = bK.b;
                if (drxxVar == null) {
                    drxxVar = drxx.d;
                }
                cvjaVar = new cvja();
                str = drxxVar.b;
            } catch (dsrm unused) {
                cvlw.e("SetUserPreferenceHandler", "Failed to parse PreferenceEntry from ChimeTaskData", new Object[0]);
            }
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            cvjaVar.a = str;
            if (!drxxVar.c.isEmpty()) {
                cvjaVar.b = drxxVar.c;
            }
            String str3 = cvjaVar.a == null ? " key" : str2;
            if (!str3.isEmpty()) {
                throw new IllegalStateException(str3.length() != 0 ? "Missing required properties:".concat(str3) : new String("Missing required properties:"));
            }
            cviyVar.a = new cvjb(cvjaVar.a, cvjaVar.b);
            int a6 = dsac.a(bK.c);
            if (a6 == 0) {
                a6 = 1;
            }
            int i5 = a6 - 1;
            cviyVar.b = i5 != 1 ? i5 != 2 ? 1 : 2 : 3;
            if (cviyVar.a == null) {
                str2 = " preferenceKey";
            }
            if (!str2.isEmpty()) {
                throw new IllegalStateException(str2.length() != 0 ? "Missing required properties:".concat(str2) : new String("Missing required properties:"));
            }
            cviz cvizVar = new cviz(cviyVar.a, cviyVar.b);
            linkedHashMap.put(cvizVar.a, cvizVar);
        }
    }

    @Override // defpackage.cvle
    public final String c() {
        return "RPC_SET_USER_PREFERENCE";
    }
}
