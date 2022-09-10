package defpackage;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.reporting.UlrPrivateModeRequest;
/* compiled from: PG */
/* renamed from: affa  reason: default package */
/* loaded from: classes2.dex */
public final class affa {
    private final coqh a;

    public affa(Context context) {
        this.a = coqk.b(context);
    }

    public final cpcq<Void> a(boolean z) {
        final UlrPrivateModeRequest ulrPrivateModeRequest = new UlrPrivateModeRequest("GMMUlrIncognitoNotifier", z);
        coqh coqhVar = this.a;
        cntc builder = cntd.builder();
        builder.a = new cnsr(ulrPrivateModeRequest) { // from class: coqg
            private final UlrPrivateModeRequest a;

            {
                this.a = ulrPrivateModeRequest;
            }

            @Override // defpackage.cnsr
            public final void a(Object obj, Object obj2) {
                cntf.a(new Status(((coqr) ((coqt) obj).L()).k(this.a)), (cpct) obj2);
            }
        };
        builder.b = new Feature[]{cojn.a};
        builder.c = 2433;
        return coqhVar.d(builder.a());
    }
}
