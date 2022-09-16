package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: mff  reason: default package */
/* loaded from: classes3.dex */
public class mff implements mpy {
    public final View a;
    private final ajxz b;
    private final akfb c;
    private final Context d;
    private final ImageView e;
    private final TextView f;
    private final akbj g;
    private final ColorStateList h;
    private final int i;
    private acti j;
    private apoj k;
    private ajrs l;

    public mff(ajxz ajxzVar, akfb akfbVar, Context context, akbk akbkVar, ViewGroup viewGroup, int i, int i2) {
        this.b = ajxzVar;
        this.c = akfbVar;
        this.d = context;
        View inflate = LayoutInflater.from(context).inflate(i, viewGroup, false);
        this.a = inflate;
        this.g = akbkVar.a(inflate);
        this.e = (ImageView) inflate.findViewById(R.id.button_icon);
        TextView textView = (TextView) inflate.findViewById(R.id.button_text);
        this.f = textView;
        this.h = textView.getTextColors();
        this.i = i2;
    }

    @Override // defpackage.mpy
    public void b() {
        this.j = null;
        this.k = null;
        this.l = null;
        this.a.setContentDescription(null);
    }

    public void c(auwy auwyVar, acti actiVar, ajrs ajrsVar) {
        int i;
        avgj avgjVar;
        int orElse;
        arag aragVar;
        avgj avgjVar2;
        ColorStateList colorStateList;
        argj argjVar;
        actiVar.getClass();
        this.j = actiVar;
        apok apokVar = auwyVar.f;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        aqxo.y(1 == (apokVar.b & 1));
        apok apokVar2 = auwyVar.f;
        if (apokVar2 == null) {
            apokVar2 = apok.a;
        }
        apoj apojVar = apokVar2.c;
        if (apojVar == null) {
            apojVar = apoj.a;
        }
        this.k = apojVar;
        this.l = ajrsVar;
        akbj akbjVar = this.g;
        acti actiVar2 = this.j;
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
        ajrs ajrsVar2 = this.l;
        if (ajrsVar2 != null) {
            hashMap.put("sectionListController", ajrsVar2.c("sectionListController"));
            hashMap.putAll(this.l.e());
        }
        akbjVar.a(apojVar, actiVar2, hashMap);
        apoj apojVar2 = this.k;
        if ((apojVar2.b & 32) != 0) {
            ajxz ajxzVar = this.b;
            arhs arhsVar = apojVar2.g;
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
        Drawable a = i == 0 ? null : akf.a(this.d, i);
        if (a == null) {
            this.e.setImageResource(0);
        } else {
            apoj apojVar3 = this.k;
            if (apojVar3.c == 20) {
                avgjVar = (avgj) apojVar3.d;
            } else {
                avgjVar = avgj.a;
            }
            if ((avgjVar.b & 2) == 0) {
                orElse = zhn.j(this.d, this.i).orElse(0);
            } else {
                Context context = this.d;
                avgg b2 = avgg.b(avgjVar.d);
                if (b2 == null) {
                    b2 = avgg.THEME_ATTRIBUTE_UNKNOWN;
                }
                orElse = akeq.a(context, b2, 0);
            }
            Drawable mutate = iy.l(a).mutate();
            mutate.setTint(orElse);
            this.e.setImageDrawable(mutate);
        }
        TextView textView = this.f;
        apoj apojVar4 = this.k;
        if ((apojVar4.b & 256) != 0) {
            aragVar = apojVar4.i;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        apoj apojVar5 = this.k;
        if (apojVar5.c == 20) {
            avgjVar2 = (avgj) apojVar5.d;
        } else {
            avgjVar2 = avgj.a;
        }
        if ((avgjVar2.b & 1) != 0) {
            Context context2 = this.d;
            avgg b3 = avgg.b(avgjVar2.c);
            if (b3 == null) {
                b3 = avgg.THEME_ATTRIBUTE_UNKNOWN;
            }
            colorStateList = ColorStateList.valueOf(akeq.a(context2, b3, 0));
        } else {
            colorStateList = this.h;
        }
        this.f.setTextColor(colorStateList);
        argl arglVar = this.k.m;
        if (arglVar == null) {
            arglVar = argl.a;
        }
        if (arglVar.b == 102716411) {
            akfb akfbVar = this.c;
            argl arglVar2 = this.k.m;
            if (arglVar2 == null) {
                arglVar2 = argl.a;
            }
            if (arglVar2.b == 102716411) {
                argjVar = (argj) arglVar2.c;
            } else {
                argjVar = argj.a;
            }
            akfbVar.b(argjVar, this.a, this.k, this.j);
        }
        aovs aovsVar = this.k.s;
        if (aovsVar == null) {
            aovsVar = aovs.a;
        }
        if ((1 & aovsVar.b) == 0) {
            this.e.setContentDescription(null);
            this.f.setImportantForAccessibility(0);
            return;
        }
        ImageView imageView = this.e;
        aovr aovrVar = aovsVar.c;
        if (aovrVar == null) {
            aovrVar = aovr.a;
        }
        imageView.setContentDescription(aovrVar.c);
        this.f.setImportantForAccessibility(2);
    }

    @Override // defpackage.mpy
    public final View oN() {
        return this.a;
    }
}
