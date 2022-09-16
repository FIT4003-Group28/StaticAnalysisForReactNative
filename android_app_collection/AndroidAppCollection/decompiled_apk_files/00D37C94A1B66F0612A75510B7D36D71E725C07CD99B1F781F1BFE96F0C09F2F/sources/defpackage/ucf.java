package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ucf  reason: default package */
/* loaded from: classes4.dex */
public final class ucf {
    public final List a;

    public ucf() {
    }

    public ucf(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ucf)) {
            return false;
        }
        return this.a.equals(((ucf) obj).a);
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
