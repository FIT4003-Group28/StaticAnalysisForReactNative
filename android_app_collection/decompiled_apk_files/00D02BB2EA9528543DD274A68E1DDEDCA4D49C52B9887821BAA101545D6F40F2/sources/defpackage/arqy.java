package defpackage;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.gmm.navigation.media.spotify.SpotifyAuthenticationActivity;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: arqy  reason: default package */
/* loaded from: classes2.dex */
public final class arqy extends itb implements arri {
    public final gga a;
    private final cqat b;
    private final bvjj c;
    private final dxio<afha> d;
    @dzsi
    private final arvo e;
    @dzsi
    private BroadcastReceiver f;

    public arqy(gga ggaVar, cqat cqatVar, bvjj bvjjVar, dxio<afha> dxioVar, @dzsi arvo arvoVar) {
        this.a = ggaVar;
        this.b = cqatVar;
        this.c = bvjjVar;
        this.d = dxioVar;
        this.e = arvoVar;
    }

    private final synchronized void l() {
        if (this.e == null || this.f != null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addDataScheme("package");
        intentFilter.addDataPath("com.spotify.music", 0);
        arqx arqxVar = new arqx(this);
        this.f = arqxVar;
        this.a.registerReceiver(arqxVar, intentFilter);
    }

    private final synchronized void m() {
        BroadcastReceiver broadcastReceiver = this.f;
        if (broadcastReceiver != null) {
            this.a.unregisterReceiver(broadcastReceiver);
            this.f = null;
        }
    }

    @Override // defpackage.itb
    public final void Nt() {
        super.Nt();
        k();
    }

    @Override // defpackage.itb
    public final void Po() {
        super.Po();
        m();
    }

    @Override // defpackage.arri
    public final void e() {
        gei.b(this.a, new arql(), arql.ad);
    }

    @Override // defpackage.arri
    public final void f() {
        arvo arvoVar = this.e;
        if (arvoVar != null && arvoVar.c()) {
            this.c.P(bvjk.ji);
        }
        new arrb().aJ(this.a);
    }

    @Override // defpackage.arri
    public final void i() {
        arvo arvoVar = this.e;
        if (arvoVar == null || !arvoVar.c()) {
            return;
        }
        this.c.Z(bvjk.ji, this.b.b());
        this.d.a().G(new Runnable(this) { // from class: arqw
            private final arqy a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                gga ggaVar = this.a.a;
                String packageName = ggaVar.getPackageName();
                Uri.Builder builder = new Uri.Builder();
                if (ggaVar.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("market://")), ImageMetadata.CONTROL_AE_ANTIBANDING_MODE).size() <= 0) {
                    builder.scheme("https").authority("play.google.com").appendEncodedPath("store/apps/details");
                } else {
                    builder.scheme("market").appendPath("details");
                }
                builder.appendQueryParameter("id", "com.spotify.music");
                Uri.Builder builder2 = new Uri.Builder();
                builder2.appendQueryParameter("utm_source", "spotify-sdk").appendQueryParameter("utm_medium", "android-sdk");
                if (TextUtils.isEmpty(packageName)) {
                    builder2.appendQueryParameter("utm_campaign", "android-sdk");
                } else {
                    builder2.appendQueryParameter("utm_campaign", packageName);
                }
                builder.appendQueryParameter("referrer", builder2.build().getEncodedQuery());
                ggaVar.startActivity(new Intent("android.intent.action.VIEW", builder.build()));
            }
        });
    }

    @Override // defpackage.arri
    public final void j() {
        gga ggaVar = this.a;
        this.d.a().f(ggaVar, new Intent(ggaVar, SpotifyAuthenticationActivity.class).addFlags(268435456), 1);
    }

    public final void k() {
        arvo arvoVar = this.e;
        if (arvoVar == null || !arvoVar.c()) {
            return;
        }
        if (eaow.e(this.b.b()).q(eaow.e(this.c.w(bvjk.ji, 0L)).j(eaow.c(5L)))) {
            arvo arvoVar2 = this.e;
            if (arvoVar2 == null || !arvoVar2.a()) {
                l();
                return;
            }
            f();
            m();
            return;
        }
        m();
    }
}
