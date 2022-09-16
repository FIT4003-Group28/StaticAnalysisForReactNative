package defpackage;

import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: urp  reason: default package */
/* loaded from: classes4.dex */
final class urp extends ury {
    private final qte a;
    private final Status b;

    public urp(qte qteVar, Status status) {
        if (qteVar != null) {
            this.a = qteVar;
            if (status != null) {
                this.b = status;
                return;
            }
            throw new NullPointerException("Null status");
        }
        throw new NullPointerException("Null result");
    }

    @Override // defpackage.ury
    public final qte a() {
        return this.a;
    }

    @Override // defpackage.ury
    public final Status b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ury) {
            ury uryVar = (ury) obj;
            if (this.a.equals(uryVar.a()) && this.b.equals(uryVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
