package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bnn  reason: default package */
/* loaded from: classes2.dex */
public final class bnn implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    final bnk a;
    final ViewGroup b;

    public bnn(bnk bnkVar, ViewGroup viewGroup) {
        this.a = bnkVar;
        this.b = viewGroup;
    }

    private final void a() {
        this.b.getViewTreeObserver().removeOnPreDrawListener(this);
        this.b.removeOnAttachStateChangeListener(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01d6 A[EDGE_INSN: B:133:0x01d6->B:88:0x01d6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fc  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnn.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
        bno.a.remove(this.b);
        ArrayList arrayList = (ArrayList) bno.a().get(this.b);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((bnk) arrayList.get(i)).s(this.b);
            }
        }
        this.a.n(true);
    }
}
