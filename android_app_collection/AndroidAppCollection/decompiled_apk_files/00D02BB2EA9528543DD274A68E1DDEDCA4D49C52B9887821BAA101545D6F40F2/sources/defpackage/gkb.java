package defpackage;

import com.google.android.apps.gmm.base.layout.MainLayout;
/* compiled from: PG */
/* renamed from: gkb  reason: default package */
/* loaded from: classes.dex */
public final class gkb implements alsp {
    final /* synthetic */ MainLayout a;

    public gkb(MainLayout mainLayout) {
        this.a = mainLayout;
    }

    private final void e() {
        final MainLayout mainLayout = this.a;
        mainLayout.s.execute(new Runnable(mainLayout) { // from class: gka
            private final MainLayout a;

            {
                this.a = mainLayout;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.p();
            }
        });
    }

    @Override // defpackage.alsp
    public final void a() {
        e();
    }

    @Override // defpackage.alsp
    public final void b() {
        e();
    }

    @Override // defpackage.alsp
    public final void c() {
    }

    @Override // defpackage.alsp
    public final void d() {
        e();
    }
}
