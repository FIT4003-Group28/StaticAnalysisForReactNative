package defpackage;

import java.util.ArrayList;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aafe  reason: default package */
/* loaded from: classes.dex */
public final class aafe {
    private final ArrayList a = new ArrayList();
    private aafo b;

    public final aafi a() {
        return new aaff(amuk.o(this.a), this.b);
    }

    public final void b(Map map) {
        ArrayList arrayList = this.a;
        map.getClass();
        arrayList.add(new aafh(map));
    }

    public final void c(Map map) {
        this.a.add(new aafg(map));
    }

    public final void d(aafo aafoVar) {
        aqxo.z(this.b == null, "fallbackRouter was already set");
        aafoVar.getClass();
        this.b = aafoVar;
    }
}
