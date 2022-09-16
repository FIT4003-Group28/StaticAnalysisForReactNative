package defpackage;

import android.content.IntentSender;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ckvg  reason: default package */
/* loaded from: classes4.dex */
public final class ckvg {
    final /* synthetic */ ckvk a;

    public ckvg(ckvk ckvkVar) {
        this.a = ckvkVar;
    }

    public final void a(ConnectionResult connectionResult) {
        this.a.o.b(new ckvi());
        try {
            connectionResult.a(this.a, 0);
        } catch (IntentSender.SendIntentException unused) {
            bvoo.h("Exception while starting high-accuracy location connection resolution", new Object[0]);
            this.a.l.b(false);
        }
    }

    public final void b(Status status) {
        this.a.o.b(new ckvi());
        try {
            status.b(this.a, 1);
        } catch (IntentSender.SendIntentException unused) {
            bvoo.h("Exception while starting high-accuracy location settings resolution", new Object[0]);
            this.a.l.c();
        }
    }
}
