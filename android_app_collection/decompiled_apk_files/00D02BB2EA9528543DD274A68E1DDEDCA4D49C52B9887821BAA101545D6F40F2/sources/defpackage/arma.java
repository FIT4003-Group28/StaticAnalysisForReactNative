package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: arma  reason: default package */
/* loaded from: classes2.dex */
public class arma extends bznp implements arlz {
    private final Context a;
    private final cqvf b;

    public arma(Context context, @dzsi jdi jdiVar, cqvf cqvfVar, cqvf cqvfVar2) {
        super(jdiVar, cqvfVar2);
        this.a = context;
        this.b = cqvfVar;
    }

    @Override // defpackage.arlz
    public cqvf a() {
        return this.b;
    }

    @Override // defpackage.arlz
    public jic b() {
        return doj.OTHER_MODE_TOOLTIP_PROMO_IMAGE.b(this.a.getResources().getDisplayMetrics());
    }
}
