package defpackage;

import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cua  reason: default package */
/* loaded from: classes3.dex */
public final class cua implements ViewTreeObserver.OnPreDrawListener {
    private final WeakReference a;
    private final /* synthetic */ int b;

    public cua(cts ctsVar, int i) {
        this.b = i;
        this.a = new WeakReference(ctsVar);
    }

    public cua(cub cubVar) {
        this.a = new WeakReference(cubVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = 0;
        if (this.b == 0) {
            cub cubVar = (cub) this.a.get();
            if (cubVar != null && !cubVar.c.isEmpty()) {
                int b = cubVar.b();
                int a = cubVar.a();
                if (cub.d(b, a)) {
                    ArrayList arrayList = new ArrayList(cubVar.c);
                    int size = arrayList.size();
                    while (i < size) {
                        ((cty) arrayList.get(i)).g(b, a);
                        i++;
                    }
                    cubVar.c();
                }
            }
            return true;
        }
        cts ctsVar = (cts) this.a.get();
        if (ctsVar != null && !ctsVar.c.isEmpty()) {
            int b2 = ctsVar.b();
            int a2 = ctsVar.a();
            if (cts.d(b2, a2)) {
                ArrayList arrayList2 = new ArrayList(ctsVar.c);
                int size2 = arrayList2.size();
                while (i < size2) {
                    ((cty) arrayList2.get(i)).g(b2, a2);
                    i++;
                }
                ctsVar.c();
            }
        }
        return true;
    }
}
