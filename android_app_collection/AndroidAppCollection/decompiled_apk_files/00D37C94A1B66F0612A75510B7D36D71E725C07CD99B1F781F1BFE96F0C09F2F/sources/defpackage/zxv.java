package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: zxv  reason: default package */
/* loaded from: classes4.dex */
final class zxv extends aljo {
    final /* synthetic */ zxz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zxv(zxz zxzVar, Context context, int i) {
        super(context, i);
        this.a = zxzVar;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        zxy zxyVar = this.a.ak;
        if ((zxyVar == null || !zxyVar.lZ()) && this.a.aq) {
            cancel();
        }
    }
}
