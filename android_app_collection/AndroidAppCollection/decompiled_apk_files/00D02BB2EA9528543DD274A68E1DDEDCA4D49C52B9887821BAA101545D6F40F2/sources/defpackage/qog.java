package defpackage;

import android.graphics.Rect;
import android.view.View;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qog  reason: default package */
/* loaded from: classes7.dex */
public final class qog implements cqfd {
    final /* synthetic */ qoj a;
    private final Rect b = new Rect();
    private boolean c = false;

    public qog(qoj qojVar) {
        this.a = qojVar;
    }

    @Override // defpackage.cqfd
    public final synchronized boolean a(View view) {
        if (!this.c && view.getGlobalVisibleRect(this.b)) {
            this.c = true;
            qoj qojVar = this.a;
            if (qojVar.f().booleanValue() && !qojVar.g().booleanValue()) {
                int i = qojVar.A;
                int min = Math.min(qojVar.k + i, qojVar.l);
                qojVar.A = min;
                if (min > i) {
                    qojVar.D(true);
                    cqkx.p(qojVar);
                    if (qojVar.g().booleanValue()) {
                        qojVar.S(qojVar.b.getString(R.string.ACCESSIBILITY_LOADING_MORE_DEPARTURES));
                    }
                }
            }
            return true;
        }
        return true;
    }
}
