package defpackage;
/* compiled from: PG */
/* renamed from: axxq  reason: default package */
/* loaded from: classes2.dex */
public final class axxq {
    private final aacz a;

    public axxq(aacz aaczVar) {
        this.a = aaczVar;
    }

    public final Boolean a() {
        aqxe aqxeVar = this.a.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        boolean z = false;
        if (aqxeVar.a(45353840L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45353840L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45353840L);
            if (aqxfVar.b == 1) {
                z = ((Boolean) aqxfVar.c).booleanValue();
            }
            return Boolean.valueOf(z);
        }
        return false;
    }
}
