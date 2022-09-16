package defpackage;

import android.content.Context;
/* compiled from: PG */
@Deprecated
/* renamed from: cyhl  reason: default package */
/* loaded from: classes5.dex */
public final class cyhl extends cyhi {
    private final Context b;

    public cyhl(Context context) {
        this.b = context;
    }

    @Override // defpackage.cyhi
    public final cqvs c() {
        try {
            return (cqvs) czhd.a(this.b, cqvs.class);
        } catch (IllegalStateException e) {
            throw new IllegalStateException("GcoreGoogleAuthUtil is not bound. You must add //java/com/google/android/libraries/gcoreclient/auth/impl:[GMS Cor version] with the correct GMS core version as a dependency of your app.", e);
        }
    }
}
