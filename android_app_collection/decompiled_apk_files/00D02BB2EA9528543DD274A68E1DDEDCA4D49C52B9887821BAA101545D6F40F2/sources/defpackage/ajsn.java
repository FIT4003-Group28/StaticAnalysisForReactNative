package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
/* compiled from: PG */
/* renamed from: ajsn  reason: default package */
/* loaded from: classes2.dex */
final class ajsn extends ajst {
    private final btlu a;
    private final long b;
    private final PersonId c;
    private final int d;

    public ajsn(btlu btluVar, long j, PersonId personId, int i) {
        if (btluVar != null) {
            this.a = btluVar;
            this.b = j;
            if (personId != null) {
                this.c = personId;
                this.d = i;
                return;
            }
            throw new NullPointerException("Null personId");
        }
        throw new NullPointerException("Null account");
    }

    @Override // defpackage.ajst
    public final btlu a() {
        return this.a;
    }

    @Override // defpackage.ajst
    public final long b() {
        return this.b;
    }

    @Override // defpackage.ajst
    public final PersonId c() {
        return this.c;
    }

    @Override // defpackage.ajst
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajst) {
            ajst ajstVar = (ajst) obj;
            if (this.a.equals(ajstVar.a()) && this.b == ajstVar.b() && this.c.equals(ajstVar.c()) && this.d == ajstVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        return ((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        String valueOf2 = String.valueOf(this.c);
        int i = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 94 + String.valueOf(valueOf2).length());
        sb.append("HistoricalRecord{account=");
        sb.append(valueOf);
        sb.append(", completionTime=");
        sb.append(j);
        sb.append(", personId=");
        sb.append(valueOf2);
        sb.append(", result=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
