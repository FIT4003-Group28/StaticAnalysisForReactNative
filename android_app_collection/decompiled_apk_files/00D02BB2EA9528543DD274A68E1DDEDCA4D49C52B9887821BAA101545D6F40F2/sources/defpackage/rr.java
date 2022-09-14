package defpackage;

import android.content.IntentFilter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rr  reason: default package */
/* loaded from: classes.dex */
public final class rr extends rq {
    public final sd a;
    final /* synthetic */ rv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr(rv rvVar, sd sdVar) {
        super(rvVar);
        this.b = rvVar;
        this.a = sdVar;
    }

    @Override // defpackage.rq
    public final void a() {
        this.b.p();
    }

    @Override // defpackage.rq
    public final IntentFilter b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        return intentFilter;
    }
}
