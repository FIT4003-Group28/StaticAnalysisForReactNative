package defpackage;
/* compiled from: PG */
/* renamed from: aovt  reason: default package */
/* loaded from: classes.dex */
public final class aovt {
    private final aovu a;

    public aovt(aovu aovuVar) {
        this.a = aovuVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aovt) && this.a.equals(((aovt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("AccessibilityIdModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
