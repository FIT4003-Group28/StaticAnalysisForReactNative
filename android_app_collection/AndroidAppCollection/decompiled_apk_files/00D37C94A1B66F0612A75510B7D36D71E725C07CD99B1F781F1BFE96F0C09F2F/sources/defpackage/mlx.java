package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: mlx  reason: default package */
/* loaded from: classes3.dex */
final class mlx implements ajru {
    public final View a;
    private final fjy b;
    private final TextView c;
    private final TextView d;
    private final LinearLayout e;
    private Map f = new HashMap();

    public mlx(View view, fjy fjyVar) {
        this.a = view;
        this.b = fjyVar;
        this.c = (TextView) view.findViewById(R.id.response_text);
        this.d = (TextView) view.findViewById(R.id.subtext);
        this.e = (LinearLayout) view.findViewById(R.id.buttons_view);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajru
    /* renamed from: d */
    public final void oK(ajrs ajrsVar, atou atouVar) {
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        arag aragVar4;
        HashMap hashMap = new HashMap();
        this.f = hashMap;
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", atouVar);
        TextView textView = this.c;
        if ((atouVar.b & 1) != 0) {
            aragVar = atouVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView, ajgl.b(aragVar));
        TextView textView2 = this.c;
        if ((atouVar.b & 1) != 0) {
            aragVar2 = atouVar.c;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        textView2.setContentDescription(ajgl.i(aragVar2));
        TextView textView3 = this.d;
        if ((atouVar.b & 2) != 0) {
            aragVar3 = atouVar.d;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        } else {
            aragVar3 = null;
        }
        zag.m(textView3, ajgl.b(aragVar3));
        TextView textView4 = this.d;
        if ((atouVar.b & 2) != 0) {
            aragVar4 = atouVar.d;
            if (aragVar4 == null) {
                aragVar4 = arag.a;
            }
        } else {
            aragVar4 = null;
        }
        textView4.setContentDescription(ajgl.i(aragVar4));
        aopu<apok> aopuVar = atouVar.e;
        this.e.removeAllViews();
        zag.o(this.e, !aopuVar.isEmpty());
        for (apok apokVar : aopuVar) {
            if (apokVar != null && (apokVar.b & 1) != 0) {
                fjx a = this.b.a(null, this.f);
                apoj apojVar = apokVar.c;
                if (apojVar == null) {
                    apojVar = apoj.a;
                }
                a.oK(ajrsVar, apojVar);
                this.e.addView(a.b);
            }
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
