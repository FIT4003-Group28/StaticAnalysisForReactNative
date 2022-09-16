package defpackage;

import android.content.Context;
import android.view.View;
/* compiled from: PG */
/* renamed from: msw  reason: default package */
/* loaded from: classes3.dex */
public final class msw implements ajru {
    public final msy a;

    public msw(Context context, ajmy ajmyVar, aafo aafoVar, ajxz ajxzVar, jkv jkvVar, snc sncVar, int i) {
        this.a = new msy(context, ajmyVar, View.inflate(context, i, null), aafoVar, ajxzVar, sncVar, jkvVar);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a.i;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        this.a.oK(ajrsVar, ((msv) obj).a);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.a.qZ(ajsaVar);
    }
}
