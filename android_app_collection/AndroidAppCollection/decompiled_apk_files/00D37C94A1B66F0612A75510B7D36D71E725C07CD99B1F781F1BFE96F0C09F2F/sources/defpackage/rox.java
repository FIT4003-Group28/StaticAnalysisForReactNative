package defpackage;

import android.os.SystemClock;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rox  reason: default package */
/* loaded from: classes4.dex */
public final class rox extends rjv {
    final /* synthetic */ roy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rox(roy royVar, rml rmlVar) {
        super(rmlVar);
        this.b = royVar;
    }

    @Override // defpackage.rjv
    public final void b() {
        roy royVar = this.b;
        royVar.d.n();
        royVar.d.Q();
        royVar.b(false, false, SystemClock.elapsedRealtime());
        riu g = royVar.d.g();
        royVar.d.Q();
        g.e(SystemClock.elapsedRealtime());
    }
}
