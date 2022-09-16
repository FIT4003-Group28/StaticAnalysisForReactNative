package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: yfj  reason: default package */
/* loaded from: classes4.dex */
public final class yfj extends ajsl implements View.OnClickListener {
    public final axnm a;
    public final View b;
    public final TextView c;
    public final yfg d;
    private final ImageView e;
    private final ColorStateList f;
    private final Context g;
    private final aafo h;
    private final ajxz i;
    private final aagi j;
    private arhm k;
    private aypg l;
    private boolean m;

    public yfj(aafo aafoVar, ajxz ajxzVar, aagi aagiVar, yfg yfgVar, axnm axnmVar, ViewStub viewStub) {
        this.h = aafoVar;
        this.i = ajxzVar;
        this.j = aagiVar;
        this.d = yfgVar;
        this.a = axnmVar;
        viewStub.setLayoutResource(R.layout.icon_badge);
        Context context = viewStub.getContext();
        this.g = context;
        View inflate = viewStub.inflate();
        this.b = inflate;
        inflate.setVisibility(8);
        inflate.setOnClickListener(this);
        this.c = (TextView) inflate.findViewById(R.id.badge_text);
        this.e = (ImageView) inflate.findViewById(R.id.badge_icon);
        this.f = zhn.f(context, R.attr.ytTextPrimary);
        this.m = false;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        arhm arhmVar = (arhm) obj;
        arhmVar.getClass();
        this.k = arhmVar;
        ajxz ajxzVar = this.i;
        arhs arhsVar = arhmVar.d;
        if (arhsVar == null) {
            arhsVar = arhs.a;
        }
        arhr b = arhr.b(arhsVar.c);
        if (b == null) {
            b = arhr.UNKNOWN;
        }
        int a = ajxzVar.a(b);
        if (a == 0) {
            this.e.setVisibility(8);
        } else {
            yzh yzhVar = new yzh(this.g);
            this.e.setImageResource(a);
            ImageView imageView = this.e;
            imageView.setImageDrawable(yzhVar.c(imageView.getDrawable(), this.f));
            this.e.setVisibility(0);
        }
        if ((arhmVar.b & 4) == 0) {
            this.c.setVisibility(8);
        } else {
            this.c.setText(arhmVar.e);
            this.c.setVisibility(0);
        }
        if ((arhmVar.b & 16) != 0) {
            int W = akel.W(arhmVar.g);
            if (W == 0) {
                W = 1;
            }
            int i = W - 1;
            if (i == 1) {
                this.c.setBackgroundResource(R.drawable.icon_badge_red_background);
            } else if (i == 2) {
                this.c.setBackgroundResource(R.drawable.icon_badge_blue_background);
            } else {
                this.c.setBackgroundResource(R.drawable.icon_badge_blue_background);
            }
        }
        if (!this.m) {
            h(arhmVar);
        }
        if (arhmVar.f) {
            this.b.setVisibility(0);
        } else {
            this.b.setVisibility(8);
        }
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((arhm) obj).k.I();
    }

    public final Drawable f() {
        return this.e.getDrawable();
    }

    public final void g() {
        this.b.setVisibility(8);
    }

    public final void h(final arhm arhmVar) {
        arhmVar.getClass();
        this.k = arhmVar;
        if ((arhmVar.b & 1) != 0) {
            aypg aypgVar = this.l;
            if (aypgVar != null && !aypgVar.e()) {
                ayqi.c((AtomicReference) this.l);
            }
            this.l = null;
            this.l = this.j.c().h(arhmVar.c, true).I(noc.s).V(ona.u).k(arhk.class).X(aypa.a()).as(new ayqb() { // from class: yfi
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    yfj yfjVar = yfj.this;
                    arhm arhmVar2 = arhmVar;
                    arhk arhkVar = (arhk) obj;
                    for (yff yffVar : yfjVar.d.a) {
                        yffVar.n(arhkVar);
                    }
                    if ((arhkVar.b.b & 2) == 0) {
                        yfjVar.c.setVisibility(8);
                    } else {
                        yfjVar.c.setText(arhkVar.getBadgeText());
                        yfjVar.c.setVisibility(0);
                    }
                    if (arhkVar.getIsVisible().booleanValue()) {
                        yfjVar.b.setVisibility(0);
                        if ((arhmVar2.b & 128) == 0) {
                            return;
                        }
                        ((akfw) yfjVar.a.get()).d(arhmVar2.j, yfjVar.b);
                        return;
                    }
                    yfjVar.b.setVisibility(8);
                    if ((arhmVar2.b & 128) == 0) {
                        return;
                    }
                    ((akfw) yfjVar.a.get()).g(arhmVar2.j);
                }
            });
            this.m = true;
        }
    }

    public final void j(yff yffVar) {
        this.d.a.add(yffVar);
    }

    public final void k(Drawable drawable) {
        if (this.e.getVisibility() == 0) {
            this.e.setImageDrawable(drawable);
        }
    }

    public final boolean m(arhk arhkVar) {
        arhm arhmVar = this.k;
        return (arhmVar == null || (arhmVar.b & 1) == 0 || !arhmVar.c.equals(arhkVar.d())) ? false : true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        arhm arhmVar = this.k;
        if (arhmVar == null || (arhmVar.b & 32) == 0) {
            return;
        }
        aafo aafoVar = this.h;
        apzg apzgVar = arhmVar.h;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aafoVar.a(apzgVar);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.k = null;
        this.b.setVisibility(8);
    }
}
