package defpackage;

import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: cwok  reason: default package */
/* loaded from: classes5.dex */
final class cwok extends cwov {
    private final cnom a;
    private final Status b;

    public cwok(cnom cnomVar, Status status) {
        if (cnomVar != null) {
            this.a = cnomVar;
            if (status != null) {
                this.b = status;
                return;
            }
            throw new NullPointerException("Null status");
        }
        throw new NullPointerException("Null result");
    }

    @Override // defpackage.cwov
    public final cnom a() {
        return this.a;
    }

    @Override // defpackage.cwov
    public final Status b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cwov) {
            cwov cwovVar = (cwov) obj;
            if (this.a.equals(cwovVar.a()) && this.b.equals(cwovVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
