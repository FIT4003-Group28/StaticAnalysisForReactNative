package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: bbzb  reason: default package */
/* loaded from: classes3.dex */
final class bbzb implements Runnable {
    final /* synthetic */ byte[] a;
    final /* synthetic */ bbzc b;

    public bbzb(bbzc bbzcVar, byte[] bArr) {
        this.b = bbzcVar;
        this.a = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Uri a = this.b.a.a();
        bbzc bbzcVar = this.b;
        bbzd bbzdVar = bbzcVar.c;
        new bbwh(bbzdVar.e, this.a, a, bbzdVar.h, bbzcVar.b).run();
    }
}
