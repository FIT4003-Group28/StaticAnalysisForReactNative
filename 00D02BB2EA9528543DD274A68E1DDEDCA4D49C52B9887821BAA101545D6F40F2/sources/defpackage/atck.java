package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: atck  reason: default package */
/* loaded from: classes2.dex */
public final class atck implements atcj {
    private final cqkj a;
    private final atcl b;
    @dzsi
    private cqkf<atna> c;

    public atck(cqkj cqkjVar, atcl atclVar) {
        this.a = cqkjVar;
        this.b = atclVar;
    }

    @Override // defpackage.atcj
    public final View a() {
        if (this.c == null) {
            this.c = this.a.c(this.b.a(), null);
        }
        return this.c.c();
    }

    @Override // defpackage.atcj
    public final void c(atmi atmiVar) {
        cqkf<atna> cqkfVar = this.c;
        if (cqkfVar != null) {
            cqkfVar.e(atmiVar);
        }
    }

    @Override // defpackage.atcj
    public final void d() {
        cqkf<atna> cqkfVar = this.c;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
    }
}
