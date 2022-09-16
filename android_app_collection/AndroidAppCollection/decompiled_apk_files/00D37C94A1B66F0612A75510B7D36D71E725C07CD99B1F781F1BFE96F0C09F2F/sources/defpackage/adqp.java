package defpackage;

import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adqp  reason: default package */
/* loaded from: classes.dex */
public final class adqp implements yiw {
    final /* synthetic */ yiw a;
    final /* synthetic */ adqq b;
    private final yiw c;

    public adqp(adqq adqqVar, yiw yiwVar, yiw yiwVar2) {
        this.b = adqqVar;
        this.a = yiwVar2;
        this.c = yiwVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Void r2 = (Void) obj;
        yiw yiwVar = this.c;
        if (yiwVar != null) {
            yiwVar.a(null, exc);
        }
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Void r8 = (Void) obj;
        List<adif> list = (List) obj2;
        if (list.isEmpty()) {
            this.a.b(null, Collections.emptyList());
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (adif adifVar : list) {
            if (!this.b.g.containsKey(adifVar.e())) {
                arrayList.add(adifVar.e());
            }
        }
        int i = 0;
        while (i < arrayList.size()) {
            int i2 = i + 6;
            int min = Math.min(arrayList.size(), i2);
            adqq adqqVar = this.b;
            adqqVar.g.putAll(adqqVar.d.b(arrayList.subList(i, min), 9));
            i = i2;
        }
        ArrayList arrayList2 = new ArrayList();
        for (adif adifVar2 : list) {
            adhy adhyVar = (adhy) this.b.g.get(adifVar2.e());
            if (adhyVar != null) {
                adia f = adifVar2.a.f();
                f.a = adhyVar;
                arrayList2.add(new adif(f.a()));
            }
        }
        Map a = this.b.b.a((Collection) Collection.EL.stream(arrayList2).map(adgi.f).collect(Collectors.toList()));
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            adif adifVar3 = (adif) arrayList2.get(i3);
            if (a.containsKey(adifVar3.a) && !((Set) a.get(adifVar3.a)).isEmpty()) {
                arrayList3.add(adifVar3);
            }
        }
        adnt e = ((adoa) this.b.c.get()).e();
        if (e != null && !e.ab() && (e.k() instanceof adif) && !arrayList3.contains(e.k())) {
            arrayList3.add((adif) e.k());
        }
        this.a.b(null, arrayList3);
    }
}
