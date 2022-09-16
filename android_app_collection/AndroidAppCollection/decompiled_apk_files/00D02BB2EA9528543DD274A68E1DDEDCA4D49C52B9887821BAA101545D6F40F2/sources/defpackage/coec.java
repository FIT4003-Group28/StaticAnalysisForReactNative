package defpackage;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: coec  reason: default package */
/* loaded from: classes5.dex */
public final class coec extends coeh {
    final /* synthetic */ Intent a;
    final /* synthetic */ WeakReference k;
    final /* synthetic */ coei l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coec(coei coeiVar, GoogleApiClient googleApiClient, Intent intent, WeakReference weakReference) {
        super(googleApiClient);
        this.l = coeiVar;
        this.a = intent;
        this.k = weakReference;
    }

    @Override // defpackage.coeg
    protected final void a(coen coenVar) {
        GoogleHelp googleHelp = (GoogleHelp) this.a.getParcelableExtra("EXTRA_GOOGLE_HELP");
        codq codqVar = googleHelp.H;
        cocm cocmVar = googleHelp.I;
        coeb coebVar = new coeb(this, coenVar, this, codqVar);
        if (codqVar == null) {
            coebVar.a(googleHelp);
        } else {
            coep.a(new coea(googleHelp, coebVar), 10);
        }
    }
}
