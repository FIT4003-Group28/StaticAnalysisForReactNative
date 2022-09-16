package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: bafn  reason: default package */
/* loaded from: classes2.dex */
final class bafn implements Runnable {
    final /* synthetic */ ByteBuffer a;
    final /* synthetic */ bagd b;

    public bafn(bagd bagdVar, ByteBuffer byteBuffer) {
        this.b = bagdVar;
        this.a = byteBuffer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bagd bagdVar = this.b;
        bagdVar.c.execute(bagdVar.b(new bafm(this)));
    }
}
