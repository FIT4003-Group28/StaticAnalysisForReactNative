package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: xfe  reason: default package */
/* loaded from: classes4.dex */
final class xfe implements Runnable {
    final /* synthetic */ Uri a;
    final /* synthetic */ xff b;

    public xfe(xff xffVar, Uri uri) {
        this.b = xffVar;
        this.a = uri;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b(this.a);
    }
}
