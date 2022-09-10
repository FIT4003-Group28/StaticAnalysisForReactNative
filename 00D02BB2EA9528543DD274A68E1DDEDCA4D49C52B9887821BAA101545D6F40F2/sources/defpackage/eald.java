package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
/* compiled from: PG */
/* renamed from: eald  reason: default package */
/* loaded from: classes6.dex */
final class eald implements eamd {
    final /* synthetic */ eale a;

    public eald(eale ealeVar) {
        this.a = ealeVar;
    }

    @Override // defpackage.eamd
    public final void a() {
        eale ealeVar = this.a;
        ReadableByteChannel readableByteChannel = ealeVar.b.m;
        int read = readableByteChannel == null ? -1 : readableByteChannel.read(ealeVar.a);
        eale ealeVar2 = this.a;
        eamc eamcVar = ealeVar2.b;
        ByteBuffer byteBuffer = ealeVar2.a;
        if (read != -1) {
            ealy ealyVar = eamcVar.a;
            ealyVar.a(new ealu(ealyVar, eamcVar.n, byteBuffer));
            return;
        }
        ReadableByteChannel readableByteChannel2 = eamcVar.m;
        if (readableByteChannel2 != null) {
            readableByteChannel2.close();
        }
        if (!eamcVar.f.compareAndSet(5, 7)) {
            return;
        }
        eamcVar.l();
        ealy ealyVar2 = eamcVar.a;
        ealyVar2.b.execute(new ealw(ealyVar2, eamcVar.n));
    }
}
