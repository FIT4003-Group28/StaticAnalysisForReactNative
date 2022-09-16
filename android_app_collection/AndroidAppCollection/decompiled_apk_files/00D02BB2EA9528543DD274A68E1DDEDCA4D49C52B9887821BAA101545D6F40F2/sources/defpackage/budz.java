package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: budz  reason: default package */
/* loaded from: classes.dex */
public final class budz extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dhri".equals(cls.getName())) {
            dyib<dhri, dhrk> dyibVar = dhcc.a;
            if (dyibVar == null) {
                synchronized (dhcc.class) {
                    dyibVar = dhcc.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.receipt.v1.MobileMapsReceiptService", "CreateReceipt");
                        c.e = true;
                        c.a = dyyq.b(dhri.a);
                        c.b = dyyq.b(dhrk.a);
                        dyibVar = c.a();
                        dhcc.a = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("dhwi".equals(cls.getName())) {
            dyib<dhwi, dhwk> dyibVar2 = dhcc.b;
            if (dyibVar2 == null) {
                synchronized (dhcc.class) {
                    dyibVar2 = dhcc.b;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.receipt.v1.MobileMapsReceiptService", "DonateReceipt");
                        c2.e = true;
                        c2.a = dyyq.b(dhwi.a);
                        c2.b = dyyq.b(dhwk.a);
                        dyibVar2 = c2.a();
                        dhcc.b = dyibVar2;
                    }
                }
            }
            hashSet.add(dyibVar2);
        }
        if ("diez".equals(cls.getName())) {
            dyib<diez, diff> dyibVar3 = dhcc.d;
            if (dyibVar3 == null) {
                synchronized (dhcc.class) {
                    dyibVar3 = dhcc.d;
                    if (dyibVar3 == null) {
                        dyhx c3 = dyib.c();
                        c3.c = dyhz.UNARY;
                        c3.d = dyib.b("google.internal.mothership.maps.mobilemaps.receipt.v1.MobileMapsReceiptService", "GetReceiptUserConsent");
                        c3.e = true;
                        c3.a = dyyq.b(diez.c);
                        c3.b = dyyq.b(diff.b);
                        dyibVar3 = c3.a();
                        dhcc.d = dyibVar3;
                    }
                }
            }
            hashSet.add(dyibVar3);
        }
        if ("dixa".equals(cls.getName())) {
            dyib<dixa, dixc> dyibVar4 = dhcc.e;
            if (dyibVar4 == null) {
                synchronized (dhcc.class) {
                    dyibVar4 = dhcc.e;
                    if (dyibVar4 == null) {
                        dyhx c4 = dyib.c();
                        c4.c = dyhz.UNARY;
                        c4.d = dyib.b("google.internal.mothership.maps.mobilemaps.receipt.v1.MobileMapsReceiptService", "MarkPhotoAsReceipt");
                        c4.e = true;
                        c4.a = dyyq.b(dixa.e);
                        c4.b = dyyq.b(dixc.a);
                        dyibVar4 = c4.a();
                        dhcc.e = dyibVar4;
                    }
                }
            }
            hashSet.add(dyibVar4);
        }
        if ("dlxy".equals(cls.getName())) {
            dyib<dlxy, dlya> dyibVar5 = dhcc.c;
            if (dyibVar5 == null) {
                synchronized (dhcc.class) {
                    dyibVar5 = dhcc.c;
                    if (dyibVar5 == null) {
                        dyhx c5 = dyib.c();
                        c5.c = dyhz.UNARY;
                        c5.d = dyib.b("google.internal.mothership.maps.mobilemaps.receipt.v1.MobileMapsReceiptService", "UpdateReceiptUserConsent");
                        c5.e = true;
                        c5.a = dyyq.b(dlxy.c);
                        c5.b = dyyq.b(dlya.a);
                        dyibVar5 = c5.a();
                        dhcc.c = dyibVar5;
                    }
                }
            }
            hashSet.add(dyibVar5);
        }
        return hashSet;
    }

    @Override // defpackage.bufb
    public final Set<Class<? extends dssj>> b() {
        HashSet hashSet = new HashSet();
        hashSet.add(dhri.class);
        hashSet.add(dhwi.class);
        hashSet.add(diez.class);
        hashSet.add(dixa.class);
        hashSet.add(dlxy.class);
        return hashSet;
    }
}
