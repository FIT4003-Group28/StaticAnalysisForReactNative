package defpackage;

import java.io.InputStream;
/* compiled from: PG */
/* renamed from: aygb  reason: default package */
/* loaded from: classes2.dex */
final class aygb implements Runnable {
    final /* synthetic */ InputStream a;
    final /* synthetic */ aygi b;

    public aygb(aygi aygiVar, InputStream inputStream) {
        this.b = aygiVar;
        this.a = inputStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.e.n(this.a);
    }
}
