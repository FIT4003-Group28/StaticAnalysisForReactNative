package defpackage;

import com.google.android.gms.common.ConnectionResult;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qvp  reason: default package */
/* loaded from: classes4.dex */
public final class qvp implements Runnable {
    final /* synthetic */ qvr a;

    public qvp(qvr qvrVar) {
        this.a = qvrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.f.b(new ConnectionResult(4));
    }
}
