package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: eale  reason: default package */
/* loaded from: classes6.dex */
final class eale implements Runnable {
    final /* synthetic */ ByteBuffer a;
    final /* synthetic */ eamc b;

    public eale(eamc eamcVar, ByteBuffer byteBuffer) {
        this.b = eamcVar;
        this.a = byteBuffer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eamc eamcVar = this.b;
        eamcVar.b.execute(eamcVar.j(new eald(this)));
    }
}
