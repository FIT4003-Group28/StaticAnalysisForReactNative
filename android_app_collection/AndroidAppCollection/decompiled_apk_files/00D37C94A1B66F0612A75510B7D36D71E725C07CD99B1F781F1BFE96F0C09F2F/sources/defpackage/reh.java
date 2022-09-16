package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: reh  reason: default package */
/* loaded from: classes4.dex */
public final class reh extends rek {
    final /* synthetic */ Intent a;
    final /* synthetic */ WeakReference b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public reh(qsx qsxVar, Intent intent, WeakReference weakReference) {
        super(qsxVar);
        this.a = intent;
        this.b = weakReference;
    }

    @Override // defpackage.rej
    protected final void b(rep repVar) {
        GoogleHelp googleHelp = (GoogleHelp) this.a.getParcelableExtra("EXTRA_GOOGLE_HELP");
        tzh tzhVar = googleHelp.H;
        try {
            rei reiVar = new rei(this.a, this.b, this, tzhVar, null, null, null);
            Parcel pv = repVar.pv();
            dve.g(pv, googleHelp);
            dve.g(pv, null);
            dve.i(pv, reiVar);
            repVar.px(2, pv);
        } catch (RemoteException e) {
            Log.e("gH_GoogleHelpApiImpl", "Starting help failed!", e);
            l(rel.a);
        }
    }
}
