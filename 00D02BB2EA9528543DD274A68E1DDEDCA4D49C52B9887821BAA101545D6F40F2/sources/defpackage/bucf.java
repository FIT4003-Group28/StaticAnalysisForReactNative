package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bucf  reason: default package */
/* loaded from: classes.dex */
public final class bucf extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dukb".equals(cls.getName())) {
            dyib<dukb, dukf> dyibVar = dhal.a;
            if (dyibVar == null) {
                synchronized (dhal.class) {
                    dyibVar = dhal.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.alias.v1.MobileMapsAliasService", "ListAliasSticker");
                        c.e = true;
                        c.a = dyyq.b(dukb.c);
                        c.b = dyyq.b(dukf.b);
                        dyibVar = c.a();
                        dhal.a = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("dvvi".equals(cls.getName())) {
            dyib<dvvi, dvvm> dyibVar2 = dhal.b;
            if (dyibVar2 == null) {
                synchronized (dhal.class) {
                    dyibVar2 = dhal.b;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.alias.v1.MobileMapsAliasService", "UpdateAlias");
                        c2.e = true;
                        c2.a = dyyq.b(dvvi.k);
                        c2.b = dyyq.b(dvvm.g);
                        dyibVar2 = c2.a();
                        dhal.b = dyibVar2;
                    }
                }
            }
            hashSet.add(dyibVar2);
        }
        return hashSet;
    }

    @Override // defpackage.bufb
    public final Set<Class<? extends dssj>> b() {
        HashSet hashSet = new HashSet();
        hashSet.add(dukb.class);
        hashSet.add(dvvi.class);
        return hashSet;
    }
}
