package defpackage;
/* compiled from: PG */
/* renamed from: axxu  reason: default package */
/* loaded from: classes2.dex */
public final class axxu {
    public final aadd a;
    public final aacz b;

    public axxu(aacz aaczVar, aadd aaddVar) {
        this.b = aaczVar;
        this.a = aaddVar;
    }

    public final Boolean a() {
        aqxe aqxeVar = this.b.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        boolean z = false;
        if (aqxeVar.a(45356747L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45356747L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45356747L);
            if (aqxfVar.b == 1) {
                z = ((Boolean) aqxfVar.c).booleanValue();
            }
            return Boolean.valueOf(z);
        }
        return false;
    }

    public final Boolean b() {
        aqxe aqxeVar = this.b.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        boolean z = false;
        if (aqxeVar.a(45356970L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45356970L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45356970L);
            if (aqxfVar.b == 1) {
                z = ((Boolean) aqxfVar.c).booleanValue();
            }
            return Boolean.valueOf(z);
        }
        return false;
    }
}
