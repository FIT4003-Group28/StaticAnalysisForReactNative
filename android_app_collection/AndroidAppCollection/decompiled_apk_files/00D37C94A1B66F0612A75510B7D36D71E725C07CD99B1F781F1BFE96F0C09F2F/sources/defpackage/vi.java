package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: vi  reason: default package */
/* loaded from: classes4.dex */
final class vi implements Runnable {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ vq b;
    private final /* synthetic */ int c;

    public vi(vq vqVar, ArrayList arrayList) {
        this.b = vqVar;
        this.a = arrayList;
    }

    public vi(vq vqVar, ArrayList arrayList, int i) {
        this.c = i;
        this.b = vqVar;
        this.a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        int i2 = 0;
        if (i == 0) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            while (i2 < size) {
                vo voVar = (vo) arrayList.get(i2);
                vq vqVar = this.b;
                yo yoVar = voVar.a;
                View view = null;
                View view2 = yoVar == null ? null : yoVar.a;
                yo yoVar2 = voVar.b;
                if (yoVar2 != null) {
                    view = yoVar2.a;
                }
                if (view2 != null) {
                    ViewPropertyAnimator duration = view2.animate().setDuration(250L);
                    vqVar.g.add(voVar.a);
                    duration.translationX(voVar.e - voVar.c);
                    duration.translationY(voVar.f - voVar.d);
                    duration.alpha(0.0f).setListener(new vm(vqVar, voVar, duration, view2)).start();
                }
                if (view != null) {
                    ViewPropertyAnimator animate = view.animate();
                    vqVar.g.add(voVar.b);
                    animate.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new vn(vqVar, voVar, animate, view)).start();
                }
                i2++;
            }
            this.a.clear();
            this.b.c.remove(this.a);
        } else if (i == 1) {
            ArrayList arrayList2 = this.a;
            int size2 = arrayList2.size();
            while (i2 < size2) {
                vp vpVar = (vp) arrayList2.get(i2);
                vq vqVar2 = this.b;
                yo yoVar3 = vpVar.a;
                int i3 = vpVar.b;
                int i4 = vpVar.c;
                int i5 = vpVar.d;
                int i6 = vpVar.e;
                View view3 = yoVar3.a;
                int i7 = i5 - i3;
                int i8 = i6 - i4;
                if (i7 != 0) {
                    view3.animate().translationX(0.0f);
                }
                if (i8 != 0) {
                    view3.animate().translationY(0.0f);
                }
                ViewPropertyAnimator animate2 = view3.animate();
                vqVar2.e.add(yoVar3);
                animate2.setDuration(vqVar2.i).setListener(new vl(vqVar2, yoVar3, i7, view3, i8, animate2)).start();
                i2++;
            }
            this.a.clear();
            this.b.b.remove(this.a);
        } else {
            ArrayList arrayList3 = this.a;
            int size3 = arrayList3.size();
            while (i2 < size3) {
                yo yoVar4 = (yo) arrayList3.get(i2);
                vq vqVar3 = this.b;
                View view4 = yoVar4.a;
                ViewPropertyAnimator animate3 = view4.animate();
                vqVar3.d.add(yoVar4);
                animate3.alpha(1.0f).setDuration(vqVar3.h).setListener(new vk(vqVar3, yoVar4, view4, animate3)).start();
                i2++;
            }
            this.a.clear();
            this.b.a.remove(this.a);
        }
    }
}
