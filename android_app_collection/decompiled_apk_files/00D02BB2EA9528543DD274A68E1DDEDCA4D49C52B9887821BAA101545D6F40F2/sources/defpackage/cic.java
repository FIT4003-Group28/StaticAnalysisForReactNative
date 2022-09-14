package defpackage;

import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cic  reason: default package */
/* loaded from: classes4.dex */
public final class cic implements ViewTreeObserver.OnPreDrawListener {
    private final WeakReference<cid> a;

    public cic(cid cidVar) {
        this.a = new WeakReference<>(cidVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        cid cidVar = this.a.get();
        if (cidVar == null || cidVar.c.isEmpty()) {
            return true;
        }
        int c = cidVar.c();
        int b = cidVar.b();
        if (!cid.d(c, b)) {
            return true;
        }
        ArrayList arrayList = new ArrayList(cidVar.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((cii) arrayList.get(i)).j(c, b);
        }
        cidVar.a();
        return true;
    }
}
