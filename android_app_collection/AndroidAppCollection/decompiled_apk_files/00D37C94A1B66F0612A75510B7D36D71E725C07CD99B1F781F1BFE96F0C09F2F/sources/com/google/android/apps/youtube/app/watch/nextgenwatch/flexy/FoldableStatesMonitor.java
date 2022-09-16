package com.google.android.apps.youtube.app.watch.nextgenwatch.flexy;

import android.content.Context;
import android.graphics.Rect;
import com.google.android.apps.youtube.app.watch.nextgenwatch.flexy.FoldableStatesMonitor;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class FoldableStatesMonitor implements f {
    public final nun a;
    private final nus b;
    private final aynx c;
    private final aypf d;

    public FoldableStatesMonitor(Context context, ntt nttVar, aynx aynxVar, nun nunVar) {
        final nus nusVar = new nus(context);
        this.b = nusVar;
        this.a = nunVar;
        this.c = aynx.e(nttVar.b.n(), aynxVar.C(nox.u).n(), new aypx() { // from class: nuq
            @Override // defpackage.aypx
            public final Object a(Object obj, Object obj2) {
                nus nusVar2 = nus.this;
                int intValue = ((Integer) obj).intValue();
                Rect rect = (Rect) obj2;
                return Float.valueOf(intValue > 0 ? ((((Integer) zew.q(nusVar2.a).first).intValue() - rect.left) - rect.right) / intValue : -1.0f);
            }
        }).n().L().aj().sq();
        this.d = new aypf();
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        this.d.c();
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        this.d.d(this.c.aa(new ayqb() { // from class: nur
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                FoldableStatesMonitor foldableStatesMonitor = FoldableStatesMonitor.this;
                float floatValue = ((Float) obj).floatValue();
                if (floatValue >= 0.0f) {
                    foldableStatesMonitor.a.h(new nue(5, floatValue, floatValue));
                } else if (foldableStatesMonitor.a.f(5) == null) {
                } else {
                    foldableStatesMonitor.a.g(0, false);
                }
            }
        }, npy.f));
    }
}
