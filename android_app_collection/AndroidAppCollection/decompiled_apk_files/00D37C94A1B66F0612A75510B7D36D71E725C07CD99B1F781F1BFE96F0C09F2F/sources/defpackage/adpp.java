package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.mdx.model.AppStatus;
/* compiled from: PG */
/* renamed from: adpp  reason: default package */
/* loaded from: classes.dex */
final class adpp implements yiw {
    final /* synthetic */ adpt a;
    private final adid b;

    public adpp(adpt adptVar, adid adidVar) {
        this.a = adptVar;
        this.b = adidVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Uri uri = (Uri) obj;
        String str = adpt.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
        sb.append("Error on retrieving app status for ");
        sb.append(valueOf);
        zep.f(str, sb.toString(), exc);
        adpt adptVar = this.a;
        adid adidVar = this.b;
        adptVar.n(adidVar, adptVar.m(adidVar));
        this.a.q(this.b);
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        c((AppStatus) obj2);
    }

    public final void c(AppStatus appStatus) {
        int a = appStatus.a();
        String str = adpt.a;
        String.valueOf(this.b.d).length();
        if (a == 2) {
            this.a.n(this.b, atcv.MDX_SESSION_DISCONNECT_REASON_SCREEN_APP_STOPPED);
            this.a.q(this.b);
        } else if (a == 1) {
        } else {
            adpt adptVar = this.a;
            adid adidVar = this.b;
            adptVar.n(adidVar, adptVar.m(adidVar));
            this.a.q(this.b);
        }
    }
}
