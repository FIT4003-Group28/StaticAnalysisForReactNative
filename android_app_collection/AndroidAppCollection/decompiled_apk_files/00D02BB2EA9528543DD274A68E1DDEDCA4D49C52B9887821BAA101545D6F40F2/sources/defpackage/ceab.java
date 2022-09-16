package defpackage;

import com.google.android.apps.gmm.base.mod.components.appbar.ModAppBar;
/* compiled from: PG */
/* renamed from: ceab  reason: default package */
/* loaded from: classes4.dex */
final class ceab<T> implements aa<Boolean> {
    final /* synthetic */ ceae a;

    public ceab(ceae ceaeVar) {
        this.a = ceaeVar;
    }

    @Override // defpackage.aa
    public final /* bridge */ /* synthetic */ void m(Boolean bool) {
        Boolean bool2 = bool;
        ceae ceaeVar = this.a;
        ModAppBar modAppBar = ceaeVar.ai;
        if (modAppBar != null) {
            dzvx.b(bool2, "it");
            ceaeVar.q(modAppBar, bool2.booleanValue());
        }
    }
}
