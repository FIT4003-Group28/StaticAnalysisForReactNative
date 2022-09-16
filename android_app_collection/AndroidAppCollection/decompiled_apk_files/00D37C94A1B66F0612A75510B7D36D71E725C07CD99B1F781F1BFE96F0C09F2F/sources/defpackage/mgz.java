package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MenuRendererOuterClass;
/* compiled from: PG */
/* renamed from: mgz  reason: default package */
/* loaded from: classes3.dex */
final class mgz {
    private final int a;
    private final Context b;
    private final ajmr c;
    private final ajyc d;
    private final fmh e;
    private final View f;
    private View g;
    private TextView h;
    private TextView i;
    private View j;
    private ImageView k;
    private fmg l;
    private ajnj m;
    private ajnj n;

    public mgz(Context context, ajmr ajmrVar, fmh fmhVar, ajyc ajycVar, View view, int i) {
        this.f = view;
        this.b = context;
        this.c = ajmrVar;
        this.d = ajycVar;
        this.e = fmhVar;
        this.a = i;
    }

    public final void a() {
        b();
        View view = this.g;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public final void b() {
        ajnj ajnjVar = this.m;
        if (ajnjVar != null) {
            ajnjVar.a();
        }
        ajnj ajnjVar2 = this.n;
        if (ajnjVar2 != null) {
            ajnjVar2.a();
        }
        fmg fmgVar = this.l;
        if (fmgVar != null) {
            fmgVar.d();
        }
    }

    public final void c(aqdg aqdgVar, ajrs ajrsVar) {
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        atep atepVar = null;
        if (this.g == null) {
            View inflate = ((ViewStub) this.f.findViewById(this.a)).inflate();
            this.g = inflate;
            this.h = (TextView) inflate.findViewById(R.id.channel_title);
            this.i = (TextView) this.g.findViewById(R.id.subscriber_count);
            this.j = this.g.findViewById(R.id.contextual_menu_anchor);
            this.k = (ImageView) this.g.findViewById(R.id.avatar_protection);
            ajnj o = akel.o(this.c, (ImageView) this.g.findViewById(R.id.channel_avatar));
            this.m = o;
            o.i(ImageView.ScaleType.CENTER_CROP);
            ajnj o2 = akel.o(this.c, (ImageView) this.g.findViewById(R.id.background_view));
            this.n = o2;
            o2.i(ImageView.ScaleType.CENTER_CROP);
            this.l = this.e.a((TextView) this.g.findViewById(R.id.subscribe_button), null);
        }
        this.g.setVisibility(0);
        int layoutDirection = this.b.getResources().getConfiguration().getLayoutDirection();
        if (this.g.getLayoutDirection() != layoutDirection) {
            this.g.setLayoutDirection(layoutDirection);
        }
        ajnj ajnjVar = this.m;
        avhn avhnVar = aqdgVar.g;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        ajnjVar.k(avhnVar);
        ajnj ajnjVar2 = this.n;
        avhn avhnVar2 = aqdgVar.f;
        if (avhnVar2 == null) {
            avhnVar2 = avhn.a;
        }
        ajnjVar2.k(avhnVar2);
        TextView textView = this.h;
        if ((aqdgVar.b & 1) != 0) {
            aragVar = aqdgVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        TextView textView2 = this.i;
        if ((aqdgVar.b & 2) != 0) {
            aragVar2 = aqdgVar.d;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        textView2.setText(ajgl.b(aragVar2));
        aqdh aqdhVar = aqdgVar.e;
        if (aqdhVar == null) {
            aqdhVar = aqdh.a;
        }
        avaq avaqVar = aqdhVar.c;
        if (avaqVar == null) {
            avaqVar = avaq.a;
        }
        aqdh aqdhVar2 = aqdgVar.e;
        if (aqdhVar2 == null) {
            aqdhVar2 = aqdh.a;
        }
        if ((aqdhVar2.b & 1) != 0) {
            Context context = this.b;
            aopa mo52toBuilder = avaqVar.mo52toBuilder();
            if ((aqdgVar.b & 1) != 0) {
                aragVar3 = aqdgVar.c;
                if (aragVar3 == null) {
                    aragVar3 = arag.a;
                }
            } else {
                aragVar3 = null;
            }
            fyv.d(context, mo52toBuilder, ajgl.b(aragVar3));
            avaqVar = (avaq) mo52toBuilder.mo39build();
            aopa mo52toBuilder2 = aqdgVar.mo52toBuilder();
            aqdh aqdhVar3 = aqdgVar.e;
            if (aqdhVar3 == null) {
                aqdhVar3 = aqdh.a;
            }
            aopa mo52toBuilder3 = aqdhVar3.mo52toBuilder();
            mo52toBuilder3.copyOnWrite();
            aqdh aqdhVar4 = (aqdh) mo52toBuilder3.instance;
            avaqVar.getClass();
            aqdhVar4.c = avaqVar;
            aqdhVar4.b |= 1;
            mo52toBuilder2.copyOnWrite();
            aqdg aqdgVar2 = (aqdg) mo52toBuilder2.instance;
            aqdh aqdhVar5 = (aqdh) mo52toBuilder3.mo39build();
            aqdhVar5.getClass();
            aqdgVar2.e = aqdhVar5;
            aqdgVar2.b |= 4;
            aqdgVar = (aqdg) mo52toBuilder2.mo39build();
        }
        this.l.i(avaqVar, ajrsVar.a);
        if (this.j != null && (aqdgVar.b & 2048) != 0) {
            ajrs ajrsVar2 = new ajrs(ajrsVar);
            ajrsVar2.b = aqdgVar.k.I();
            ajyc ajycVar = this.d;
            View view = this.f;
            View view2 = this.j;
            aunb aunbVar = aqdgVar.l;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (aunbVar.qn(MenuRendererOuterClass.menuRenderer)) {
                aunb aunbVar2 = aqdgVar.l;
                if (aunbVar2 == null) {
                    aunbVar2 = aunb.a;
                }
                atepVar = (atep) aunbVar2.qm(MenuRendererOuterClass.menuRenderer);
            }
            ajycVar.e(view, view2, atepVar, aqdgVar, ajrsVar2.a);
        }
        if (this.k == null || (aqdgVar.b & 256) == 0) {
            return;
        }
        mgy mgyVar = new mgy();
        ImageView imageView = this.k;
        asos asosVar = aqdgVar.j;
        if (asosVar == null) {
            asosVar = asos.a;
        }
        imageView.setColorFilter(asosVar.b, PorterDuff.Mode.SRC_IN);
        this.k.setImageDrawable(mgyVar);
    }
}
