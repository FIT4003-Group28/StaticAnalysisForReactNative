package defpackage;

import com.google.android.apps.gmm.base.layout.MainLayout;
/* compiled from: PG */
/* renamed from: gjn  reason: default package */
/* loaded from: classes6.dex */
public final class gjn implements degu<jbq> {
    final /* synthetic */ MainLayout a;

    public gjn(MainLayout mainLayout) {
        this.a = mainLayout;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(jbq jbqVar) {
        jbq jbqVar2 = jbqVar;
        MainLayout mainLayout = this.a;
        if (mainLayout.aH == null) {
            mainLayout.aH = mainLayout.k.a(new hfy(), this.a.Q.b);
        }
        this.a.aH.e(jbqVar2);
    }
}
