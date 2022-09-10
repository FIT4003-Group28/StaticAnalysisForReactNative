package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fg  reason: default package */
/* loaded from: classes.dex */
public final class fg implements akp {
    final /* synthetic */ fd a;

    public fg(fd fdVar) {
        this.a = fdVar;
    }

    @Override // defpackage.akp
    public final void a() {
        if (this.a.ay() != null) {
            View ay = this.a.ay();
            this.a.az(null);
            ay.clearAnimation();
        }
        this.a.aA(null);
    }
}
