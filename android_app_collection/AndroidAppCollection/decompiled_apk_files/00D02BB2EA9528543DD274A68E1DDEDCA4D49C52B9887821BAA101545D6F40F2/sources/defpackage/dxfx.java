package defpackage;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import com.spotify.protocol.types.UserStatus;
import com.spotify.protocol.types.WelcomeDetails;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dxfx  reason: default package */
/* loaded from: classes6.dex */
public final class dxfx extends AsyncTask<Void, Void, dxhb<WelcomeDetails>> {
    private final dxgo a;
    private final dxfy b;
    private final dxhr c;
    private final dxfb d;

    public dxfx(dxfy dxfyVar, dxew dxewVar, dxfb dxfbVar) {
        this.b = dxfyVar;
        this.d = dxfbVar;
        this.c = dxewVar.d;
        dxgn dxgnVar = new dxgn();
        dxgnVar.e = dxfyVar.d.getPackageName();
        dxgnVar.f = "app";
        dxgnVar.g = "0.6.1-8.4.91.697";
        dxgnVar.h = dxewVar.c;
        HashMap hashMap = new HashMap();
        hashMap.put("redirect_uri", dxewVar.b);
        hashMap.put("show_auth_view", "false");
        hashMap.put("scopes", "app-remote-control");
        dxgnVar.b = new String[]{"appid"};
        dxgnVar.c = dxewVar.a;
        dxgnVar.d = hashMap;
        this.a = new dxgo(dxgnVar.e, dxgnVar.f, dxgnVar.g, dxgnVar.b, dxgnVar.c, dxgnVar.d, dxgnVar.h);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ dxhb<WelcomeDetails> doInBackground(Void[] voidArr) {
        dxft dxftVar;
        Intent intent;
        dxfw dxfwVar = this.b.a;
        dxgt.a();
        dxfwVar.e = new dxft();
        try {
            intent = new Intent("com.spotify.mobile.appprotocol.action.START_APP_PROTOCOL_SERVICE");
            intent.setPackage(dxfwVar.a);
            if (Build.VERSION.SDK_INT >= 26) {
                dxfwVar.b.getApplicationContext().startForegroundService(intent);
            } else {
                dxfwVar.b.startService(intent);
            }
        } catch (Exception e) {
            dxgt.b();
            dxfwVar.e.a(new dxfl(e));
            dxftVar = dxfwVar.e;
        }
        if (!dxfwVar.b.getApplicationContext().bindService(intent, dxfwVar, 65)) {
            String valueOf = String.valueOf(dxfwVar.a);
            throw new IllegalStateException(valueOf.length() != 0 ? "Can't connect to Spotify service with package ".concat(valueOf) : new String("Can't connect to Spotify service with package "));
        }
        dxgt.a();
        dxfwVar.f = 2;
        dxftVar = dxfwVar.e;
        dxhb<Void> d = dxftVar.d(30L, TimeUnit.SECONDS);
        if (!d.b()) {
            return dxhe.a(d.c());
        }
        dxgz dxgzVar = this.b.b;
        dxhi b = dxgzVar.c.b(WelcomeDetails.class);
        dxgzVar.a = b.a;
        try {
            dxgh dxghVar = dxgzVar.b;
            dxghVar.a(new Object[]{1, "spotify", dxghVar.a});
        } catch (dxhn e2) {
            dxgzVar.c.f(dxgzVar.a);
            b.b.g(e2);
        }
        return b.b.d(1L, TimeUnit.HOURS);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(dxhb<WelcomeDetails> dxhbVar) {
        dxhb<WelcomeDetails> dxhbVar2 = dxhbVar;
        if (dxhbVar2.b()) {
            dxfb dxfbVar = this.d;
            dxgb dxgbVar = new dxgb(this.b.b);
            dxfd dxfdVar = new dxfd(dxgbVar, new dxfu(dxgbVar), new dxfs(dxgbVar), new dxgc(dxgbVar), new dxfp(dxgbVar), dxfbVar.a);
            dxfdVar.b = true;
            dxgbVar.b.add(new dxfz(dxfdVar));
            dxfy dxfyVar = dxfbVar.a;
            dxey dxeyVar = new dxey(dxfbVar, dxfdVar);
            dxfyVar.b.d = dxeyVar;
            dxfyVar.a.g = dxeyVar;
            dxhh c = dxfdVar.e.a.c("com.spotify.status", UserStatus.class);
            c.a(new dxez(dxfbVar, dxfdVar));
            c.h(new dxfa(dxfbVar));
        } else {
            dxfb dxfbVar2 = this.d;
            Throwable c2 = dxhbVar2.c();
            dxgt.a.b();
            dxfbVar2.a.a();
            String str = c2 instanceof dxhm ? ((dxhm) c2).a : null;
            String message = c2.getMessage();
            if (!(c2 instanceof dxfl)) {
                c2 = "com.spotify.error.client_authentication_failed".equals(str) ? new dxfe(message, c2) : "com.spotify.error.unsupported_version".equals(str) ? new dxfm(message, c2) : "com.spotify.error.offline_mode_active".equals(str) ? new dxfi(message, c2) : "com.spotify.error.user_not_authorized".equals(str) ? new dxfn(message, c2) : "com.spotify.error.not_logged_in".equals(str) ? new dxfh(message, c2) : new dxhn(message, c2);
            }
            dxfbVar2.b.a(c2);
        }
        this.b.c = null;
    }

    @Override // android.os.AsyncTask
    protected final void onPreExecute() {
        dxfy dxfyVar = this.b;
        dxfyVar.a = new dxfw(dxfyVar.f, dxfyVar.d);
        dxgh dxghVar = new dxgh(this.a, this.c, this.b.a);
        this.b.b = new dxgz(dxghVar, new dxhk());
    }
}
