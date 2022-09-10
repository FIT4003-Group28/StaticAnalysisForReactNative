package defpackage;
/* compiled from: PG */
/* renamed from: cdhk  reason: default package */
/* loaded from: classes4.dex */
final class cdhk extends cdil {
    private final cdhl a;

    public cdhk(cdhl cdhlVar) {
        if (cdhlVar != null) {
            this.a = cdhlVar;
            return;
        }
        throw new NullPointerException("Null pickedPlace");
    }

    @Override // defpackage.cdil
    public final cdhl a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cdil)) {
            return false;
        }
        return this.a.equals(((cdil) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("PlacePickerResult{pickedPlace=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
