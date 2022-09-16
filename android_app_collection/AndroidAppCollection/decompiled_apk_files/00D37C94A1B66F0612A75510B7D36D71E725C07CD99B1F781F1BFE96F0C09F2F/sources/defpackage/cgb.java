package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cgb  reason: default package */
/* loaded from: classes2.dex */
public final class cgb {
    public final cnt a;
    public final cta b;
    public final ctc c;
    public final csy d = new csy();
    public final csx e = new csx();
    public final jk f;
    public final alsb g;
    public final aihs h;
    private final ciq i;
    private final csw j;

    public cgb() {
        jk a = cvk.a(new jm(20), new cmg(2), new cvf());
        this.f = a;
        this.a = new cnt(a);
        this.g = new alsb();
        this.b = new cta();
        this.c = new ctc();
        this.i = new ciq();
        this.h = new aihs();
        this.j = new csw();
        List<String> asList = Arrays.asList("Gif", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        for (String str : asList) {
            arrayList.add(str);
        }
        arrayList.add("legacy_append");
        this.b.d(arrayList);
    }

    public final cin a(Object obj) {
        return this.i.a(obj);
    }

    public final List b() {
        List a = this.j.a();
        if (!a.isEmpty()) {
            return a;
        }
        throw new cfx();
    }

    public final List c(Object obj) {
        List b = this.a.b(obj.getClass());
        if (b.isEmpty()) {
            throw new cfy(obj);
        }
        int size = b.size();
        List emptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            cnq cnqVar = (cnq) b.get(i);
            if (cnqVar.b(obj)) {
                if (z) {
                    emptyList = new ArrayList(size - i);
                }
                emptyList.add(cnqVar);
                z = false;
            }
        }
        if (emptyList.isEmpty()) {
            throw new cfy(obj, b);
        }
        return emptyList;
    }

    public final void d(Class cls, chn chnVar) {
        this.g.b(cls, chnVar);
    }

    public final void e(Class cls, cif cifVar) {
        this.c.b(cls, cifVar);
    }

    public final void f(Class cls, Class cls2, cie cieVar) {
        h("legacy_append", cls, cls2, cieVar);
    }

    public final void g(Class cls, Class cls2, cnr cnrVar) {
        this.a.c(cls, cls2, cnrVar);
    }

    public final void h(String str, Class cls, Class cls2, cie cieVar) {
        this.b.c(str, cieVar, cls, cls2);
    }

    public final void i(Class cls, Class cls2, cie cieVar) {
        this.b.e(cieVar, cls, cls2);
    }

    public final void j(Class cls, Class cls2, cnr cnrVar) {
        this.a.d(cls, cls2, cnrVar);
    }

    public final void k(chp chpVar) {
        this.j.b(chpVar);
    }

    public final void l(cim cimVar) {
        this.i.b(cimVar);
    }

    public final void m(Class cls, Class cls2, crm crmVar) {
        this.h.d(cls, cls2, crmVar);
    }

    public final void n(Class cls, Class cls2, cnr cnrVar) {
        this.a.e(cls, cls2, cnrVar);
    }
}
