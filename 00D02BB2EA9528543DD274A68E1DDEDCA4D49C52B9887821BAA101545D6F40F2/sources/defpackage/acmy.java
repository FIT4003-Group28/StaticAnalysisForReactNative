package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: acmy  reason: default package */
/* loaded from: classes2.dex */
public final class acmy<T, D> {
    public final Map<String, cpqf<T, D>> a;
    public final List<cpvi<T, D>> b;
    public final Map<String, cppu<T, D>> c;
    @dzsi
    public final cprx<D> d;
    @dzsi
    public final cpru<D> e;
    @dzsi
    public final cpre<D> f;
    @dzsi
    public final Integer g;
    public final boolean h;
    @dzsi
    public final Integer i;
    public final int j;
    @dzsi
    public final cpsm k;
    @dzsi
    public final cptb<T, D> l;
    public final boolean m;
    @dzsi
    public final Integer n;
    @dzsi
    public final Integer o;
    @dzsi
    public final cprj p;

    public acmy() {
        this.a = new HashMap();
        this.b = new ArrayList();
        this.c = new HashMap();
        this.e = null;
        this.d = null;
        this.f = null;
        this.g = null;
        this.o = null;
        this.n = null;
        this.h = false;
        this.p = null;
        this.i = null;
        this.j = 0;
        this.k = null;
        this.l = null;
        this.m = false;
    }

    public static <T, D> acmx<T, D> a() {
        return new acmx<>();
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof acmy)) {
            return false;
        }
        acmy acmyVar = (acmy) obj;
        if (dbsd.a(this.a.keySet(), acmyVar.a.keySet()) && dbsd.a(this.b, acmyVar.b) && dbsd.a(this.c.keySet(), acmyVar.c.keySet()) && dbsd.a(this.e, acmyVar.e) && dbsd.a(this.d, acmyVar.d) && dbsd.a(this.f, acmyVar.f)) {
            Integer num = acmyVar.g;
            if (dbsd.a(null, null) && dbsd.a(this.o, acmyVar.o) && dbsd.a(this.n, acmyVar.n)) {
                boolean z = acmyVar.h;
                if (dbsd.a(this.p, acmyVar.p)) {
                    Integer num2 = acmyVar.i;
                    if (dbsd.a(null, null) && this.j == acmyVar.j && dbsd.a(this.k, acmyVar.k) && dbsd.a(this.l, acmyVar.l) && this.m == acmyVar.m) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a.keySet(), this.b, this.c.keySet(), this.e, this.d, this.f, null, this.o, this.n, false, this.p, null, Integer.valueOf(this.j), this.k, this.l, Boolean.valueOf(this.m)});
    }

    public acmy(HashMap hashMap, List list, HashMap hashMap2, cpru cpruVar, cprx cprxVar, cpre cpreVar, Integer num, Integer num2, cprj cprjVar, int i, cpsm cpsmVar, cptb cptbVar, boolean z) {
        this.a = dcdn.r(hashMap);
        this.b = dcdc.r(list);
        this.c = dcdn.r(hashMap2);
        this.e = cpruVar;
        this.d = cprxVar;
        this.f = cpreVar;
        this.g = null;
        this.o = num;
        this.n = num2;
        this.h = false;
        this.p = cprjVar;
        this.i = null;
        this.j = i;
        this.k = cpsmVar;
        this.l = cptbVar;
        this.m = z;
    }
}
