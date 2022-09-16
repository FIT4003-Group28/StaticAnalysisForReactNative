package defpackage;

import android.view.View;
import java.util.Observable;
import java.util.Observer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lrs  reason: default package */
/* loaded from: classes3.dex */
public final class lrs implements Observer {
    final /* synthetic */ lrt a;

    public lrs(lrt lrtVar) {
        this.a = lrtVar;
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (!this.a.b.equals(observable) || !(obj instanceof awaj)) {
            return;
        }
        lrt lrtVar = this.a;
        dt dtVar = lrtVar.a;
        final ngi ngiVar = (ngi) lrtVar.c.get();
        final acti actiVar = this.a.e;
        ylx.n(dtVar, ylx.b(ngiVar.a, anii.h(ngiVar.d.b.a(), fcq.a, anjk.a), new ampg() { // from class: ngf
            @Override // defpackage.ampg
            public final Object apply(Object obj2) {
                argj j;
                ngi ngiVar2 = ngi.this;
                acti actiVar2 = actiVar;
                if (((Boolean) obj2).booleanValue()) {
                    return false;
                }
                for (ngh nghVar : ngiVar2.c) {
                    View h = nghVar.h();
                    if (h != null && h.isShown() && (j = nghVar.j()) != null) {
                        ngg nggVar = new ngg(ngiVar2);
                        ngiVar2.b.c(j, h, j, actiVar2, nggVar);
                        if (nggVar.a) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }), new lrr(this, obj), new lrr(this, obj, 1));
    }
}
