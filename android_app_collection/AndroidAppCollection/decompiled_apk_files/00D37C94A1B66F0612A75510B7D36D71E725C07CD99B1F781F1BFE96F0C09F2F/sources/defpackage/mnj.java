package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: mnj  reason: default package */
/* loaded from: classes3.dex */
public final class mnj extends ajsl {
    private final Context a;
    private final ajmy b;
    private final ajrx c;
    private final ajrp d;
    private final View e;
    private final ImageView f;
    private final TextView g;
    private final TextView h;
    private final TextView i;
    private final TextView j;
    private final ViewGroup k;
    private final akbm l;

    public mnj(Context context, ajmy ajmyVar, ajrq ajrqVar, akbn akbnVar, gem gemVar, ViewGroup viewGroup) {
        this.a = context;
        this.b = ajmyVar;
        this.c = gemVar;
        this.d = ajrqVar.a(gemVar);
        View inflate = LayoutInflater.from(context).inflate(R.layout.premium_season_card_item, viewGroup, false);
        this.e = inflate;
        this.f = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.g = (TextView) inflate.findViewById(R.id.thumbnail_overlay_bottom_panel);
        this.h = (TextView) inflate.findViewById(R.id.thumbnail_bottom_panel);
        this.i = (TextView) inflate.findViewById(R.id.title);
        this.j = (TextView) inflate.findViewById(R.id.subtitle);
        this.k = (ViewGroup) inflate.findViewById(R.id.bottom_standalone_badges_container);
        this.l = akbnVar.a((TextView) inflate.findViewById(R.id.offer_button));
        gemVar.c(inflate);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.c).b;
    }

    @Override // defpackage.ajsl
    public final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        apzg apzgVar;
        avhn avhnVar;
        String str;
        augn augnVar = (augn) obj;
        ajrp ajrpVar = this.d;
        acti actiVar = ajrsVar.a;
        aunb aunbVar = null;
        if ((augnVar.b & 16) != 0) {
            apzgVar = augnVar.i;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        ajrpVar.a(actiVar, apzgVar, ajrsVar.e());
        ajmy ajmyVar = this.b;
        ImageView imageView = this.f;
        boolean z = true;
        if ((augnVar.b & 1) != 0) {
            avhnVar = augnVar.c;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
        } else {
            avhnVar = null;
        }
        ajmyVar.h(imageView, avhnVar);
        TextView textView = this.g;
        aopu<avhc> aopuVar = augnVar.d;
        if (aopuVar == null || aopuVar.isEmpty()) {
            str = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (avhc avhcVar : aopuVar) {
                avgs avgsVar = avhcVar.d;
                if (avgsVar == null) {
                    avgsVar = avgs.a;
                }
                if ((avgsVar.b & 1) != 0) {
                    avgs avgsVar2 = avhcVar.d;
                    if (avgsVar2 == null) {
                        avgsVar2 = avgs.a;
                    }
                    arag aragVar = avgsVar2.c;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                    arrayList.add(ajgl.b(aragVar));
                }
            }
            str = TextUtils.join(System.getProperty("line.separator"), arrayList);
        }
        zag.m(textView, str);
        TextView textView2 = this.h;
        arag aragVar2 = augnVar.e;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        zag.m(textView2, ajgl.b(aragVar2));
        TextView textView3 = this.i;
        arag aragVar3 = augnVar.f;
        if (aragVar3 == null) {
            aragVar3 = arag.a;
        }
        zag.m(textView3, ajgl.b(aragVar3));
        TextView textView4 = this.j;
        arag aragVar4 = augnVar.g;
        if (aragVar4 == null) {
            aragVar4 = arag.a;
        }
        zag.m(textView4, ajgl.b(aragVar4));
        fsz.e(this.a, this.k, augnVar.h);
        ViewGroup viewGroup = this.k;
        if (viewGroup.getChildCount() <= 0) {
            z = false;
        }
        zag.o(viewGroup, z);
        if ((augnVar.b & 64) != 0 && (aunbVar = augnVar.j) == null) {
            aunbVar = aunb.a;
        }
        this.l.b((apoj) ampq.i(aunbVar).b(meo.h).f(), ajrsVar.a);
        this.c.e(ajrsVar);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((augn) obj).k.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.d.c();
    }
}
