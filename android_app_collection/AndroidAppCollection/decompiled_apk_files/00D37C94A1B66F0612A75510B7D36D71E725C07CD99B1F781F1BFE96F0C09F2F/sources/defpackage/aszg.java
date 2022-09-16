package defpackage;
/* compiled from: PG */
/* renamed from: aszg  reason: default package */
/* loaded from: classes2.dex */
public final class aszg {
    public final aszh a;

    public aszg(aszh aszhVar) {
        this.a = aszhVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aszg) && this.a.equals(((aszg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
        sb.append("MainVideoUserStateMetadataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
