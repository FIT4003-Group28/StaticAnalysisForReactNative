package defpackage;
/* compiled from: PG */
/* renamed from: axxr  reason: default package */
/* loaded from: classes2.dex */
public final class axxr {
    private final aacz a;

    public axxr(aacz aaczVar) {
        this.a = aaczVar;
    }

    public final Boolean a() {
        aqxe aqxeVar = this.a.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        boolean z = false;
        if (aqxeVar.a(45353558L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45353558L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45353558L);
            if (aqxfVar.b == 1) {
                z = ((Boolean) aqxfVar.c).booleanValue();
            }
            return Boolean.valueOf(z);
        }
        return false;
    }
}
