package defpackage;

import java.io.InputStream;
/* compiled from: PG */
/* renamed from: dynl  reason: default package */
/* loaded from: classes6.dex */
final class dynl implements Runnable {
    final /* synthetic */ InputStream a;
    final /* synthetic */ dynv b;

    public dynl(dynv dynvVar, InputStream inputStream) {
        this.b = dynvVar;
        this.a = inputStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.d.c(this.a);
    }
}
