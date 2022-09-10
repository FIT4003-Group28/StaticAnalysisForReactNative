package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: atci  reason: default package */
/* loaded from: classes2.dex */
public final class atci implements atcj {
    public final cqkf<atna> a;

    public atci(cqkj cqkjVar) {
        this.a = cqkjVar.e(new atle());
    }

    @Override // defpackage.atcj
    public final View a() {
        return this.a.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b() {
        View findViewById = this.a.c().findViewById(atle.a);
        dbsk.s(findViewById);
        return findViewById.getMeasuredHeight();
    }

    @Override // defpackage.atcj
    public final void c(atmi atmiVar) {
        this.a.e(atmiVar);
    }

    @Override // defpackage.atcj
    public final void d() {
        throw null;
    }
}
