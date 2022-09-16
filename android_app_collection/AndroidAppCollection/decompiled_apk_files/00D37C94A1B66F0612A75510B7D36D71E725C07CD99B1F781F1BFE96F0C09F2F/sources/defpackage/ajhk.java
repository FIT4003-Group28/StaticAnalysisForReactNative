package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ajhk  reason: default package */
/* loaded from: classes.dex */
public final class ajhk implements ajru {
    private final ajhl a;

    public ajhk(ajhl ajhlVar) {
        this.a = ajhlVar;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a.a();
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        ajhh ajhhVar = (ajhh) obj;
        ajhl ajhlVar = this.a;
        ajhlVar.a = ajhhVar;
        ajhlVar.e(ajrsVar, ajhhVar, ajhhVar.b().c);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.a.qZ(ajsaVar);
    }
}
