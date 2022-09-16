package defpackage;

import java.util.IdentityHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: axxz  reason: default package */
/* loaded from: classes2.dex */
public final class axxz {
    public axyb a;
    public Map b;

    public axxz(axyb axybVar) {
        this.a = axybVar;
    }

    public final axyb a() {
        if (this.b != null) {
            axyb axybVar = this.a;
            axyb axybVar2 = axyb.a;
            for (Map.Entry entry : axybVar.b.entrySet()) {
                if (!this.b.containsKey(entry.getKey())) {
                    this.b.put((axya) entry.getKey(), entry.getValue());
                }
            }
            this.a = new axyb(this.b);
            this.b = null;
        }
        return this.a;
    }

    public final void b(axya axyaVar, Object obj) {
        if (this.b == null) {
            this.b = new IdentityHashMap(1);
        }
        this.b.put(axyaVar, obj);
    }
}
