package defpackage;

import defpackage.apcy;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: apch  reason: default package */
/* loaded from: classes2.dex */
public final class apch<V extends apcy> {
    private final List<V> a = new ArrayList();
    private final bwrs<aoyg> b;
    private final apcg<V> c;

    public apch(bwrs<aoyg> bwrsVar, apcg<V> apcgVar) {
        this.b = bwrsVar;
        this.c = apcgVar;
    }

    public final synchronized List<V> a() {
        aoyg c = this.b.c();
        dbsk.s(c);
        dcdc<aoxt> d = c.d();
        dbsk.q(d.size() >= this.a.size(), "getFullyLoadedPlaces() is shorter than list of created place entries (%s < %s)", d.size(), this.a.size());
        if (d.size() != this.a.size()) {
            dcdc<aoxt> subList = d.subList(this.a.size(), d.size());
            int size = subList.size();
            for (int i = 0; i < size; i++) {
                List<V> list = this.a;
                list.add(this.c.a(subList.get(i), list.size()));
            }
        }
        return this.a;
    }
}
