package defpackage;

import com.google.android.gms.common.ConnectionResult;
/* compiled from: PG */
/* renamed from: cmvo  reason: default package */
/* loaded from: classes5.dex */
public final class cmvo extends cmzf {
    public ConnectionResult a;
    public int b;

    @Override // defpackage.cmzf
    public final cmzg a() {
        String str = this.b == 0 ? " failureReason" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new cmvp(this.b, this.a);
    }
}
