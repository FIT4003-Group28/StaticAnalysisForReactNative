package com.google.android.youtube.api;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.apps.youtube.embeddedplayer.service.util.a;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.model.WatchDescriptor;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class StandalonePlayerActivity extends Activity implements ooo {
    private static StandalonePlayerActivity a;
    private WatchDescriptor b;
    private PlaybackStartDescriptor c;
    private boolean d;
    private boolean e;
    private boolean f;
    private ooh g;
    private oqs h;
    private oqt i;
    private String j;
    private String k;

    @Override // defpackage.ooo
    public final void a(ooh oohVar) {
        this.g = oohVar;
        if (!TextUtils.isEmpty(this.j)) {
            oohVar.i(this.j, new alxu(this));
        } else {
            c();
        }
    }

    @Override // defpackage.ooo
    public final void b(Exception exc) {
        Intent intent = new Intent();
        intent.putExtra("initialization_result", aqvb.n(oon.l(exc)));
        setResult(1, intent);
        finish();
    }

    public final void c() {
        if (isFinishing()) {
            return;
        }
        ooh oohVar = this.g;
        oon oonVar = (oon) oohVar;
        oonVar.i = this.k;
        oqs oqsVar = new oqs(this, oohVar, new afmy(this, oonVar.f.L()));
        this.h = oqsVar;
        boolean z = true;
        oqsVar.ap(true);
        if (((osb) this.b.b.instance).d) {
            this.h.ao(new alyn(this));
        }
        View view = (View) alyx.b(this.h.J());
        if (view == null) {
            b(new IllegalStateException("Could not get player view."));
            return;
        }
        oqt oqtVar = new oqt(this, view, this.h, this.c, this.d, this.e, this.f);
        this.i = oqtVar;
        oqtVar.show();
        this.h.K(8);
        oqs oqsVar2 = this.h;
        if (this.d || this.f) {
            z = false;
        }
        oqsVar2.am(z);
        Intent intent = new Intent();
        intent.putExtra("initialization_result", "SUCCESS");
        setResult(-1, intent);
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        PlaybackStartDescriptor a2;
        StandalonePlayerActivity standalonePlayerActivity = a;
        if (standalonePlayerActivity != null) {
            standalonePlayerActivity.finish();
        }
        a = this;
        Intent intent = getIntent();
        WatchDescriptor watchDescriptor = (WatchDescriptor) intent.getParcelableExtra("watch");
        boolean z = false;
        if (watchDescriptor == null) {
            String stringExtra = intent.getStringExtra("video_id");
            String stringExtra2 = intent.getStringExtra("playlist_id");
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("video_ids");
            int intExtra = intent.getIntExtra("current_index", 0);
            int intExtra2 = intent.getIntExtra("start_time_millis", 0);
            boolean booleanExtra = intent.getBooleanExtra("autoplay", false);
            if (stringArrayListExtra != null) {
                a2 = a.c(stringArrayListExtra, intExtra, intExtra2);
            } else if (stringExtra2 != null) {
                a2 = a.a(stringExtra2, intExtra, intExtra2);
            } else if (stringExtra != null) {
                a2 = a.b(stringExtra, intExtra2);
            } else {
                a2 = PlaybackStartDescriptor.d().a();
            }
            aijl e = a2.e();
            e.d = booleanExtra;
            e.b(!booleanExtra);
            WatchDescriptor watchDescriptor2 = new WatchDescriptor(e.a());
            this.b = watchDescriptor2;
            this.c = watchDescriptor2.a;
        } else {
            this.b = watchDescriptor;
            PlaybackStartDescriptor playbackStartDescriptor = watchDescriptor.a;
            if (!TextUtils.isEmpty(playbackStartDescriptor.l())) {
                playbackStartDescriptor = a.b(playbackStartDescriptor.l(), playbackStartDescriptor.c());
            } else if (!TextUtils.isEmpty(playbackStartDescriptor.k())) {
                playbackStartDescriptor = a.a(playbackStartDescriptor.k(), playbackStartDescriptor.a(), playbackStartDescriptor.c());
            } else {
                List m = playbackStartDescriptor.m();
                if (m != null) {
                    if (m.size() == 1) {
                        playbackStartDescriptor = a.b((String) m.get(0), playbackStartDescriptor.c());
                    } else {
                        playbackStartDescriptor = a.c(m, playbackStartDescriptor.a(), playbackStartDescriptor.c());
                    }
                } else {
                    aqvb.l("Invalid PlaybackStartDescriptor. Returning the instance itself.", new Object[0]);
                }
            }
            this.c = playbackStartDescriptor;
        }
        this.d = intent.getBooleanExtra("lightbox_mode", false);
        this.e = intent.getBooleanExtra("window_has_status_bar", false);
        if (Build.VERSION.SDK_INT >= 24 && isInMultiWindowMode()) {
            z = true;
        }
        this.f = z;
        super.onCreate(bundle);
        if (!this.d && !this.f) {
            setRequestedOrientation(6);
        }
        String stringExtra3 = intent.getStringExtra("developer_key");
        String stringExtra4 = intent.getStringExtra("app_version");
        String stringExtra5 = intent.getStringExtra("client_library_version");
        if (stringExtra5 == null) {
            stringExtra5 = "1.0.0";
        }
        String str = stringExtra5;
        if (!str.matches("^(\\d+\\.){2}(\\d+)(\\w?)$")) {
            b(new IllegalStateException("Invalid client version"));
            return;
        }
        String callingPackage = getCallingPackage();
        String stringExtra6 = callingPackage != null ? callingPackage : intent.getStringExtra("app_package");
        this.k = (TextUtils.isEmpty(stringExtra6) || TextUtils.equals(stringExtra6, "com.google.android.youtube")) ? intent.getStringExtra("referring_app_package") : stringExtra6;
        String stringExtra7 = "com.google.android.music".equals(callingPackage) ? intent.getStringExtra("google_account_name") : null;
        this.j = stringExtra7;
        if (stringExtra3 == null) {
            b(new IllegalArgumentException("App developer key cannot be null or empty"));
        } else if (stringExtra6 == null) {
            b(new IllegalArgumentException("App package name cannot be null or empty"));
        } else if (stringExtra4 == null) {
            b(new IllegalArgumentException("App version name cannot be null or empty"));
        } else {
            oon.n(this, new Handler(getMainLooper()), this, stringExtra3, stringExtra6, stringExtra4, str, !TextUtils.isEmpty(stringExtra7), 3);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        oqs oqsVar = this.h;
        if (oqsVar != null) {
            oqsVar.am(false);
            this.h.al(isFinishing());
        }
        oqt oqtVar = this.i;
        if (oqtVar != null && oqtVar.isShowing()) {
            this.i.dismiss();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        oqs oqsVar = this.h;
        return (oqsVar != null && oqsVar.aw(i, keyEvent)) || super.onKeyUp(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        oqs oqsVar = this.h;
        return (oqsVar != null && oqsVar.ax(i, keyEvent)) || super.onKeyUp(i, keyEvent);
    }

    @Override // android.app.Activity
    public final void onPause() {
        oqs oqsVar = this.h;
        if (oqsVar != null) {
            oqsVar.ah();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        oqs oqsVar = this.h;
        if (oqsVar != null) {
            oqsVar.ai();
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        oqs oqsVar = this.h;
        if (oqsVar != null) {
            oqsVar.aj();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        if (a == this) {
            a = null;
        }
        oqs oqsVar = this.h;
        if (oqsVar != null) {
            oqsVar.ak();
        }
        super.onStop();
    }
}
