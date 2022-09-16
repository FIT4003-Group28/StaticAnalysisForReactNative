package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: abnt  reason: default package */
/* loaded from: classes.dex */
public final class abnt extends abne {
    private final ajnj j;

    public abnt(Context context, acth acthVar, aafo aafoVar, ajmr ajmrVar) {
        super(context, acthVar, aafoVar);
        this.j = new ajnj(ajmrVar, this.c);
    }

    @Override // defpackage.abnb
    protected final void d(avhn avhnVar) {
        this.j.k(avhnVar);
    }

    @Override // defpackage.abnb
    protected final boolean p() {
        return true;
    }

    @Override // defpackage.abnb, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        super.qZ(ajsaVar);
        this.j.a();
    }
}
