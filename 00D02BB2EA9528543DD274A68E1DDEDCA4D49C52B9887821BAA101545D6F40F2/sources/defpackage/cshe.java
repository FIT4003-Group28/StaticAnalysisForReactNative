package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cshe  reason: default package */
/* loaded from: classes5.dex */
public final class cshe extends csgp<cshe> {
    final /* synthetic */ cshf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cshe(cshf cshfVar, csgs csgsVar, cshu<csgt> cshuVar) {
        super(csgsVar, cshuVar);
        this.a = cshfVar;
    }

    @Override // defpackage.csgp
    protected final /* bridge */ /* synthetic */ void a() {
        czhz.b();
    }

    public final void d(View view) {
        czhz.b();
        csgt c = c();
        csgt a = cshd.a(view);
        if (a != null) {
            if (a.d()) {
                if (a.e()) {
                    new IllegalStateException("CVE is already impressed and cannot be replaced.");
                    cshu.d();
                    return;
                }
                new IllegalStateException("CVE is already attached and cannot be replaced.");
                cshu.d();
                return;
            }
            a.c(c);
            return;
        }
        cshd cshdVar = new cshd(view, c);
        c.c = cshdVar;
        cshdVar.e();
    }
}
