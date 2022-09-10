package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: yu  reason: default package */
/* loaded from: classes7.dex */
public final class yu implements Runnable {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ zc b;

    public yu(zc zcVar, ArrayList arrayList) {
        this.b = zcVar;
        this.a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            acl aclVar = (acl) arrayList.get(i);
            zc zcVar = this.b;
            View view = aclVar.a;
            ViewPropertyAnimator animate = view.animate();
            zcVar.d.add(aclVar);
            animate.alpha(1.0f).setDuration(zcVar.h).setListener(new yw(zcVar, aclVar, view, animate)).start();
        }
        this.a.clear();
        this.b.a.remove(this.a);
    }
}
