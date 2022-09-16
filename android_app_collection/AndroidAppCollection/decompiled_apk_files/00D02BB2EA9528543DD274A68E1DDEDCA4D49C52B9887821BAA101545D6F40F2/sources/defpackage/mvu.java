package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: mvu  reason: default package */
/* loaded from: classes7.dex */
public final class mvu implements kqp {
    private final cmg a;

    public mvu(cmg cmgVar) {
        this.a = cmgVar;
    }

    @Override // defpackage.kqp
    public final void a(View view) {
        dbsk.m(view instanceof cnfn, "EditText view in KeyboardSearchOverlay is not CarEditable for projected mode.");
        this.a.b((cnfn) view);
    }

    @Override // defpackage.kqp
    public final boolean b() {
        return this.a.a();
    }

    @Override // defpackage.kqp
    public final void c() {
        this.a.c();
    }
}
