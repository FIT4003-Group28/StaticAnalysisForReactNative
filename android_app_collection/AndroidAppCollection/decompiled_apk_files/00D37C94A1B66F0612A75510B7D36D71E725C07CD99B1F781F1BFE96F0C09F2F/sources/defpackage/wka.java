package defpackage;

import android.app.Application;
import android.view.View;
import com.google.android.libraries.lidar.VisibilityChangeEventData;
/* compiled from: PG */
/* renamed from: wka  reason: default package */
/* loaded from: classes4.dex */
public final class wka {
    public final tjx a;
    public wjz b;

    public wka(tjp tjpVar, View view, tjq tjqVar) {
        tjpVar.getClass();
        this.a = new tjx(tjpVar, view, new wjx(this), tjqVar);
    }

    public final tjt a() {
        return this.a.a(tla.ABANDON);
    }

    public final tjt b() {
        return this.a.a(tla.COMPLETE);
    }

    public final tjt c() {
        return this.a.a(tla.EXIT_FULLSCREEN);
    }

    public final tjt d() {
        return this.a.a(tla.FULLSCREEN);
    }

    public final tjt e() {
        return this.a.a(tla.START);
    }

    public final tjt f() {
        return this.a.a(tla.PAUSE);
    }

    public final tjt g() {
        return this.a.a(tla.RESUME);
    }

    public final tjt h(int i) {
        if (i != 1) {
            if (i == 2) {
                return this.a.a(tla.MIDPOINT);
            }
            if (i == 3) {
                return this.a.a(tla.THIRD_QUARTILE);
            }
            return null;
        }
        return this.a.a(tla.FIRST_QUARTILE);
    }

    public final tjt i() {
        return this.a.a(tla.SKIP);
    }

    public final void j() {
        this.a.a.g = null;
    }

    public final void k() {
        Application a;
        tjx tjxVar = this.a;
        tjxVar.b.b();
        tjp tjpVar = tjxVar.c;
        if (tjpVar == null || (a = tjpVar.a()) == null) {
            return;
        }
        a.unregisterActivityLifecycleCallbacks(tjxVar);
    }

    public final void l(VisibilityChangeEventData visibilityChangeEventData) {
        tkj tkjVar = this.a.b;
        if (tkjVar instanceof tlb) {
            tlb tlbVar = (tlb) tkjVar;
            tky tkyVar = tlbVar.a;
            tkyVar.l = false;
            tkyVar.b = System.currentTimeMillis();
            tky tkyVar2 = tlbVar.a;
            tkyVar2.a = visibilityChangeEventData.c;
            tlb.c(tkyVar2, visibilityChangeEventData, null);
            tlbVar.a.l();
            tlbVar.a.m();
        }
    }

    public final void m() {
        this.a.a(tla.SUSPEND);
    }

    public final void n(int i, int i2, int i3, int i4) {
        this.a.a.e(i, i2, i3, i4);
    }

    public wka(tjq tjqVar) {
        this.a = new tjx(new wjx(this), tjqVar);
    }
}
