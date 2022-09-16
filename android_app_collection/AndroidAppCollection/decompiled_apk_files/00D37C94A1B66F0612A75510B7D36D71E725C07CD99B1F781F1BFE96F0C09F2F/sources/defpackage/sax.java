package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: sax  reason: default package */
/* loaded from: classes4.dex */
public final class sax extends sbs {
    final /* synthetic */ sbb a;

    public sax(sbb sbbVar) {
        this.a = sbbVar;
    }

    @Override // defpackage.sbs
    public final void b(Map map, sfa sfaVar) {
        this.a.c.clear();
        this.a.d.clear();
        if (map.isEmpty()) {
            return;
        }
        Boolean bool = (Boolean) this.a.b.s(scb.a);
        Boolean valueOf = Boolean.valueOf(bool != null && bool.booleanValue());
        if (!this.a.a.isEnabled() || valueOf.booleanValue()) {
            return;
        }
        for (String str : map.keySet()) {
            sbb sbbVar = this.a;
            sbbVar.f.add(sbbVar.b.i(str));
        }
        if (this.a.b.k().equals(sgq.d)) {
            this.a.d(shp.f());
        } else {
            this.a.d(new TreeSet());
        }
        sbb sbbVar2 = this.a;
        sbbVar2.e = shp.i(sbbVar2.c.size());
        List l = sbbVar2.b.l();
        for (int i = 0; i < l.size(); i++) {
            sgt sgtVar = ((sat) l.get(i)).a;
            sgp c = ((sat) l.get(i)).c();
            List list = sgtVar.a;
            for (int i2 = 0; i2 < sgtVar.a(); i2++) {
                Object a = c.a(list.get(i2), i2, sgtVar);
                if (!sbbVar2.e.containsKey(a)) {
                    Integer[] numArr = new Integer[l.size()];
                    Arrays.fill((Object[]) numArr, (Object) (-1));
                    sbbVar2.e.put(a, numArr);
                }
                ((Integer[]) sbbVar2.e.get(a))[i] = Integer.valueOf(i2);
            }
        }
    }
}
