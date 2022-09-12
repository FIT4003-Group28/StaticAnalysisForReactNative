package defpackage;

import android.app.Activity;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bxpv  reason: default package */
/* loaded from: classes4.dex */
public class bxpv extends bxpd {
    final /* synthetic */ btpc a;
    final /* synthetic */ gga b;
    final /* synthetic */ bxeq c;
    final /* synthetic */ bxko d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxpv(Activity activity, btpc btpcVar, gga ggaVar, bxeq bxeqVar, bxko bxkoVar) {
        super(activity);
        this.a = btpcVar;
        this.b = ggaVar;
        this.c = bxeqVar;
        this.d = bxkoVar;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        if (!this.a.i()) {
            gga ggaVar = this.b;
            Toast.makeText(ggaVar, ggaVar.getString(R.string.OFFLINE_COULD_NOT_FETCH_SUGGESTIONS), 1).show();
        } else {
            bxeq bxeqVar = this.c;
            if (bxeqVar != null) {
                bxeqVar.aL(this.d.d());
            }
        }
        return cqkl.a;
    }
}
