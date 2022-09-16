package defpackage;

import android.view.ViewTreeObserver;
import com.google.android.libraries.abuse.reporting.ReportAbuseCardConfigParcel;
/* compiled from: PG */
/* renamed from: cplu  reason: default package */
/* loaded from: classes5.dex */
final class cplu implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ ViewTreeObserver a;
    final /* synthetic */ ReportAbuseCardConfigParcel b;
    final /* synthetic */ cplw c;

    public cplu(cplw cplwVar, ViewTreeObserver viewTreeObserver, ReportAbuseCardConfigParcel reportAbuseCardConfigParcel) {
        this.c = cplwVar;
        this.a = viewTreeObserver;
        this.b = reportAbuseCardConfigParcel;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.removeOnGlobalLayoutListener(this);
        if (this.c.f()) {
            this.c.ag.setScrollX(0);
        }
        this.c.w();
        this.c.h(true);
        this.c.i(this.b);
    }
}
