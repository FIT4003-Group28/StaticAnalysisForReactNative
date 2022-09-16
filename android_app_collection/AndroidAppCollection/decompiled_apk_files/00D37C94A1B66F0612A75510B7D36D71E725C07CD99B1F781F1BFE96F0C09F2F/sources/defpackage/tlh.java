package defpackage;

import java.util.ArrayList;
import java.util.Set;
/* compiled from: PG */
/* renamed from: tlh  reason: default package */
/* loaded from: classes4.dex */
public final class tlh implements tli {
    public final ankw a;
    public final Set b;

    public tlh(ankw ankwVar, Set set) {
        this.a = ankwVar;
        this.b = set;
    }

    @Override // defpackage.tli
    public final ankt a(final tlp tlpVar) {
        return anlz.v(ammo.b(new aniq() { // from class: tlg
            @Override // defpackage.aniq
            public final ankt a() {
                tlh tlhVar = tlh.this;
                tlp tlpVar2 = tlpVar;
                ArrayList arrayList = new ArrayList(1);
                amzs it = ((amyt) tlhVar.b).iterator();
                while (it.hasNext()) {
                    arrayList.add(((tli) it.next()).a(tlpVar2));
                }
                return anlz.l(arrayList).a(new adgg(arrayList, 1), tlhVar.a);
            }
        }), this.a);
    }
}
