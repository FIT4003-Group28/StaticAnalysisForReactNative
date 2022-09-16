package defpackage;

import java.util.Collection;
/* compiled from: PG */
/* renamed from: zjc  reason: default package */
/* loaded from: classes4.dex */
public final class zjc {
    public final zix a;
    public final Collection b;

    public zjc(zix zixVar, Collection collection) {
        this.a = zixVar;
        if (collection != null) {
            this.b = collection;
            return;
        }
        throw new NullPointerException("Null paths");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zjc) {
            zjc zjcVar = (zjc) obj;
            if (this.a.equals(zjcVar.a) && this.b.equals(zjcVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53 + String.valueOf(valueOf2).length());
        sb.append("DataSyncSubscription{observer=");
        sb.append(valueOf);
        sb.append(", active=true, paths=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public zjc() {
    }
}
