package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayq  reason: default package */
/* loaded from: classes3.dex */
public final class ayq implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    final ayn a;
    final ViewGroup b;

    public ayq(ayn aynVar, ViewGroup viewGroup) {
        this.a = aynVar;
        this.b = viewGroup;
    }

    private final void a() {
        this.b.getViewTreeObserver().removeOnPreDrawListener(this);
        this.b.removeOnAttachStateChangeListener(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01d7 A[EDGE_INSN: B:133:0x01d7->B:88:0x01d7 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0282 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fd  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayq.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
        ayr.a.remove(this.b);
        ArrayList<ayn> arrayList = ayr.a().get(this.b);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList.get(i).p(this.b);
            }
        }
        this.a.l(true);
    }
}
