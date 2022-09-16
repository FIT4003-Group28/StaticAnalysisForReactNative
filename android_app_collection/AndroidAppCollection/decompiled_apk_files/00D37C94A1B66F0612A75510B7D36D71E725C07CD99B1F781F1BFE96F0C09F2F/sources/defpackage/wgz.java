package defpackage;
/* compiled from: PG */
/* renamed from: wgz  reason: default package */
/* loaded from: classes4.dex */
public final class wgz {
    private final axwp a;

    public wgz(axwp axwpVar) {
        this.a = axwpVar;
    }

    public final boolean a() {
        Boolean bool;
        aqxe aqxeVar = this.a.a.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        boolean z = false;
        if (aqxeVar.a(45353494L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45353494L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45353494L);
            if (aqxfVar.b == 1) {
                z = ((Boolean) aqxfVar.c).booleanValue();
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = false;
        }
        return bool.booleanValue();
    }
}
