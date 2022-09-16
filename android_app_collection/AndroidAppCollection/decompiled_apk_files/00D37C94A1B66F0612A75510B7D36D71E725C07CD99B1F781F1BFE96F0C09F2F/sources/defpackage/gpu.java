package defpackage;
/* compiled from: PG */
/* renamed from: gpu  reason: default package */
/* loaded from: classes3.dex */
public final class gpu {
    private final axxw a;

    public gpu(axxw axxwVar) {
        this.a = axxwVar;
    }

    public final boolean a() {
        Boolean bool;
        aqxe aqxeVar = this.a.a.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        boolean z = false;
        if (aqxeVar.a(45357365L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45357365L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45357365L);
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
