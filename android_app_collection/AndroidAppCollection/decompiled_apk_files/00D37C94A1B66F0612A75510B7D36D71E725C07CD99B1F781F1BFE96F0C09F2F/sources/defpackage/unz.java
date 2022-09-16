package defpackage;

import android.util.Log;
import com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: unz  reason: default package */
/* loaded from: classes4.dex */
public final class unz implements ankb {
    final WeakReference a;

    public unz(ExpressSignInLayout expressSignInLayout) {
        this.a = new WeakReference(expressSignInLayout);
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        Log.e(ExpressSignInLayout.a, "ContinueWithAccountListener execution threw an exception", th);
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Boolean bool = (Boolean) obj;
        ExpressSignInLayout expressSignInLayout = (ExpressSignInLayout) this.a.get();
        if (expressSignInLayout != null) {
            if (!bool.booleanValue()) {
                umr.b(new unc(expressSignInLayout));
            } else {
                expressSignInLayout.d();
            }
        }
    }
}
