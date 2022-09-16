package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BackgroundPromoRendererOuterClass;
/* compiled from: PG */
/* renamed from: mmj  reason: default package */
/* loaded from: classes3.dex */
public final class mmj extends ajsl {
    private final gem a;
    private final FrameLayout b;
    private final ajsa c;
    private ajru d;
    private final TextView e;

    public mmj(Context context, gem gemVar, ajsa ajsaVar) {
        this.a = gemVar;
        context.getClass();
        this.c = ajsaVar;
        FrameLayout frameLayout = (FrameLayout) View.inflate(context, R.layout.pending_uploads_item, null);
        this.b = frameLayout;
        this.e = (TextView) frameLayout.findViewById(R.id.no_uploads_text);
        gemVar.c(frameLayout);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a.b;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        arag aragVar;
        atvg atvgVar = (atvg) obj;
        TextView textView = this.e;
        if ((atvgVar.b & 2) != 0) {
            aragVar = atvgVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView, ajgl.b(aragVar));
        aunb aunbVar = atvgVar.d;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(BackgroundPromoRendererOuterClass.backgroundPromoRenderer)) {
            aunb aunbVar2 = atvgVar.d;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            apke apkeVar = (apke) aunbVar2.qm(BackgroundPromoRendererOuterClass.backgroundPromoRenderer);
            ampq i = akel.i(this.c, apkeVar, this.b);
            if (i.h()) {
                ajru ajruVar = (ajru) i.c();
                this.d = ajruVar;
                ajruVar.oK(ajrsVar, apkeVar);
                this.b.addView(this.d.a());
                zgd.v(this.b, -1, -1);
                this.b.setVisibility(0);
            }
        } else {
            zgd.v(this.b, -1, -2);
        }
        this.a.e(ajrsVar);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        atvg atvgVar = (atvg) obj;
        return new byte[0];
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        ajru ajruVar = this.d;
        if (ajruVar != null) {
            this.b.removeView(ajruVar.a());
            akel.k(this.d, ajsaVar);
            this.d = null;
        }
    }
}
