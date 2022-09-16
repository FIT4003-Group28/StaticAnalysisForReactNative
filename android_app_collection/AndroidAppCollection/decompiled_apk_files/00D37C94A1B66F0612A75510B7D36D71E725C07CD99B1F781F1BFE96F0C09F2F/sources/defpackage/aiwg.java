package defpackage;

import android.view.accessibility.CaptioningManager;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: aiwg  reason: default package */
/* loaded from: classes.dex */
public final class aiwg implements abea {
    private final ankt a;
    private final aitm b;

    public aiwg(ankt anktVar, aitm aitmVar) {
        anktVar.getClass();
        this.a = anktVar;
        aitmVar.getClass();
        this.b = aitmVar;
    }

    @Override // defpackage.abea
    public final void nq(abed abedVar) {
        CaptioningManager captioningManager = null;
        if (this.a.isDone()) {
            try {
                ampq ampqVar = (ampq) anlz.y(this.a);
                if (ampqVar.h()) {
                    captioningManager = (CaptioningManager) ampqVar.c();
                }
            } catch (ExecutionException e) {
                zep.d("Exception getting CaptioningManager", e);
            }
        }
        abedVar.B = aiwb.k(this.b, captioningManager);
    }
}
