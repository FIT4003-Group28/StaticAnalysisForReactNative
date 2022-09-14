package defpackage;

import defpackage.dssj;
/* compiled from: PG */
/* renamed from: czjt  reason: default package */
/* loaded from: classes5.dex */
public final class czjt<T extends dssj> extends czku<T> {
    private final czkt a;

    public czjt(czkt czktVar) {
        this.a = czktVar;
    }

    @Override // defpackage.czku
    public final czkt a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof czku)) {
            return false;
        }
        return this.a.equals(((czku) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("SignallingConfig{service=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
