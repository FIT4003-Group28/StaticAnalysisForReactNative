package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: yei  reason: default package */
/* loaded from: classes4.dex */
public final class yei extends ajsl {
    final ImageView a;
    final TextView b;
    final TextView c;
    final int d;
    final int e;
    final int f;
    private final ajmy g;
    private final aafo h;
    private final ajrx i;
    private final ajwo j;

    public yei(Context context, ajmy ajmyVar, aafo aafoVar, yef yefVar, ajwm ajwmVar) {
        this.g = ajmyVar;
        this.h = aafoVar;
        this.i = yefVar;
        int orElse = zhn.j(context, R.attr.ytTextPrimary).orElse(0);
        this.d = orElse;
        int orElse2 = zhn.j(context, R.attr.ytTextSecondary).orElse(0);
        this.e = orElse2;
        int orElse3 = zhn.j(context, R.attr.ytStaticBlue).orElse(0);
        this.f = orElse3;
        View inflate = LayoutInflater.from(context).inflate(R.layout.music_key_promo_small_feature_item, (ViewGroup) null);
        this.a = (ImageView) inflate.findViewById(R.id.icon);
        TextView textView = (TextView) inflate.findViewById(R.id.header);
        this.b = textView;
        TextView textView2 = (TextView) inflate.findViewById(R.id.description);
        this.c = textView2;
        ajwn ajwnVar = ajwmVar.a;
        ajwnVar.a = textView;
        ajwnVar.g(orElse);
        ajwnVar.b = textView2;
        ajwnVar.e(orElse2);
        ajwnVar.d(orElse3);
        this.j = ajwnVar.a();
        yefVar.c(inflate);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((yef) this.i).a;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        arag aragVar;
        atlr atlrVar = (atlr) obj;
        this.a.setVisibility(1 != (atlrVar.b & 1) ? 8 : 0);
        ajmy ajmyVar = this.g;
        ImageView imageView = this.a;
        avhn avhnVar = atlrVar.c;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        ajmyVar.h(imageView, avhnVar);
        TextView textView = this.b;
        arag aragVar2 = atlrVar.d;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        zag.m(textView, ajgl.b(aragVar2));
        TextView textView2 = this.c;
        apmy apmyVar = null;
        if ((atlrVar.b & 4) != 0) {
            aragVar = atlrVar.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView2, aafv.a(aragVar, this.h, false));
        ajwo ajwoVar = this.j;
        if ((atlrVar.b & 8) != 0) {
            atlq atlqVar = atlrVar.f;
            if (atlqVar == null) {
                atlqVar = atlq.a;
            }
            if (atlqVar.b == 118483990) {
                apmyVar = (apmy) atlqVar.c;
            } else {
                apmyVar = apmy.a;
            }
        }
        ajwoVar.a(apmyVar);
        this.i.e(ajrsVar);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((atlr) obj).g.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
