package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aaoj  reason: default package */
/* loaded from: classes.dex */
public class aaoj {
    private static final amqf a = amqf.b(',').e().a();
    private final List b;

    public aaoj(List list) {
        this.b = list;
    }

    public amuk a() {
        for (asmc asmcVar : this.b) {
            if ("e".equals(asmcVar.e) && asmcVar.c == 2) {
                List<String> h = a.h(asmcVar.c == 2 ? (String) asmcVar.d : "");
                ArrayList arrayList = new ArrayList();
                for (String str : h) {
                    arrayList.add(Integer.valueOf(Integer.parseInt(str)));
                }
                return amuk.o(arrayList);
            }
        }
        return amuk.q();
    }
}
