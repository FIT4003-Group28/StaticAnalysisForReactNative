package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: enm  reason: default package */
/* loaded from: classes3.dex */
public final class enm {
    private final azqb a;
    private final atvr b;
    private final Map c;
    private final enn d;

    public enm(azqb azqbVar, wkl wklVar) {
        enn enjVar;
        this.a = azqbVar;
        Object b = wklVar.b();
        if (b instanceof atvr) {
            this.b = (atvr) b;
        } else {
            this.b = null;
        }
        this.c = new HashMap();
        atvr atvrVar = this.b;
        int i = (atvrVar == null || (i = awwc.aQ(atvrVar.c)) == 0) ? 1 : i;
        atvr atvrVar2 = this.b;
        int i2 = atvrVar2 != null ? atvrVar2.b : 0;
        boolean z = atvrVar2 != null && atvrVar2.d;
        boolean z2 = atvrVar2 != null && atvrVar2.e;
        String d = d();
        if (i - 1 == 1) {
            enjVar = new enj(azqbVar, i2, z, z2, d);
        } else {
            enjVar = new enk(azqbVar, i2, z, z2, d);
        }
        this.d = enjVar;
    }

    private final String d() {
        atvr atvrVar = this.b;
        return atvrVar != null ? atvrVar.f : "";
    }

    public final Object a(eno enoVar, Class cls, String str) {
        Object obj = this.c.get(enoVar);
        if (cls.isInstance(obj)) {
            Object cast = cls.cast(obj);
            this.d.d(enoVar, str, null, true);
            return cast;
        }
        return null;
    }

    public final Object b(String str, Class cls, String str2, enl enlVar) {
        return c(str, cls, str2, enlVar, null);
    }

    public final Object c(String str, Class cls, String str2, enl enlVar, Object obj) {
        eno enoVar = new eno(str, cls);
        Object a = a(enoVar, cls, str2);
        if (a == null) {
            a = enlVar.a();
            if (amps.e(enoVar.a)) {
                ((vpg) ((akvm) this.a.get()).e.get()).b(amps.d(str2), d());
            }
            this.c.put(enoVar, a);
            if (this.d.f(enoVar)) {
                ((vpg) ((akvm) this.a.get()).f.get()).b(amps.d(str2), d());
            }
            this.d.d(enoVar, str2, obj, false);
            if (this.d.e()) {
                ArrayList arrayList = new ArrayList();
                this.d.c(arrayList);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    eno enoVar2 = (eno) arrayList.get(i);
                    this.c.remove(enoVar2);
                    this.d.b(enoVar2);
                }
            }
        }
        return a;
    }
}
