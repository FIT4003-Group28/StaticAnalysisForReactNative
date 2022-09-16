package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.youtube.R;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.WatchPlaylistEndpointOuterClass;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: oiv  reason: default package */
/* loaded from: classes3.dex */
public final class oiv implements afzf {
    final /* synthetic */ Uri a;
    final /* synthetic */ Intent b;
    final /* synthetic */ SettableFuture c;
    final /* synthetic */ oiw d;

    public oiv(oiw oiwVar, Uri uri, Intent intent, SettableFuture settableFuture) {
        this.d = oiwVar;
        this.a = uri;
        this.b = intent;
        this.c = settableFuture;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        if (cffVar.getCause() == null || !(cffVar.getCause() instanceof CancellationException)) {
            zag.q(this.d.a, R.string.url_resolver_failed, 1);
        }
        PaneDescriptor n = this.d.c.n();
        if (n == null || this.d.k.b(n)) {
            this.d.c.d(this.d.c.f());
        }
        this.c.o(Boolean.FALSE);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        arxs arxsVar = (arxs) obj;
        apzg apzgVar = arxsVar.d;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        if ((arxsVar.b & 2) == 0) {
            eog.g(this.d.a, this.a);
        } else if (apzgVar.qn(UrlEndpointOuterClass.urlEndpoint)) {
            eog.g(this.d.a, Uri.parse(((avvk) apzgVar.qm(UrlEndpointOuterClass.urlEndpoint)).c));
        } else {
            if (!apzgVar.qn(WatchEndpointOuterClass.watchEndpoint) && !apzgVar.qn(WatchPlaylistEndpointOuterClass.watchPlaylistEndpoint)) {
                this.d.e();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.bundle", this.b.getExtras());
            hashMap.put("com.google.android.apps.youtube.app.endpoint.flags", 1);
            hashMap.put(actk.a, 1);
            this.d.b.c(apzgVar, hashMap);
        }
        this.c.o(Boolean.TRUE);
    }
}
