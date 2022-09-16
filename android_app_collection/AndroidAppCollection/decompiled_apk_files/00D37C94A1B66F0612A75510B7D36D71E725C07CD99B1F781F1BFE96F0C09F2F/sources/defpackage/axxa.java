package defpackage;
/* compiled from: PG */
/* renamed from: axxa  reason: default package */
/* loaded from: classes2.dex */
public final class axxa {
    public final aacz a;

    public axxa(aacz aaczVar) {
        this.a = aaczVar;
    }

    public final Boolean a() {
        aqxe aqxeVar = this.a.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        boolean z = false;
        if (aqxeVar.a(45354117L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45354117L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45354117L);
            if (aqxfVar.b == 1) {
                z = ((Boolean) aqxfVar.c).booleanValue();
            }
            return Boolean.valueOf(z);
        }
        return false;
    }

    public final Boolean b() {
        aqxe aqxeVar = this.a.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        boolean z = false;
        if (aqxeVar.a(45354422L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45354422L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45354422L);
            if (aqxfVar.b == 1) {
                z = ((Boolean) aqxfVar.c).booleanValue();
            }
            return Boolean.valueOf(z);
        }
        return false;
    }
}
