package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amgv  reason: default package */
/* loaded from: classes2.dex */
public final class amgv extends amje {
    private final alvi a;
    private final akrk b;

    public amgv(@dzsi alvi alviVar, @dzsi akrk akrkVar) {
        this.a = alviVar;
        this.b = akrkVar;
    }

    @Override // defpackage.amje
    @dzsi
    public final alvi a() {
        return this.a;
    }

    @Override // defpackage.amje
    @dzsi
    public final akrk b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amje) {
            amje amjeVar = (amje) obj;
            alvi alviVar = this.a;
            if (alviVar != null ? alviVar.equals(amjeVar.a()) : amjeVar.a() == null) {
                akrk akrkVar = this.b;
                if (akrkVar != null ? akrkVar.equals(amjeVar.b()) : amjeVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        alvi alviVar = this.a;
        int i = 0;
        int hashCode = ((alviVar == null ? 0 : alviVar.hashCode()) ^ 1000003) * 1000003;
        akrk akrkVar = this.b;
        if (akrkVar != null) {
            i = akrkVar.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48 + String.valueOf(valueOf2).length());
        sb.append("LabelPosition{pointPosition=");
        sb.append(valueOf);
        sb.append(", polylinePosition=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
