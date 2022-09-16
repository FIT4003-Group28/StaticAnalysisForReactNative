package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat$Token;
/* compiled from: PG */
/* renamed from: are  reason: default package */
/* loaded from: classes2.dex */
class are extends MediaBrowserService {
    final /* synthetic */ arf a;

    public are(arf arfVar, Context context) {
        this.a = arfVar;
        attachBaseContext(context);
    }

    @Override // android.service.media.MediaBrowserService
    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        Bundle bundle2;
        int i2;
        ynv ynvVar;
        iz.c(bundle);
        arf arfVar = this.a;
        Bundle bundle3 = bundle == null ? null : new Bundle(bundle);
        if (bundle3 == null || bundle3.getInt("extra_client_version", 0) == 0) {
            bundle2 = null;
            i2 = -1;
        } else {
            bundle3.remove("extra_client_version");
            arfVar.c = new Messenger(arfVar.d.d);
            bundle2 = new Bundle();
            bundle2.putInt("extra_service_version", 2);
            bundle2.putBinder("extra_messenger", arfVar.c.getBinder());
            MediaSessionCompat$Token mediaSessionCompat$Token = arfVar.d.e;
            if (mediaSessionCompat$Token != null) {
                ih a = mediaSessionCompat$Token.a();
                bundle2.putBinder("extra_session_binder", a == null ? null : a.asBinder());
            } else {
                arfVar.a.add(bundle2);
            }
            int i3 = bundle3.getInt("extra_calling_pid", -1);
            bundle3.remove("extra_calling_pid");
            i2 = i3;
        }
        ara araVar = new ara(arfVar.d, str, i2, i, null);
        ynv e = arfVar.d.e(str);
        if (e == null) {
            ynvVar = null;
        } else {
            if (arfVar.c != null) {
                arfVar.d.b.add(araVar);
            }
            if (bundle2 == null) {
                bundle2 = e.b;
            } else {
                Bundle bundle4 = e.b;
                if (bundle4 != null) {
                    bundle2.putAll(bundle4);
                }
            }
            ynvVar = new ynv(bundle2);
        }
        if (ynvVar == null) {
            return null;
        }
        return new MediaBrowserService.BrowserRoot(ynvVar.a, ynvVar.b);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result) {
        arf arfVar = this.a;
        arfVar.d.b(new ard(str, new arn(result)));
    }
}
