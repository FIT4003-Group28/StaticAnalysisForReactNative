package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: bsop  reason: default package */
/* loaded from: classes4.dex */
public final class bsop {
    public final ArrayList<ght> a = new ArrayList<>();
    public final ArrayList<ght> b = new ArrayList<>();

    public final void a(ght ghtVar) {
        this.a.add(ghtVar);
    }

    public final int b(int i, int i2) {
        ArrayList<ght> arrayList = i == 1 ? this.b : this.a;
        final ArrayList<ght> arrayList2 = i == 1 ? this.a : this.b;
        if (i2 >= 0 && i2 < arrayList.size()) {
            dcbg w = dcbg.b(arrayList).w(i2);
            arrayList2.getClass();
            dcbg o = w.o(new dbsl(arrayList2) { // from class: bsol
                private final ArrayList a;

                {
                    this.a = arrayList2;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    return this.a.contains((ght) obj);
                }
            });
            arrayList2.getClass();
            dbsg u = o.s(new dbrn(arrayList2) { // from class: bsom
                private final ArrayList a;

                {
                    this.a = arrayList2;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    return Integer.valueOf(this.a.indexOf((ght) obj));
                }
            }).u();
            if (u.a()) {
                return ((Integer) u.b()).intValue();
            }
            dcbg w2 = dcbg.b(dchl.l(arrayList)).w(arrayList.size() - i2);
            arrayList2.getClass();
            dcbg o2 = w2.o(new dbsl(arrayList2) { // from class: bson
                private final ArrayList a;

                {
                    this.a = arrayList2;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    return this.a.contains((ght) obj);
                }
            });
            arrayList2.getClass();
            dbsg u2 = o2.s(new dbrn(arrayList2) { // from class: bsoo
                private final ArrayList a;

                {
                    this.a = arrayList2;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    return Integer.valueOf(this.a.indexOf((ght) obj));
                }
            }).u();
            if (u2.a()) {
                return ((Integer) u2.b()).intValue();
            }
        }
        return -1;
    }
}
