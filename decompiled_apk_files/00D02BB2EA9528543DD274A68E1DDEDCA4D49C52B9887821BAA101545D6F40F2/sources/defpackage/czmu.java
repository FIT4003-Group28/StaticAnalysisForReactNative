package defpackage;

import defpackage.dssj;
/* compiled from: PG */
/* renamed from: czmu  reason: default package */
/* loaded from: classes5.dex */
public final class czmu<T extends dssj> extends czmv<T> {
    public final T a;
    private final dsqa b;

    public czmu(T t, dsqa dsqaVar) {
        if (t != null) {
            this.a = t;
            if (dsqaVar != null) {
                this.b = dsqaVar;
                return;
            }
            throw new NullPointerException("Null extensionRegistryLite");
        }
        throw new NullPointerException("Null defaultValue");
    }

    @Override // defpackage.czmv
    public final T b() {
        return this.a;
    }

    @Override // defpackage.czmv
    public final dsqa c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof czmv) {
            czmv czmvVar = (czmv) obj;
            if (this.a.equals(czmvVar.b()) && this.b.equals(czmvVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54 + String.valueOf(valueOf2).length());
        sb.append("ProtoSerializer{defaultValue=");
        sb.append(valueOf);
        sb.append(", extensionRegistryLite=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
