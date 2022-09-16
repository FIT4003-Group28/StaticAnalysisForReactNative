package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.mdx.tvsignin.TvSignInControllerImpl;
/* compiled from: PG */
/* renamed from: advl  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class advl implements ayqb {
    public final /* synthetic */ TvSignInControllerImpl a;
    public final /* synthetic */ ixj b;
    private final /* synthetic */ int c;

    public /* synthetic */ advl(TvSignInControllerImpl tvSignInControllerImpl, ixj ixjVar) {
        this.a = tvSignInControllerImpl;
        this.b = ixjVar;
    }

    public /* synthetic */ advl(TvSignInControllerImpl tvSignInControllerImpl, ixj ixjVar, int i) {
        this.c = i;
        this.a = tvSignInControllerImpl;
        this.b = ixjVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.c == 0) {
            TvSignInControllerImpl tvSignInControllerImpl = this.a;
            ixj ixjVar = this.b;
            ampq ampqVar = (ampq) obj;
            tvSignInControllerImpl.j.c();
            if (!ampqVar.h()) {
                zep.c(TvSignInControllerImpl.a, "SignInRequest from onSignInStarted MDx message is absent. Not proceeding with sign in flow.");
                ixjVar.a();
                tvSignInControllerImpl.o();
                return;
            }
            tvSignInControllerImpl.k = (advb) ampqVar.c();
            ixjVar.a.ag = null;
            ixjVar.a.ac.post(new ixi(ixjVar));
            if (!tvSignInControllerImpl.e.t() || tvSignInControllerImpl.d.a() == null || tvSignInControllerImpl.d.a().b == null || TextUtils.isEmpty(tvSignInControllerImpl.d.a().b)) {
                tvSignInControllerImpl.p(tvSignInControllerImpl.k, null);
                return;
            } else {
                tvSignInControllerImpl.p(tvSignInControllerImpl.k, tvSignInControllerImpl.d.a().b);
                return;
            }
        }
        TvSignInControllerImpl tvSignInControllerImpl2 = this.a;
        ixj ixjVar2 = this.b;
        String str = TvSignInControllerImpl.a;
        String valueOf = String.valueOf((Throwable) obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
        sb.append("Failed to start MDx message sign in: ");
        sb.append(valueOf);
        zep.c(str, sb.toString());
        ixjVar2.a();
        tvSignInControllerImpl2.o();
    }
}
