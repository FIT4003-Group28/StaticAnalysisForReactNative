package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: nko  reason: default package */
/* loaded from: classes3.dex */
public final class nko implements nlx {
    private final Context a;
    private final ajmy b;
    private final apdp c;
    private View d;

    public nko(Context context, ajmy ajmyVar, apdp apdpVar) {
        this.a = context;
        this.b = ajmyVar;
        this.c = apdpVar;
    }

    @Override // defpackage.nlx
    public final View a() {
        return null;
    }

    @Override // defpackage.nlx
    public final View b() {
        avhn avhnVar;
        arag aragVar;
        if (this.d == null) {
            arag aragVar2 = null;
            View inflate = LayoutInflater.from(this.a).inflate(R.layout.ads_engagement_panel_title_header, (ViewGroup) null, false);
            this.d = inflate;
            ImageView imageView = (ImageView) inflate.findViewById(R.id.thumbnail);
            ajmy ajmyVar = this.b;
            apdp apdpVar = this.c;
            if ((apdpVar.b & 2) != 0) {
                avhnVar = apdpVar.d;
                if (avhnVar == null) {
                    avhnVar = avhn.a;
                }
            } else {
                avhnVar = null;
            }
            ajmyVar.h(imageView, avhnVar);
            TextView textView = (TextView) this.d.findViewById(R.id.title);
            apdp apdpVar2 = this.c;
            if ((apdpVar2.b & 1) != 0) {
                aragVar = apdpVar2.c;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            textView.setText(ajgl.b(aragVar));
            TextView textView2 = (TextView) this.d.findViewById(R.id.subtitle);
            apdp apdpVar3 = this.c;
            if ((apdpVar3.b & 4) != 0 && (aragVar2 = apdpVar3.e) == null) {
                aragVar2 = arag.a;
            }
            textView2.setText(ajgl.b(aragVar2));
        }
        return this.d;
    }

    @Override // defpackage.nlx
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.nlx
    public final void d() {
    }

    @Override // defpackage.nlx
    public final void e(boolean z) {
    }

    @Override // defpackage.nlx
    public final void f(auxr auxrVar) {
    }

    @Override // defpackage.nlx
    public final void g(nma nmaVar) {
    }

    @Override // defpackage.nlx
    public final void h(nly nlyVar) {
    }

    @Override // defpackage.nlx
    public final void i(CharSequence charSequence) {
    }

    @Override // defpackage.nlx
    public final void j(CharSequence charSequence) {
    }

    @Override // defpackage.nlx
    public final boolean k() {
        return true;
    }

    @Override // defpackage.nlx
    public final void l(nmn nmnVar) {
    }
}
