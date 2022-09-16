package defpackage;
/* compiled from: PG */
/* renamed from: kgk  reason: default package */
/* loaded from: classes3.dex */
public final class kgk {
    public final boolean a;
    public final int b;
    public final int c;
    public int d;
    private final yve e;

    public kgk(yve yveVar, axxu axxuVar) {
        Boolean bool;
        Long l;
        Long l2;
        this.e = yveVar;
        aqxe aqxeVar = axxuVar.b.b().C;
        aqxeVar = aqxeVar == null ? aqxe.a : aqxeVar;
        boolean z = false;
        if (aqxeVar.a(45357559L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45357559L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45357559L);
            bool = Boolean.valueOf(aqxfVar.b == 1 ? ((Boolean) aqxfVar.c).booleanValue() : z);
        } else {
            bool = false;
        }
        boolean booleanValue = bool.booleanValue();
        this.a = booleanValue;
        aqxe aqxeVar2 = axxuVar.b.b().C;
        aqxeVar2 = aqxeVar2 == null ? aqxe.a : aqxeVar2;
        long j = 0;
        if (aqxeVar2.a(45357558L)) {
            aoqp aoqpVar2 = aqxeVar2.b;
            if (!aoqpVar2.containsKey(45357558L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar2 = (aqxf) aoqpVar2.get(45357558L);
            l = Long.valueOf(aqxfVar2.b == 2 ? ((Long) aqxfVar2.c).longValue() : 0L);
        } else {
            l = 0L;
        }
        int intValue = l.intValue();
        this.b = intValue;
        aqxe aqxeVar3 = axxuVar.b.b().C;
        aqxeVar3 = aqxeVar3 == null ? aqxe.a : aqxeVar3;
        if (aqxeVar3.a(45357557L)) {
            aoqp aoqpVar3 = aqxeVar3.b;
            if (!aoqpVar3.containsKey(45357557L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar3 = (aqxf) aoqpVar3.get(45357557L);
            l2 = Long.valueOf(aqxfVar3.b == 2 ? ((Long) aqxfVar3.c).longValue() : j);
        } else {
            l2 = 0L;
        }
        int intValue2 = l2.intValue();
        this.c = intValue2;
        if (!booleanValue) {
            if (intValue == 0 && intValue2 == 0) {
                return;
            }
            yveVar.d().I().C(jnx.u).n().Z(new ayqb() { // from class: kgj
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    kgk.this.d = ((Integer) obj).intValue();
                }
            });
        }
    }

    public final void a() {
        ylx.m(this.e.b(jvb.m), jou.l);
    }
}
