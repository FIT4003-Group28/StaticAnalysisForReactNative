package defpackage;
/* compiled from: PG */
/* renamed from: axvq  reason: default package */
/* loaded from: classes3.dex */
public final class axvq extends axwc {
    private final String a;

    public axvq(@dzsi String str) {
        this.a = str;
    }

    @Override // defpackage.axwc
    @dzsi
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof axwc)) {
            return false;
        }
        axwc axwcVar = (axwc) obj;
        String str = this.a;
        return str == null ? axwcVar.a() == null : str.equals(axwcVar.a());
    }

    public final int hashCode() {
        String str = this.a;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 55);
        sb.append("EditAliasSuggestFragmentResult{selectedPlaceFeatureId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
