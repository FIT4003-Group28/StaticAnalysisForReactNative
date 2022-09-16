package defpackage;

import android.os.Looper;
import android.view.View;
/* compiled from: PG */
/* renamed from: ajjc  reason: default package */
/* loaded from: classes.dex */
public final class ajjc implements tct {
    private final akfc a;
    private final acth b;

    public ajjc(akfc akfcVar, acth acthVar) {
        this.a = akfcVar;
        this.b = acthVar;
    }

    @Override // defpackage.tct
    public final aooq a() {
        return avjb.b;
    }

    @Override // defpackage.tct
    public final /* bridge */ /* synthetic */ aynr b(Object obj, tcs tcsVar) {
        avjb avjbVar = (avjb) obj;
        if ((avjbVar.c & 1) == 0 || tcsVar.a == null) {
            return aynr.f();
        }
        final argj argjVar = avjbVar.d;
        if (argjVar == null) {
            argjVar = argj.a;
        }
        final View view = tcsVar.b;
        if (view == null) {
            view = tcsVar.a;
        }
        if (view == null) {
            return aynr.f();
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            d(argjVar, view);
            return aynr.f();
        }
        return aynr.t(new aypv() { // from class: ajjb
            @Override // defpackage.aypv
            public final void a() {
                ajjc.this.d(argjVar, view);
            }
        }).E(aypa.a());
    }

    @Override // defpackage.tct
    public final /* synthetic */ void c() {
    }

    public final void d(argj argjVar, View view) {
        int i = argjVar.b;
        if ((i & 16) != 0 || (i & 64) != 0) {
            this.a.b(argjVar, view, argjVar, this.b.oi());
        } else {
            this.a.f(argjVar, view, this.b.oi());
        }
    }
}
