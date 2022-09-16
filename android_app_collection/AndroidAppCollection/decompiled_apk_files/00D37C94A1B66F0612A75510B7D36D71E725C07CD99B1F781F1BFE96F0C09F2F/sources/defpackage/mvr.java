package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mvr  reason: default package */
/* loaded from: classes3.dex */
public final class mvr implements ajru {
    private final frf a;
    private final View b;
    private final mvp c;
    private final mvp d;
    private mvp e;

    /* JADX INFO: Access modifiers changed from: protected */
    public mvr(Context context, ajmy ajmyVar, aafo aafoVar, ajyc ajycVar, wwk wwkVar, tjv tjvVar, wxc wxcVar, enm enmVar, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.promoted_app_install_wrapper, viewGroup, false);
        this.b = inflate;
        this.c = new mvp(context, ajmyVar, aafoVar, ajycVar, wwkVar, tjvVar, wxcVar, enmVar, inflate, R.id.promoted_app_install_new_line_layout_stub);
        this.d = new mvp(context, ajmyVar, aafoVar, ajycVar, wwkVar, tjvVar, wxcVar, enmVar, inflate, R.id.promoted_app_install_right_align_layout_stub);
        frf h = mxt.h(context);
        this.a = h;
        inflate.setBackground(h);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        aozy aozyVar;
        int i;
        arag aragVar;
        int i2;
        int i3;
        mvp mvpVar;
        auho auhoVar = (auho) obj;
        auhoVar.getClass();
        this.e = null;
        if ((auhoVar.b & 2048) != 0) {
            auhn auhnVar = auhoVar.o;
            if (auhnVar == null) {
                auhnVar = auhn.a;
            }
            int bW = awwc.bW(auhnVar.b);
            if (bW == 0 || bW != 3) {
                auhn auhnVar2 = auhoVar.o;
                if (auhnVar2 == null) {
                    auhnVar2 = auhn.a;
                }
                int bW2 = awwc.bW(auhnVar2.b);
                if (bW2 != 0 && bW2 == 2) {
                    mvpVar = this.d;
                }
            } else {
                mvpVar = this.c;
            }
            this.e = mvpVar;
        }
        mvp mvpVar2 = this.e;
        if (mvpVar2 != null) {
            if (mvpVar2.p == null) {
                mvpVar2.p = mvpVar2.d.inflate();
                mvpVar2.q = mvpVar2.p.findViewById(R.id.content_layout);
                mvpVar2.r = mvpVar2.p.findViewById(R.id.click_overlay);
                mvpVar2.z = (ImageView) mvpVar2.q.findViewById(R.id.thumbnail);
                mvpVar2.A = mvpVar2.q.findViewById(R.id.contextual_menu_anchor);
                mvpVar2.s = (TextView) mvpVar2.q.findViewById(R.id.ad_attribution);
                mvpVar2.t = (TextView) mvpVar2.q.findViewById(R.id.title);
                mvpVar2.u = (TextView) mvpVar2.q.findViewById(R.id.rating_text);
                mvpVar2.v = (RatingBar) mvpVar2.q.findViewById(R.id.rating);
                mvpVar2.w = (TextView) mvpVar2.q.findViewById(R.id.byline);
                mvpVar2.x = (TextView) mvpVar2.q.findViewById(R.id.description);
                mvpVar2.y = (TextView) mvpVar2.q.findViewById(R.id.action);
                zag.k(mvpVar2.q, null);
                mvpVar2.A.setBackground(null);
                mvpVar2.o = new nce(mvpVar2.e, mvpVar2.g, mvpVar2.k, mvpVar2.i, mvpVar2.j, mvpVar2.l, mvpVar2.p, mvpVar2.q, mvpVar2.r, mvpVar2.A, mvpVar2.m);
            }
            nce nceVar = mvpVar2.o;
            acti actiVar = ajrsVar.a;
            String str = auhoVar.r;
            aopu aopuVar = auhoVar.i;
            apzg apzgVar = auhoVar.h;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            apzg apzgVar2 = apzgVar;
            long j = auhoVar.n;
            long j2 = auhoVar.m;
            if ((auhoVar.b & 4096) != 0) {
                aozy aozyVar2 = auhoVar.p;
                if (aozyVar2 == null) {
                    aozyVar2 = aozy.a;
                }
                aozyVar = aozyVar2;
            } else {
                aozyVar = null;
            }
            nceVar.w(actiVar, auhoVar, str, aopuVar, apzgVar2, j, j2, aozyVar, auhoVar.q.I());
            if ((auhoVar.b & 1) == 0) {
                mvpVar2.z.setVisibility(8);
            } else {
                ajmy ajmyVar = mvpVar2.f;
                ImageView imageView = mvpVar2.z;
                avhn avhnVar = auhoVar.c;
                if (avhnVar == null) {
                    avhnVar = avhn.a;
                }
                ajmyVar.h(imageView, avhnVar);
                mvpVar2.z.setVisibility(0);
            }
            if ((auhoVar.b & 2048) != 0) {
                auhn auhnVar3 = auhoVar.o;
                if (auhnVar3 == null) {
                    auhnVar3 = auhn.a;
                }
                if (auhnVar3.c > 0) {
                    auhn auhnVar4 = auhoVar.o;
                    if (auhnVar4 == null) {
                        auhnVar4 = auhn.a;
                    }
                    i3 = (int) auhnVar4.c;
                } else {
                    i3 = 40;
                }
                int applyDimension = (int) TypedValue.applyDimension(1, i3, mvpVar2.n.getDisplayMetrics());
                mvpVar2.z.getLayoutParams().height = applyDimension;
                mvpVar2.z.getLayoutParams().width = applyDimension;
            }
            auhm auhmVar = auhoVar.l;
            if (auhmVar == null) {
                auhmVar = auhm.a;
            }
            if ((auhmVar.b & 1) == 0) {
                mvpVar2.s.setVisibility(8);
            } else {
                mvpVar2.s.setVisibility(0);
            }
            if ((auhoVar.b & 2) == 0) {
                mvpVar2.t.setVisibility(8);
            } else {
                TextView textView = mvpVar2.t;
                arag aragVar2 = auhoVar.d;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
                textView.setText(ajgl.b(aragVar2));
                mvpVar2.t.setVisibility(0);
            }
            float f = auhoVar.e;
            if (Float.compare(f, 0.0f) > 0) {
                if (Float.compare(f, 5.0f) > 0) {
                    f = 5.0f;
                }
                TextView textView2 = mvpVar2.u;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                    mvpVar2.u.setText(String.format("%1.1f", Float.valueOf(f)));
                }
                mvpVar2.v.setVisibility(0);
                mvpVar2.v.setRating(f);
                i = 8;
            } else {
                TextView textView3 = mvpVar2.u;
                i = 8;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                mvpVar2.v.setVisibility(8);
            }
            if ((auhoVar.b & i) == 0) {
                mvpVar2.w.setVisibility(8);
            } else {
                TextView textView4 = mvpVar2.w;
                arag aragVar3 = auhoVar.f;
                if (aragVar3 == null) {
                    aragVar3 = arag.a;
                }
                textView4.setText(ajgl.b(aragVar3));
                mvpVar2.w.setVisibility(0);
            }
            if ((auhoVar.b & 16) == 0) {
                mvpVar2.x.setVisibility(8);
            } else {
                TextView textView5 = mvpVar2.x;
                arag aragVar4 = auhoVar.g;
                if (aragVar4 == null) {
                    aragVar4 = arag.a;
                }
                textView5.setText(ajgl.b(aragVar4));
                mvpVar2.x.setVisibility(0);
            }
            apok apokVar = auhoVar.j;
            if (apokVar == null) {
                apokVar = apok.a;
            }
            if ((apokVar.b & 1) == 0) {
                mvpVar2.y.setVisibility(8);
            } else {
                TextView textView6 = mvpVar2.y;
                apok apokVar2 = auhoVar.j;
                if (apokVar2 == null) {
                    apokVar2 = apok.a;
                }
                apoj apojVar = apokVar2.c;
                if (apojVar == null) {
                    apojVar = apoj.a;
                }
                if ((apojVar.b & 256) != 0) {
                    apok apokVar3 = auhoVar.j;
                    if (apokVar3 == null) {
                        apokVar3 = apok.a;
                    }
                    apoj apojVar2 = apokVar3.c;
                    if (apojVar2 == null) {
                        apojVar2 = apoj.a;
                    }
                    aragVar = apojVar2.i;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                } else {
                    aragVar = null;
                }
                textView6.setText(ajgl.b(aragVar));
                TextView textView7 = mvpVar2.y;
                apok apokVar4 = auhoVar.j;
                if (apokVar4 == null) {
                    apokVar4 = apok.a;
                }
                apoj apojVar3 = apokVar4.c;
                if (apojVar3 == null) {
                    apojVar3 = apoj.a;
                }
                if (apojVar3.c != 1 || (i2 = akzj.l(((Integer) apojVar3.d).intValue())) == 0) {
                    i2 = 1;
                }
                if (i2 - 1 == 13) {
                    textView7.setTextColor(mvpVar2.a);
                    textView7.setBackground(null);
                } else {
                    textView7.setTextColor(mvpVar2.b);
                    if (mvpVar2.B == null) {
                        mvpVar2.B = new ColorDrawable(mvpVar2.c);
                    }
                    textView7.setBackground(mvpVar2.B);
                }
                mvpVar2.y.setVisibility(0);
            }
            ates atesVar = auhoVar.k;
            if (atesVar == null) {
                atesVar = ates.a;
            }
            if ((atesVar.b & 1) == 0) {
                mvpVar2.A.setVisibility(8);
            } else {
                ajyc ajycVar = mvpVar2.h;
                View rootView = mvpVar2.p.getRootView();
                View view = mvpVar2.A;
                ates atesVar2 = auhoVar.k;
                if (atesVar2 == null) {
                    atesVar2 = ates.a;
                }
                atep atepVar = atesVar2.c;
                if (atepVar == null) {
                    atepVar = atep.a;
                }
                ajycVar.e(rootView, view, atepVar, auhoVar, ajrsVar.a);
                mvpVar2.A.setClickable(false);
                mvpVar2.A.setVisibility(0);
            }
            this.b.setVisibility(0);
            return;
        }
        this.b.setVisibility(8);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        mvp mvpVar = this.e;
        if (mvpVar != null) {
            mvpVar.o.c();
            this.e = null;
        }
    }
}
