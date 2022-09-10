package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: aplg  reason: default package */
/* loaded from: classes2.dex */
public final class aplg implements jkh {
    public static final cqjg a = cqjg.a();
    private final cjmt b;

    public aplg(cjmt cjmtVar) {
        this.b = cjmtVar;
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
        View d;
        View j = jkjVar.j();
        if (j == null || (d = cqkx.d(j, a)) == null) {
            return;
        }
        int g = this.b.g();
        jjn jjnVar2 = jjn.HIDDEN;
        int ordinal = jjnVar.ordinal();
        float f2 = 0.0f;
        if (ordinal == 0 || ordinal == 1) {
            f2 = -g;
        } else if (ordinal == 2) {
            f2 = (f - 1.0f) * g;
        }
        d.setTranslationY(f2);
    }
}
