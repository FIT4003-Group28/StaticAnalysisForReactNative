package defpackage;

import android.view.View;
import com.google.ar.core.InstallActivity;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
/* compiled from: PG */
/* renamed from: dbau  reason: default package */
/* loaded from: classes5.dex */
public final class dbau implements View.OnClickListener {
    final /* synthetic */ InstallActivity a;

    public dbau(InstallActivity installActivity) {
        this.a = installActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.finishWithFailure(new UnavailableUserDeclinedInstallationException());
    }
}
