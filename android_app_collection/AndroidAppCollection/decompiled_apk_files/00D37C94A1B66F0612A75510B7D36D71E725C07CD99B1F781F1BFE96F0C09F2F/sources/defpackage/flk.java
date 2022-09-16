package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: flk  reason: default package */
/* loaded from: classes3.dex */
public final class flk extends ajsl {
    public final yni a;
    public final aafo b;
    public arcy c;
    private final ajmy d;
    private final ajxz e;
    private final LayoutInflater f;
    private final Resources g;
    private final ViewGroup h;
    private flj i;

    public flk(Context context, ajmy ajmyVar, yni yniVar, aafo aafoVar, ajxz ajxzVar) {
        ajmyVar.getClass();
        this.d = ajmyVar;
        yniVar.getClass();
        this.a = yniVar;
        aafoVar.getClass();
        this.b = aafoVar;
        ajxzVar.getClass();
        this.e = ajxzVar;
        this.f = LayoutInflater.from(context);
        this.g = context.getResources();
        this.h = new FrameLayout(context);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.h;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        arag aragVar;
        int i;
        this.c = (arcy) obj;
        int i2 = 0;
        if (this.i == null) {
            this.i = new flj(this, this.f.inflate(true != this.g.getBoolean(R.bool.generic_promo_banner_view) ? R.layout.generic_promo_card : R.layout.generic_promo_banner, this.h, false));
        }
        flj fljVar = this.i;
        TextView textView = fljVar.b;
        arcy arcyVar = this.c;
        arag aragVar2 = null;
        if ((arcyVar.b & 1) != 0) {
            aragVar = arcyVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        TextView textView2 = fljVar.c;
        arcy arcyVar2 = this.c;
        if ((arcyVar2.b & 2) != 0 && (aragVar2 = arcyVar2.d) == null) {
            aragVar2 = arag.a;
        }
        textView2.setText(ajgl.b(aragVar2));
        if ((this.c.b & 64) == 0) {
            fljVar.d.setVisibility(8);
        } else {
            fljVar.d.setVisibility(0);
        }
        ajmy ajmyVar = this.d;
        ImageView imageView = fljVar.e;
        avhn avhnVar = this.c.h;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        ajmyVar.h(imageView, avhnVar);
        apok apokVar = this.c.e;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        apoj apojVar = apokVar.c;
        if (apojVar == null) {
            apojVar = apoj.a;
        }
        if ((apojVar.b & 256) == 0) {
            fljVar.g.setVisibility(8);
        } else {
            Button button = fljVar.g;
            apok apokVar2 = this.c.e;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            apoj apojVar2 = apokVar2.c;
            if (apojVar2 == null) {
                apojVar2 = apoj.a;
            }
            arag aragVar3 = apojVar2.i;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
            button.setText(ajgl.b(aragVar3));
        }
        arcy arcyVar3 = this.c;
        if ((arcyVar3.b & 16) != 0) {
            ajxz ajxzVar = this.e;
            arhs arhsVar = arcyVar3.g;
            if (arhsVar == null) {
                arhsVar = arhs.a;
            }
            arhr b = arhr.b(arhsVar.c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
            i = ajxzVar.a(b);
        } else {
            i = 0;
        }
        if (i != 0) {
            this.d.e(fljVar.f);
            fljVar.f.setBackgroundResource(i);
        } else {
            avhn avhnVar2 = this.c.f;
            if (avhnVar2 == null) {
                avhnVar2 = avhn.a;
            }
            this.d.h(fljVar.f, avhnVar2);
            ImageView imageView2 = fljVar.f;
            if (true != akel.A(avhnVar2)) {
                i2 = 8;
            }
            imageView2.setVisibility(i2);
        }
        this.h.removeAllViews();
        this.h.addView(fljVar.a);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((arcy) obj).j.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
