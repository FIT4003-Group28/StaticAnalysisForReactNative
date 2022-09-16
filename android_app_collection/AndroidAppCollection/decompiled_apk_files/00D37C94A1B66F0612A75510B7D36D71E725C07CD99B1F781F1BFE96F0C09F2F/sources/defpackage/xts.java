package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Map;
/* compiled from: PG */
/* renamed from: xts  reason: default package */
/* loaded from: classes4.dex */
public final class xts implements ajru {
    public final aafo a;
    public final xyf b;
    public auxq c;
    public auxr d;
    public ww e;
    public xnl f;
    public Map g;
    public acti h;
    private final ajxz i;
    private final View j;
    private final TextView k;
    private final TextView l;
    private final ImageView m;
    private final TextView n;

    public xts(Context context, ajxz ajxzVar, aafo aafoVar, xyf xyfVar) {
        context.getClass();
        ajxzVar.getClass();
        this.i = ajxzVar;
        aafoVar.getClass();
        this.a = aafoVar;
        xyfVar.getClass();
        this.b = xyfVar;
        View inflate = View.inflate(context, R.layout.sort_filter_sub_menu_item, null);
        this.j = inflate;
        this.k = (TextView) inflate.findViewById(R.id.text);
        this.l = (TextView) inflate.findViewById(R.id.subtitle);
        this.m = (ImageView) inflate.findViewById(R.id.icon);
        this.n = (TextView) inflate.findViewById(R.id.beta_label);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: xtr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                auxs auxsVar;
                apzg apzgVar;
                xnl xnlVar;
                auxs auxsVar2;
                xts xtsVar = xts.this;
                if (xtsVar.b.c(xtsVar.c)) {
                    return;
                }
                auxq auxqVar = xtsVar.c;
                if (auxqVar != null) {
                    if (auxqVar.c == 3) {
                        auxsVar = (auxs) auxqVar.d;
                    } else {
                        auxsVar = auxs.a;
                    }
                    if ((auxsVar.b & 1) != 0 && (xnlVar = xtsVar.f) != null) {
                        auxq auxqVar2 = xtsVar.c;
                        if (auxqVar2.c == 3) {
                            auxsVar2 = (auxs) auxqVar2.d;
                        } else {
                            auxsVar2 = auxs.a;
                        }
                        aumx aumxVar = auxsVar2.c;
                        if (aumxVar == null) {
                            aumxVar = aumx.a;
                        }
                        xnlVar.a(ajna.g(aumxVar));
                    } else {
                        auxq auxqVar3 = xtsVar.c;
                        int i = auxqVar3.c;
                        if (i == 5) {
                            apzgVar = (apzg) auxqVar3.d;
                        } else if (i == 6) {
                            apzgVar = (apzg) auxqVar3.d;
                        } else {
                            apzgVar = apzg.a;
                        }
                        int i2 = xtsVar.c.c;
                        if (i2 == 5 || i2 == 6) {
                            xtsVar.a.c(apzgVar, xtsVar.g);
                        }
                    }
                    acti actiVar = xtsVar.h;
                    if (actiVar != null) {
                        auxq auxqVar4 = xtsVar.c;
                        if ((auxqVar4.b & 8192) != 0) {
                            actiVar.H(3, new acte(auxqVar4.j), null);
                        }
                    }
                }
                auxr auxrVar = xtsVar.d;
                if (auxrVar != null) {
                    for (auxq auxqVar5 : auxrVar.c) {
                        if (xtsVar.b.c(auxqVar5)) {
                            xtsVar.b.b(auxqVar5, false);
                        }
                    }
                    xtsVar.b.b(xtsVar.c, true);
                }
                ww wwVar = xtsVar.e;
                if (wwVar == null) {
                    return;
                }
                wwVar.k();
            }
        });
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.j;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        auxq auxqVar = (auxq) obj;
        if (auxqVar == null) {
            return;
        }
        this.c = auxqVar;
        Object c = ajrsVar.c("sortFilterMenu");
        this.e = c instanceof ww ? (ww) c : null;
        Object c2 = ajrsVar.c("sortFilterMenuModel");
        this.d = c2 instanceof auxr ? (auxr) c2 : null;
        this.f = (xnl) ajrsVar.c("sortFilterContinuationHandler");
        this.g = (Map) ajrsVar.d("sortFilterEndpointArgsKey", null);
        if ((auxqVar.b & 8192) != 0) {
            acti actiVar = ajrsVar.a;
            this.h = actiVar;
            actiVar.u(new acte(auxqVar.j), null);
        }
        this.k.setText(this.c.e);
        zag.m(this.l, this.c.f);
        auxq auxqVar2 = this.c;
        if ((auxqVar2.b & 256) == 0) {
            this.m.setImageDrawable(null);
            this.m.setVisibility(8);
        } else {
            ImageView imageView = this.m;
            ajxz ajxzVar = this.i;
            arhs arhsVar = auxqVar2.h;
            if (arhsVar == null) {
                arhsVar = arhs.a;
            }
            arhr b = arhr.b(arhsVar.c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
            imageView.setImageResource(ajxzVar.a(b));
            this.m.setVisibility(0);
        }
        auxq auxqVar3 = this.c;
        if ((auxqVar3.b & 4096) == 0 || !auxqVar3.i) {
            this.n.setVisibility(8);
        } else {
            this.n.setVisibility(0);
        }
        if (!this.b.c(this.c)) {
            return;
        }
        View view = this.j;
        view.setBackgroundColor(zhn.d(view.getContext(), R.attr.ytButtonChipBackgroundHover));
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
