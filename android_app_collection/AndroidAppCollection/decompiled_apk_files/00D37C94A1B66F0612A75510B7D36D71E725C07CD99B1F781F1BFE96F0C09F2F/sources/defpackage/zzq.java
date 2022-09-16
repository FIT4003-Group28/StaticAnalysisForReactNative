package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.google.android.libraries.youtube.infocards.factories.InfoCardCollection;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: zzq  reason: default package */
/* loaded from: classes4.dex */
public class zzq extends aizc implements Animation.AnimationListener, aaai {
    private boolean a;
    public final View b;
    public final RecyclerView c;
    public final LinearLayoutManager d;
    public final View e;
    public aaar f;
    public aaak g;
    private final aaah h;
    private final aaam i;
    private final Animation j;
    private final Animation k;
    private Animation l;
    private Animation m;
    private Animation n;
    private Animation o;
    private Animation p;
    private Animation q;
    private Runnable r;
    private int s;
    private final ne t;

    public zzq(Context context, aaam aaamVar) {
        super(context);
        this.s = -1;
        Resources resources = context.getResources();
        this.i = aaamVar;
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.fade_in);
        this.j = loadAnimation;
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.fade_out);
        this.k = loadAnimation2;
        long integer = resources.getInteger(R.integer.fade_duration_fast);
        loadAnimation.setDuration(integer);
        loadAnimation2.setDuration(integer);
        loadAnimation2.setAnimationListener(this);
        LayoutInflater.from(context).inflate(R.layout.info_card_drawer_overlay, this);
        this.b = findViewById(R.id.info_cards_drawer);
        findViewById(R.id.info_cards_drawer_close).setOnClickListener(new View.OnClickListener() { // from class: zzn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aaak aaakVar = zzq.this.g;
                if (aaakVar != null) {
                    aaal aaalVar = aaakVar.a;
                    aaalVar.i = false;
                    aaalVar.c.r();
                    aaakVar.a.c.d();
                }
            }
        });
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.info_cards);
        this.c = recyclerView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.d = linearLayoutManager;
        recyclerView.aC(new zzo(context));
        recyclerView.ag(linearLayoutManager);
        aaah aaahVar = new aaah(context, true);
        this.h = aaahVar;
        recyclerView.ad(aaahVar);
        zzp zzpVar = new zzp(this);
        this.t = zzpVar;
        this.e = findViewById(R.id.info_cards_drawer_separator);
        recyclerView.aE(zzpVar);
        g();
    }

    private final void o(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.clearAnimation();
            if (childAt instanceof ViewGroup) {
                o((ViewGroup) childAt);
            }
        }
    }

    private final void p() {
        int e = lj.e(this);
        if (e == this.s) {
            return;
        }
        this.s = e;
        if (e == 0) {
            if (this.n == null) {
                Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.infocards_right_translate_in);
                this.n = loadAnimation;
                loadAnimation.setAnimationListener(this);
            }
            if (this.o == null) {
                Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), R.anim.infocards_right_translate_out);
                this.o = loadAnimation2;
                loadAnimation2.setAnimationListener(this);
            }
            this.p = this.n;
            this.q = this.o;
            return;
        }
        if (this.l == null) {
            Animation loadAnimation3 = AnimationUtils.loadAnimation(getContext(), R.anim.infocards_left_translate_in);
            this.l = loadAnimation3;
            loadAnimation3.setAnimationListener(this);
        }
        if (this.m == null) {
            Animation loadAnimation4 = AnimationUtils.loadAnimation(getContext(), R.anim.infocards_left_translate_out);
            this.m = loadAnimation4;
            loadAnimation4.setAnimationListener(this);
        }
        this.p = this.l;
        this.q = this.m;
    }

    private final boolean q() {
        int i = 0;
        boolean z = this.b.getVisibility() == 0 && !this.a;
        if (true != z) {
            i = 8;
        }
        setVisibility(i);
        return z;
    }

    @Override // defpackage.aaai
    public final Boolean a(arji arjiVar, long j, long j2) {
        aaam aaamVar = this.i;
        if (aaamVar != null) {
            return aaamVar.d(arjiVar, j, j2);
        }
        return false;
    }

    public ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.aaai
    public final void d(boolean z) {
        aaam aaamVar = this.i;
        if (aaamVar != null) {
            aaamVar.g(z);
        }
    }

    @Override // defpackage.aaai
    public final void e(boolean z) {
        p();
        if (this.b.getVisibility() == 0) {
            if (!z || !isShown()) {
                this.b.setVisibility(8);
            } else {
                this.b.startAnimation(this.q);
            }
        }
    }

    @Override // defpackage.aaai
    public final void f(boolean z) {
        aaam aaamVar = this.i;
        if (aaamVar != null) {
            if (z) {
                aaamVar.f();
            } else {
                aaamVar.e();
            }
        }
    }

    @Override // defpackage.aaai
    public final void g() {
        this.b.setVisibility(8);
        aaam aaamVar = this.i;
        if (aaamVar != null) {
            aaamVar.l();
            this.i.i();
        }
    }

    @Override // defpackage.aaai
    public final void h(int i) {
        if (this.b.isShown()) {
            if (zdg.e(getContext())) {
                return;
            }
            aaag.b(this.d.S(i));
            this.c.al(i);
            return;
        }
        this.c.ab(i);
    }

    @Override // defpackage.aaai
    public final void i(InfoCardCollection infoCardCollection, aaan aaanVar, aaar aaarVar) {
        this.f = aaarVar;
        this.h.w(infoCardCollection.b(), aaanVar, aaarVar);
        this.i.j(true);
        CharSequence a = infoCardCollection.a();
        if (a != null) {
            ((TextView) findViewById(R.id.info_cards_drawer_header)).setText(a);
            this.b.setContentDescription(a);
        }
    }

    @Override // defpackage.aaai
    public final void j(Runnable runnable) {
        this.r = runnable;
    }

    @Override // defpackage.aaai
    public final void k(boolean z) {
        if (z != this.a) {
            return;
        }
        boolean z2 = !z;
        this.a = z2;
        if (!z2 || getVisibility() != 0) {
            if (this.a || !q()) {
                return;
            }
            startAnimation(this.j);
            return;
        }
        startAnimation(this.k);
    }

    @Override // defpackage.aaai
    public final void l() {
        p();
        this.b.setVisibility(0);
        this.b.startAnimation(this.p);
        q();
    }

    @Override // defpackage.aaai
    public final void m(boolean z) {
        aaam aaamVar = this.i;
        if (aaamVar != null) {
            aaamVar.m(z);
        }
    }

    @Override // defpackage.aaai
    public final void n(aaak aaakVar) {
        this.g = aaakVar;
        aaam aaamVar = this.i;
        if (aaamVar != null) {
            aaamVar.o(aaakVar);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (animation == this.k) {
            setVisibility(8);
            o(this);
        }
        if (animation == this.p) {
            zdg.d(this.b);
            View findFocus = this.c.findFocus();
            if (findFocus == null) {
                findFocus = this.c.getChildAt(0);
            }
            if (findFocus != null) {
                zdg.d(findFocus);
            }
        }
        if (animation == this.q) {
            this.b.setVisibility(8);
            Runnable runnable = this.r;
            if (runnable == null) {
                return;
            }
            runnable.run();
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
