package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: fph  reason: default package */
/* loaded from: classes3.dex */
public final class fph extends ajsl {
    private final ajmy a;
    private final ajrx b;
    private final ajrp c;
    private final Resources d;
    private final View e;
    private final ImageView f;
    private final TextView g;
    private final TextView h;
    private final TextView i;
    private final TextView j;
    private final akbm k;
    private final TextView l;

    public fph(Context context, ajmy ajmyVar, ajrq ajrqVar, akbn akbnVar, gem gemVar) {
        this.c = ajrqVar.a(gemVar);
        ajmyVar.getClass();
        this.a = ajmyVar;
        this.b = gemVar;
        this.d = context.getResources();
        View inflate = View.inflate(context, R.layout.compact_movie_upsell, null);
        this.e = inflate;
        this.f = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.g = (TextView) inflate.findViewById(R.id.textual_call_to_action);
        this.h = (TextView) inflate.findViewById(R.id.title);
        this.i = (TextView) inflate.findViewById(R.id.subtitle);
        this.j = (TextView) inflate.findViewById(R.id.top_metadata);
        TextView textView = (TextView) inflate.findViewById(R.id.offer_button_cta);
        this.l = textView;
        this.k = akbnVar.a(textView);
        gemVar.c(inflate);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.b).b;
    }

    @Override // defpackage.ajsl
    public final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        arag aragVar4;
        apoj apojVar;
        aqeb aqebVar = (aqeb) obj;
        GridLayout.LayoutParams layoutParams = (GridLayout.LayoutParams) this.f.getLayoutParams();
        int i = aqebVar.b;
        if ((i & 8) != 0) {
            layoutParams.width = this.d.getDimensionPixelSize(R.dimen.compact_movie_upsell_thumbnail_width);
            ajmy ajmyVar = this.a;
            ImageView imageView = this.f;
            avhn avhnVar = aqebVar.f;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            ajmyVar.h(imageView, avhnVar);
        } else if ((i & 4) != 0) {
            layoutParams.width = this.d.getDimensionPixelSize(R.dimen.compact_show_upsell_thumbnail_width);
            ajmy ajmyVar2 = this.a;
            ImageView imageView2 = this.f;
            avhn avhnVar2 = aqebVar.e;
            if (avhnVar2 == null) {
                avhnVar2 = avhn.a;
            }
            ajmyVar2.h(imageView2, avhnVar2);
        }
        apzg apzgVar = null;
        zag.l(this.e, null, 0);
        TextView textView = this.g;
        if ((aqebVar.b & 256) != 0) {
            aragVar = aqebVar.i;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView, ajgl.b(aragVar));
        TextView textView2 = this.h;
        if ((aqebVar.b & 1) != 0) {
            aragVar2 = aqebVar.c;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        zag.m(textView2, ajgl.b(aragVar2));
        TextView textView3 = this.i;
        if ((aqebVar.b & 2) != 0) {
            aragVar3 = aqebVar.d;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        } else {
            aragVar3 = null;
        }
        zag.m(textView3, ajgl.b(aragVar3));
        TextView textView4 = this.j;
        if ((aqebVar.b & 64) != 0) {
            aragVar4 = aqebVar.h;
            if (aragVar4 == null) {
                aragVar4 = arag.a;
            }
        } else {
            aragVar4 = null;
        }
        zag.m(textView4, ajgl.b(aragVar4));
        akbm akbmVar = this.k;
        apok apokVar = aqebVar.j;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        if ((apokVar.b & 1) != 0) {
            apok apokVar2 = aqebVar.j;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            apojVar = apokVar2.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
        } else {
            apojVar = null;
        }
        akbmVar.b(apojVar, ajrsVar.a);
        if ((aqebVar.b & 8) != 0) {
            zav.c(this.l, akf.a(this.l.getContext(), R.drawable.button_color_transparent_background));
        }
        ajrp ajrpVar = this.c;
        acti actiVar = ajrsVar.a;
        if ((aqebVar.b & 16) != 0 && (apzgVar = aqebVar.g) == null) {
            apzgVar = apzg.a;
        }
        ajrpVar.a(actiVar, apzgVar, ajrsVar.e());
        this.b.e(ajrsVar);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqeb) obj).k.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.c.c();
    }
}
