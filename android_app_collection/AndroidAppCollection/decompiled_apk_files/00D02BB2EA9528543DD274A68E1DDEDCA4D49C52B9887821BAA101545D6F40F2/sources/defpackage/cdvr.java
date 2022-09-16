package defpackage;

import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: cdvr  reason: default package */
/* loaded from: classes4.dex */
public final class cdvr implements ViewTreeObserver.OnGlobalLayoutListener {
    private final /* synthetic */ dzut a;

    public cdvr(dzut dzutVar) {
        this.a = dzutVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final /* synthetic */ void onGlobalLayout() {
        dzvx.b(this.a.a(), "invoke(...)");
    }
}
