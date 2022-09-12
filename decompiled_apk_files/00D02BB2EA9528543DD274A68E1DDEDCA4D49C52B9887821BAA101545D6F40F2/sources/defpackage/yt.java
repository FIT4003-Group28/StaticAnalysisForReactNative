package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: yt  reason: default package */
/* loaded from: classes7.dex */
public final class yt implements Runnable {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ zc b;

    public yt(zc zcVar, ArrayList arrayList) {
        this.b = zcVar;
        this.a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            za zaVar = (za) arrayList.get(i);
            zc zcVar = this.b;
            acl aclVar = zaVar.a;
            View view = null;
            View view2 = aclVar == null ? null : aclVar.a;
            acl aclVar2 = zaVar.b;
            if (aclVar2 != null) {
                view = aclVar2.a;
            }
            if (view2 != null) {
                ViewPropertyAnimator duration = view2.animate().setDuration(zcVar.k);
                zcVar.g.add(zaVar.a);
                duration.translationX(zaVar.e - zaVar.c);
                duration.translationY(zaVar.f - zaVar.d);
                duration.alpha(0.0f).setListener(new yy(zcVar, zaVar, duration, view2)).start();
            }
            if (view != null) {
                ViewPropertyAnimator animate = view.animate();
                zcVar.g.add(zaVar.b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(zcVar.k).alpha(1.0f).setListener(new yz(zcVar, zaVar, animate, view)).start();
            }
        }
        this.a.clear();
        this.b.c.remove(this.a);
    }
}
