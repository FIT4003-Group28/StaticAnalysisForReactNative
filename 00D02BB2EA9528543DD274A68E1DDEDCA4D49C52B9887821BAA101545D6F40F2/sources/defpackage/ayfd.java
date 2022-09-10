package defpackage;

import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: ayfd  reason: default package */
/* loaded from: classes3.dex */
public final class ayfd {
    private final WeakHashMap<ayfc, Boolean> a = new WeakHashMap<>();
    @dzsi
    private ayfc b;

    public final synchronized ayfc a(@dzsi baad baadVar) {
        for (ayfc ayfcVar : this.a.keySet()) {
            baad baadVar2 = ayfcVar.a;
            if ((baadVar2 == null && baadVar == null) || (baadVar2 != null && baadVar != null && baadVar2.aa(baadVar))) {
                this.b = ayfcVar;
                return ayfcVar;
            }
        }
        ayfc ayfcVar2 = new ayfc(baadVar);
        this.b = ayfcVar2;
        this.a.put(ayfcVar2, true);
        return ayfcVar2;
    }
}
