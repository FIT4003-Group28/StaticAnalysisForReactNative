package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import com.google.protos.youtube.api.innertube.ApplicationHelpEndpointOuterClass;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand;
import com.google.protos.youtube.api.innertube.OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import com.google.protos.youtube.api.innertube.UserFeedbackEndpointOuterClass;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: liq  reason: default package */
/* loaded from: classes3.dex */
public final class liq implements aafo {
    public final Activity a;
    public final azqb b;
    private final azqb c;
    private final azqb d;
    private final lil e;
    private final eqk f;
    private final ohp g;

    public liq(Activity activity, azqb azqbVar, azqb azqbVar2, lil lilVar, azqb azqbVar3, ohp ohpVar, eqk eqkVar) {
        this.a = activity;
        this.b = azqbVar;
        this.d = azqbVar2;
        this.c = azqbVar3;
        this.e = lilVar;
        this.g = ohpVar;
        this.f = eqkVar;
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void a(apzg apzgVar) {
        aafn.a(this, apzgVar);
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void b(List list) {
        aafn.b(this, list);
    }

    @Override // defpackage.aafo
    public final void c(apzg apzgVar, Map map) {
        if (apzgVar.qn(BrowseEndpointOuterClass.browseEndpoint)) {
            Intent a = this.g.a();
            a.putExtra("navigation_endpoint", apzgVar.toByteArray());
            this.a.startActivity(a);
        } else if (apzgVar.qn(OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint.openSourceLicensesEndpoint)) {
            Activity activity = this.a;
            activity.startActivity(new Intent(activity, LicenseMenuActivity.class));
        } else if (apzgVar.qn(ApplicationHelpEndpointOuterClass.applicationHelpEndpoint)) {
            lik likVar = this.e.a;
            if (likVar == null) {
                return;
            }
            likVar.aI();
        } else if (apzgVar.qn(UrlEndpointOuterClass.urlEndpoint)) {
            eog.g(this.a, zgt.j(((avvk) apzgVar.qm(UrlEndpointOuterClass.urlEndpoint)).c));
        } else if (apzgVar.qn(UserFeedbackEndpointOuterClass.userFeedbackEndpoint)) {
            ((akui) this.d.get()).b(new akuh() { // from class: lip
                @Override // defpackage.akuh
                public final void a(Bundle bundle) {
                    liq liqVar = liq.this;
                    ((akul) liqVar.b.get()).a(zew.o(liqVar.a), bundle, null);
                }
            });
        } else if (!apzgVar.qn(LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.localWatchHistoryCommand)) {
            try {
                ((aafi) this.c.get()).f(apzgVar).kD(apzgVar, map);
            } catch (aafy unused) {
            }
        } else {
            this.f.kD(apzgVar, map);
        }
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void d(List list, Map map) {
        aafn.c(this, list, map);
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void e(List list, Object obj) {
        aafn.d(this, list, obj);
    }
}
