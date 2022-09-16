package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mtb  reason: default package */
/* loaded from: classes3.dex */
public final class mtb implements ajru {
    private final ajmy a;
    private final View b;
    private final ImageView c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final akbj g;

    public mtb(Context context, ajmy ajmyVar, akbn akbnVar, ViewGroup viewGroup) {
        this.a = ajmyVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.watch_metadata_app_promo, viewGroup, false);
        this.b = inflate;
        this.c = (ImageView) inflate.findViewById(R.id.image);
        this.d = (TextView) inflate.findViewById(R.id.title);
        this.e = (TextView) inflate.findViewById(R.id.subtitle);
        TextView textView = (TextView) inflate.findViewById(R.id.button);
        this.f = textView;
        this.g = akbnVar.a(textView);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        awes awesVar = (awes) obj;
        if ((awesVar.b & 1) == 0) {
            zag.o(this.c, false);
        } else {
            zag.o(this.c, true);
            ajmy ajmyVar = this.a;
            ImageView imageView = this.c;
            avhn avhnVar = awesVar.c;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            ajmyVar.h(imageView, avhnVar);
        }
        TextView textView = this.d;
        arag aragVar = awesVar.d;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        zag.m(textView, ajgl.b(aragVar));
        TextView textView2 = this.e;
        arag aragVar2 = awesVar.e;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        zag.m(textView2, ajgl.b(aragVar2));
        apok apokVar = awesVar.f;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        if ((apokVar.b & 1) == 0) {
            zag.o(this.f, false);
            return;
        }
        zag.o(this.f, true);
        akbj akbjVar = this.g;
        apok apokVar2 = awesVar.f;
        if (apokVar2 == null) {
            apokVar2 = apok.a;
        }
        apoj apojVar = apokVar2.c;
        if (apojVar == null) {
            apojVar = apoj.a;
        }
        akbjVar.b(apojVar, ajrsVar.a);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.a.e(this.c);
    }
}
