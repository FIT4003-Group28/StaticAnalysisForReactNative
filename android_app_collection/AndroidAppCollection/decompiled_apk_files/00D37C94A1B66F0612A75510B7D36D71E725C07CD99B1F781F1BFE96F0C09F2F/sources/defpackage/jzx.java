package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jzx  reason: default package */
/* loaded from: classes3.dex */
public final class jzx implements aaam, ahyh {
    private static final Interpolator e = kt.o(0.05f, 0.0f, 0.0f, 1.0f);
    public final azqb a;
    public View b;
    public boolean c;
    public aaak d;
    private final Context f;
    private final Resources g;
    private final TouchImageView h;
    private final ajmy i;
    private final azqb j;
    private final Handler k;
    private Animation l;
    private Animation m;
    private Runnable n;
    private Vibrator o;
    private ahyg p;
    private TextView q;
    private ImageView r;
    private boolean s;

    public jzx(Context context, Handler handler, ajmy ajmyVar, azqb azqbVar, azqb azqbVar2) {
        this.f = context;
        Resources resources = context.getResources();
        resources.getClass();
        this.g = resources;
        handler.getClass();
        this.k = handler;
        ajmyVar.getClass();
        this.i = ajmyVar;
        azqbVar.getClass();
        this.a = azqbVar;
        this.j = azqbVar2;
        View inflate = LayoutInflater.from(context).inflate(R.layout.watch_info_card_button, (ViewGroup) null);
        inflate.getClass();
        TouchImageView touchImageView = (TouchImageView) inflate;
        this.h = touchImageView;
        m(false);
        touchImageView.setVisibility(8);
    }

    @Override // defpackage.aaam
    public final TouchImageView a() {
        return this.h;
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.aaam
    public final Boolean d(arji arjiVar, long j, long j2) {
        if (!this.s || ((nor) this.j.get()).x()) {
            return false;
        }
        h();
        TextView textView = this.q;
        arag aragVar = arjiVar.c;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        textView.setText(ajgl.b(aragVar));
        if ((arjiVar.b & 128) != 0) {
            ajmy ajmyVar = this.i;
            ImageView imageView = this.r;
            avhn avhnVar = arjiVar.j;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            ajmyVar.h(imageView, avhnVar);
        }
        this.b.setVisibility(0);
        this.b.startAnimation(this.l);
        this.k.removeCallbacks(this.n);
        this.k.postDelayed(this.n, j);
        if (zdg.e(this.f)) {
            if (this.o == null) {
                Object systemService = this.f.getSystemService("vibrator");
                systemService.getClass();
                this.o = (Vibrator) systemService;
            }
            this.o.vibrate(this.g.getInteger(R.integer.info_card_accessibility_teaser_vibrate_duration_ms));
        }
        return true;
    }

    @Override // defpackage.aaam
    public final void e() {
    }

    @Override // defpackage.aaam
    public final void f() {
    }

    @Override // defpackage.aaam
    public final void g(boolean z) {
        if (!nI() || this.m == null) {
            return;
        }
        this.k.removeCallbacks(this.n);
        if (z) {
            this.m.setDuration(360L);
        } else {
            this.m.setDuration(0L);
        }
        this.b.startAnimation(this.m);
    }

    final void h() {
        if (nI()) {
            return;
        }
        View inflate = LayoutInflater.from(this.f).inflate(R.layout.watch_info_cards_teaser_overlay, new FrameLayout(this.f));
        this.b = inflate;
        View findViewById = inflate.findViewById(R.id.watch_info_card_teaser_content);
        findViewById.getClass();
        View findViewById2 = this.b.findViewById(R.id.watch_info_card_teaser_content_wrapper);
        findViewById2.getClass();
        TextView textView = (TextView) findViewById.findViewById(R.id.watch_info_card_teaser_message);
        textView.getClass();
        this.q = textView;
        View findViewById3 = this.b.findViewById(R.id.watch_info_card_close_icon);
        findViewById3.getClass();
        ImageView imageView = (ImageView) this.b.findViewById(R.id.watch_info_card_teaser_icon);
        imageView.getClass();
        this.r = imageView;
        this.b.setVisibility(8);
        findViewById2.setOnClickListener(new View.OnClickListener() { // from class: jzs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jzx jzxVar = jzx.this;
                if (!jzxVar.c) {
                    jzxVar.d.a();
                    jzxVar.g(true);
                }
                jzxVar.c = false;
            }
        });
        findViewById2.setOnTouchListener(new alxt(findViewById, new jzv(this)));
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f, R.anim.fade_in);
        this.l = loadAnimation;
        Interpolator interpolator = e;
        loadAnimation.setInterpolator(interpolator);
        this.l.setDuration(360L);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f, R.anim.fade_out);
        this.m = loadAnimation2;
        loadAnimation2.setInterpolator(interpolator);
        this.m.setAnimationListener(new jzw(this));
        final acte acteVar = new acte(actj.INFO_CARDS_TEASER_CLOSE_ICON);
        ((acti) this.a.get()).D(acteVar);
        findViewById3.setOnClickListener(new View.OnClickListener() { // from class: jzt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jzx jzxVar = jzx.this;
                acum acumVar = acteVar;
                jzxVar.g(true);
                ((acti) jzxVar.a.get()).H(3, acumVar, null);
            }
        });
        this.n = new Runnable() { // from class: jzu
            @Override // java.lang.Runnable
            public final void run() {
                jzx.this.g(true);
            }
        };
        ahyg ahygVar = this.p;
        if (ahygVar == null) {
            return;
        }
        ahygVar.d(this, this.b);
    }

    @Override // defpackage.aaam
    public final void i() {
        this.k.removeCallbacks(this.n);
        this.s = false;
        if (nI()) {
            this.b.setVisibility(8);
        }
    }

    @Override // defpackage.aaam
    public final void j(boolean z) {
        this.s = true;
    }

    @Override // defpackage.aizf
    public final View kZ() {
        h();
        return this.b;
    }

    @Override // defpackage.aaam
    public final void l() {
    }

    @Override // defpackage.aaam
    public final void m(boolean z) {
        if (z) {
            this.h.setContentDescription(this.g.getString(R.string.accessibility_annotation_overlay_info_cards_drawer_dismiss));
        } else {
            this.h.setContentDescription(this.g.getString(R.string.accessibility_info_cards));
        }
    }

    @Override // defpackage.ahyh
    public final boolean nI() {
        return this.b != null;
    }

    @Override // defpackage.ahyh
    public final void ns(ahyg ahygVar) {
        this.p = ahygVar;
    }

    @Override // defpackage.aaam
    public final void o(aaak aaakVar) {
        this.d = aaakVar;
    }
}
