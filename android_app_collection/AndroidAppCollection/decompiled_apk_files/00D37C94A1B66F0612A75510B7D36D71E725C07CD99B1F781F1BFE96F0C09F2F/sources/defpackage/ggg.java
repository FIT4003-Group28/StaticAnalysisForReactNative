package defpackage;

import android.os.Looper;
import android.view.View;
/* compiled from: PG */
/* renamed from: ggg  reason: default package */
/* loaded from: classes3.dex */
public final class ggg implements tct {
    public final akfw a;

    public ggg(akfw akfwVar) {
        this.a = akfwVar;
    }

    @Override // defpackage.tct
    public final aooq a() {
        return auhe.b;
    }

    @Override // defpackage.tct
    public final /* bridge */ /* synthetic */ aynr b(Object obj, tcs tcsVar) {
        final View view;
        final auhe auheVar = (auhe) obj;
        if ((auheVar.c & 1) == 0 || (view = tcsVar.a) == null) {
            return aynr.f();
        }
        View view2 = tcsVar.b;
        if (view2 != null) {
            view = view2;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            view.post(new ggf(this, auheVar, view, 1));
            return aynr.f();
        }
        return aynr.t(new aypv() { // from class: gge
            @Override // defpackage.aypv
            public final void a() {
                ggg gggVar = ggg.this;
                View view3 = view;
                view3.post(new ggf(gggVar, auheVar, view3));
            }
        }).E(aypa.a());
    }

    @Override // defpackage.tct
    public final /* synthetic */ void c() {
    }
}
