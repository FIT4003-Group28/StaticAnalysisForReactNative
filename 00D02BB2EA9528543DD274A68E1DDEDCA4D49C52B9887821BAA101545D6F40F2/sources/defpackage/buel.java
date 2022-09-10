package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: buel  reason: default package */
/* loaded from: classes.dex */
public final class buel extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dwco".equals(cls.getName())) {
            dyib<dwco, dwcq> dyibVar = dhco.c;
            if (dyibVar == null) {
                synchronized (dhco.class) {
                    dyibVar = dhco.c;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.todolist.v1.MobileMapsTodoListService", "DismissTodoItem");
                        c.e = true;
                        c.a = dyyq.b(dwco.f);
                        c.b = dyyq.b(dwcq.c);
                        dyibVar = c.a();
                        dhco.c = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("dixk".equals(cls.getName())) {
            dyib<dixk, dixm> dyibVar2 = dhco.a;
            if (dyibVar2 == null) {
                synchronized (dhco.class) {
                    dyibVar2 = dhco.a;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.todolist.v1.MobileMapsTodoListService", "GetMultiTodoList");
                        c2.e = true;
                        c2.a = dyyq.b(dixk.b);
                        c2.b = dyyq.b(dixm.b);
                        dyibVar2 = c2.a();
                        dhco.a = dyibVar2;
                    }
                }
            }
            hashSet.add(dyibVar2);
        }
        if ("dwmp".equals(cls.getName())) {
            dyib<dwmp, dwmt> dyibVar3 = dhco.d;
            if (dyibVar3 == null) {
                synchronized (dhco.class) {
                    dyibVar3 = dhco.d;
                    if (dyibVar3 == null) {
                        dyhx c3 = dyib.c();
                        c3.c = dyhz.UNARY;
                        c3.d = dyib.b("google.internal.mothership.maps.mobilemaps.todolist.v1.MobileMapsTodoListService", "GetTodoList");
                        c3.e = true;
                        c3.a = dyyq.b(dwmp.q);
                        c3.b = dyyq.b(dwmt.d);
                        dyibVar3 = c3.a();
                        dhco.d = dyibVar3;
                    }
                }
            }
            hashSet.add(dyibVar3);
        }
        if ("dimw".equals(cls.getName())) {
            dyib<dimw, dimy> dyibVar4 = dhco.b;
            if (dyibVar4 == null) {
                synchronized (dhco.class) {
                    dyibVar4 = dhco.b;
                    if (dyibVar4 == null) {
                        dyhx c4 = dyib.c();
                        c4.c = dyhz.UNARY;
                        c4.d = dyib.b("google.internal.mothership.maps.mobilemaps.todolist.v1.MobileMapsTodoListService", "ListTodoBundles");
                        c4.e = true;
                        c4.a = dyyq.b(dimw.a);
                        c4.b = dyyq.b(dimy.a);
                        dyibVar4 = c4.a();
                        dhco.b = dyibVar4;
                    }
                }
            }
            hashSet.add(dyibVar4);
        }
        return hashSet;
    }

    @Override // defpackage.bufb
    public final Set<Class<? extends dssj>> b() {
        HashSet hashSet = new HashSet();
        hashSet.add(dwco.class);
        hashSet.add(dixk.class);
        hashSet.add(dwmp.class);
        hashSet.add(dimw.class);
        return hashSet;
    }
}
