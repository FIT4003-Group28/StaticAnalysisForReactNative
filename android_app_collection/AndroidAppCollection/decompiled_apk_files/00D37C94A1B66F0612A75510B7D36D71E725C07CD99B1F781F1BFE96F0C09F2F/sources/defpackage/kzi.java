package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kzi  reason: default package */
/* loaded from: classes3.dex */
final class kzi extends mfs {
    private final ajrp a;
    private final ajxz b;
    private final ajyc c;
    private final TextView d;
    private final View e;
    private final ViewGroup f;

    public kzi(Context context, ajmy ajmyVar, aafo aafoVar, ajrx ajrxVar, ajyc ajycVar, ajxz ajxzVar) {
        super(context, ajmyVar, aafoVar, ajrxVar, R.layout.watch_card_compact_video_condensed_item, null, null);
        this.a = new ajrp(aafoVar, ajrxVar);
        View view = this.i;
        this.d = (TextView) view.findViewById(R.id.serial_id);
        this.e = view.findViewById(R.id.thumbnail_layout);
        this.f = (ViewGroup) view.findViewById(R.id.badge_layout);
        this.c = ajycVar;
        this.b = ajxzVar;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.i;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        apzg apzgVar;
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        arag aragVar4;
        atep atepVar;
        awdi awdiVar = (awdi) obj;
        ajrp ajrpVar = this.a;
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
        if ((awdiVar.b & 1) != 0) {
            avhn avhnVar = awdiVar.c;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            z(avhnVar);
            zag.o(this.e, true);
            zag.o(this.d, false);
        } else {
            zag.m(this.d, awdiVar.m);
            zag.o(this.e, false);
        }
        TextView textView = this.j;
        if ((awdiVar.b & 2) != 0) {
            aragVar = awdiVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView, ajgl.b(aragVar));
        TextView textView2 = this.n;
        if ((awdiVar.b & 4) != 0) {
            aragVar2 = awdiVar.e;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        zag.m(textView2, ajgl.b(aragVar2));
        pns.j(this.g, this.f, this.b, awdiVar.j, false);
        if ((awdiVar.b & 16) != 0) {
            aragVar3 = awdiVar.g;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        } else {
            aragVar3 = null;
        }
        Spanned b = ajgl.b(aragVar3);
        if ((awdiVar.b & 16) != 0) {
            aragVar4 = awdiVar.g;
            if (aragVar4 == null) {
                aragVar4 = arag.a;
            }
        } else {
            aragVar4 = null;
        }
        p(b, ajgl.i(aragVar4), awdiVar.i, null);
        ajyc ajycVar = this.c;
        View view = this.i;
        View view2 = this.y;
        ates atesVar = awdiVar.l;
        if (atesVar == null) {
            atesVar = ates.a;
        }
        if ((1 & atesVar.b) != 0) {
            ates atesVar2 = awdiVar.l;
            if (atesVar2 == null) {
                atesVar2 = ates.a;
            }
            atep atepVar2 = atesVar2.c;
            if (atepVar2 == null) {
                atepVar2 = atep.a;
            }
            atepVar = atepVar2;
        } else {
            atepVar = null;
        }
        ajycVar.e(view, view2, atepVar, awdiVar, ajrsVar.a);
    }

    @Override // defpackage.mfs, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        super.qZ(ajsaVar);
        this.a.c();
    }
}
