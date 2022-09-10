package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: bdkp  reason: default package */
/* loaded from: classes3.dex */
final class bdkp extends aag {
    final /* synthetic */ Context a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdkp(Context context) {
        super(0, false);
        this.a = context;
    }

    @Override // defpackage.aag
    protected final int J(aci aciVar) {
        return this.a.getResources().getDisplayMetrics().widthPixels;
    }
}
