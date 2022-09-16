package defpackage;
/* compiled from: PG */
/* renamed from: axwu  reason: default package */
/* loaded from: classes2.dex */
public final class axwu {
    public final aacz a;

    public axwu(aacz aaczVar) {
        this.a = aaczVar;
    }

    public final Boolean a() {
        aqxe aqxeVar = this.a.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        boolean z = false;
        if (aqxeVar.a(45357369L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45357369L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45357369L);
            if (aqxfVar.b == 1) {
                z = ((Boolean) aqxfVar.c).booleanValue();
            }
            return Boolean.valueOf(z);
        }
        return false;
    }
}
