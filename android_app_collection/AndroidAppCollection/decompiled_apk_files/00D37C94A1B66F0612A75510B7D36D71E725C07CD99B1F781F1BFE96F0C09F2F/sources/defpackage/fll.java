package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: fll  reason: default package */
/* loaded from: classes3.dex */
public final class fll implements ajru {
    public final View a;
    private final TextView b;
    private final TextView c;
    private final ImageView d;
    private final ImageView e;
    private final FrameLayout f;
    private final Context g;
    private final ajxz h;
    private final aafo i;
    private final ajnj j;
    private final DisplayMetrics k;
    private final fjy l;
    private fjx m;

    public fll(Context context, ajxz ajxzVar, aafo aafoVar, ajmr ajmrVar, fjy fjyVar, int i) {
        this.g = context;
        this.h = ajxzVar;
        this.i = aafoVar;
        this.l = fjyVar;
        View inflate = View.inflate(context, i, null);
        this.a = inflate;
        this.b = (TextView) inflate.findViewById(R.id.message_text);
        this.c = (TextView) inflate.findViewById(R.id.message_subtext);
        this.d = (ImageView) inflate.findViewById(R.id.message_icon);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.message_thumbnail);
        this.e = imageView;
        this.f = (FrameLayout) inflate.findViewById(R.id.message_button_layout);
        this.j = new ajnj(ajmrVar, imageView);
        this.k = context.getResources().getDisplayMetrics();
    }

    private final int e(int i) {
        return zew.i(this.k, i);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajru
    /* renamed from: d */
    public final void oK(ajrs ajrsVar, flr flrVar) {
        atff atffVar;
        atff atffVar2;
        arag aragVar;
        atfa atfaVar = flrVar.a;
        if ((atfaVar.b & 1) != 0) {
            arag aragVar2 = atfaVar.e;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            this.b.setText(aafv.a(aragVar2, this.i, false));
            this.b.setVisibility(0);
        } else {
            this.b.setVisibility(8);
        }
        atfd atfdVar = atfaVar.f;
        if (atfdVar == null) {
            atfdVar = atfd.a;
        }
        if ((atfdVar.b & 1) == 0) {
            this.c.setVisibility(8);
            this.b.setTextColor(zhn.j(this.g, R.attr.ytTextSecondary).orElse(0));
        } else {
            TextView textView = this.c;
            atfd atfdVar2 = atfaVar.f;
            if (atfdVar2 == null) {
                atfdVar2 = atfd.a;
            }
            atfc atfcVar = atfdVar2.c;
            if (atfcVar == null) {
                atfcVar = atfc.a;
            }
            if ((atfcVar.b & 1) != 0) {
                atfd atfdVar3 = atfaVar.f;
                if (atfdVar3 == null) {
                    atfdVar3 = atfd.a;
                }
                atfc atfcVar2 = atfdVar3.c;
                if (atfcVar2 == null) {
                    atfcVar2 = atfc.a;
                }
                aragVar = atfcVar2.c;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            textView.setText(aafv.a(aragVar, this.i, false));
            this.c.setVisibility(0);
            this.c.setLineSpacing(zew.i(this.g.getResources().getDisplayMetrics(), ajrsVar.b("BaseMessagePresenter.SubtextLineSpacingExtra", 0)), 1.0f);
            this.b.setTextColor(zhn.j(this.g, R.attr.ytTextPrimary).orElse(0));
        }
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        int i = atfaVar.c;
        if (i != 2) {
            if (i == 7) {
                atffVar = (atff) atfaVar.d;
            } else {
                atffVar = atff.a;
            }
            if ((atffVar.b & 1) != 0) {
                if (atfaVar.c == 7) {
                    atffVar2 = (atff) atfaVar.d;
                } else {
                    atffVar2 = atff.a;
                }
                atfe atfeVar = atffVar2.c;
                if (atfeVar == null) {
                    atfeVar = atfe.a;
                }
                zgd.v(this.e, e(atfeVar.c), e(atfeVar.d));
                ajnj ajnjVar = this.j;
                avhn avhnVar = atfeVar.b;
                if (avhnVar == null) {
                    avhnVar = avhn.a;
                }
                ajnjVar.k(avhnVar);
                this.e.setVisibility(0);
            }
        } else {
            ajxz ajxzVar = this.h;
            arhr b = arhr.b(((atfg) atfaVar.d).b);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
            int a = ajxzVar.a(b);
            if (a != 0) {
                this.d.setImageResource(a);
                this.d.setVisibility(0);
            }
        }
        this.f.setVisibility(8);
        apok apokVar = atfaVar.h;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        if ((apokVar.b & 1) != 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.action.HideEnclosingAction.tag", atfaVar);
            fjx b2 = this.l.b(null, hashMap, R.layout.wide_button);
            apok apokVar2 = atfaVar.h;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            apoj apojVar = apokVar2.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
            b2.oK(ajrsVar, apojVar);
            this.f.removeAllViews();
            this.f.addView(b2.b);
            this.f.setVisibility(0);
            this.m = b2;
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.c.setLineSpacing(0.0f, 1.0f);
        this.f.removeAllViews();
        fjx fjxVar = this.m;
        if (fjxVar != null) {
            fjxVar.qZ(ajsaVar);
            this.m = null;
        }
    }
}
