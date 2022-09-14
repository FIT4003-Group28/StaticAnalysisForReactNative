package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: vno  reason: default package */
/* loaded from: classes7.dex */
public final class vno {
    private final cjmt a;
    private final cqjg b;

    public vno(cjmt cjmtVar, cqjg cqjgVar) {
        this.a = cjmtVar;
        this.b = cqjgVar;
    }

    public final void a(jkj jkjVar, jjn jjnVar, float f) {
        final float f2;
        int g = this.a.g();
        if (jjnVar == jjn.FULLY_EXPANDED) {
            f2 = 0.0f;
        } else if (jkjVar.D(jjnVar) == jjn.FULLY_EXPANDED) {
            f2 = g * (f - 1.0f);
        } else {
            f2 = -g;
        }
        View j = jkjVar.j();
        if (j == null) {
            return;
        }
        cqhu.d(j, this.b, new dbrn(f2) { // from class: vnm
            private final float a;

            {
                this.a = f2;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                float f3 = this.a;
                View view = (View) obj;
                if (view != null) {
                    view.setTranslationY(f3);
                    return null;
                }
                return null;
            }
        });
    }
}
