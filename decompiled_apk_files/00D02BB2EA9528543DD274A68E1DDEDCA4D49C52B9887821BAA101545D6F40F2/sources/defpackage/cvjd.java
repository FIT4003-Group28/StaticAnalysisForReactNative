package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cvjd  reason: default package */
/* loaded from: classes5.dex */
public final class cvjd extends cvjh {
    public final List<cvje> a;

    public cvjd(List<cvje> list) {
        this.a = list;
    }

    @Override // defpackage.cvjh
    public final List<cvje> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cvjh)) {
            return false;
        }
        return this.a.equals(((cvjh) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
        sb.append("SetPreferencesRequest{preferenceEntries=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
