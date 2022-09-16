package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack;
import com.google.android.youtube.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: hgo  reason: default package */
/* loaded from: classes3.dex */
public final class hgo extends zxr implements View.OnClickListener, SeekBar.OnSeekBarChangeListener {
    public final SeekBar a;
    public final aypg b;
    public final hgn c;
    public final dt d;
    public boolean e;
    private final View f;
    private final View g;
    private final actj h;

    public hgo(final View view, hgn hgnVar, final actj actjVar, Context context, dt dtVar, acti actiVar, hfn hfnVar, Executor executor, hkl hklVar) {
        super(context, dtVar.getSupportFragmentManager(), actiVar, true, true);
        this.c = hgnVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.music_balancer_layout, (ViewGroup) null);
        this.f = inflate;
        this.e = false;
        this.g = view;
        view.setOnClickListener(this);
        this.h = actjVar;
        SeekBar seekBar = (SeekBar) inflate.findViewById(R.id.music_balancer_bar);
        this.a = seekBar;
        this.d = dtVar;
        if (Build.VERSION.SDK_INT >= 29) {
            Rect rect = new Rect();
            seekBar.getHitRect(rect);
            seekBar.setSystemGestureExclusionRects(amuk.r(rect));
        }
        seekBar.setOnSeekBarChangeListener(this);
        seekBar.setMax(100);
        this.b = hfnVar.b().X(azpj.b(executor)).as(new ayqb() { // from class: hgl
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                hgo hgoVar = hgo.this;
                View view2 = view;
                actj actjVar2 = actjVar;
                ampq ampqVar = (ampq) obj;
                if (ampqVar.h()) {
                    if (((ShortsCreationSelectedTrack) ampqVar.c()).l()) {
                        return;
                    }
                    view2.setVisibility(0);
                    if (actjVar2 == null || hgoVar.e) {
                        return;
                    }
                    hgoVar.D.u(new acte(actjVar2), null);
                    hgoVar.e = true;
                    return;
                }
                view2.setVisibility(8);
                hgoVar.D.q(new acte(actjVar2), null);
            }
        });
        if (hklVar.e()) {
            ((TextView) inflate.findViewById(R.id.music_balancer_music_label)).setText(R.string.music_balancer_sound_label);
        }
    }

    @Override // defpackage.zxr
    protected final View a() {
        return this.f;
    }

    @Override // defpackage.zxr
    protected final CharSequence b() {
        return null;
    }

    @Override // defpackage.zxr, defpackage.zxy
    public final void f() {
        super.f();
        this.D.H(3, new acte(actj.SHORTS_CREATION_VOLUME_BALANCER_DONE_BUTTON), null);
    }

    @Override // defpackage.zxr, defpackage.zxy
    public final void g() {
        super.g();
        this.D.n(new acte(actj.SHORTS_CREATION_VOLUME_BALANCER_VOLUME_SLIDER));
        this.D.n(new acte(actj.SHORTS_CREATION_VOLUME_BALANCER_DONE_BUTTON));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.g) {
            actj actjVar = this.h;
            if (actjVar != null) {
                this.D.H(3, new acte(actjVar), null);
            }
            G();
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (seekBar != this.a || !z) {
            return;
        }
        float f = 1.0f - (i / 100.0f);
        hai haiVar = (hai) this.c;
        hbg hbgVar = haiVar.p;
        if (hbgVar == null) {
            return;
        }
        haiVar.w = f;
        hbgVar.a(f);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        if (seekBar == this.a) {
            this.D.H(65, new acte(actj.SHORTS_CREATION_VOLUME_BALANCER_VOLUME_SLIDER), null);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
