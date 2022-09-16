package defpackage;
/* compiled from: PG */
/* renamed from: aovo  reason: default package */
/* loaded from: classes.dex */
public final class aovo {
    private final aovr a;

    public aovo(aovr aovrVar) {
        this.a = aovrVar;
    }

    public static aovn b(aovr aovrVar) {
        return new aovn(aovrVar.mo52toBuilder());
    }

    public final amvn a() {
        amvl amvlVar = new amvl();
        aovu aovuVar = this.a.d;
        if (aovuVar == null) {
            aovuVar = aovu.a;
        }
        new aovt((aovu) aovuVar.mo52toBuilder().mo39build());
        amvlVar.j(new amvl().g());
        return amvlVar.g();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aovo) && this.a.equals(((aovo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("AccessibilityDataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
