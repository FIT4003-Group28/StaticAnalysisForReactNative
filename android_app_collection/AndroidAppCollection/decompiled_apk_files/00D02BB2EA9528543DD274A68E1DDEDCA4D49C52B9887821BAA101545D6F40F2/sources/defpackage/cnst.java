package defpackage;

import com.google.android.gms.common.ConnectionResult;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cnst  reason: default package */
/* loaded from: classes5.dex */
public final class cnst implements Runnable {
    final /* synthetic */ cnsv a;

    public cnst(cnsv cnsvVar) {
        this.a = cnsvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.g.b(new ConnectionResult(4));
    }
}
