package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ncu  reason: default package */
/* loaded from: classes3.dex */
public final class ncu extends ajsl {
    public aoyx a;
    ajmu b;
    private final ajmy c;
    private final wxc d;
    private final ajgj e;
    private final View f;
    private final ImageView g;
    private final ImageView h;
    private final TextView i;
    private final TextView j;
    private final TextView k;

    public ncu(Context context, ajmy ajmyVar, final wxc wxcVar, final aafo aafoVar) {
        this.c = ajmyVar;
        this.d = wxcVar;
        ajgi a = ajgj.a();
        a.a = context;
        a.c = new ajve(aafoVar);
        this.e = a.a();
        View inflate = LayoutInflater.from(context).inflate(R.layout.ad_item_details_section, (ViewGroup) null, false);
        this.f = inflate;
        this.g = (ImageView) inflate.findViewById(R.id.primary_image);
        this.h = (ImageView) inflate.findViewById(R.id.icon);
        this.i = (TextView) inflate.findViewById(R.id.title);
        this.j = (TextView) inflate.findViewById(R.id.heading);
        this.k = (TextView) inflate.findViewById(R.id.subheading);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: ncs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ncu ncuVar = ncu.this;
                wxc wxcVar2 = wxcVar;
                aafo aafoVar2 = aafoVar;
                aoyx aoyxVar = ncuVar.a;
                if (aoyxVar == null || (aoyxVar.b & 32) == 0 || wxcVar2.d(aoyxVar)) {
                    return;
                }
                Map f = actk.f(ncuVar.a);
                apzg apzgVar = ncuVar.a.h;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar2.c(apzgVar, f);
            }
        });
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.f;
    }

    @Override // defpackage.ajsl
    public final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        arag aragVar;
        arag aragVar2;
        aoyx aoyxVar = (aoyx) obj;
        boolean z = true;
        zag.o(this.f, true);
        if (this.b == null) {
            nct nctVar = new nct();
            ajmt a = ajmu.a();
            a.d(true);
            a.c = nctVar;
            this.b = a.a();
        }
        this.a = aoyxVar;
        ajmy ajmyVar = this.c;
        ImageView imageView = this.g;
        avhn avhnVar = aoyxVar.c;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        ajmyVar.k(imageView, avhnVar, this.b);
        zag.o(this.g, 1 == (aoyxVar.b & 1));
        ajmy ajmyVar2 = this.c;
        ImageView imageView2 = this.h;
        avhn avhnVar2 = aoyxVar.d;
        if (avhnVar2 == null) {
            avhnVar2 = avhn.a;
        }
        ajmyVar2.k(imageView2, avhnVar2, this.b);
        ImageView imageView3 = this.h;
        if ((aoyxVar.b & 2) == 0) {
            z = false;
        }
        zag.o(imageView3, z);
        TextView textView = this.i;
        arag aragVar3 = null;
        if ((aoyxVar.b & 4) != 0) {
            aragVar = aoyxVar.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView, ajgl.d(aragVar, this.e));
        TextView textView2 = this.j;
        if ((aoyxVar.b & 8) != 0) {
            aragVar2 = aoyxVar.f;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        zag.m(textView2, ajgl.d(aragVar2, this.e));
        TextView textView3 = this.k;
        if ((aoyxVar.b & 16) != 0 && (aragVar3 = aoyxVar.g) == null) {
            aragVar3 = arag.a;
        }
        zag.m(textView3, ajgl.d(aragVar3, this.e));
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aoyx) obj).i.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.d.b(this.a);
        this.a = null;
    }
}
