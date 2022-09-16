package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: jtz  reason: default package */
/* loaded from: classes3.dex */
public final class jtz implements jut {
    private final List a;
    private final Map b;

    public jtz(List list, Map map) {
        this.a = list;
        this.b = map;
    }

    @Override // defpackage.jut
    public final amuk a(jnb jnbVar) {
        aopa createBuilder = auqh.a.createBuilder();
        ArrayList arrayList = new ArrayList();
        amzt listIterator = ((amuk) this.a).listIterator();
        while (listIterator.hasNext()) {
            jut jutVar = (jut) this.b.get((jtv) listIterator.next());
            jutVar.getClass();
            amuk a = jutVar.a(jnbVar);
            if (!a.isEmpty()) {
                arrayList.add((auqk) ((jur) a.get(0)).a);
            }
        }
        createBuilder.aI(arrayList);
        return amuk.r(new jur((auqh) createBuilder.mo39build()));
    }
}
