package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.media.SoundPool;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera.CountdownNumeralView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack;
import com.google.android.libraries.youtube.edit.camera.MultiSegmentCameraProgressIndicator;
import com.google.android.libraries.youtube.edit.ui.DurationMsSeekBar;
import com.google.android.libraries.youtube.edit.ui.SegmentedControl;
import com.google.android.libraries.youtube.edit.ui.SegmentedControlSegment;
import com.google.android.youtube.R;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: gyg  reason: default package */
/* loaded from: classes3.dex */
public final class gyg extends zxr implements View.OnClickListener, zxp, zyh {
    public final dt a;
    public final gyq b;
    public final hew c;
    public final boolean d;
    public final hkl e;
    final View f;
    final View g;
    final CountdownNumeralView h;
    final SegmentedControl i;
    final Button j;
    int k;
    int l;
    SoundPool m;
    CountDownTimer n;
    DurationMsSeekBar o;
    public String p;
    public long q;
    public final gxa r;
    private final Context s;
    private final View t;
    private final View u;
    private final hho v;
    private final Handler w;
    private boolean x;

    public gyg(Context context, dt dtVar, View view, View view2, gyq gyqVar, gxa gxaVar, hho hhoVar, hew hewVar, hfn hfnVar, hkl hklVar, boolean z) {
        super(context, dtVar.getSupportFragmentManager(), gyqVar.a, true, true);
        this.s = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.recording_timer_layout, (ViewGroup) null);
        this.t = inflate;
        this.i = (SegmentedControl) inflate.findViewById(R.id.countdown_duration_control);
        Resources resources = context.getResources();
        int i = 3;
        char c = 0;
        int i2 = 1;
        int[] iArr = {resources.getInteger(R.integer.shorts_timer_duration_short_sec), resources.getInteger(R.integer.shorts_timer_duration_medium_sec), resources.getInteger(R.integer.shorts_timer_duration_long_sec)};
        ArrayList arrayList = new ArrayList(3);
        int i3 = 0;
        while (i3 < i) {
            int i4 = iArr[i3];
            gye gyeVar = new gye();
            Object[] objArr = new Object[i2];
            Integer valueOf = Integer.valueOf(i4);
            objArr[c] = valueOf;
            String string = resources.getString(R.string.duration_seconds_ultra_short, objArr);
            if (string != null) {
                gyeVar.b = string;
                int i5 = i3;
                gyeVar.a = Integer.valueOf((int) TimeUnit.SECONDS.toMillis(i4));
                String quantityString = resources.getQuantityString(R.plurals.shorts_a11y_timer_duration_seconds, i4, valueOf);
                if (quantityString != null) {
                    gyeVar.c = quantityString;
                    Integer num = gyeVar.a;
                    if (num != null && gyeVar.b != null && gyeVar.c != null) {
                        arrayList.add(new gyf(num.intValue(), gyeVar.b, gyeVar.c));
                        i3 = i5 + 1;
                        i = 3;
                        c = 0;
                        i2 = 1;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        if (gyeVar.a == null) {
                            sb.append(" countdownDurationMs");
                        }
                        if (gyeVar.b == null) {
                            sb.append(" text");
                        }
                        if (gyeVar.c == null) {
                            sb.append(" contentDescription");
                        }
                        String valueOf2 = String.valueOf(sb);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
                        sb2.append("Missing required properties:");
                        sb2.append(valueOf2);
                        throw new IllegalStateException(sb2.toString());
                    }
                } else {
                    throw new NullPointerException("Null contentDescription");
                }
            } else {
                throw new NullPointerException("Null text");
            }
        }
        this.i.h = arrayList;
        int i6 = 0;
        while (i6 < arrayList.size()) {
            gyf i7 = i(i6);
            SegmentedControlSegment segmentedControlSegment = (SegmentedControlSegment) LayoutInflater.from(context).inflate(R.layout.recording_timer_duration_segment, (ViewGroup) null);
            segmentedControlSegment.setText(i7.b);
            segmentedControlSegment.setTextOn(i7.b);
            segmentedControlSegment.setTextOff(i7.b);
            segmentedControlSegment.setContentDescription(i7.c);
            segmentedControlSegment.setChecked(i6 == 0);
            this.i.addView(segmentedControlSegment);
            i6++;
        }
        this.i.g = this;
        this.a = dtVar;
        hhoVar.getClass();
        this.v = hhoVar;
        DurationMsSeekBar durationMsSeekBar = (DurationMsSeekBar) this.t.findViewById(R.id.recording_duration_seek_bar);
        this.o = durationMsSeekBar;
        durationMsSeekBar.a = hhoVar.b();
        this.o.setMax(hhoVar.c);
        this.o.e = this;
        view.getClass();
        this.u = view;
        view.setOnClickListener(this);
        view2.getClass();
        this.f = view2;
        View findViewById = view2.findViewById(R.id.shorts_cancel_countdown_button);
        this.g = findViewById;
        findViewById.setOnClickListener(this);
        this.h = (CountdownNumeralView) view2.findViewById(R.id.shorts_countdown_numeral_view);
        Button button = (Button) this.t.findViewById(R.id.start_button);
        this.j = button;
        button.setOnClickListener(this);
        gyqVar.getClass();
        this.b = gyqVar;
        gxaVar.getClass();
        this.r = gxaVar;
        hewVar.getClass();
        this.c = hewVar;
        this.w = new Handler(Looper.getMainLooper());
        this.e = hklVar;
        this.d = z;
        SoundPool soundPool = new SoundPool(5, 3, 0);
        this.m = soundPool;
        this.k = soundPool.load(context, R.raw.countdown_tick_increment, 0);
        this.l = this.m.load(context, R.raw.countdown_tick_final, 0);
        hfnVar.getClass();
        auuw auuwVar = hklVar.a.a().z;
        if ((auuwVar == null ? auuw.a : auuwVar).k) {
            hfnVar.b().as(new ayqb() { // from class: gya
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    final gyg gygVar = gyg.this;
                    ampq ampqVar = (ampq) obj;
                    if (ampqVar.h()) {
                        final ShortsCreationSelectedTrack shortsCreationSelectedTrack = (ShortsCreationSelectedTrack) ampqVar.c();
                        gygVar.a.runOnUiThread(new Runnable() { // from class: gyc
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r1v0, types: [gyc] */
                            /* JADX WARN: Type inference failed for: r1v5 */
                            @Override // java.lang.Runnable
                            public final void run() {
                                gyg gygVar2;
                                gyg gygVar3;
                                ByteArrayInputStream byteArrayInputStream;
                                ByteArrayInputStream byteArrayInputStream2;
                                long j = this;
                                gyg gygVar4 = gyg.this;
                                ShortsCreationSelectedTrack shortsCreationSelectedTrack2 = shortsCreationSelectedTrack;
                                if (!shortsCreationSelectedTrack2.k().equals(gygVar4.p)) {
                                    gygVar4.o.i(1);
                                    gygVar4.o.j(shortsCreationSelectedTrack2.a());
                                    gygVar4.p = shortsCreationSelectedTrack2.k();
                                    gygVar4.q = 0L;
                                }
                                if (shortsCreationSelectedTrack2.d().h()) {
                                    long longValue = ((Long) shortsCreationSelectedTrack2.d().c()).longValue();
                                    if (gygVar4.q != longValue) {
                                        gygVar4.q = longValue;
                                        long min = Math.min(gygVar4.e.a(), longValue);
                                        if (longValue <= gygVar4.e.a()) {
                                            gygVar4.o.i(0);
                                        } else {
                                            if (!gygVar4.e.k() || !shortsCreationSelectedTrack2.e().h()) {
                                                gygVar2 = gygVar4;
                                                gygVar2.o.h(min, longValue);
                                                gygVar2.b.a(actj.SHORTS_CREATION_TIMER_COUNTDOWN_PLACEHOLDER_WAVEFORM).e();
                                            } else {
                                                DurationMsSeekBar durationMsSeekBar2 = gygVar4.o;
                                                try {
                                                    try {
                                                        byteArrayInputStream = new ByteArrayInputStream((byte[]) shortsCreationSelectedTrack2.e().c());
                                                    } catch (IOException e) {
                                                        e = e;
                                                        gygVar3 = gygVar4;
                                                        j = min;
                                                        zep.d("Error reading the raw waveform bytes. ", e);
                                                        durationMsSeekBar2.h(j, longValue);
                                                        gygVar2 = gygVar3;
                                                        gygVar2.b.a(actj.SHORTS_CREATION_TIMER_COUNTDOWN_REAL_WAVEFORM).e();
                                                        gygVar2.o.j(shortsCreationSelectedTrack2.a());
                                                    }
                                                } catch (IOException e2) {
                                                    e = e2;
                                                    zep.d("Error reading the raw waveform bytes. ", e);
                                                    durationMsSeekBar2.h(j, longValue);
                                                    gygVar2 = gygVar3;
                                                    gygVar2.b.a(actj.SHORTS_CREATION_TIMER_COUNTDOWN_REAL_WAVEFORM).e();
                                                    gygVar2.o.j(shortsCreationSelectedTrack2.a());
                                                }
                                                try {
                                                    amny a = amny.a(byteArrayInputStream);
                                                    int i8 = a.b;
                                                    byteArrayInputStream2 = byteArrayInputStream;
                                                    gygVar3 = gygVar4;
                                                    try {
                                                        durationMsSeekBar2.f.e(longValue, min, durationMsSeekBar2.g, a.a, i8, amuk.q());
                                                        durationMsSeekBar2.h = 0.0f;
                                                        byteArrayInputStream2.close();
                                                        gygVar2 = gygVar3;
                                                        gygVar2.b.a(actj.SHORTS_CREATION_TIMER_COUNTDOWN_REAL_WAVEFORM).e();
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        try {
                                                            byteArrayInputStream2.close();
                                                        } catch (Throwable unused) {
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    byteArrayInputStream2 = byteArrayInputStream;
                                                }
                                            }
                                            gygVar2.o.j(shortsCreationSelectedTrack2.a());
                                        }
                                    }
                                    gygVar2 = gygVar4;
                                    gygVar2.o.j(shortsCreationSelectedTrack2.a());
                                }
                            }
                        });
                        return;
                    }
                    gygVar.p = null;
                    gygVar.a.runOnUiThread(new gyb(gygVar, 1));
                }
            });
        }
    }

    @Override // defpackage.zxr
    protected final View a() {
        return this.t;
    }

    @Override // defpackage.zxr
    protected final CharSequence b() {
        return this.s.getString(R.string.camera_timer_button_label);
    }

    @Override // defpackage.zyh
    public final void d(int i) {
        this.b.a(actj.SHORTS_CREATION_TIMER_COUNTDOWN_DURATION_CONTROL).b();
    }

    @Override // defpackage.zxr, defpackage.zxy
    public final void f() {
        if (this.d) {
            hew hewVar = this.c;
            if (hewVar.e) {
                hewVar.c(hewVar.a());
                this.c.f(false);
            }
        }
        this.b.a(actj.SHORTS_CREATION_TIMER_COUNTDOWN_DURATION_CONTROL).d();
        this.b.a(actj.SHORTS_CREATION_TIMER_RECORDING_DURATION_SLIDER).d();
        this.b.a(actj.SHORTS_CREATION_TIMER_START_BUTTON).d();
        this.i.d(0, false, true);
        gxa gxaVar = this.r;
        MultiSegmentCameraProgressIndicator multiSegmentCameraProgressIndicator = gxaVar.a.aC;
        if (multiSegmentCameraProgressIndicator == null) {
            zep.b("Unexpected null recordingProgressIndicator in call to onRecordingTimerDialogDismissed");
        } else {
            multiSegmentCameraProgressIndicator.f(false);
            gxaVar.a.aO.setVisibility(0);
            gxk gxkVar = gxaVar.a;
            if (gxkVar.aG.n == null) {
                gxkVar.aN();
                gxaVar.a.aC.c();
            }
            gxaVar.a.aS.setVisibility(4);
        }
        super.f();
    }

    @Override // defpackage.zxr, defpackage.zxy
    public final void g() {
        super.g();
        gyo a = this.b.a(actj.SHORTS_CREATION_TIMER_COUNTDOWN_DURATION_CONTROL);
        a.h(true);
        a.a();
        gyo a2 = this.b.a(actj.SHORTS_CREATION_TIMER_RECORDING_DURATION_SLIDER);
        a2.h(true);
        a2.a();
        gyo a3 = this.b.a(actj.SHORTS_CREATION_TIMER_START_BUTTON);
        a3.h(true);
        a3.a();
        this.o.c = this.v.a();
        this.o.a = this.v.b();
        DurationMsSeekBar durationMsSeekBar = this.o;
        int i = this.v.d;
        durationMsSeekBar.b = i;
        durationMsSeekBar.setProgress(i + durationMsSeekBar.c);
        durationMsSeekBar.postInvalidate();
        this.r.a(this.o.a());
    }

    @Override // defpackage.zxr
    protected final boolean h() {
        return false;
    }

    final gyf i(int i) {
        return (gyf) this.i.h.get(i);
    }

    public final void j(boolean z) {
        CountDownTimer countDownTimer = this.n;
        if (countDownTimer == null) {
            return;
        }
        countDownTimer.cancel();
        this.n = null;
        this.h.a();
        this.f.setVisibility(4);
        this.b.a(actj.SHORTS_CREATION_CANCEL_COUNTDOWN_BUTTON).d();
        gxk gxkVar = this.r.a;
        gxkVar.aT();
        gxkVar.aB.setVisibility(0);
        if (!z) {
            return;
        }
        G();
    }

    @Override // defpackage.zxr, defpackage.zxy
    public final void k() {
        if (this.d) {
            this.c.b();
        }
        this.w.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.zxr, defpackage.zxy
    public final void l() {
        gxa gxaVar = this.r;
        gxk gxkVar = gxaVar.a;
        boolean z = false;
        if (gxkVar.aC == null) {
            zep.b("Unexpected null recordingProgressIndicator in call to onRecordingTimerDialogShown");
        } else {
            gxkVar.aG();
            gxaVar.a.aC.f(true);
            gxaVar.a.aS.setVisibility(0);
        }
        this.r.a(this.o.a());
        if (this.d) {
            this.c.i();
        }
        try {
            if (Settings.System.getFloat(this.s.getContentResolver(), "animator_duration_scale") != 0.0f) {
                z = true;
            }
            this.x = z;
        } catch (Settings.SettingNotFoundException unused) {
            this.x = true;
        }
        m();
    }

    @Override // defpackage.zyh
    public final void lM() {
    }

    @Override // defpackage.zxr
    protected final actj lR() {
        return actj.SHORTS_CREATION_TIMER_BOTTOM_SHEET;
    }

    public final void m() {
        long j = this.d ? this.c.j() - this.c.a() : 0L;
        if (j > this.o.a() && this.d) {
            hew hewVar = this.c;
            hewVar.c(hewVar.a());
        }
        if (this.x) {
            DurationMsSeekBar durationMsSeekBar = this.o;
            durationMsSeekBar.d = (int) Math.min(Math.max(0L, j), durationMsSeekBar.getMax());
            durationMsSeekBar.i = (((float) j) / durationMsSeekBar.f.e) + durationMsSeekBar.h;
            durationMsSeekBar.postInvalidate();
        }
        this.w.postDelayed(new gyb(this), 60L);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.u) {
            if (this.d) {
                this.c.e(1.0f);
                this.c.f(true);
                hew hewVar = this.c;
                hewVar.c(hewVar.a());
            }
            this.b.a(actj.SHORTS_CREATION_RECORDING_TIMER_BUTTON).b();
            if (I()) {
                return;
            }
            G();
        } else if (view != this.j) {
            if (view != this.g) {
                return;
            }
            this.b.a(actj.SHORTS_CREATION_CANCEL_COUNTDOWN_BUTTON).b();
            if (zdg.e(this.s)) {
                Context context = this.s;
                zdg.c(context, this.g, context.getString(R.string.shorts_a11y_timer_canceled));
            }
            j(true);
        } else {
            int i = i(this.i.d).a;
            long j = i;
            this.n = new gyd(this, j, TimeUnit.SECONDS.toMillis(1L), this.o.a(), i);
            CountdownNumeralView countdownNumeralView = this.h;
            int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(j);
            countdownNumeralView.a = seconds;
            countdownNumeralView.setCurrentText("");
            countdownNumeralView.setVisibility(0);
            countdownNumeralView.b = true;
            if (zdg.e(countdownNumeralView.getContext())) {
                zdg.c(countdownNumeralView.getContext(), countdownNumeralView, countdownNumeralView.getContext().getResources().getQuantityString(R.plurals.shorts_a11y_timer_started, seconds, Integer.valueOf(seconds)));
            }
            this.b.a(actj.SHORTS_CREATION_TIMER_START_BUTTON).b();
            gxk gxkVar = this.r.a;
            gxkVar.aH();
            gxkVar.aB.setVisibility(4);
            z();
            this.f.setVisibility(0);
            gyo a = this.b.a(actj.SHORTS_CREATION_CANCEL_COUNTDOWN_BUTTON);
            a.h(true);
            a.a();
            this.n.start();
        }
    }
}
