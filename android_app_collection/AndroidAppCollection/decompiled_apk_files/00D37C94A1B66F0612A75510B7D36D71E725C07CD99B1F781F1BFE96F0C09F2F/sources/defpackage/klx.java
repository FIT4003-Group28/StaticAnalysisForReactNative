package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayDeque;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: klx  reason: default package */
/* loaded from: classes3.dex */
public final class klx extends ahyf implements View.OnClickListener, ahzm {
    private boolean A;
    private CharSequence B;
    private CharSequence C;
    private CharSequence D;
    private Bitmap E;
    private final Runnable a;
    private final Context b;
    private final Handler c;
    private View d;
    private View e;
    private View f;
    private TextView g;
    private TextView h;
    private TextView i;
    private View j;
    private ImageView k;
    private View l;
    private TextView m;
    private View n;
    private ImageView o;
    private ahzl p;
    private final ahzv q;
    private Animator r;
    private Animator s;
    private long t;
    private int u;
    private int v;
    private CharSequence w;
    private CharSequence x;
    private boolean y;
    private boolean z;

    public klx(Context context, ahzv ahzvVar, Handler handler) {
        super(context);
        this.a = new Runnable() { // from class: klw
            @Override // java.lang.Runnable
            public final void run() {
                klx.this.s();
            }
        };
        this.q = ahzvVar;
        this.b = context;
        this.c = handler;
    }

    private final void x() {
        View view = this.e;
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        this.c.removeCallbacks(this.a);
        this.c.postDelayed(this.a, this.t);
    }

    @Override // defpackage.ahyl
    public final View a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.livestream_offline_slate, (ViewGroup) new FrameLayout(context), true);
        this.d = inflate;
        View findViewById = inflate.findViewById(R.id.livestream_offline_slate);
        this.e = findViewById;
        this.g = (TextView) findViewById.findViewById(R.id.livestream_line1);
        this.h = (TextView) this.e.findViewById(R.id.livestream_line2);
        this.j = this.e.findViewById(R.id.livestream_notification_button);
        ImageView imageView = (ImageView) this.e.findViewById(R.id.livestream_notification_icon);
        this.k = imageView;
        imageView.setImageAlpha(PrivateKeyType.INVALID);
        this.i = (TextView) this.e.findViewById(R.id.livestream_notification_text);
        this.j.setOnClickListener(this);
        this.l = this.e.findViewById(R.id.livestream_replay_button);
        this.m = (TextView) this.e.findViewById(R.id.livestream_replay_text);
        this.l.setOnClickListener(this);
        View findViewById2 = this.d.findViewById(R.id.livestream_offline_slate_collapsed);
        this.f = findViewById2;
        View findViewById3 = findViewById2.findViewById(R.id.livestream_offline_slate_expand_button);
        this.n = findViewById3;
        findViewById3.setOnClickListener(this);
        Animator loadAnimator = AnimatorInflater.loadAnimator(context, R.animator.livestream_offline_slate_background_fade);
        this.r = loadAnimator;
        loadAnimator.setTarget(this.n);
        Animator loadAnimator2 = AnimatorInflater.loadAnimator(context, R.animator.livestream_offline_slate_background_fade);
        this.s = loadAnimator2;
        loadAnimator2.setTarget((TextView) this.f.findViewById(R.id.livestream_trailer_text));
        this.o = (ImageView) this.d.findViewById(R.id.livestream_channel_image);
        this.d.setClickable(false);
        this.d.setBackgroundColor(0);
        return this.d;
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahyl
    public final void d(Context context, View view) {
        int i;
        boolean z = true;
        if (aa(1)) {
            int i2 = 8;
            if (!this.A) {
                this.g.setText(this.B);
                this.g.setContentDescription(this.B);
                this.h.setText(this.C);
                this.h.setContentDescription(this.C);
                ArrayDeque arrayDeque = new ArrayDeque();
                if (!TextUtils.isEmpty(this.C) || TextUtils.isEmpty(this.B)) {
                    arrayDeque.add(zgd.d(2, R.id.livestream_text_anchor));
                    arrayDeque.add(zgd.n(15));
                } else {
                    arrayDeque.add(zgd.n(2));
                    arrayDeque.add(zgd.c(15));
                }
                zgd.t(this.g, zgd.y(arrayDeque), RelativeLayout.LayoutParams.class);
                this.l.setVisibility(8);
                View view2 = this.j;
                if (this.v > 0) {
                    i2 = 0;
                }
                view2.setVisibility(i2);
            } else {
                this.g.setText(this.B);
                this.g.setContentDescription(this.B);
                this.h.setText(this.C);
                this.h.setContentDescription(this.C);
                this.m.setText(this.D);
                this.j.setVisibility(8);
                this.l.setVisibility(0);
            }
        }
        if (aa(2)) {
            this.j.setSelected(this.y);
            int i3 = this.u;
            if (i3 != 0 && (i = this.v) != 0) {
                ImageView imageView = this.k;
                if (true != this.y) {
                    i3 = i;
                }
                imageView.setImageResource(i3);
            }
            this.i.setText(this.y ? this.w : this.x);
        }
        if (aa(4)) {
            ImageView imageView2 = this.o;
            if (imageView2 != null) {
                imageView2.setImageBitmap(this.E);
                if (this.E == null) {
                    z = false;
                }
                this.z = z;
                this.d.setClickable(z);
            }
            this.E = null;
        }
    }

    @Override // defpackage.ahzm
    public final void g(boolean z) {
        View view = this.f;
        if (view == null || this.e == null) {
            return;
        }
        view.setVisibility(8);
        this.f.setAlpha(1.0f);
        this.e.setVisibility(0);
        this.g.requestFocus();
        this.g.sendAccessibilityEvent(8);
        if (!z) {
            return;
        }
        x();
    }

    @Override // defpackage.ahzm
    public final int getHeight() {
        View view = this.d;
        if (view != null) {
            return view.getHeight();
        }
        return 0;
    }

    @Override // defpackage.ahzm
    public final int getWidth() {
        View view = this.d;
        if (view != null) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // defpackage.ahyf
    public final void kT() {
        W();
    }

    @Override // defpackage.ahzm
    public final void l() {
        View view;
        if (this.t == 0 || this.f == null || (view = this.e) == null) {
            return;
        }
        view.setVisibility(8);
        this.f.setVisibility(8);
    }

    @Override // defpackage.ahzm
    public final void m() {
        this.c.removeCallbacks(this.a);
    }

    @Override // defpackage.ahyl
    public final boolean mZ() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ahyf
    public final void na(int i) {
        ahzv ahzvVar;
        if (i != 3) {
            boolean z = true;
            if (i == 1 || (ahzvVar = this.q) == null) {
                return;
            }
            if (i != 2) {
                z = false;
            }
            ahzvVar.G(z);
        }
    }

    @Override // defpackage.ahzm
    public final void o(long j) {
        this.t = j;
        x();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.j) {
            this.y = !this.y;
            Y(2);
            this.p.rV();
        }
        if (view == this.l) {
            this.p.rU();
        }
        if (view == this.n) {
            g(true);
        }
    }

    @Override // defpackage.ahzm
    public final void p(Bitmap bitmap) {
        if (bitmap != null || this.z) {
            this.E = bitmap;
            Y(4);
        }
    }

    @Override // defpackage.ahzm
    public final void q(ahzl ahzlVar) {
        this.p = ahzlVar;
    }

    @Override // defpackage.ahzm
    public final void r(boolean z) {
        ahzv ahzvVar = this.q;
        if (ahzvVar != null) {
            ahzvVar.H(z);
        }
    }

    public final void s() {
        View view;
        if (this.t == 0 || this.f == null || (view = this.e) == null) {
            return;
        }
        view.setVisibility(8);
        this.f.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(400L);
        animatorSet.playTogether(this.r, this.s);
        animatorSet.start();
    }

    @Override // defpackage.ahzm
    public final void t(CharSequence charSequence, CharSequence charSequence2, boolean z, CharSequence charSequence3, int i, CharSequence charSequence4, int i2) {
        this.B = charSequence;
        this.C = charSequence2;
        this.y = z;
        this.u = i2;
        this.v = i;
        this.w = charSequence4;
        this.x = charSequence3;
        this.A = false;
        Z();
        Y(3);
    }

    @Override // defpackage.ahzm
    public final void u(boolean z) {
        View view;
        if (this.f == null || (view = this.e) == null) {
            return;
        }
        if (z) {
            s();
            return;
        }
        view.setVisibility(0);
        this.f.setVisibility(8);
    }

    @Override // defpackage.ahzm
    public final void v(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.B = charSequence;
        this.C = charSequence2;
        this.D = charSequence3;
        this.A = true;
        Z();
        Y(1);
    }

    @Override // defpackage.ahzm
    public final void w(boolean z) {
        if (this.e == null) {
            return;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        if (z) {
            arrayDeque.add(zgd.r(this.b.getResources().getDimensionPixelSize(R.dimen.livestream_offline_slate_width)));
            arrayDeque.add(zgd.g(83));
        } else {
            arrayDeque.add(zgd.r(-1));
            arrayDeque.add(zgd.g(81));
        }
        zgd.t(this.e, zgd.y(arrayDeque), FrameLayout.LayoutParams.class);
    }
}
