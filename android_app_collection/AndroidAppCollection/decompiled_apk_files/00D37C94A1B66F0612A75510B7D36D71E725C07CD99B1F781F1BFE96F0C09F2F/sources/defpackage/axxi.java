package defpackage;
/* compiled from: PG */
/* renamed from: axxi  reason: default package */
/* loaded from: classes2.dex */
public final class axxi {
    public final aadd a;
    public final aacz b;

    public axxi(aacz aaczVar, aadd aaddVar) {
        this.b = aaczVar;
        this.a = aaddVar;
    }

    public final ayoi a() {
        return this.a.a.V(axxd.h).B();
    }

    public final Boolean b() {
        aqxe aqxeVar = this.b.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        boolean z = false;
        if (aqxeVar.a(45353487L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45353487L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45353487L);
            if (aqxfVar.b == 1) {
                z = ((Boolean) aqxfVar.c).booleanValue();
            }
            return Boolean.valueOf(z);
        }
        return false;
    }
}
