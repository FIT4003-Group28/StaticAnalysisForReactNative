package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: sgt  reason: default package */
/* loaded from: classes4.dex */
public final class sgt {
    public final List a;
    public final String b;
    public shd c = new shd();
    public sgz d = new sgz();

    public sgt(String str, List list) {
        sho.g(str, "name");
        this.b = str;
        this.a = list;
    }

    public final int a() {
        return this.a.size();
    }

    public final sgp b(sgq sgqVar, sgq sgqVar2) {
        sgp a;
        sgp a2 = this.d.a(sgqVar);
        return (a2 != null || (a = this.d.a(sgqVar2)) == null) ? a2 : new sgs(a);
    }

    public final sgp c(sgq sgqVar) {
        return this.d.a(sgqVar);
    }

    public final sgp d(sgq sgqVar, Object obj) {
        sgz sgzVar = this.d;
        sho.h(obj);
        sgp sgpVar = (sgp) sgzVar.a.get(sgqVar);
        return sgpVar != null ? sgpVar : new sgy(obj);
    }

    public final Object e(sgu sguVar, Object obj) {
        Object obj2 = this.c.a.get(sguVar);
        return obj2 != null ? obj2 : obj;
    }

    public final void f(sgq sgqVar, sgp sgpVar) {
        this.d.a.put(sgqVar, sgpVar);
    }

    public final void g(sgq sgqVar, Object obj) {
        this.d.a.put(sgqVar, obj != null ? new sgy(obj, 1) : null);
    }

    public final void h(Integer num) {
        g(sgq.e, num);
    }
}
