package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bucn  reason: default package */
/* loaded from: classes.dex */
public final class bucn extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dvjl".equals(cls.getName())) {
            dyib<dvjl, dvjn> dyibVar = dhas.c;
            if (dyibVar == null) {
                synchronized (dhas.class) {
                    dyibVar = dhas.c;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.contact.v1.MobileMapsContactService", "AutocompleteContacts");
                        c.e = true;
                        c.a = dyyq.b(dvjl.d);
                        c.b = dyyq.b(dvjn.b);
                        dyibVar = c.a();
                        dhas.c = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("dvjp".equals(cls.getName())) {
            dyib<dvjp, dvjr> dyibVar2 = dhas.b;
            if (dyibVar2 == null) {
                synchronized (dhas.class) {
                    dyibVar2 = dhas.b;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.contact.v1.MobileMapsContactService", "GetContact");
                        c2.e = true;
                        c2.a = dyyq.b(dvjp.c);
                        c2.b = dyyq.b(dvjr.e);
                        dyibVar2 = c2.a();
                        dhas.b = dyibVar2;
                    }
                }
            }
            hashSet.add(dyibVar2);
        }
        if ("dvjt".equals(cls.getName())) {
            dyib<dvjt, dvjv> dyibVar3 = dhas.a;
            if (dyibVar3 == null) {
                synchronized (dhas.class) {
                    dyibVar3 = dhas.a;
                    if (dyibVar3 == null) {
                        dyhx c3 = dyib.c();
                        c3.c = dyhz.UNARY;
                        c3.d = dyib.b("google.internal.mothership.maps.mobilemaps.contact.v1.MobileMapsContactService", "WriteContact");
                        c3.e = true;
                        c3.a = dyyq.b(dvjt.h);
                        c3.b = dyyq.b(dvjv.b);
                        dyibVar3 = c3.a();
                        dhas.a = dyibVar3;
                    }
                }
            }
            hashSet.add(dyibVar3);
        }
        return hashSet;
    }

    @Override // defpackage.bufb
    public final Set<Class<? extends dssj>> b() {
        HashSet hashSet = new HashSet();
        hashSet.add(dvjl.class);
        hashSet.add(dvjp.class);
        hashSet.add(dvjt.class);
        return hashSet;
    }
}
