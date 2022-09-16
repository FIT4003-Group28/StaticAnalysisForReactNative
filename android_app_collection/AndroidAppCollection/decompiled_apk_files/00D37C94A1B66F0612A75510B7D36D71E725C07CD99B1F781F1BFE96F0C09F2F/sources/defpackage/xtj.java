package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: xtj  reason: default package */
/* loaded from: classes4.dex */
public final class xtj extends ajsl {
    private final ajmy a;
    private final ajrp b;
    private final View c;
    private final TextView d;
    private final FixedAspectRatioFrameLayout e;
    private final ImageView f;
    private final View g;

    public xtj(Context context, ajmy ajmyVar, aafo aafoVar) {
        context.getClass();
        ajmyVar.getClass();
        aafoVar.getClass();
        this.a = ajmyVar;
        View inflate = View.inflate(context, R.layout.comment_video_thumbnail_header, null);
        this.c = inflate;
        this.d = (TextView) inflate.findViewById(R.id.title);
        this.e = (FixedAspectRatioFrameLayout) inflate.findViewById(R.id.comment_video_thumbnail_layout);
        this.f = (ImageView) inflate.findViewById(R.id.comment_video_thumbnail);
        this.g = inflate.findViewById(R.id.divider);
        this.b = new ajrp(aafoVar, inflate);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajsl
    public final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        apzg apzgVar;
        aqcd aqcdVar = (aqcd) obj;
        ajrp ajrpVar = this.b;
        acti actiVar = ajrsVar.a;
        arag aragVar = null;
        if ((aqcdVar.b & 4) != 0) {
            apzgVar = aqcdVar.e;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        ajrpVar.a(actiVar, apzgVar, ajrsVar.e());
        TextView textView = this.d;
        if ((aqcdVar.b & 1) != 0 && (aragVar = aqcdVar.c) == null) {
            aragVar = arag.a;
        }
        zag.m(textView, ajgl.b(aragVar));
        avhn avhnVar = aqcdVar.d;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        float p = akel.p(avhnVar);
        if (p > 0.0f) {
            this.e.a = p;
        }
        avhn avhnVar2 = aqcdVar.d;
        if (avhnVar2 == null) {
            avhnVar2 = avhn.a;
        }
        boolean A = akel.A(avhnVar2);
        zag.o(this.e, A);
        ajmy ajmyVar = this.a;
        ImageView imageView = this.f;
        avhn avhnVar3 = aqcdVar.d;
        if (avhnVar3 == null) {
            avhnVar3 = avhn.a;
        }
        ajmyVar.h(imageView, avhnVar3);
        zag.o(this.f, A);
        this.g.setVisibility(true != aqcdVar.f ? 8 : 0);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqcd) obj).g.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.b.c();
    }
}
