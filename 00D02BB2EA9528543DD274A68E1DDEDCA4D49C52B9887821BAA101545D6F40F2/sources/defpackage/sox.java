package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: sox  reason: default package */
/* loaded from: classes7.dex */
public class sox implements bxof {
    private final cqtd a = cqrt.h(2131232720, iva.b(ibl.H(), ibl.af()));
    private final Activity b;
    private final dxio<afef> c;

    public sox(Activity activity, dxio<afef> dxioVar) {
        this.b = activity;
        this.c = dxioVar;
    }

    @Override // defpackage.bxof
    public CharSequence a() {
        return "";
    }

    @Override // defpackage.bxof
    public CharSequence b() {
        return this.b.getString(R.string.INCOGNITO_ZERO_SUGGEST_PROMO_CARD_DESCRIPTION);
    }

    @Override // defpackage.bxof
    public CharSequence c() {
        return this.b.getString(R.string.TURN_OFF_INCOGNITO_ZERO_SUGGEST_PROMO_CARD_BUTTON_TITLE);
    }

    @Override // defpackage.bxof
    public cqtd d() {
        return this.a;
    }

    @Override // defpackage.bxof
    @dzsi
    public CharSequence e() {
        return null;
    }

    @Override // defpackage.bxof
    public cqkl f(cjqm cjqmVar) {
        this.c.a().e(false);
        return cqkl.a;
    }

    @Override // defpackage.bxof
    public cjtd g() {
        return cjtd.a(dtyc.fI);
    }
}
