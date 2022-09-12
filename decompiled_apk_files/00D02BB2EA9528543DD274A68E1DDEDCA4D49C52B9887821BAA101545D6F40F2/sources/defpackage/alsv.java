package defpackage;

import java.util.Collection;
import java.util.List;
/* compiled from: PG */
/* renamed from: alsv  reason: default package */
/* loaded from: classes.dex */
final class alsv implements alsx {
    final /* synthetic */ boolean a;
    final /* synthetic */ alsz b;
    @dzsi
    private List<alsx> c = null;

    public alsv(alsz alszVar, boolean z) {
        this.b = alszVar;
        this.a = z;
    }

    @Override // defpackage.alsx
    public final void a(alyh alyhVar, int i, @dzsi Collection<altt> collection) {
        List<alsx> list;
        if (i == 0 && collection != null) {
            this.b.a.Pz(alyhVar, collection);
            this.b.b(collection);
        }
        synchronized (this.b) {
            if (!this.a || i != 2) {
                if (this.c == null) {
                    this.c = this.b.f.remove(alyhVar);
                }
                list = this.c;
            } else {
                list = this.c;
                if (list == null) {
                    list = this.b.f.get(alyhVar);
                }
                if (list != null) {
                    list = dcdc.r(list);
                }
            }
        }
        if (list != null) {
            for (alsx alsxVar : list) {
                alsxVar.a(alyhVar, i, collection);
            }
        }
    }
}
