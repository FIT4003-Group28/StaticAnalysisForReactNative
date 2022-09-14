package defpackage;

import android.app.Activity;
import android.view.View;
/* compiled from: PG */
/* renamed from: ayez  reason: default package */
/* loaded from: classes3.dex */
public final class ayez implements jkh {
    public final jkf a;
    private final bfkk b;
    private final View c;
    private final Activity d;

    public ayez(Activity activity, jkf jkfVar, bfkk bfkkVar, View view) {
        this.b = bfkkVar;
        this.c = view;
        this.d = activity;
        this.a = jkfVar;
    }

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
    }

    @Override // defpackage.jkh
    public final void M(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void N(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void O() {
    }

    @Override // defpackage.jkh
    public final void P(jkj jkjVar, jjn jjnVar, float f) {
        this.b.Pp((jjnVar == jjn.HIDDEN ? 0.0f : -bfki.g(jkjVar, jjnVar, f)) / ((int) (this.c.getWidth() / bfki.a(this.d.getResources()))));
        this.b.Pr(0.0f);
        this.b.Ps(1.0f);
        this.b.Pq(false);
        cqkx.p(this.b);
    }
}
