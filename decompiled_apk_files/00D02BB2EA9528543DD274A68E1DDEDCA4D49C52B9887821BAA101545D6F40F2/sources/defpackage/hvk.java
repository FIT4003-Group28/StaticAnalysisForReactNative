package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: hvk  reason: default package */
/* loaded from: classes6.dex */
public final class hvk implements aktl {
    static final int[] a = {0, 15};
    public static final /* synthetic */ int b = 0;
    private final Map<dmpn, Integer> c = new HashMap();

    private final synchronized akvp b(List<akvp> list) {
        hvj hvjVar;
        for (Map.Entry<dmpn, Integer> entry : this.c.entrySet()) {
            entry.setValue(Integer.valueOf(entry.getValue().intValue() - 1));
        }
        ArrayList arrayList = new ArrayList();
        for (akvp akvpVar : list) {
            if (akvpVar instanceof alnf) {
                alnf alnfVar = (alnf) akvpVar;
                dmpn dmpnVar = (dmpn) akvpVar.a().k();
                Integer num = this.c.get(dmpnVar);
                int intValue = num != null ? num.intValue() + 2 : 1;
                this.c.put(dmpnVar, Integer.valueOf(intValue));
                arrayList.add(new hvj(alnfVar, dmpnVar, intValue));
            }
        }
        dcft.y(this.c.entrySet(), hvi.a);
        Collections.sort(arrayList);
        hvjVar = (hvj) arrayList.get(0);
        this.c.put(hvjVar.a, 0);
        return hvjVar.c;
    }

    @Override // defpackage.aktl
    @dzsi
    public final akvp a(List<akvp> list) {
        int i;
        if (list.isEmpty()) {
            return null;
        }
        akvp akvpVar = list.get(0);
        if (akvpVar instanceof alnf) {
            return b(list);
        }
        if (akvpVar.a() == null || !(akvpVar.a().k() instanceof akve)) {
            return akvpVar;
        }
        akvp akvpVar2 = list.get(0);
        int i2 = ((akve) akvpVar2.a().k()).c;
        for (akvp akvpVar3 : list) {
            if (akvpVar3.a() != null && (akvpVar3.a().k() instanceof akve) && (i = ((akve) akvpVar3.a().k()).c) > i2) {
                akvpVar2 = akvpVar3;
                i2 = i;
            }
        }
        return akvpVar2;
    }
}
