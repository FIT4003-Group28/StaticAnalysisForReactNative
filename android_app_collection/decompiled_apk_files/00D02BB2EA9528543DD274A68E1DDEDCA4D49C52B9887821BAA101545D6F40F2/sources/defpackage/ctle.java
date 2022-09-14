package defpackage;

import android.database.ContentObserver;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: ctle  reason: default package */
/* loaded from: classes5.dex */
final class ctle extends ContentObserver {
    final /* synthetic */ ctlf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctle(ctlf ctlfVar) {
        super(ctlfVar.q.f);
        this.a = ctlfVar;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        cstq.b(Looper.getMainLooper() == Looper.myLooper(), "checkMainThread failed");
        this.a.p();
    }
}
