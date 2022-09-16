package defpackage;
/* compiled from: PG */
/* renamed from: fbz  reason: default package */
/* loaded from: classes3.dex */
public final class fbz {
    private final azqb a;
    private final azqb b;
    private final axxh c;

    public fbz(azqb azqbVar, azqb azqbVar2, axxh axxhVar) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = axxhVar;
    }

    public final boolean a() {
        Long l;
        Boolean bool;
        aqxe aqxeVar = this.c.b.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        long j = 0;
        if (aqxeVar.a(45356841L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45356841L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45356841L);
            if (aqxfVar.b == 2) {
                j = ((Long) aqxfVar.c).longValue();
            }
            l = Long.valueOf(j);
        } else {
            l = 0L;
        }
        long longValue = l.longValue();
        aqxe aqxeVar2 = this.c.b.b().C;
        if (aqxeVar2 == null) {
            aqxeVar2 = aqxe.a;
        }
        if (aqxeVar2.a(45356840L)) {
            aoqp aoqpVar2 = aqxeVar2.b;
            if (!aoqpVar2.containsKey(45356840L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar2 = (aqxf) aoqpVar2.get(45356840L);
            bool = Boolean.valueOf(aqxfVar2.b == 1 ? ((Boolean) aqxfVar2.c).booleanValue() : false);
        } else {
            bool = false;
        }
        return bool.booleanValue() && ((ahdn) this.a.get()).c() && ((long) ((fcl) this.b.get()).a()) >= longValue;
    }
}
