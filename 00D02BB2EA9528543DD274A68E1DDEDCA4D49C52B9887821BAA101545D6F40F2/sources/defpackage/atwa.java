package defpackage;

import android.content.Context;
import android.view.View;
/* compiled from: PG */
/* renamed from: atwa  reason: default package */
/* loaded from: classes2.dex */
final class atwa implements cqfc {
    private static final dcqe a = dcqe.c("atwa");
    private final Context b;

    public atwa(Context context) {
        this.b = context;
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        View a2 = cqhu.a(view, atrf.c);
        if (a2 == null) {
            bvoo.h("TextView not found. Cannot perform animation.", new Object[0]);
            return;
        }
        View a3 = cqhu.a(view, atrf.b);
        if (a3 == null) {
            bvoo.h("IconView not found. Cannot perform animation.", new Object[0]);
            return;
        }
        int i = 1;
        if (true != bvox.b(this.b)) {
            i = -1;
        }
        a2.setTranslationX(((a3.getWidth() / 2) + atrf.i.NR(this.b)) * i);
    }
}
