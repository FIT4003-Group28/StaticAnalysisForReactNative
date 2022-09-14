package defpackage;

import com.google.android.gms.common.ConnectionResult;
/* compiled from: PG */
/* renamed from: cmvp  reason: default package */
/* loaded from: classes5.dex */
final class cmvp extends cmzg {
    private final ConnectionResult a;
    private final int b;

    public cmvp(int i, ConnectionResult connectionResult) {
        this.b = i;
        this.a = connectionResult;
    }

    @Override // defpackage.cmzg
    public final ConnectionResult a() {
        return this.a;
    }

    @Override // defpackage.cmzg
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        ConnectionResult connectionResult;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cmzg)) {
            return false;
        }
        cmzg cmzgVar = (cmzg) obj;
        int i = this.b;
        int b = cmzgVar.b();
        if (i == 0) {
            throw null;
        }
        return i == b && ((connectionResult = this.a) != null ? connectionResult.equals(cmzgVar.a()) : cmzgVar.a() == null);
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            int i2 = (i ^ 1000003) * 1000003;
            ConnectionResult connectionResult = this.a;
            return i2 ^ (connectionResult == null ? 0 : connectionResult.hashCode());
        }
        throw null;
    }
}
