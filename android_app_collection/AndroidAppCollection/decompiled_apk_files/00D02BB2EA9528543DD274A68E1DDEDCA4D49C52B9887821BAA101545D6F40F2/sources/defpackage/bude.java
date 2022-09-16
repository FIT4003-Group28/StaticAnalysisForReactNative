package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bude  reason: default package */
/* loaded from: classes.dex */
public final class bude extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("diqb".equals(cls.getName())) {
            dyib<diqb, diqd> dyibVar = dhbh.i;
            if (dyibVar == null) {
                synchronized (dhbh.class) {
                    dyibVar = dhbh.i;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.localstream.v1.MobileMapsLocalStreamService", "CreateMutedPlaces");
                        c.e = true;
                        c.a = dyyq.b(diqb.a);
                        c.b = dyyq.b(diqd.a);
                        dyibVar = c.a();
                        dhbh.i = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("dlbi".equals(cls.getName())) {
            dyib<dlbi, dlbk> dyibVar2 = dhbh.c;
            if (dyibVar2 == null) {
                synchronized (dhbh.class) {
                    dyibVar2 = dhbh.c;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.localstream.v1.MobileMapsLocalStreamService", "DeleteCard");
                        c2.e = true;
                        c2.a = dyyq.b(dlbi.d);
                        c2.b = dyyq.b(dlbk.b);
                        dyibVar2 = c2.a();
                        dhbh.c = dyibVar2;
                    }
                }
            }
            hashSet.add(dyibVar2);
        }
        if ("diqf".equals(cls.getName())) {
            dyib<diqf, diqh> dyibVar3 = dhbh.j;
            if (dyibVar3 == null) {
                synchronized (dhbh.class) {
                    dyibVar3 = dhbh.j;
                    if (dyibVar3 == null) {
                        dyhx c3 = dyib.c();
                        c3.c = dyhz.UNARY;
                        c3.d = dyib.b("google.internal.mothership.maps.mobilemaps.localstream.v1.MobileMapsLocalStreamService", "DeleteMutedPlaces");
                        c3.e = true;
                        c3.a = dyyq.b(diqf.a);
                        c3.b = dyyq.b(diqh.a);
                        dyibVar3 = c3.a();
                        dhbh.j = dyibVar3;
                    }
                }
            }
            hashSet.add(dyibVar3);
        }
        if ("diqj".equals(cls.getName())) {
            dyib<diqj, diql> dyibVar4 = dhbh.f;
            if (dyibVar4 == null) {
                synchronized (dhbh.class) {
                    dyibVar4 = dhbh.f;
                    if (dyibVar4 == null) {
                        dyhx c4 = dyib.c();
                        c4.c = dyhz.UNARY;
                        c4.d = dyib.b("google.internal.mothership.maps.mobilemaps.localstream.v1.MobileMapsLocalStreamService", "DeleteTripDestinations");
                        c4.e = true;
                        c4.a = dyyq.b(diqj.d);
                        c4.b = dyyq.b(diql.a);
                        dyibVar4 = c4.a();
                        dhbh.f = dyibVar4;
                    }
                }
            }
            hashSet.add(dyibVar4);
        }
        if ("diqn".equals(cls.getName())) {
            dyib<diqn, diqp> dyibVar5 = dhbh.h;
            if (dyibVar5 == null) {
                synchronized (dhbh.class) {
                    dyibVar5 = dhbh.h;
                    if (dyibVar5 == null) {
                        dyhx c5 = dyib.c();
                        c5.c = dyhz.UNARY;
                        c5.d = dyib.b("google.internal.mothership.maps.mobilemaps.localstream.v1.MobileMapsLocalStreamService", "DisablePlaceLists");
                        c5.e = true;
                        c5.a = dyyq.b(diqn.a);
                        c5.b = dyyq.b(diqp.a);
                        dyibVar5 = c5.a();
                        dhbh.h = dyibVar5;
                    }
                }
            }
            hashSet.add(dyibVar5);
        }
        if ("diqr".equals(cls.getName())) {
            dyib<diqr, diqt> dyibVar6 = dhbh.g;
            if (dyibVar6 == null) {
                synchronized (dhbh.class) {
                    dyibVar6 = dhbh.g;
                    if (dyibVar6 == null) {
                        dyhx c6 = dyib.c();
                        c6.c = dyhz.UNARY;
                        c6.d = dyib.b("google.internal.mothership.maps.mobilemaps.localstream.v1.MobileMapsLocalStreamService", "EnablePlaceLists");
                        c6.e = true;
                        c6.a = dyyq.b(diqr.a);
                        c6.b = dyyq.b(diqt.a);
                        dyibVar6 = c6.a();
                        dhbh.g = dyibVar6;
                    }
                }
            }
            hashSet.add(dyibVar6);
        }
        if ("dirb".equals(cls.getName())) {
            dyib<dirb, dird> dyibVar7 = dhbh.a;
            if (dyibVar7 == null) {
                synchronized (dhbh.class) {
                    dyibVar7 = dhbh.a;
                    if (dyibVar7 == null) {
                        dyhx c7 = dyib.c();
                        c7.c = dyhz.UNARY;
                        c7.d = dyib.b("google.internal.mothership.maps.mobilemaps.localstream.v1.MobileMapsLocalStreamService", "GetLocalStream");
                        c7.e = true;
                        c7.a = dyyq.b(dirb.l);
                        c7.b = dyyq.b(dird.k);
                        dyibVar7 = c7.a();
                        dhbh.a = dyibVar7;
                    }
                }
            }
            hashSet.add(dyibVar7);
        }
        if ("diqx".equals(cls.getName())) {
            dyib<diqx, diqz> dyibVar8 = dhbh.d;
            if (dyibVar8 == null) {
                synchronized (dhbh.class) {
                    dyibVar8 = dhbh.d;
                    if (dyibVar8 == null) {
                        dyhx c8 = dyib.c();
                        c8.c = dyhz.UNARY;
                        c8.d = dyib.b("google.internal.mothership.maps.mobilemaps.localstream.v1.MobileMapsLocalStreamService", "ListFollowEntities");
                        c8.e = true;
                        c8.a = dyyq.b(diqx.g);
                        c8.b = dyyq.b(diqz.f);
                        dyibVar8 = c8.a();
                        dhbh.d = dyibVar8;
                    }
                }
            }
            hashSet.add(dyibVar8);
        }
        if ("dlbm".equals(cls.getName())) {
            dyib<dlbm, dlbo> dyibVar9 = dhbh.b;
            if (dyibVar9 == null) {
                synchronized (dhbh.class) {
                    dyibVar9 = dhbh.b;
                    if (dyibVar9 == null) {
                        dyhx c9 = dyib.c();
                        c9.c = dyhz.UNARY;
                        c9.d = dyib.b("google.internal.mothership.maps.mobilemaps.localstream.v1.MobileMapsLocalStreamService", "SendFeedback");
                        c9.e = true;
                        c9.a = dyyq.b(dlbm.a);
                        c9.b = dyyq.b(dlbo.a);
                        dyibVar9 = c9.a();
                        dhbh.b = dyibVar9;
                    }
                }
            }
            hashSet.add(dyibVar9);
        }
        if ("dirf".equals(cls.getName())) {
            dyib<dirf, dirj> dyibVar10 = dhbh.e;
            if (dyibVar10 == null) {
                synchronized (dhbh.class) {
                    dyibVar10 = dhbh.e;
                    if (dyibVar10 == null) {
                        dyhx c10 = dyib.c();
                        c10.c = dyhz.UNARY;
                        c10.d = dyib.b("google.internal.mothership.maps.mobilemaps.localstream.v1.MobileMapsLocalStreamService", "UpdateAreas");
                        c10.e = true;
                        c10.a = dyyq.b(dirf.f);
                        c10.b = dyyq.b(dirj.e);
                        dyibVar10 = c10.a();
                        dhbh.e = dyibVar10;
                    }
                }
            }
            hashSet.add(dyibVar10);
        }
        if ("dlbq".equals(cls.getName())) {
            dyib<dlbq, dlbu> dyibVar11 = dhbh.k;
            if (dyibVar11 == null) {
                synchronized (dhbh.class) {
                    dyibVar11 = dhbh.k;
                    if (dyibVar11 == null) {
                        dyhx c11 = dyib.c();
                        c11.c = dyhz.UNARY;
                        c11.d = dyib.b("google.internal.mothership.maps.mobilemaps.localstream.v1.MobileMapsLocalStreamService", "VerifyArea");
                        c11.e = true;
                        c11.a = dyyq.b(dlbq.f);
                        c11.b = dyyq.b(dlbu.c);
                        dyibVar11 = c11.a();
                        dhbh.k = dyibVar11;
                    }
                }
            }
            hashSet.add(dyibVar11);
        }
        return hashSet;
    }

    @Override // defpackage.bufb
    public final Set<Class<? extends dssj>> b() {
        HashSet hashSet = new HashSet();
        hashSet.add(diqb.class);
        hashSet.add(dlbi.class);
        hashSet.add(diqf.class);
        hashSet.add(diqj.class);
        hashSet.add(diqn.class);
        hashSet.add(diqr.class);
        hashSet.add(dirb.class);
        hashSet.add(diqx.class);
        hashSet.add(dlbm.class);
        hashSet.add(dirf.class);
        hashSet.add(dlbq.class);
        return hashSet;
    }
}
