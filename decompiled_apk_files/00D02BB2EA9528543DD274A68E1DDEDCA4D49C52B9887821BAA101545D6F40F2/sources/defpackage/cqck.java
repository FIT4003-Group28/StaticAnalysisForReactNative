package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqck  reason: default package */
/* loaded from: classes5.dex */
public final class cqck implements degu<Void> {
    final /* synthetic */ Context a;
    final /* synthetic */ cqcp b;

    public cqck(cqcp cqcpVar, Context context) {
        this.b = cqcpVar;
        this.a = context;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        Context context = this.a;
        Toast.makeText(context, context.getResources().getString(R.string.retryable_error_message), 0).show();
        this.b.g.b(14);
        this.b.c(cqcm.WAITING_FOR_USER_DECISION);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Void r2) {
        this.b.c(cqcm.CONSENT_WRITTEN);
    }
}
