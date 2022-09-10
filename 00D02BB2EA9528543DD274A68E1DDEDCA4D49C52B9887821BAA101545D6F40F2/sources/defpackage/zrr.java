package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
/* compiled from: PG */
/* renamed from: zrr  reason: default package */
/* loaded from: classes7.dex */
final class zrr implements cqkn<zcv> {
    private final String a;

    public zrr(String str) {
        this.a = str;
    }

    @Override // defpackage.cqkn
    public final /* bridge */ /* synthetic */ void a(zcv zcvVar, View view) {
        Context context = view.getContext();
        if (context instanceof gga) {
            afha wc = ((afgz) btsq.b(afgz.class, (gga) context)).wc();
            dbsk.s(wc);
            wc.k(context, this.a, 4);
        } else if (!(context instanceof Activity)) {
        } else {
            dbsk.l(false);
            btme.a(context).b(this.a);
        }
    }
}
