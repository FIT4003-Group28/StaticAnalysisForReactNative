package com.google.android.libraries.youtube.livecreation.screencast;

import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.view.ContextThemeWrapper;
import android.view.GestureDetector;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.libraries.youtube.livecreation.controller.StreamConfig;
import com.google.android.libraries.youtube.livecreation.screencast.ScreencastHostService;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import com.google.android.youtube.R;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ScreencastHostService extends acdr implements acfr, abyd, abyg, abyf, abtw, ynl {
    public static final /* synthetic */ int s = 0;
    private static final long t = TimeUnit.SECONDS.toMillis(30);
    private aths A;
    public yni a;
    public acti b;
    public acft c;
    public abyl d;
    public abtx e;
    public abss f;
    public Executor g;
    public Executor h;
    public axnm i;
    public abzc j;
    public SharedPreferences k;
    public akvm l;
    public boolean m;
    public boolean n;
    public acfs o;
    public abyk p;
    public accp q;
    public acdq r;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private String z;

    private final void B() {
        acfs acfsVar = this.o;
        if (acfsVar == null) {
            Log.w("ScreencastHostServ", "No screencast controls UI available.");
        } else {
            acgd acgdVar = acfsVar.b;
            acgdVar.d();
            if (acgdVar.a.getParent() != null) {
                acgdVar.g.removeView(acgdVar.a);
            }
            acfsVar.c.c();
            acfsVar.c.i();
            acfsVar.e();
            acfq acfqVar = acfsVar.d;
            if (acfqVar != null) {
                acfqVar.a();
            }
            acfsVar.i = 1;
        }
        this.n = false;
        this.m = false;
        if (!this.v) {
            stopSelf();
        }
        stopForeground(true);
    }

    private final void C() {
        Intent intent = new Intent(getApplicationContext(), ScreencastHostService.class);
        intent.putExtra("EXTRA_STOP_SESSION_WITH_CONFIRM", true);
        PendingIntent service = PendingIntent.getService(this, 0, intent, zgd.M() | 134217728);
        Resources resources = getResources();
        int i = true != this.n ? R.string.screencast_notification_title_cancel_stream : R.string.screencast_notification_title_stop_stream;
        fi fiVar = new fi(this);
        yhr.g(fiVar);
        fiVar.r(2131231515);
        fiVar.x = "status";
        fiVar.k = 1;
        fiVar.k(resources.getString(i));
        fiVar.j(resources.getString(R.string.screencast_notification_text));
        fiVar.g = service;
        fiVar.o(true);
        startForeground(com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowFixedWidthMinor, fiVar.b());
    }

    public static Intent c(Context context) {
        Intent intent = new Intent(context.getApplicationContext(), ScreencastHostService.class);
        intent.putExtra("EXTRA_STOP_SESSION", true);
        return intent;
    }

    public static Intent p(Context context, afvn afvnVar, String str, boolean z, String str2, String str3, aths athsVar, long j, long j2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, Intent intent) {
        afvnVar.getClass();
        Intent intent2 = new Intent(context.getApplicationContext(), ScreencastHostService.class);
        intent2.putExtra("EXTRA_START_SESSION", true);
        intent2.putExtra("EXTRA_ORIENTATION_IS_PORTRAIT", z);
        intent2.putExtra("EXTRA_VIDEO_ID", str);
        intent2.putExtra("EXTRA_STREAM_URL", str2);
        intent2.putExtra("EXTRA_STREAM_KEY", str3);
        intent2.putExtra("EXTRA_USE_CBR_MODE", z3);
        intent2.putExtra("EXTRA_USE_RATE_BOUNCE_MODE", z4);
        intent2.putExtra("EXTRA_ALLOW_240P", z5);
        intent2.putExtra("EXTRA_ALLOW_360P", z6);
        intent2.putExtra("EXTRA_USE_WEBRTC", z7);
        intent2.putExtra("EXTRA_START_WITH_SELF_CAM", true);
        intent2.putExtra("EXTRA_START_WITH_MIC", z2);
        intent2.putExtra("EXTRA_START_WITH_CHAT", false);
        intent2.putExtra("EXTRA_SCREEN_CAPTURE_PERMISSION", intent);
        intent2.putExtra("EXTRA_TIMER_START_BASE", j);
        intent2.putExtra("EXTRA_TIMER_DURATION", j2);
        intent2.putExtra("EXTRA_SEND_BUFFER_CHUNK_COUNT", i);
        intent2.putExtra("EXTRA_STREAM_SCREEN_RENDERER", new ParcelableMessageLite(athsVar));
        return intent2;
    }

    private final Dialog q() {
        nw nwVar = new nw(getApplicationContext(), com.google.cardboard.sdk.R.style.Theme_AppCompat_Dialog);
        nwVar.c(true);
        nwVar.n(R.string.stop_screencast_session_title);
        nwVar.f(R.string.stop_screencast_session_message);
        nwVar.k(R.string.ok, new DialogInterface.OnClickListener() { // from class: acds
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                acly.e(ScreencastHostService.this.getApplicationContext());
            }
        });
        nwVar.h(R.string.cancel, null);
        nx b = nwVar.b();
        b.getWindow().setType(Build.VERSION.SDK_INT >= 26 ? 2038 : 2003);
        return b;
    }

    @Override // defpackage.abyg
    public final void A() {
    }

    @Override // defpackage.abtw
    public final void a(boolean z) {
        if (z) {
            this.f.e(new acdx(this));
        } else {
            this.f.e(new acdx(this, 3));
        }
    }

    @Override // defpackage.abyd
    public final boolean d() {
        return true;
    }

    @Override // defpackage.abyf
    public final void g(int i, String str) {
    }

    @Override // defpackage.abyf
    public final void h(int i, arag aragVar) {
    }

    @Override // defpackage.acfr
    public final void i() {
        Log.e("ScreencastHostServ", "Fatal error from UI controller");
        k();
    }

    public final void j(final boolean z) {
        this.p.n(z, new abyh() { // from class: acdt
            @Override // defpackage.abyh
            public final void a(final boolean z2) {
                final ScreencastHostService screencastHostService = ScreencastHostService.this;
                boolean z3 = z;
                screencastHostService.o(new acee(z2));
                if (z3 != z2) {
                    screencastHostService.h.execute(new Runnable() { // from class: acdz
                        @Override // java.lang.Runnable
                        public final void run() {
                            ScreencastHostService screencastHostService2 = ScreencastHostService.this;
                            boolean z4 = z2;
                            acfs acfsVar = screencastHostService2.o;
                            acfsVar.b.f(z4);
                            acfsVar.c.p(z4);
                            screencastHostService2.o.j(acfg.ERROR, screencastHostService2.getString(R.string.screencast_mic_update_error));
                        }
                    });
                }
            }
        });
    }

    public final void k() {
        if (this.w) {
            return;
        }
        acfs acfsVar = this.o;
        if (acfsVar != null) {
            acfsVar.h("");
        }
        this.f.f();
        accp accpVar = this.q;
        if (accpVar != null) {
            accpVar.i();
        }
        abyk abykVar = this.p;
        if (abykVar == null || !this.u) {
            B();
            startActivity(achc.a(getApplicationContext(), 26, null, null, null, false));
        } else {
            abykVar.r(false);
        }
        abxa b = abxa.b();
        b.k(asth.class);
        b.f(asth.class, acej.class, null);
        this.w = true;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afwd afwdVar = (afwd) obj;
                if (!this.m) {
                    return null;
                }
                k();
                this.o.i(R.string.screencast_capture_stopped_on_sign_out);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{afwd.class};
    }

    @Override // defpackage.abyf
    public final void l(abyi abyiVar, String str) {
        String.valueOf(abyiVar.name()).length();
        String.valueOf(str).length();
    }

    @Override // defpackage.abyf
    public final void m(String str) {
    }

    @Override // defpackage.abyf
    public final void n(String str, String str2, avjf avjfVar) {
        if (acfs.m(this.o)) {
            if (!TextUtils.isEmpty(str)) {
                acfs acfsVar = this.o;
                if (acfs.n(acfsVar.i)) {
                    acfsVar.c.d.e(str);
                }
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            acfs acfsVar2 = this.o;
            if (!acfs.n(acfsVar2.i)) {
                return;
            }
            acfsVar2.c.d.d(str2);
        }
    }

    public final void o(final zdt zdtVar) {
        this.g.execute(new Runnable() { // from class: acdy
            @Override // java.lang.Runnable
            public final void run() {
                ScreencastHostService screencastHostService = ScreencastHostService.this;
                zdt zdtVar2 = zdtVar;
                StreamConfig a = StreamConfig.a(screencastHostService.k.getString("SHARED_PREF_STREAM_CONFIG_KEY", null));
                if (a == null) {
                    Log.e("ScreencastHostServ", "Failed to load live stream state from shared preferences");
                    return;
                }
                zdtVar2.a(a);
                String b = a.b();
                if (TextUtils.isEmpty(b)) {
                    Log.e("ScreencastHostServ", "Failed to save the live stream state to shared preference.");
                    return;
                }
                SharedPreferences.Editor edit = screencastHostService.k.edit();
                edit.putString("SHARED_PREF_STREAM_CONFIG_KEY", b);
                edit.apply();
            }
        });
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        if (this.y) {
            this.a.m(this);
            this.y = false;
        }
        this.v = true;
        super.onDestroy();
        k();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        Size size;
        Point point;
        float min;
        if (!acly.d()) {
            stopSelf();
            return 2;
        }
        if (!this.y) {
            this.a.g(this);
            this.y = true;
        }
        if (intent == null) {
            B();
            return 2;
        } else if (intent.getBooleanExtra("EXTRA_STOP_SESSION", false)) {
            k();
            return 2;
        } else if (intent.getBooleanExtra("EXTRA_STOP_SESSION_WITH_CONFIRM", false)) {
            q().show();
            return 2;
        } else if (!intent.getBooleanExtra("EXTRA_START_SESSION", false)) {
            return 2;
        } else {
            boolean booleanExtra = intent.getBooleanExtra("EXTRA_ORIENTATION_IS_PORTRAIT", true);
            boolean booleanExtra2 = intent.getBooleanExtra("EXTRA_DID_START_BROADCAST", false);
            long longExtra = intent.getLongExtra("EXTRA_TIMER_START_BASE", 0L);
            long longExtra2 = intent.getLongExtra("EXTRA_TIMER_DURATION", 0L);
            int intExtra = intent.getIntExtra("EXTRA_SEND_BUFFER_CHUNK_COUNT", 0);
            this.z = intent.getStringExtra("EXTRA_VIDEO_ID");
            ParcelableMessageLite parcelableMessageLite = (ParcelableMessageLite) intent.getParcelableExtra("EXTRA_STREAM_SCREEN_RENDERER");
            if (parcelableMessageLite != null) {
                this.A = (aths) parcelableMessageLite.a(aths.a);
            }
            String stringExtra = intent.getStringExtra("EXTRA_STREAM_URL");
            String stringExtra2 = intent.getStringExtra("EXTRA_STREAM_KEY");
            boolean booleanExtra3 = intent.getBooleanExtra("EXTRA_START_WITH_SELF_CAM", true);
            boolean booleanExtra4 = intent.getBooleanExtra("EXTRA_START_WITH_MIC", true);
            boolean booleanExtra5 = intent.getBooleanExtra("EXTRA_START_WITH_CHAT", false);
            boolean booleanExtra6 = intent.getBooleanExtra("EXTRA_USE_CBR_MODE", false);
            boolean booleanExtra7 = intent.getBooleanExtra("EXTRA_USE_RATE_BOUNCE_MODE", false);
            boolean booleanExtra8 = intent.getBooleanExtra("EXTRA_ALLOW_240P", false);
            boolean booleanExtra9 = intent.getBooleanExtra("EXTRA_ALLOW_360P", false);
            boolean booleanExtra10 = intent.getBooleanExtra("EXTRA_USE_WEBRTC", false);
            final Intent intent2 = (Intent) intent.getParcelableExtra("EXTRA_SCREEN_CAPTURE_PERMISSION");
            String str = this.z;
            if (this.m) {
                q().show();
                return 2;
            }
            C();
            boolean z = this.j.c().G;
            WindowManager windowManager = (WindowManager) getSystemService("window");
            int i3 = 720;
            int i4 = 1280;
            if (windowManager == null || !z) {
                if (true == booleanExtra) {
                    i4 = 608;
                }
                if (true == booleanExtra) {
                    i3 = 1080;
                }
                size = new Size(i4, i3);
            } else {
                windowManager.getDefaultDisplay().getRealSize(new Point());
                if (Math.min(point.x, point.y) / Math.max(point.x, point.y) == 0.5625f) {
                    if (true == booleanExtra) {
                        i4 = 608;
                    }
                    if (true == booleanExtra) {
                        i3 = 1080;
                    }
                    size = new Size(i4, i3);
                } else {
                    int sqrt = (int) Math.sqrt(min * 921600.0f);
                    int sqrt2 = (int) Math.sqrt(921600.0f / min);
                    if (sqrt % 2 != 0) {
                        sqrt++;
                    }
                    if (sqrt2 % 2 != 0) {
                        sqrt2++;
                    }
                    int i5 = true != booleanExtra ? sqrt2 : sqrt;
                    if (true == booleanExtra) {
                        sqrt = sqrt2;
                    }
                    size = new Size(i5, sqrt);
                    size.getWidth();
                    size.getHeight();
                }
            }
            final int width = size.getWidth();
            final int height = size.getHeight();
            abyk a = this.d.a(null, str, booleanExtra, booleanExtra2, false, Integer.valueOf(width), Integer.valueOf(height), stringExtra, stringExtra2, longExtra, longExtra2, booleanExtra4, booleanExtra6, booleanExtra7, booleanExtra8, booleanExtra9, booleanExtra10, intExtra);
            this.p = a;
            a.y = new acdu(this);
            this.m = true;
            acft acftVar = this.c;
            Context context = (Context) acftVar.a.get();
            context.getClass();
            wal walVar = (wal) acftVar.b.get();
            walVar.getClass();
            ((ScheduledExecutorService) acftVar.c.get()).getClass();
            acti actiVar = (acti) acftVar.d.get();
            actiVar.getClass();
            axnm axnmVar = ((axoz) acftVar.e).get();
            axnmVar.getClass();
            ajxz ajxzVar = (ajxz) acftVar.f.get();
            ajxzVar.getClass();
            ajmy ajmyVar = (ajmy) acftVar.g.get();
            ajmyVar.getClass();
            SharedPreferences sharedPreferences = (SharedPreferences) acftVar.h.get();
            sharedPreferences.getClass();
            acfs acfsVar = new acfs(context, walVar, actiVar, axnmVar, ajxzVar, ajmyVar, sharedPreferences, this);
            this.o = acfsVar;
            aths athsVar = this.A;
            acfsVar.h = booleanExtra5;
            acfsVar.l(athsVar);
            acgd acgdVar = acfsVar.b;
            acgdVar.p = acfsVar;
            if (acgdVar.u != 1) {
                acgdVar.d();
            }
            acgdVar.g(false);
            acgdVar.f(booleanExtra4);
            acgdVar.q = acgd.l(acgdVar.f);
            if (!TextUtils.isEmpty(acgdVar.q)) {
                acgdVar.t = new aces(acgdVar.f, acgdVar.q, acgdVar.h, acgdVar.b);
                if (!acgdVar.t.k(acgdVar.v)) {
                    acgdVar.t = null;
                }
            }
            boolean z2 = acgdVar.k() && booleanExtra3;
            acgdVar.o = z2;
            if (z2) {
                acgdVar.b.setVisibility(0);
                acgdVar.c.setVisibility(8);
                acgdVar.t.h();
            } else {
                acgdVar.b.setVisibility(8);
                acgdVar.c.setVisibility(0);
            }
            acgdVar.s = new acgc(acgdVar);
            acgdVar.a.setOnTouchListener(new acfy(acgdVar, new GestureDetector(acgdVar.f, acgdVar.s)));
            acgdVar.r = 0;
            acgdVar.u = 2;
            final acfh acfhVar = acfsVar.c;
            acgd acgdVar2 = acfsVar.b;
            aqxo.y(acgdVar2.u != 1);
            boolean k = acgdVar2.k();
            acfhVar.m.setOnClickListener(new acew(acfhVar, 5));
            acfhVar.m.getChildAt(0).setOnClickListener(new acew(acfhVar, 6));
            nw nwVar = new nw(acfhVar.f, com.google.cardboard.sdk.R.style.Theme_AppCompat_Dialog);
            nwVar.f(R.string.lc_confirm_stop_streaming);
            nwVar.i(acfhVar.f.getString(R.string.cancel), null);
            nwVar.l(acfhVar.f.getString(R.string.ok), new DialogInterface.OnClickListener() { // from class: acev
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i6) {
                    acfh acfhVar2 = acfh.this;
                    acfhVar2.E = false;
                    acet acetVar = acfhVar2.z;
                    if (acetVar != null) {
                        ((acfs) acetVar).d();
                    }
                    acfhVar2.l.setEnabled(false);
                }
            });
            nwVar.c(false);
            acfhVar.N = nwVar.b();
            acfhVar.N.getWindow().setType(Build.VERSION.SDK_INT >= 26 ? 2038 : 2003);
            acfhVar.e.setOnClickListener(new acew(acfhVar, 7));
            acfhVar.e.setVisibility(0);
            acfhVar.g(actj.SCREENCAST_CONTROLLER_START_STREAM_BUTTON);
            acfhVar.g(actj.SCREENCAST_CONTROLLER_STOP_STREAM_BUTTON);
            acfhVar.g(actj.SCREENCAST_CONTROLLER_ENABLE_CAMERA_BUTTON);
            acfhVar.g(actj.SCREENCAST_CONTROLLER_DISABLE_CAMERA_BUTTON);
            actj actjVar = actj.SCREENCAST_CONTROLLER_DISABLE_CAMERA_BUTTON;
            acfhVar.d.c(null);
            if (!k) {
                acfhVar.l(false);
                acfhVar.j.setEnabled(false);
                acfhVar.j.setImageTintList(ake.f(acfhVar.f, R.color.screencast_control_button_disabled_color));
                acfhVar.j.setContentDescription(acfhVar.i);
            } else if (booleanExtra3) {
                acfhVar.l(true);
                actjVar = actj.SCREENCAST_CONTROLLER_ENABLE_CAMERA_BUTTON;
            } else {
                acfhVar.l(false);
            }
            acfhVar.o.H(3, new acte(actjVar), null);
            acfhVar.j.setOnClickListener(new acew(acfhVar, 8));
            acfhVar.h.setOnClickListener(new acew(acfhVar, 9));
            acfhVar.p(booleanExtra4);
            acfhVar.g(actj.SCREENCAST_CONTROLLER_ENABLE_MIC_BUTTON);
            acfhVar.g(actj.SCREENCAST_CONTROLLER_DISABLE_MIC_BUTTON);
            acfhVar.o.H(3, new acte(booleanExtra4 ? actj.SCREENCAST_CONTROLLER_ENABLE_MIC_BUTTON : actj.SCREENCAST_CONTROLLER_DISABLE_MIC_BUTTON), null);
            acfhVar.H = booleanExtra5;
            acfhVar.n(booleanExtra5);
            acfhVar.k.setVisibility(0);
            acfhVar.k.setOnClickListener(new acew(acfhVar, 10));
            acfhVar.q(false);
            acfhVar.l.setOnClickListener(new acew(acfhVar, 2));
            acfhVar.l.setEnabled(true);
            acfhVar.d();
            acfhVar.g(actj.SCREENCAST_CONTROLLER_PAUSE_STREAM_BUTTON);
            acfhVar.g(actj.SCREENCAST_CONTROLLER_RESUME_STREAM_BUTTON);
            acfhVar.s.setVisibility(0);
            acfhVar.s.setOnSeekBarChangeListener(new acey(acfhVar));
            SeekBar seekBar = acfhVar.s;
            seekBar.setProgress(seekBar.getMax());
            acfhVar.k();
            acfhVar.n.setOnClickListener(new acew(acfhVar, 3));
            acfhVar.r.setOnClickListener(new acew(acfhVar, 4));
            acfhVar.b.setVisibility(8);
            acfhVar.a();
            acfh acfhVar2 = acfsVar.c;
            acfhVar2.z = acfsVar;
            acfhVar2.A = acfsVar;
            acfhVar2.B = acfsVar;
            acfhVar2.C = acfsVar;
            acgd acgdVar3 = acfsVar.b;
            WindowManager.LayoutParams b = achc.b();
            b.flags |= 256;
            b.x = 0;
            b.y = 0;
            acgdVar3.r = b.gravity;
            acgdVar3.g.addView(acgdVar3.a, b);
            acgdVar3.h(acgdVar3.h);
            acgdVar3.b();
            acfsVar.i = 2;
            if (acfs.n(2) && acfsVar.i != 3) {
                acfsVar.e();
                acfsVar.b.b();
                if (!acfsVar.j.a.getBoolean("PREFS_SELF_VIEW_WINDOW_TOOLTIP_SEEN", false)) {
                    final acgd acgdVar4 = acfsVar.b;
                    String string = acfsVar.a.getString(R.string.tap_to_toggle_toolbar_tooltip);
                    if (acgdVar4.m == null) {
                        acgdVar4.m = new FrameLayout(acgdVar4.f);
                    }
                    if (acgdVar4.n == null) {
                        acgdVar4.n = new View(acgdVar4.f);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(1, 1);
                        layoutParams.gravity = 81;
                        acgdVar4.n.setLayoutParams(layoutParams);
                        acgdVar4.m.addView(acgdVar4.n);
                    }
                    if (acgdVar4.m.getParent() == null) {
                        WindowManager.LayoutParams b2 = achc.b();
                        b2.flags |= 256;
                        b2.x = 0;
                        b2.y = 0;
                        acgdVar4.g.addView(acgdVar4.m, b2);
                    }
                    acgdVar4.m();
                    ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(acgdVar4.f, 2132084076);
                    YouTubeTextView youTubeTextView = new YouTubeTextView(contextThemeWrapper);
                    youTubeTextView.setText(string);
                    youTubeTextView.setTextColor(zhn.d(contextThemeWrapper, R.attr.liveChatTooltipTextColor));
                    youTubeTextView.setTextAppearance(contextThemeWrapper, R.attr.ytTextAppearanceBody1a);
                    akgc akgcVar = new akgc(youTubeTextView, acgdVar4.n, 1, 2);
                    akgcVar.f(new akfz() { // from class: acfu
                        @Override // defpackage.akfz
                        public final void a(int i6) {
                            acgd acgdVar5 = acgd.this;
                            acgdVar5.g.removeView(acgdVar5.m);
                        }
                    });
                    acgdVar4.n.getViewTreeObserver().addOnGlobalLayoutListener(new acfw(acgdVar4, akgcVar));
                    acgdVar4.n.requestLayout();
                }
                acfsVar.c.i();
                acfsVar.c.r();
                acfsVar.f();
                acfsVar.i = 3;
            }
            this.f.b(this.e.a());
            this.f.d(new absp() { // from class: acef
                @Override // defpackage.absp
                public final void a() {
                    accp accpVar;
                    final ScreencastHostService screencastHostService = ScreencastHostService.this;
                    int i6 = width;
                    int i7 = height;
                    Intent intent3 = intent2;
                    Context applicationContext = screencastHostService.getApplicationContext();
                    abry a2 = screencastHostService.f.a();
                    int i8 = accp.g;
                    if (i6 <= 0 || i7 <= 0) {
                        Log.e("VirtualDisplaySource", "Invalid size for virtual display");
                    } else {
                        try {
                            accpVar = new accp((DisplayManager) applicationContext.getSystemService("display"), (MediaProjectionManager) applicationContext.getSystemService("media_projection"), intent3, a2, i6, i7);
                        } catch (Exception e) {
                            Log.e("VirtualDisplaySource", "Could not create virtual display video source", e);
                        }
                        screencastHostService.q = accpVar;
                        accp accpVar2 = screencastHostService.q;
                        accpVar2.getClass();
                        accpVar2.f();
                        abyk abykVar = screencastHostService.p;
                        accp accpVar3 = screencastHostService.q;
                        abykVar.x = accpVar3;
                        accpVar3.c(new accf() { // from class: acdv
                            @Override // defpackage.accf
                            public final void f(accg accgVar) {
                                ScreencastHostService.this.f.g();
                            }
                        }, null);
                        screencastHostService.f.i(screencastHostService.q);
                        screencastHostService.f.j();
                    }
                    accpVar = null;
                    screencastHostService.q = accpVar;
                    accp accpVar22 = screencastHostService.q;
                    accpVar22.getClass();
                    accpVar22.f();
                    abyk abykVar2 = screencastHostService.p;
                    accp accpVar32 = screencastHostService.q;
                    abykVar2.x = accpVar32;
                    accpVar32.c(new accf() { // from class: acdv
                        @Override // defpackage.accf
                        public final void f(accg accgVar) {
                            ScreencastHostService.this.f.g();
                        }
                    }, null);
                    screencastHostService.f.i(screencastHostService.q);
                    screencastHostService.f.j();
                }
            }, true);
            this.b.d(acuo.a(13768), null, null);
            this.r = new acdq(new aceh(this), new acei(this), this.j.c().K, this.j.a(), new acdw(this));
            acej acejVar = new acej(this, booleanExtra);
            abxa b3 = abxa.b();
            b3.f(asth.class, acej.class, acejVar);
            b3.j(asth.class, t);
            return 2;
        }
    }

    @Override // defpackage.abyg
    public final void r(int i) {
    }

    @Override // defpackage.abyg
    public final void s(int i, final String str, final String str2, final aths athsVar) {
        this.A = athsVar;
        o(new zdt() { // from class: aced
            @Override // defpackage.zdt
            public final void a(Object obj) {
                String str3 = str;
                String str4 = str2;
                aths athsVar2 = athsVar;
                StreamConfig streamConfig = (StreamConfig) obj;
                int i2 = ScreencastHostService.s;
                streamConfig.u = str3;
                streamConfig.v = str4;
                streamConfig.j = athsVar2;
            }
        });
        if (acfs.m(this.o)) {
            this.o.l(athsVar);
        }
    }

    @Override // defpackage.abyg
    public final void t() {
        o(zbx.g);
    }

    @Override // defpackage.abyg
    public final void u(int i, athj athjVar, String str, arag aragVar, boolean z) {
        if (!this.x) {
            this.o.d();
            B();
            startActivity(achc.a(getApplicationContext(), i, athjVar, str, aragVar, z));
            acdq acdqVar = this.r;
            acdqVar.a();
            if (!acdqVar.d) {
                acdqVar.h.a("SUCCESS");
            }
            this.x = true;
        }
    }

    @Override // defpackage.abyg
    public final void v() {
        this.r.c = true;
    }

    @Override // defpackage.abyg
    public final void w() {
        if (acfs.m(this.o)) {
            acfs acfsVar = this.o;
            if (acfsVar.i != 5) {
                return;
            }
            acfsVar.c.l.setEnabled(true);
        }
    }

    @Override // defpackage.abyg
    public final void x(final long j) {
        this.n = true;
        o(new zdt() { // from class: acec
            @Override // defpackage.zdt
            public final void a(Object obj) {
                int i = ScreencastHostService.s;
                ((StreamConfig) obj).l = j;
            }
        });
        if (acfs.m(this.o)) {
            this.o.c();
        }
        C();
        this.r.c();
    }

    @Override // defpackage.abyg
    public final void y(boolean z) {
        this.u = true;
    }

    @Override // defpackage.abyg
    public final void z(final abxk abxkVar) {
        this.o.e();
        acfs acfsVar = this.o;
        String string = getResources().getString(R.string.screencast_capture_communication_error);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: aceb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ScreencastHostService screencastHostService = ScreencastHostService.this;
                abxk abxkVar2 = abxkVar;
                screencastHostService.o.h(screencastHostService.getResources().getString(R.string.lc_reconnecting));
                abxkVar2.a(true);
            }
        };
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: acea
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                abxk abxkVar2 = abxk.this;
                int i = ScreencastHostService.s;
                abxkVar2.a(false);
            }
        };
        if (!acfs.n(acfsVar.i)) {
            return;
        }
        acfsVar.e();
        acfsVar.b();
        acfsVar.e.a(1);
        acfsVar.e.a.setText(string);
        acfsVar.e.c(onClickListener);
        acfsVar.e.b(onClickListener2);
        acfsVar.e.setVisibility(0);
        acfsVar.i = 6;
    }
}
