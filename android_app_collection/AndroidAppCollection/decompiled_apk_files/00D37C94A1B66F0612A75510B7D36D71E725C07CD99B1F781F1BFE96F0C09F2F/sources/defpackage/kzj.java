package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kzj  reason: default package */
/* loaded from: classes3.dex */
final class kzj extends mfs {
    protected final Resources a;
    protected final LinearLayout b;
    protected final RelativeLayout c;
    private final ajrp d;
    private final ajxz e;
    private final ViewGroup f;

    public kzj(Context context, ajmy ajmyVar, aafo aafoVar, ajrx ajrxVar, ajxz ajxzVar) {
        super(context, ajmyVar, aafoVar, ajrxVar, R.layout.watch_card_compact_video_item, null, null);
        this.a = context.getResources();
        this.d = new ajrp(aafoVar, ajrxVar);
        LinearLayout linearLayout = (LinearLayout) this.i.findViewById(R.id.video_info_view);
        this.b = linearLayout;
        this.c = (RelativeLayout) linearLayout.findViewById(R.id.thumbnail_layout);
        this.f = (ViewGroup) linearLayout.findViewById(R.id.badge_layout);
        this.e = ajxzVar;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.i;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        apzg apzgVar;
        int dimension;
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        arag aragVar4;
        arag aragVar5;
        awdi awdiVar = (awdi) obj;
        ajrp ajrpVar = this.d;
        acti actiVar = ajrsVar.a;
        if ((awdiVar.b & 64) != 0) {
            apzgVar = awdiVar.h;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        ajrpVar.b(actiVar, apzgVar, ajrsVar.e(), this);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.c.getLayoutParams();
        if (hqs.q(ajrsVar)) {
            this.b.setOrientation(1);
            layoutParams.width = -1;
            dimension = 0;
        } else {
            this.b.setOrientation(0);
            layoutParams.width = (int) this.a.getDimension(R.dimen.watch_card_list_item_thumbnail_width);
            dimension = (int) this.a.getDimension(R.dimen.compact_video_thumbnail_margin);
        }
        layoutParams.setMarginEnd(dimension);
        if ((awdiVar.b & 2) != 0) {
            aragVar = awdiVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        B(ajgl.b(aragVar));
        if ((awdiVar.b & 8) != 0) {
            aragVar2 = awdiVar.f;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        zag.m(this.m, ajgl.b(aragVar2));
        if ((awdiVar.b & 4) != 0) {
            aragVar3 = awdiVar.e;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        } else {
            aragVar3 = null;
        }
        zag.m(this.n, ajgl.b(aragVar3));
        if ((awdiVar.b & 16) != 0) {
            aragVar4 = awdiVar.g;
            if (aragVar4 == null) {
                aragVar4 = arag.a;
            }
        } else {
            aragVar4 = null;
        }
        Spanned b = ajgl.b(aragVar4);
        if ((awdiVar.b & 16) != 0) {
            aragVar5 = awdiVar.g;
            if (aragVar5 == null) {
                aragVar5 = arag.a;
            }
        } else {
            aragVar5 = null;
        }
        p(b, ajgl.i(aragVar5), awdiVar.i, null);
        avhn avhnVar = awdiVar.c;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        z(avhnVar);
        pns.j(this.g, this.f, this.e, awdiVar.j, false);
    }

    @Override // defpackage.mfs, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        super.qZ(ajsaVar);
        this.d.c();
    }
}
