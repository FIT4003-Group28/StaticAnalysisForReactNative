package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: bbyx  reason: default package */
/* loaded from: classes3.dex */
final class bbyx implements Runnable {
    final /* synthetic */ Uri a;
    final /* synthetic */ bbyy b;

    public bbyx(bbyy bbyyVar, Uri uri) {
        this.b = bbyyVar;
        this.a = uri;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.getContentResolver().delete(this.a, null, null);
        this.b.e.b(this.a);
    }
}
