package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: fjm  reason: default package */
/* loaded from: classes3.dex */
public final class fjm extends fjq {
    private final ajgj d;
    private final ajxz e;
    private final float f;
    private final TextView g;
    private final ImageView h;
    private final Context i;

    public fjm(ajmy ajmyVar, Context context, ajxz ajxzVar, fjp fjpVar, View view) {
        super(view, ajmyVar, null);
        this.e = ajxzVar;
        ajgi a = ajgj.a();
        a.a = context;
        this.d = a.a();
        this.f = context.getResources().getDisplayMetrics().density;
        view.setVisibility(8);
        this.g = (TextView) view.findViewById(R.id.ad_cta_button_text);
        this.h = (ImageView) view.findViewById(R.id.ad_cta_button_icon);
        this.i = context;
        if (fjpVar != null) {
            b(fjpVar);
        }
    }

    public final void a(aoyl aoylVar, acti actiVar) {
        arag aragVar = null;
        if (actiVar != null) {
            actiVar.u(new acte(aoylVar.o), null);
        }
        this.c = aoylVar;
        int i = 0;
        this.a.setVisibility(0);
        akep c = akel.c(this.i);
        TextView textView = this.g;
        if ((aoylVar.b & 1) != 0 && (aragVar = aoylVar.e) == null) {
            aragVar = arag.a;
        }
        zag.m(textView, ajgl.e(aragVar, this.d, c));
        if ((aoylVar.b & 2) != 0) {
            this.h.setVisibility(0);
            ajmy ajmyVar = this.b;
            ImageView imageView = this.h;
            avhn avhnVar = aoylVar.f;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            ajmyVar.k(imageView, avhnVar, fjq.f(0));
        } else {
            arhs arhsVar = aoylVar.g;
            if (arhsVar == null) {
                arhsVar = arhs.a;
            }
            arhr b = arhr.b(arhsVar.c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
            if (b != arhr.UNKNOWN) {
                this.h.setVisibility(0);
                ImageView imageView2 = this.h;
                ajxz ajxzVar = this.e;
                arhs arhsVar2 = aoylVar.g;
                if (arhsVar2 == null) {
                    arhsVar2 = arhs.a;
                }
                arhr b2 = arhr.b(arhsVar2.c);
                if (b2 == null) {
                    b2 = arhr.UNKNOWN;
                }
                imageView2.setImageResource(ajxzVar.a(b2));
                arag aragVar2 = aoylVar.e;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
                if (aragVar2.c.size() > 0) {
                    arag aragVar3 = aoylVar.e;
                    if (aragVar3 == null) {
                        aragVar3 = arag.a;
                    }
                    if ((((arai) aragVar3.c.get(0)).b & 128) == 0) {
                        ImageView imageView3 = this.h;
                        arag aragVar4 = aoylVar.e;
                        if (aragVar4 == null) {
                            aragVar4 = arag.a;
                        }
                        imageView3.setColorFilter(((arai) aragVar4.c.get(0)).i);
                    } else {
                        arag aragVar5 = aoylVar.e;
                        if (aragVar5 == null) {
                            aragVar5 = arag.a;
                        }
                        int i2 = ((arai) aragVar5.c.get(0)).i;
                        arag aragVar6 = aoylVar.e;
                        if (aragVar6 == null) {
                            aragVar6 = arag.a;
                        }
                        this.h.setColorFilter(akel.c(this.i).a(i2, ((arai) aragVar6.c.get(0)).j));
                    }
                }
            } else {
                this.h.setVisibility(8);
            }
        }
        if (this.a.getBackground().getCurrent() instanceof GradientDrawable) {
            GradientDrawable gradientDrawable = (GradientDrawable) this.a.getBackground().getCurrent().mutate();
            if (aoylVar.c == 3) {
                i = ((Integer) aoylVar.d).intValue();
            }
            if ((aoylVar.b & 16) != 0) {
                i = c.a(i, aoylVar.h);
            }
            gradientDrawable.setColor(i);
            gradientDrawable.setCornerRadius(this.f * aoylVar.i);
            int i3 = aoylVar.j;
            if ((aoylVar.b & 128) != 0) {
                i3 = c.a(i3, aoylVar.k);
            }
            gradientDrawable.setStroke(Math.round(this.f * aoylVar.l), i3);
            this.a.setBackground(gradientDrawable);
        }
    }

    @Override // defpackage.fjq
    public final void b(final fjp fjpVar) {
        this.a.setOnClickListener(new View.OnClickListener() { // from class: fjl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fjm fjmVar = fjm.this;
                fjp fjpVar2 = fjpVar;
                Object obj = fjmVar.c;
                if (obj == null || fjpVar2 == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(((aoyl) obj).n);
                aoyl aoylVar = (aoyl) fjmVar.c;
                if ((aoylVar.b & 512) != 0) {
                    apzg apzgVar = aoylVar.m;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    arrayList.add(apzgVar);
                }
                fjpVar2.a(fjmVar.c, arrayList);
            }
        });
    }

    @Override // defpackage.fjq
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        a((aoyl) obj, null);
    }
}
