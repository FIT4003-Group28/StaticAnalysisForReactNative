package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: akop  reason: default package */
/* loaded from: classes.dex */
public final class akop implements ajru {
    public apzg a;
    public apzg b;
    public apzg c;
    public arag d;
    private final aafo e;
    private final ajxz f;
    private final View g;
    private final ajnj h;
    private final TextView i;
    private final TextView j;
    private final ImageView k;

    public akop(Context context, ajmy ajmyVar, aafo aafoVar, ajxz ajxzVar, akoo akooVar) {
        this.e = aafoVar;
        this.f = ajxzVar;
        View inflate = View.inflate(context, R.layout.share_panel_promo, null);
        this.g = inflate;
        this.h = new ajnj(ajmyVar, (ImageView) inflate.findViewById(R.id.promo_image), true);
        this.i = (TextView) inflate.findViewById(R.id.promo_text);
        TextView textView = (TextView) inflate.findViewById(R.id.add_contacts_button);
        this.j = textView;
        textView.setOnClickListener(new akol(this, aafoVar));
        ImageView imageView = (ImageView) inflate.findViewById(R.id.close_button);
        this.k = imageView;
        imageView.setOnClickListener(new akom(this, aafoVar, akooVar));
        akpk.g(inflate);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.g;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        arag aragVar;
        arag aragVar2;
        apzg apzgVar;
        apzg apzgVar2;
        avnf avnfVar = (avnf) obj;
        int i = 0;
        if (!TextUtils.isEmpty(avnfVar.c)) {
            this.g.setBackgroundColor(Color.parseColor(avnfVar.c));
        } else {
            this.g.setBackgroundColor(0);
        }
        ajnj ajnjVar = this.h;
        avhn avhnVar = avnfVar.h;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        ajnjVar.k(avhnVar);
        TextView textView = this.i;
        if ((avnfVar.b & 64) != 0) {
            aragVar = avnfVar.i;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        apok apokVar = avnfVar.j;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        apoj apojVar = apokVar.c;
        if (apojVar == null) {
            apojVar = apoj.a;
        }
        TextView textView2 = this.j;
        if ((apojVar.b & 256) != 0) {
            aragVar2 = apojVar.i;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        zag.m(textView2, aafv.a(aragVar2, this.e, false));
        if ((apojVar.b & 8192) != 0) {
            apzgVar = apojVar.n;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        this.a = apzgVar;
        if ((apojVar.b & 16384) != 0) {
            apzgVar2 = apojVar.o;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
        } else {
            apzgVar2 = null;
        }
        this.b = apzgVar2;
        if ((avnfVar.b & 2) != 0) {
            ajxz ajxzVar = this.f;
            arhs arhsVar = avnfVar.d;
            if (arhsVar == null) {
                arhsVar = arhs.a;
            }
            arhr b = arhr.b(arhsVar.c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
            i = ajxzVar.a(b);
        }
        if (i != 0) {
            this.k.setImageResource(i);
        } else {
            this.k.setImageDrawable(null);
        }
        apzg apzgVar3 = avnfVar.e;
        if (apzgVar3 == null) {
            apzgVar3 = apzg.a;
        }
        this.c = apzgVar3;
        arag aragVar3 = avnfVar.f;
        if (aragVar3 == null) {
            aragVar3 = arag.a;
        }
        this.d = aragVar3;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
