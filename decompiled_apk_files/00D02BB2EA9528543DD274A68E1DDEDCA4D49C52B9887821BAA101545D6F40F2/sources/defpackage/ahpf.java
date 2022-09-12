package defpackage;
/* compiled from: PG */
/* renamed from: ahpf  reason: default package */
/* loaded from: classes2.dex */
final class ahpf {
    final akra a;
    final akra b;

    public ahpf(akra akraVar, akra akraVar2) {
        this.a = akraVar;
        this.b = akraVar2;
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof ahpf)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ahpf ahpfVar = (ahpf) obj;
        return (this.a.equals(ahpfVar.a) && this.b.equals(ahpfVar.b)) || (this.a.equals(ahpfVar.b) && this.b.equals(ahpfVar.a));
    }

    public final int hashCode() {
        return this.a.hashCode() * this.b.hashCode();
    }
}
