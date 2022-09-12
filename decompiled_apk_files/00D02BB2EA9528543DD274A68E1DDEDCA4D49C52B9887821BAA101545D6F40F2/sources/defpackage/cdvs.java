package defpackage;

import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: cdvs  reason: default package */
/* loaded from: classes4.dex */
public final class cdvs implements ViewTreeObserver.OnGlobalLayoutListener {
    private final /* synthetic */ dzut a;

    public cdvs(dzut dzutVar) {
        this.a = dzutVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final /* synthetic */ void onGlobalLayout() {
        dzvx.b(this.a.a(), "invoke(...)");
    }
}
