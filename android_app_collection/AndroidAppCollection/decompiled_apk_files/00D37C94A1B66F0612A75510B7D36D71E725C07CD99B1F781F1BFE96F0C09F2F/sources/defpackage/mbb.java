package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.widget.WrappingTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MenuRendererOuterClass;
/* compiled from: PG */
/* renamed from: mbb  reason: default package */
/* loaded from: classes3.dex */
public final class mbb implements ajru {
    public final aafo a;
    private final ajmy b;
    private final ajyc c;
    private final View d;
    private final ImageView e;
    private final TextView f;
    private final TextView g;
    private final WrappingTextView h;
    private final ImageView i;
    private final View j;

    public mbb(Context context, aafo aafoVar, ajmy ajmyVar, ajyc ajycVar, ViewGroup viewGroup) {
        this.a = aafoVar;
        this.b = ajmyVar;
        this.c = ajycVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.suggested_video, viewGroup, false);
        this.d = inflate;
        this.e = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.f = (TextView) inflate.findViewById(R.id.duration);
        this.g = (TextView) inflate.findViewById(R.id.headline);
        this.h = (WrappingTextView) inflate.findViewById(R.id.details);
        this.i = (ImageView) inflate.findViewById(R.id.contextual_menu_anchor);
        this.j = inflate.findViewById(R.id.separator);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        avhn avhnVar;
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        final avcl avclVar = (avcl) obj;
        this.d.setOnClickListener(new View.OnClickListener() { // from class: maz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                apzg apzgVar;
                mbb mbbVar = mbb.this;
                avcl avclVar2 = avclVar;
                aafo aafoVar = mbbVar.a;
                if ((avclVar2.b & 128) != 0) {
                    apzgVar = avclVar2.j;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                } else {
                    apzgVar = null;
                }
                aafoVar.c(apzgVar, null);
            }
        });
        ajmy ajmyVar = this.b;
        ImageView imageView = this.e;
        arag aragVar4 = null;
        if ((avclVar.b & 8) != 0) {
            avhnVar = avclVar.f;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
        } else {
            avhnVar = null;
        }
        ajmyVar.h(imageView, avhnVar);
        TextView textView = this.f;
        if ((avclVar.b & 16) != 0) {
            aragVar = avclVar.g;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView, ajgl.b(aragVar));
        TextView textView2 = this.g;
        if ((avclVar.b & 1) != 0) {
            aragVar2 = avclVar.c;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        zag.m(textView2, ajgl.b(aragVar2));
        amuf f = amuk.f();
        if ((avclVar.b & 4) != 0) {
            aragVar3 = avclVar.e;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        } else {
            aragVar3 = null;
        }
        Spanned b = ajgl.b(aragVar3);
        if (b != null) {
            f.h(etk.j(b));
        }
        if ((avclVar.b & 2) != 0 && (aragVar4 = avclVar.d) == null) {
            aragVar4 = arag.a;
        }
        Spanned b2 = ajgl.b(aragVar4);
        if (b2 != null) {
            f.h(etk.j(b2));
        }
        amuk g = f.g();
        if (g.isEmpty()) {
            this.h.setVisibility(8);
        } else {
            this.h.setVisibility(0);
            this.h.a(g);
        }
        ajyc ajycVar = this.c;
        View rootView = this.d.getRootView();
        ImageView imageView2 = this.i;
        aunb aunbVar = avclVar.h;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        ajycVar.e(rootView, imageView2, (atep) ajjh.l(aunbVar, MenuRendererOuterClass.menuRenderer), avclVar, acti.l);
        zag.o(this.j, !ajrsVar.j("isLastVideo", false));
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.b.e(this.e);
    }
}
