package defpackage;

import android.os.Handler;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: pxc  reason: default package */
/* loaded from: classes4.dex */
public final class pxc implements pvq {
    @Override // defpackage.pvq
    public final pwa a(Looper looper, Handler.Callback callback) {
        return new pxe(new Handler(looper, callback));
    }
}
