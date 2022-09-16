package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: abnr  reason: default package */
/* loaded from: classes.dex */
public final class abnr extends abnc {
    private final ajnj j;

    public abnr(Context context, acth acthVar, aafo aafoVar, ajmr ajmrVar) {
        super(context, acthVar, aafoVar, ajmrVar);
        this.j = new ajnj(ajmrVar, this.c);
    }

    @Override // defpackage.abnb
    public final void d(avhn avhnVar) {
        this.j.k(avhnVar);
    }

    @Override // defpackage.abnb
    protected final boolean p() {
        return true;
    }

    @Override // defpackage.abnc, defpackage.abnb, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        super.qZ(ajsaVar);
        this.j.a();
    }
}
