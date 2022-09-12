package defpackage;

import android.view.View;
import com.google.ar.core.InstallActivity;
/* compiled from: PG */
/* renamed from: dbav  reason: default package */
/* loaded from: classes5.dex */
public final class dbav implements View.OnClickListener {
    final /* synthetic */ InstallActivity a;

    public dbav(InstallActivity installActivity) {
        this.a = installActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.animateToSpinner();
        this.a.startInstaller();
    }
}
