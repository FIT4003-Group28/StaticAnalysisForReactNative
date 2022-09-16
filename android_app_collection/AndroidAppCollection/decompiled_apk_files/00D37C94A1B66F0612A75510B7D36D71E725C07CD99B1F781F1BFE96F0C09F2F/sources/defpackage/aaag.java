package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.libraries.youtube.infocards.factories.InfoCardCollection;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: aaag  reason: default package */
/* loaded from: classes.dex */
public final class aaag implements aaas {
    public final Context b;
    public final Animation c;
    public final Animation d;
    public View e;
    public aaar f;
    public boolean g;
    public RecyclerView h;
    public LinearLayoutManager i;
    private final aaan k;
    private final Animation l;
    private final ViewStub m;
    private aaah n;
    private TextView o;
    private final odz p;
    private final ne q;
    private static final int[] j = {16842919, 16842910};
    public static final int[] a = new int[0];

    public aaag(Context context, odz odzVar, ViewStub viewStub, aaan aaanVar) {
        this.b = context;
        this.m = viewStub;
        this.p = odzVar;
        this.k = aaanVar;
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.top_translate_in);
        this.c = loadAnimation;
        loadAnimation.setAnimationListener(new aaaa(this, 1));
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.top_translate_out);
        this.l = loadAnimation2;
        loadAnimation2.setAnimationListener(new aaaa(this));
        this.d = AnimationUtils.loadAnimation(context, R.anim.top_translate_out);
        this.q = new aaab(this);
    }

    public static void b(View view) {
        Drawable foreground;
        if (!(view instanceof CardView) || (foreground = ((CardView) view).getForeground()) == null) {
            return;
        }
        foreground.setState(j);
        view.postDelayed(new aaaf(foreground), 250L);
    }

    @Override // defpackage.aaas
    public final void a(boolean z) {
        if (!this.g) {
            if (!this.l.hasStarted() || this.l.hasEnded()) {
                return;
            }
            this.l.cancel();
            return;
        }
        this.g = false;
        if (!z || !((View) this.e.getParent()).isShown()) {
            this.e.setVisibility(8);
        } else {
            this.e.startAnimation(this.l);
        }
        this.p.a.getWindow().getDecorView().sendAccessibilityEvent(32);
    }

    @Override // defpackage.aaas
    public final void c(InfoCardCollection infoCardCollection, int i, boolean z) {
        if (!this.g) {
            this.g = true;
            if (this.e == null) {
                View inflate = this.m.inflate();
                this.e = inflate;
                inflate.findViewById(R.id.close).setOnClickListener(new aaad(this));
                this.h = (RecyclerView) this.e.findViewById(R.id.info_cards);
                this.i = new LinearLayoutManager();
                this.h.aC(new aaae(this));
                this.h.ag(this.i);
                aaah aaahVar = new aaah(this.b, false);
                this.n = aaahVar;
                this.h.ad(aaahVar);
                this.h.aE(this.q);
            }
            this.n.w(infoCardCollection.b(), this.k, this.f);
            CharSequence a2 = infoCardCollection.a();
            if (a2 != null) {
                TextView textView = (TextView) this.e.findViewById(R.id.info_card_drawer_title);
                this.o = textView;
                textView.setText(a2);
                this.e.setContentDescription(a2);
            }
            TextView textView2 = (TextView) this.e.findViewById(R.id.ad_badge);
            aris arisVar = infoCardCollection.a.g;
            if (arisVar == null) {
                arisVar = aris.a;
            }
            if ((arisVar.b & 1) == 0) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
            if (!z || !((View) this.e.getParent()).isShown()) {
                this.e.setVisibility(0);
            } else {
                this.e.setVisibility(4);
                this.e.post(new Runnable() { // from class: zzz
                    @Override // java.lang.Runnable
                    public final void run() {
                        aaag aaagVar = aaag.this;
                        aaagVar.e.setVisibility(0);
                        aaagVar.e.startAnimation(aaagVar.c);
                    }
                });
            }
            this.h.ab(i);
            zdg.d((View) this.h.getParent());
            View childAt = this.h.getChildAt(Math.max(0, i) - this.i.J());
            if (childAt == null) {
                return;
            }
            zdg.d(childAt);
            return;
        }
        this.h.al(i);
    }
}
