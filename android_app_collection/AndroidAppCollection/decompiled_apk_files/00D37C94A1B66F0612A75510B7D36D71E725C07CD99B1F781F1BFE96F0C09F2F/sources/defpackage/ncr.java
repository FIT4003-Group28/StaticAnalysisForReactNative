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
/* renamed from: ncr  reason: default package */
/* loaded from: classes3.dex */
public final class ncr extends ajsl {
    public aoyg a;
    private final ajmy b;
    private final wxc c;
    private final ajgj d;
    private final View e;
    private final ImageView f;
    private final TextView g;
    private ajmu h;

    public ncr(Context context, ajmy ajmyVar, final wxc wxcVar, final aafo aafoVar) {
        this.b = ajmyVar;
        this.c = wxcVar;
        ajgi a = ajgj.a();
        a.a = context;
        a.c = new ajve(aafoVar);
        this.d = a.a();
        View inflate = LayoutInflater.from(context).inflate(R.layout.ad_clickable_icon_section, (ViewGroup) null, false);
        this.e = inflate;
        this.f = (ImageView) inflate.findViewById(R.id.icon);
        this.g = (TextView) inflate.findViewById(R.id.text);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: ncq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ncr ncrVar = ncr.this;
                wxc wxcVar2 = wxcVar;
                aafo aafoVar2 = aafoVar;
                aoyg aoygVar = ncrVar.a;
                if (aoygVar == null || (aoygVar.b & 4) == 0 || wxcVar2.d(aoygVar)) {
                    return;
                }
                Map f = actk.f(ncrVar.a);
                apzg apzgVar = ncrVar.a.e;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar2.c(apzgVar, f);
            }
        });
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.e;
    }

    @Override // defpackage.ajsl
    public final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        arag aragVar;
        aoyg aoygVar = (aoyg) obj;
        this.a = aoygVar;
        boolean z = true;
        zag.o(this.e, true);
        if (this.h == null) {
            nct nctVar = new nct(1);
            ajmt a = ajmu.a();
            a.d(true);
            a.c = nctVar;
            this.h = a.a();
        }
        ajmy ajmyVar = this.b;
        ImageView imageView = this.f;
        avhn avhnVar = aoygVar.c;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        ajmyVar.k(imageView, avhnVar, this.h);
        ImageView imageView2 = this.f;
        if (1 != (aoygVar.b & 1)) {
            z = false;
        }
        zag.o(imageView2, z);
        TextView textView = this.g;
        if ((aoygVar.b & 2) != 0) {
            aragVar = aoygVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView, ajgl.d(aragVar, this.d));
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aoyg) obj).f.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.c.b(this.a);
        this.a = null;
    }
}
