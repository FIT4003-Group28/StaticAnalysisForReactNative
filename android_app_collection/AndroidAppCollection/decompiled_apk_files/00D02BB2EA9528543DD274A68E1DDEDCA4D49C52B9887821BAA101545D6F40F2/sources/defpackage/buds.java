package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: buds  reason: default package */
/* loaded from: classes.dex */
public final class buds extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dhlp".equals(cls.getName())) {
            dyib<dhlp, dhlr> dyibVar = dhbv.a;
            if (dyibVar == null) {
                synchronized (dhbv.class) {
                    dyibVar = dhbv.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.photo.v1.MobileMapsPhotoService", "AssociatePhoto");
                        c.e = true;
                        c.a = dyyq.b(dhlp.e);
                        c.b = dyyq.b(dhlr.a);
                        dyibVar = c.a();
                        dhbv.a = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("dhva".equals(cls.getName())) {
            dyib<dhva, dhve> dyibVar2 = dhbv.b;
            if (dyibVar2 == null) {
                synchronized (dhbv.class) {
                    dyibVar2 = dhbv.b;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.photo.v1.MobileMapsPhotoService", "DeletePhoto");
                        c2.e = true;
                        c2.a = dyyq.b(dhva.d);
                        c2.b = dyyq.b(dhve.b);
                        dyibVar2 = c2.a();
                        dhbv.b = dyibVar2;
                    }
                }
            }
            hashSet.add(dyibVar2);
        }
        if ("dupe".equals(cls.getName())) {
            dyib<dupe, dupg> dyibVar3 = dhbv.c;
            if (dyibVar3 == null) {
                synchronized (dhbv.class) {
                    dyibVar3 = dhbv.c;
                    if (dyibVar3 == null) {
                        dyhx c3 = dyib.c();
                        c3.c = dyhz.UNARY;
                        c3.d = dyib.b("google.internal.mothership.maps.mobilemaps.photo.v1.MobileMapsPhotoService", "DismissPrivatePhoto");
                        c3.e = true;
                        c3.a = dyyq.b(dupe.e);
                        c3.b = dyyq.b(dupg.b);
                        dyibVar3 = c3.a();
                        dhbv.c = dyibVar3;
                    }
                }
            }
            hashSet.add(dyibVar3);
        }
        if ("dwge".equals(cls.getName())) {
            dyib<dwge, dwgl> dyibVar4 = dhbv.d;
            if (dyibVar4 == null) {
                synchronized (dhbv.class) {
                    dyibVar4 = dhbv.d;
                    if (dyibVar4 == null) {
                        dyhx c4 = dyib.c();
                        c4.c = dyhz.UNARY;
                        c4.d = dyib.b("google.internal.mothership.maps.mobilemaps.photo.v1.MobileMapsPhotoService", "ListEntityPhotos");
                        c4.e = true;
                        c4.a = dyyq.b(dwge.m);
                        c4.b = dyyq.b(dwgl.i);
                        dyibVar4 = c4.a();
                        dhbv.d = dyibVar4;
                    }
                }
            }
            hashSet.add(dyibVar4);
        }
        if ("dwnd".equals(cls.getName())) {
            dyib<dwnd, dwnf> dyibVar5 = dhbv.e;
            if (dyibVar5 == null) {
                synchronized (dhbv.class) {
                    dyibVar5 = dhbv.e;
                    if (dyibVar5 == null) {
                        dyhx c5 = dyib.c();
                        c5.c = dyhz.UNARY;
                        c5.d = dyib.b("google.internal.mothership.maps.mobilemaps.photo.v1.MobileMapsPhotoService", "ListPrivatePhotos");
                        c5.e = true;
                        c5.a = dyyq.b(dwnd.e);
                        c5.b = dyyq.b(dwnf.f);
                        dyibVar5 = c5.a();
                        dhbv.e = dyibVar5;
                    }
                }
            }
            hashSet.add(dyibVar5);
        }
        if ("dkdg".equals(cls.getName())) {
            dyib<dkdg, dkdm> dyibVar6 = dhbv.f;
            if (dyibVar6 == null) {
                synchronized (dhbv.class) {
                    dyibVar6 = dhbv.f;
                    if (dyibVar6 == null) {
                        dyhx c6 = dyib.c();
                        c6.c = dyhz.UNARY;
                        c6.d = dyib.b("google.internal.mothership.maps.mobilemaps.photo.v1.MobileMapsPhotoService", "ListUserPhotos");
                        c6.e = true;
                        c6.a = dyyq.b(dkdg.j);
                        c6.b = dyyq.b(dkdm.e);
                        dyibVar6 = c6.a();
                        dhbv.f = dyibVar6;
                    }
                }
            }
            hashSet.add(dyibVar6);
        }
        if ("dwgr".equals(cls.getName())) {
            dyib<dwgr, dwgt> dyibVar7 = dhbv.g;
            if (dyibVar7 == null) {
                synchronized (dhbv.class) {
                    dyibVar7 = dhbv.g;
                    if (dyibVar7 == null) {
                        dyhx c7 = dyib.c();
                        c7.c = dyhz.UNARY;
                        c7.d = dyib.b("google.internal.mothership.maps.mobilemaps.photo.v1.MobileMapsPhotoService", "TakedownPhoto");
                        c7.e = true;
                        c7.a = dyyq.b(dwgr.g);
                        c7.b = dyyq.b(dwgt.a);
                        dyibVar7 = c7.a();
                        dhbv.g = dyibVar7;
                    }
                }
            }
            hashSet.add(dyibVar7);
        }
        if ("dwvf".equals(cls.getName())) {
            dyib<dwvf, dwvj> dyibVar8 = dhbv.h;
            if (dyibVar8 == null) {
                synchronized (dhbv.class) {
                    dyibVar8 = dhbv.h;
                    if (dyibVar8 == null) {
                        dyhx c8 = dyib.c();
                        c8.c = dyhz.UNARY;
                        c8.d = dyib.b("google.internal.mothership.maps.mobilemaps.photo.v1.MobileMapsPhotoService", "UpdatePhoto");
                        c8.e = true;
                        c8.a = dyyq.b(dwvf.e);
                        c8.b = dyyq.b(dwvj.b);
                        dyibVar8 = c8.a();
                        dhbv.h = dyibVar8;
                    }
                }
            }
            hashSet.add(dyibVar8);
        }
        if ("dizr".equals(cls.getName())) {
            dyib<dizr, dizt> dyibVar9 = dhbv.i;
            if (dyibVar9 == null) {
                synchronized (dhbv.class) {
                    dyibVar9 = dhbv.i;
                    if (dyibVar9 == null) {
                        dyhx c9 = dyib.c();
                        c9.c = dyhz.UNARY;
                        c9.d = dyib.b("google.internal.mothership.maps.mobilemaps.photo.v1.MobileMapsPhotoService", "VotePhoto");
                        c9.e = true;
                        c9.a = dyyq.b(dizr.f);
                        c9.b = dyyq.b(dizt.a);
                        dyibVar9 = c9.a();
                        dhbv.i = dyibVar9;
                    }
                }
            }
            hashSet.add(dyibVar9);
        }
        return hashSet;
    }

    @Override // defpackage.bufb
    public final Set<Class<? extends dssj>> b() {
        HashSet hashSet = new HashSet();
        hashSet.add(dhlp.class);
        hashSet.add(dhva.class);
        hashSet.add(dupe.class);
        hashSet.add(dwge.class);
        hashSet.add(dwnd.class);
        hashSet.add(dkdg.class);
        hashSet.add(dwgr.class);
        hashSet.add(dwvf.class);
        hashSet.add(dizr.class);
        return hashSet;
    }
}
