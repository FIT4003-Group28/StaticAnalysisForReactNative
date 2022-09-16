package defpackage;

import android.os.Build;
/* compiled from: PG */
/* renamed from: ashu  reason: default package */
/* loaded from: classes.dex */
final class ashu implements crzp<btvo> {
    final /* synthetic */ ashy a;

    public ashu(ashy ashyVar) {
        this.a = ashyVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<btvo> crzmVar) {
        if (Build.VERSION.SDK_INT < 28 || !this.a.d.a().getAssistantParameters().b) {
            return;
        }
        this.a.m();
    }
}
