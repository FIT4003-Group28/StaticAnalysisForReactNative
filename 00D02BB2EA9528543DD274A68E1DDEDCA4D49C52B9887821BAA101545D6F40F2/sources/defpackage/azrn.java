package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azrn  reason: default package */
/* loaded from: classes3.dex */
public final class azrn extends azrk {
    private final ilo a;
    private final baal b;

    public azrn(ilo iloVar, @dzsi baal baalVar) {
        this.a = iloVar;
        this.b = baalVar;
    }

    @Override // defpackage.azrk
    public final ilo a() {
        return this.a;
    }

    @Override // defpackage.azrk
    @dzsi
    public final baal b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        baal baalVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof azrk) {
            azrk azrkVar = (azrk) obj;
            if (this.a.equals(azrkVar.a()) && ((baalVar = this.b) != null ? baalVar.equals(azrkVar.b()) : azrkVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        baal baalVar = this.b;
        return hashCode ^ (baalVar == null ? 0 : baalVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48 + String.valueOf(valueOf2).length());
        sb.append("AddPlaceToListResult{placemark=");
        sb.append(valueOf);
        sb.append(", localListItem=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
