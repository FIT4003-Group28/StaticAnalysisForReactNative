package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.widget.WrappingTextViewForClarifyBox;
import com.google.android.youtube.R;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: kxm  reason: default package */
/* loaded from: classes3.dex */
public class kxm extends ajsl {
    protected final Context a;
    protected final Resources b;
    protected final ajyc c;
    protected final ajmy d;
    protected final ajrp e;
    protected final ajxz f;
    protected final View g;
    protected final WrappingTextViewForClarifyBox h;
    protected final TextView i;
    protected final ImageView j;
    protected final Handler k;
    private final ImageView l;
    private final View m;
    private final View n;

    public kxm(Context context, ajmy ajmyVar, aafo aafoVar, ajyc ajycVar, Handler handler, ajxz ajxzVar, int i, ViewGroup viewGroup) {
        this.a = context;
        this.b = context.getResources();
        this.c = ajycVar;
        this.d = ajmyVar;
        this.k = handler;
        this.f = ajxzVar;
        View inflate = LayoutInflater.from(context).inflate(i, viewGroup, false);
        this.g = inflate;
        this.e = new ajrp(aafoVar, inflate);
        this.l = (ImageView) inflate.findViewById(R.id.clarification_image);
        this.m = inflate.findViewById(R.id.contextual_menu_anchor);
        this.h = (WrappingTextViewForClarifyBox) inflate.findViewById(R.id.clarification_text);
        this.i = (TextView) inflate.findViewById(R.id.source_text);
        this.j = (ImageView) inflate.findViewById(R.id.open_in_new_icon);
        this.n = inflate.findViewById(R.id.bottom_separator);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.g;
    }

    @Override // defpackage.ajsl
    public final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        apzg apzgVar;
        List<arai> emptyList;
        String[] split;
        apvm apvmVar = (apvm) obj;
        ajrp ajrpVar = this.e;
        acti actiVar = ajrsVar.a;
        atep atepVar = null;
        if ((apvmVar.b & 8) != 0) {
            apzgVar = apvmVar.f;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        ajrpVar.a(actiVar, apzgVar, ajrsVar.e());
        int i = apvmVar.c;
        int i2 = 0;
        if (i == 2) {
            this.d.h(this.l, (avhn) apvmVar.d);
            this.l.setColorFilter((ColorFilter) null);
        } else if (i == 12) {
            ImageView imageView = this.l;
            ajxz ajxzVar = this.f;
            arhr b = arhr.b(((arhs) apvmVar.d).c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
            imageView.setImageResource(ajxzVar.a(b));
            this.l.setColorFilter(zhn.j(this.a, R.attr.ytIconActiveOther).orElse(0));
        }
        ates atesVar = apvmVar.g;
        if (atesVar == null) {
            atesVar = ates.a;
        }
        boolean z = true;
        if ((atesVar.b & 1) != 0) {
            ates atesVar2 = apvmVar.g;
            if (atesVar2 == null) {
                atesVar2 = ates.a;
            }
            atep atepVar2 = atesVar2.c;
            if (atepVar2 == null) {
                atepVar2 = atep.a;
            }
            atepVar = atepVar2;
        }
        this.c.e(this.g, this.m, atepVar, apvmVar, ajrsVar.a);
        if ((apvmVar.b & 1) != 0) {
            arag aragVar = apvmVar.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            emptyList = aragVar.c;
        } else {
            emptyList = Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (arai araiVar : emptyList) {
            for (String str : araiVar.c.split(" ", -1)) {
                if (araiVar.d) {
                    i3 += str.length() + 1;
                }
                arrayList.add(str);
            }
        }
        f(apvmVar);
        int e = apwt.e(apvmVar.i);
        if (e != 0 && e == 4) {
            z = false;
        }
        this.i.getViewTreeObserver().addOnPreDrawListener(new kxl(this, z, i3, arrayList));
        if (this.n == null) {
            return;
        }
        if (ajrsVar.c("clarify_box_no_bottom") != Boolean.TRUE) {
            i2 = this.b.getDimensionPixelOffset(R.dimen.clarification_box_bottom_margin);
        }
        zgd.t(this.n, zgd.e(i2), ViewGroup.MarginLayoutParams.class);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((apvm) obj).m.I();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(apvm apvmVar) {
        TextView textView = this.i;
        arag aragVar = apvmVar.h;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        zag.m(textView, ajgl.b(aragVar));
        zag.o(this.j, this.i.getVisibility() == 0);
    }

    public void g(int i, boolean z) {
        int i2;
        final boolean z2;
        int dimensionPixelOffset = this.b.getDimensionPixelOffset(R.dimen.clarification_box_open_in_new_icon_padding_start);
        final RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.j.getLayoutParams();
        final RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.i.getLayoutParams();
        ArrayDeque arrayDeque = new ArrayDeque();
        if (!z || i < 0) {
            arrayDeque.add(zgd.n(16));
            arrayDeque.add(zgd.n(8));
            arrayDeque.add(zgd.d(18, R.id.clarification_text));
            arrayDeque.add(zgd.d(3, R.id.clarification_text));
            i2 = 0;
        } else {
            arrayDeque.add(zgd.d(16, R.id.contextual_menu_anchor));
            arrayDeque.add(zgd.d(8, R.id.clarification_text));
            arrayDeque.add(zgd.n(18));
            arrayDeque.add(zgd.n(3));
            i2 = i + this.b.getDimensionPixelOffset(R.dimen.clarification_box_wiki_link_padding_start);
        }
        arrayDeque.add(zgd.k(dimensionPixelOffset + i2));
        final boolean a = zgd.y(arrayDeque).a(layoutParams2);
        boolean w = zgd.w(layoutParams, zgd.l(-i2));
        if (a) {
            z2 = w;
        } else if (!w) {
            return;
        } else {
            z2 = true;
        }
        this.k.post(new Runnable() { // from class: kxj
            @Override // java.lang.Runnable
            public final void run() {
                kxm kxmVar = kxm.this;
                boolean z3 = a;
                RelativeLayout.LayoutParams layoutParams3 = layoutParams2;
                boolean z4 = z2;
                RelativeLayout.LayoutParams layoutParams4 = layoutParams;
                if (z3) {
                    kxmVar.i.setLayoutParams(layoutParams3);
                }
                if (z4) {
                    kxmVar.j.setLayoutParams(layoutParams4);
                }
            }
        });
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.e.c();
    }
}
