package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bxsb  reason: default package */
/* loaded from: classes4.dex */
public class bxsb implements bxof {
    private final String a;
    private final String b;
    private final cqtd c = cqrt.h(2131232720, iva.b(ibl.H(), ibl.af()));
    private final cjtd d = cjtd.a(dtyb.cj);
    private final dxio<afef> e;

    public bxsb(Context context, dxio<afef> dxioVar) {
        this.a = context.getString(R.string.INCOGNITO_ZERO_SUGGEST_PROMO_CARD_DESCRIPTION);
        this.b = context.getString(R.string.TURN_OFF_INCOGNITO_ZERO_SUGGEST_PROMO_CARD_BUTTON_TITLE);
        this.e = dxioVar;
    }

    @Override // defpackage.bxof
    public CharSequence a() {
        return "";
    }

    @Override // defpackage.bxof
    public CharSequence b() {
        return this.a;
    }

    @Override // defpackage.bxof
    public CharSequence c() {
        return this.b;
    }

    @Override // defpackage.bxof
    public cqtd d() {
        return this.c;
    }

    @Override // defpackage.bxof
    @dzsi
    public CharSequence e() {
        return null;
    }

    @Override // defpackage.bxof
    public cqkl f(cjqm cjqmVar) {
        this.e.a().e(false);
        return cqkl.a;
    }

    @Override // defpackage.bxof
    public cjtd g() {
        return this.d;
    }
}
