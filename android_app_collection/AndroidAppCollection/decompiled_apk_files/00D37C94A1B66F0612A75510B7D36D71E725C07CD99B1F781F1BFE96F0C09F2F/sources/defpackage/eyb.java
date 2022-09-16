package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AuthorizedUrlEndpointOuterClass;
import com.google.protos.youtube.api.innertube.ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: eyb  reason: default package */
/* loaded from: classes3.dex */
public final class eyb implements aafo {
    private final wxc a;
    private final Activity b;
    private final yni c;
    private final yrj d;
    private final aafi e;
    private final azqb f;
    private final yzv g;
    private eyg h;

    public eyb(wxc wxcVar, Activity activity, yni yniVar, yrj yrjVar, azqb azqbVar, aafi aafiVar, yzv yzvVar) {
        this.a = wxcVar;
        this.b = activity;
        yniVar.getClass();
        this.c = yniVar;
        yrjVar.getClass();
        this.d = yrjVar;
        azqbVar.getClass();
        this.f = azqbVar;
        this.e = aafiVar;
        yzvVar.getClass();
        this.g = yzvVar;
    }

    private static final void f(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(context, (int) R.string.url_resolver_failed, 1).show();
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
        if (apzgVar != null) {
            try {
                try {
                    aafl aaflVar = null;
                    if (apzgVar.qn(UrlEndpointOuterClass.urlEndpoint)) {
                        if (this.h == null) {
                            this.h = new eyg(this.b, this.a, null, eya.a, null, null, anjk.a, null, null);
                        }
                        aaflVar = this.h;
                    } else if (!this.d.o()) {
                        this.g.b();
                    } else if (apzgVar.qn(ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint.channelCreationFormEndpoint)) {
                        aaflVar = (aafl) this.f.get();
                    } else if (apzgVar.qn(AuthorizedUrlEndpointOuterClass.authorizedUrlEndpoint)) {
                        Uri j = zgt.j(((apiw) apzgVar.qm(AuthorizedUrlEndpointOuterClass.authorizedUrlEndpoint)).b);
                        Activity activity = this.b;
                        Intent intent = new Intent("android.intent.action.VIEW", j);
                        ajgl.q(activity, intent);
                        f(this.b, intent.setFlags(268435456));
                    } else {
                        throw new aafy("Unknown NavigationData encountered");
                    }
                    if (aaflVar == null) {
                        return;
                    }
                    aaflVar.kD(apzgVar, map);
                    this.c.d(new ewr());
                } catch (aafy e) {
                    zag.r(this.b, e.getMessage(), 1);
                }
            } catch (aafy unused) {
                this.e.f(apzgVar).kD(apzgVar, map);
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
