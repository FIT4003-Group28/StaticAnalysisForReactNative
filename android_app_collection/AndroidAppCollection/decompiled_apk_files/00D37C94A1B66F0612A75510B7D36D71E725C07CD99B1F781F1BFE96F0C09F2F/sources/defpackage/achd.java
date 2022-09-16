package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AndroidApplicationEndpointOuterClass;
import com.google.protos.youtube.api.innertube.AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint;
import com.google.protos.youtube.api.innertube.AuthorizedUrlEndpointOuterClass;
import com.google.protos.youtube.api.innertube.CopyTextEndpointOuterClass$CopyTextEndpoint;
import com.google.protos.youtube.api.innertube.ShareEndpointOuterClass$ShareEndpoint;
import com.google.protos.youtube.api.innertube.ShareEndpointOuterClass$ShareEntityEndpoint;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: achd  reason: default package */
/* loaded from: classes.dex */
public final class achd implements aafo {
    private final aafo a;
    private final aafi b;
    private final dt c;
    private final azqb d;

    public achd(dt dtVar, aafo aafoVar, aafi aafiVar, azqb azqbVar) {
        aafoVar.getClass();
        this.a = aafoVar;
        dtVar.getClass();
        this.c = dtVar;
        this.b = aafiVar;
        this.d = azqbVar;
    }

    private final void f(apzg apzgVar, dp dpVar) {
        if (!this.c.isFinishing()) {
            Bundle bundle = dpVar.m;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putByteArray("navigation_endpoint", apzgVar.toByteArray());
            dpVar.ae(bundle);
            ex l = this.c.getSupportFragmentManager().l();
            l.r(dpVar, "DialogFragmentFromNavigation");
            l.k();
        }
    }

    private final boolean g(apzg apzgVar) {
        if (apzgVar.qn(ShareEndpointOuterClass$ShareEntityEndpoint.shareEntityEndpoint)) {
            aqmv aqmvVar = (aqmv) this.d.get();
            f(apzgVar, new aknr());
            return true;
        } else if (apzgVar.qn(ShareEndpointOuterClass$ShareEndpoint.shareEndpoint)) {
            f(apzgVar, new acls());
            return true;
        } else if (apzgVar.qn(CopyTextEndpointOuterClass$CopyTextEndpoint.copyTextEndpoint)) {
            CopyTextEndpointOuterClass$CopyTextEndpoint copyTextEndpointOuterClass$CopyTextEndpoint = (CopyTextEndpointOuterClass$CopyTextEndpoint) apzgVar.qm(CopyTextEndpointOuterClass$CopyTextEndpoint.copyTextEndpoint);
            ((ClipboardManager) this.c.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text/plain", copyTextEndpointOuterClass$CopyTextEndpoint.b));
            if (copyTextEndpointOuterClass$CopyTextEndpoint.c.isEmpty()) {
                return true;
            }
            aafn.c(this, copyTextEndpointOuterClass$CopyTextEndpoint.c, null);
            return true;
        } else if (apzgVar.qn(AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.androidShareIntentEndpoint)) {
            AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint = (AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint) apzgVar.qm(AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.androidShareIntentEndpoint);
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            for (asmc asmcVar : androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.b) {
                intent.putExtra(asmcVar.e, asmcVar.c == 2 ? (String) asmcVar.d : "");
            }
            intent.setType(androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.c);
            this.c.startActivity(Intent.createChooser(intent, null));
            return true;
        } else if (apzgVar.qn(AndroidApplicationEndpointOuterClass.androidAppEndpoint)) {
            Intent C = zgt.C();
            apem apemVar = (apem) apzgVar.qm(AndroidApplicationEndpointOuterClass.androidAppEndpoint);
            C.setClassName(apemVar.c, apemVar.d);
            for (asmc asmcVar2 : apemVar.e) {
                C.putExtra(asmcVar2.e, asmcVar2.c == 2 ? (String) asmcVar2.d : "");
            }
            try {
                this.c.startActivity(C);
                return true;
            } catch (ActivityNotFoundException unused) {
                zag.q(this.c, R.string.lc_error_generic, 0);
                return true;
            }
        } else if (apzgVar.qn(UrlEndpointOuterClass.urlEndpoint)) {
            Uri j = zgt.j(((avvk) apzgVar.qm(UrlEndpointOuterClass.urlEndpoint)).c);
            dt dtVar = this.c;
            Intent intent2 = new Intent("android.intent.action.VIEW", j);
            ajgl.q(dtVar, intent2);
            h(this.c, intent2.setFlags(268435456));
            return true;
        } else if (!apzgVar.qn(AuthorizedUrlEndpointOuterClass.authorizedUrlEndpoint)) {
            return false;
        } else {
            Uri j2 = zgt.j(((apiw) apzgVar.qm(AuthorizedUrlEndpointOuterClass.authorizedUrlEndpoint)).b);
            dt dtVar2 = this.c;
            Intent intent3 = new Intent("android.intent.action.VIEW", j2);
            ajgl.q(dtVar2, intent3);
            h(this.c, intent3.setFlags(268435456));
            return true;
        }
    }

    private static final void h(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(context, context.getString(R.string.lc_error_browser_not_found), 1).show();
        }
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
        if (!g(apzgVar)) {
            try {
                this.b.f(apzgVar).kD(apzgVar, map);
            } catch (aafy unused) {
                String valueOf = String.valueOf(Arrays.toString(Thread.currentThread().getStackTrace()));
                afus.b(2, 29, valueOf.length() != 0 ? "No binding found for command routed to LiveCreationCommandRouter. \n".concat(valueOf) : new String("No binding found for command routed to LiveCreationCommandRouter. \n"));
                this.a.c(apzgVar, map);
            }
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
