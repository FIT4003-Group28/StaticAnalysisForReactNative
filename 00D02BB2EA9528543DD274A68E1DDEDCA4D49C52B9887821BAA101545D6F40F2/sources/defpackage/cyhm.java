package defpackage;

import android.content.Context;
/* compiled from: PG */
@Deprecated
/* renamed from: cyhm  reason: default package */
/* loaded from: classes5.dex */
public final class cyhm extends cyhu {
    public cyhm(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cyhu
    @dzsi
    public final cqvv a() {
        try {
            return (cqvv) czhd.a(this.a, cqvv.class);
        } catch (IllegalStateException e) {
            throw new IllegalStateException("GcoreClearcutLoggerFactory is not bound. Please add a specific cheese version of //java/com/google/android/libraries/gcoreclient/clearcut/impl:[cheese] as a dependency to the root android_binary target.", e);
        } catch (UnsupportedOperationException e2) {
            if (String.valueOf(e2.getMessage()).length() != 0) {
                return null;
            }
            new String("Failed to get a Gcore clearcut logger factory: ");
            return null;
        }
    }

    @Override // defpackage.cyhu, defpackage.cyho
    public final cyhn b(String str, String str2) {
        cyhn cyhnVar = (cyhn) czhd.b(this.a, cyhn.class);
        return cyhnVar == null ? new cyhs(super.c()) : cyhnVar;
    }
}
