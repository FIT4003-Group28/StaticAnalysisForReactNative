package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kxh  reason: default package */
/* loaded from: classes3.dex */
public final class kxh extends fjt {
    private final Context a;
    private final ajrx f;
    private final ajrp g;

    public kxh(Context context, ajmy ajmyVar, gem gemVar, ajrq ajrqVar) {
        super(context, ajmyVar, R.layout.channel_card_item);
        this.a = context;
        this.f = gemVar;
        gemVar.c(this.b);
        this.g = ajrqVar.a(gemVar);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.f).b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        apzg apzgVar;
        avhn avhnVar;
        arag aragVar;
        aprh aprhVar = (aprh) obj;
        zgd.t(a(), zgd.r(this.a.getResources().getDimensionPixelSize(R.dimen.channel_card_width)), ViewGroup.LayoutParams.class);
        ajrp ajrpVar = this.g;
        acti actiVar = ajrsVar.a;
        arag aragVar2 = null;
        if ((aprhVar.b & 8) != 0) {
            apzgVar = aprhVar.f;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        ajrpVar.a(actiVar, apzgVar, ajrsVar.e());
        ajrsVar.a.u(new acte(aprhVar.g), null);
        if ((aprhVar.b & 1) != 0) {
            avhnVar = aprhVar.c;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
        } else {
            avhnVar = null;
        }
        d(avhnVar);
        if ((aprhVar.b & 2) != 0) {
            aragVar = aprhVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        f(ajgl.b(aragVar));
        if ((aprhVar.b & 4) != 0 && (aragVar2 = aprhVar.e) == null) {
            aragVar2 = arag.a;
        }
        e(ajgl.b(aragVar2));
        this.f.e(ajrsVar);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.g.c();
    }
}
