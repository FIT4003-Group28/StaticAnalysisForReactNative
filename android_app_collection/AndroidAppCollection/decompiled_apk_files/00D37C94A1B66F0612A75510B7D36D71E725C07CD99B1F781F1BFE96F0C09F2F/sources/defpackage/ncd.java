package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ncd  reason: default package */
/* loaded from: classes3.dex */
public final class ncd implements ajru {
    private final frf a;
    private final View b;
    private final ncb c;
    private final ncb d;
    private final ncb e;
    private ncb f;

    /* JADX INFO: Access modifiers changed from: protected */
    public ncd(Context context, ajmy ajmyVar, aafo aafoVar, ajxz ajxzVar, ajyc ajycVar, wwk wwkVar, tjv tjvVar, wxc wxcVar, enm enmVar, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.promoted_text_banner_wrapper, viewGroup, false);
        this.b = inflate;
        this.c = new ncb(context, ajmyVar, aafoVar, ajxzVar, ajycVar, wwkVar, tjvVar, wxcVar, enmVar, inflate, R.id.promoted_text_banner_layout_one_stub, R.id.title_icon);
        this.d = new ncb(context, ajmyVar, aafoVar, ajxzVar, ajycVar, wwkVar, tjvVar, wxcVar, enmVar, inflate, R.id.promoted_text_banner_layout_two_stub, R.id.byline_icon);
        this.e = new ncb(context, ajmyVar, aafoVar, ajxzVar, ajycVar, wwkVar, tjvVar, wxcVar, enmVar, inflate, R.id.promoted_text_banner_layout_three_stub, R.id.icon);
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
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        ncb ncbVar;
        auji aujiVar = (auji) obj;
        aujiVar.getClass();
        this.f = null;
        if ((aujiVar.b & 128) != 0) {
            aujh aujhVar = aujiVar.k;
            if (aujhVar == null) {
                aujhVar = aujh.a;
            }
            int bU = awwc.bU(aujhVar.b);
            if (bU != 0 && bU == 2) {
                ncbVar = this.c;
            } else {
                aujh aujhVar2 = aujiVar.k;
                if (aujhVar2 == null) {
                    aujhVar2 = aujh.a;
                }
                int bU2 = awwc.bU(aujhVar2.b);
                if (bU2 != 0 && bU2 == 3) {
                    ncbVar = this.d;
                } else {
                    aujh aujhVar3 = aujiVar.k;
                    if (aujhVar3 == null) {
                        aujhVar3 = aujh.a;
                    }
                    int bU3 = awwc.bU(aujhVar3.b);
                    if (bU3 != 0 && bU3 == 4) {
                        ncbVar = this.e;
                    }
                }
            }
            this.f = ncbVar;
        }
        ncb ncbVar2 = this.f;
        if (ncbVar2 == null) {
            this.b.setVisibility(8);
            return;
        }
        if (ncbVar2.n == null) {
            ncbVar2.n = ncbVar2.a.inflate();
            ncbVar2.o = ncbVar2.n.findViewById(R.id.content_layout);
            ncbVar2.p = ncbVar2.n.findViewById(R.id.click_overlay);
            ncbVar2.q = (TextView) ncbVar2.o.findViewById(R.id.title);
            ncbVar2.r = (TextView) ncbVar2.o.findViewById(R.id.subtitle);
            ncbVar2.s = (TextView) ncbVar2.o.findViewById(R.id.byline);
            ncbVar2.t = (ImageView) ncbVar2.o.findViewById(R.id.thumbnail);
            ncbVar2.u = (ImageView) ncbVar2.o.findViewById(ncbVar2.l);
            ncbVar2.v = ncbVar2.o.findViewById(R.id.contextual_menu_anchor);
            zag.k(ncbVar2.o, null);
            ncbVar2.v.setBackground(null);
            ncbVar2.m = new nce(ncbVar2.b, ncbVar2.d, ncbVar2.i, ncbVar2.g, ncbVar2.h, ncbVar2.j, ncbVar2.n, ncbVar2.o, ncbVar2.p, ncbVar2.v, ncbVar2.k);
        }
        nce nceVar = ncbVar2.m;
        acti actiVar = ajrsVar.a;
        String str = aujiVar.p;
        aopu aopuVar = aujiVar.i;
        apzg apzgVar = aujiVar.h;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        apzg apzgVar2 = apzgVar;
        long j = aujiVar.m;
        long j2 = aujiVar.l;
        if ((aujiVar.b & 1024) != 0) {
            aozy aozyVar2 = aujiVar.n;
            if (aozyVar2 == null) {
                aozyVar2 = aozy.a;
            }
            aozyVar = aozyVar2;
        } else {
            aozyVar = null;
        }
        nceVar.w(actiVar, aujiVar, str, aopuVar, apzgVar2, j, j2, aozyVar, aujiVar.o.I());
        TextView textView = ncbVar2.q;
        if ((aujiVar.b & 1) != 0) {
            aragVar = aujiVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView, ajgl.b(aragVar));
        TextView textView2 = ncbVar2.r;
        if ((aujiVar.b & 2) != 0) {
            aragVar2 = aujiVar.d;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        zag.m(textView2, ajgl.b(aragVar2));
        TextView textView3 = ncbVar2.s;
        if ((aujiVar.b & 4) != 0) {
            aragVar3 = aujiVar.e;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        } else {
            aragVar3 = null;
        }
        zag.m(textView3, ajgl.b(aragVar3));
        ImageView imageView = ncbVar2.t;
        if (imageView != null && (aujiVar.b & 16) != 0) {
            ajmy ajmyVar = ncbVar2.c;
            avhn avhnVar = aujiVar.g;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            ajmyVar.h(imageView, avhnVar);
            ncbVar2.t.setVisibility(0);
            ncbVar2.u.setVisibility(8);
        } else if ((aujiVar.b & 8) != 0) {
            ImageView imageView2 = ncbVar2.u;
            ajxz ajxzVar = ncbVar2.e;
            arhs arhsVar = aujiVar.f;
            if (arhsVar == null) {
                arhsVar = arhs.a;
            }
            arhr b = arhr.b(arhsVar.c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
            imageView2.setImageResource(ajxzVar.a(b));
            ImageView imageView3 = ncbVar2.t;
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
            ncbVar2.u.setVisibility(0);
        } else {
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ncbVar2.u.setVisibility(8);
        }
        ates atesVar = aujiVar.j;
        if (atesVar == null) {
            atesVar = ates.a;
        }
        if ((atesVar.b & 1) != 0) {
            ncbVar2.v.setVisibility(0);
            ajyc ajycVar = ncbVar2.f;
            View rootView = ncbVar2.n.getRootView();
            View view = ncbVar2.v;
            ates atesVar2 = aujiVar.j;
            if (atesVar2 == null) {
                atesVar2 = ates.a;
            }
            atep atepVar = atesVar2.c;
            if (atepVar == null) {
                atepVar = atep.a;
            }
            ajycVar.e(rootView, view, atepVar, aujiVar, ajrsVar.a);
            ncbVar2.v.setClickable(false);
        } else {
            ncbVar2.v.setVisibility(8);
        }
        this.b.setVisibility(0);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        ncb ncbVar = this.f;
        if (ncbVar != null) {
            ncbVar.m.c();
            this.f = null;
        }
    }
}
