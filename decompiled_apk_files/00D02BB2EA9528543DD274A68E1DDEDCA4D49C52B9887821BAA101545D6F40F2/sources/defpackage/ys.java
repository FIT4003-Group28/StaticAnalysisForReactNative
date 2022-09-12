package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ys  reason: default package */
/* loaded from: classes7.dex */
public final class ys implements Runnable {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ zc b;

    public ys(zc zcVar, ArrayList arrayList) {
        this.b = zcVar;
        this.a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zb zbVar = (zb) arrayList.get(i);
            zc zcVar = this.b;
            acl aclVar = zbVar.a;
            int i2 = zbVar.b;
            int i3 = zbVar.c;
            int i4 = zbVar.d;
            int i5 = zbVar.e;
            View view = aclVar.a;
            int i6 = i4 - i2;
            int i7 = i5 - i3;
            if (i6 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i7 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator animate = view.animate();
            zcVar.e.add(aclVar);
            animate.setDuration(zcVar.j).setListener(new yx(zcVar, aclVar, i6, view, i7, animate)).start();
        }
        this.a.clear();
        this.b.b.remove(this.a);
    }
}
