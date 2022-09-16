package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SortFilterSubMenuRendererOuterClass;
/* compiled from: PG */
/* renamed from: mqz  reason: default package */
/* loaded from: classes3.dex */
public final class mqz extends ajsl {
    private final View a;
    private final TextView b;
    private final ViewGroup c;
    private final fly d;
    private flx e;

    public mqz(Context context, fly flyVar) {
        this.d = flyVar;
        View inflate = View.inflate(context, R.layout.sort_filter_header, null);
        this.a = inflate;
        this.b = (TextView) inflate.findViewById(R.id.title);
        this.c = (ViewGroup) inflate.findViewById(R.id.sort_filter_sub_menu_container);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        arag aragVar;
        auxp auxpVar = (auxp) obj;
        TextView textView = this.b;
        boolean z = true;
        auxr auxrVar = null;
        if ((auxpVar.b & 1) != 0) {
            aragVar = auxpVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        aunb aunbVar = auxpVar.d;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(SortFilterSubMenuRendererOuterClass.sortFilterSubMenuRenderer)) {
            aunb aunbVar2 = auxpVar.d;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            auxrVar = (auxr) aunbVar2.qm(SortFilterSubMenuRendererOuterClass.sortFilterSubMenuRenderer);
        }
        if (auxrVar != null) {
            if (this.e == null) {
                this.e = this.d.b(this.c);
            }
            this.c.addView(this.e.c);
            this.e.oK(ajrsVar, auxrVar);
        }
        ViewGroup viewGroup = this.c;
        if (auxrVar == null) {
            z = false;
        }
        zag.o(viewGroup, z);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((auxp) obj).e.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.c.removeAllViews();
        flx flxVar = this.e;
        if (flxVar != null) {
            flxVar.qZ(ajsaVar);
        }
    }
}
