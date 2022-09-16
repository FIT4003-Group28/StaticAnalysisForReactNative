package defpackage;
/* compiled from: PG */
/* renamed from: axxo  reason: default package */
/* loaded from: classes2.dex */
public final class axxo {
    public final aadd a;
    public final aacz b;

    public axxo(aacz aaczVar, aadd aaddVar) {
        this.b = aaczVar;
        this.a = aaddVar;
    }

    public final ayoi a() {
        return this.a.a.V(axxk.k).B();
    }

    public final ayoi b() {
        return this.a.a.V(axxk.m).B();
    }

    public final ayoi c() {
        return this.a.a.V(axxk.n).B();
    }

    public final Boolean d() {
        aqxe aqxeVar = this.b.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        boolean z = false;
        if (aqxeVar.a(45357212L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45357212L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45357212L);
            if (aqxfVar.b == 1) {
                z = ((Boolean) aqxfVar.c).booleanValue();
            }
            return Boolean.valueOf(z);
        }
        return false;
    }

    public final String e() {
        aqxe aqxeVar = this.b.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        if (aqxeVar.a(45357700L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45357700L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45357700L);
            return aqxfVar.b == 3 ? (String) aqxfVar.c : "";
        }
        return "";
    }
}
