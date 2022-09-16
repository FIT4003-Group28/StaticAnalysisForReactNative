package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.rendering.ui.badge.DurationBadgeView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jwx  reason: default package */
/* loaded from: classes3.dex */
public final class jwx extends fqe implements jwq, feg {
    public final acti d;
    public final aafo e;
    private final feh f;
    private final aypf g;
    private final airw h;
    private final ajmy i;
    private ImageView j;
    private TextView k;
    private TextView l;
    private TextView m;
    private DurationBadgeView n;

    public jwx(feh fehVar, airw airwVar, acti actiVar, aafo aafoVar, ajmy ajmyVar) {
        fehVar.getClass();
        this.f = fehVar;
        airwVar.getClass();
        this.h = airwVar;
        this.d = actiVar;
        this.e = aafoVar;
        ajmyVar.getClass();
        this.i = ajmyVar;
        this.g = new aypf();
    }

    @Override // defpackage.jwq
    public final ViewGroup.LayoutParams a() {
        ViewStub viewStub = this.c;
        if (viewStub != null) {
            return viewStub.getLayoutParams();
        }
        if (g() != null) {
            return g().getLayoutParams();
        }
        return null;
    }

    @Override // defpackage.jwq
    public final void d(ViewGroup.LayoutParams layoutParams) {
        ViewStub viewStub = this.c;
        if (viewStub != null) {
            viewStub.setLayoutParams(layoutParams);
        } else if (g() == null) {
        } else {
            g().setLayoutParams(layoutParams);
        }
    }

    @Override // defpackage.fqe
    protected final void i() {
        View g = g();
        this.j = (ImageView) g.findViewById(R.id.thumbnail);
        this.k = (TextView) g.findViewById(R.id.title);
        this.l = (TextView) g.findViewById(R.id.video_title);
        this.m = (TextView) g.findViewById(R.id.byline);
        this.n = (DurationBadgeView) g.findViewById(R.id.duration);
    }

    @Override // defpackage.feg
    public final void kF() {
        this.g.c();
    }

    @Override // defpackage.fqe
    protected final void n() {
        avhn avhnVar;
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        auaz auazVar = (auaz) this.b;
        if (auazVar == null) {
            return;
        }
        ajmy ajmyVar = this.i;
        ImageView imageView = this.j;
        if ((auazVar.b & 1024) != 0) {
            avhnVar = auazVar.j;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
        } else {
            avhnVar = null;
        }
        ajmyVar.h(imageView, avhnVar);
        TextView textView = this.k;
        if ((auazVar.b & 1) != 0) {
            aragVar = auazVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        TextView textView2 = this.k;
        textView2.setContentDescription(textView2.getText());
        TextView textView3 = this.l;
        if ((auazVar.b & 2) != 0) {
            aragVar2 = auazVar.d;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        textView3.setText(ajgl.b(aragVar2));
        TextView textView4 = this.l;
        textView4.setContentDescription(textView4.getText());
        TextView textView5 = this.m;
        if ((auazVar.b & 4) != 0) {
            aragVar3 = auazVar.e;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        } else {
            aragVar3 = null;
        }
        textView5.setText(ajgl.b(aragVar3));
        TextView textView6 = this.m;
        textView6.setContentDescription(textView6.getText());
        final apoj b = ahfc.b(auazVar);
        if (b == null || (b.b & 16384) == 0) {
            g().setOnClickListener(null);
            g().setClickable(false);
        } else {
            g().setOnClickListener(new View.OnClickListener() { // from class: jwu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    jwx jwxVar = jwx.this;
                    apoj apojVar = b;
                    if ((apojVar.b & 1048576) != 0) {
                        jwxVar.d.H(3, new acte(apojVar.t), null);
                    }
                    aafo aafoVar = jwxVar.e;
                    apzg apzgVar = apojVar.o;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    aafoVar.c(apzgVar, null);
                }
            });
        }
        hqs.p(this.n, null, null, auazVar.k, null);
    }

    @Override // defpackage.feg
    public final void nr() {
        this.g.c();
        this.g.d(this.h.ao().I().G(aypa.a()).aa(new ayqb() { // from class: jwv
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                jwx jwxVar = jwx.this;
                WatchNextResponseModel a = ((ahhm) obj).a();
                auaz auazVar = null;
                aube aubeVar = a != null ? a.i : null;
                if (aubeVar != null && (aubeVar.b & 1024) != 0) {
                    auba aubaVar = aubeVar.h;
                    if (aubaVar == null) {
                        aubaVar = auba.a;
                    }
                    auazVar = aubaVar.c;
                    if (auazVar == null) {
                        auazVar = auaz.a;
                    }
                }
                jwxVar.k(auazVar);
            }
        }, jww.a));
    }

    @Override // defpackage.fqe
    protected final void p() {
        if (this.f.b) {
            nr();
        }
        this.f.a(this);
    }
}
