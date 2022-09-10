package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: eakz  reason: default package */
/* loaded from: classes6.dex */
final class eakz implements eamd {
    final /* synthetic */ boolean a;
    final /* synthetic */ eala b;

    public eakz(eala ealaVar, boolean z) {
        this.b = ealaVar;
        this.a = z;
    }

    @Override // defpackage.eamd
    public final void a() {
        eala ealaVar = this.b;
        ealaVar.d = ealaVar.b.getLength();
        eala ealaVar2 = this.b;
        long j = ealaVar2.d;
        if (j == 0) {
            ealaVar2.g();
            return;
        }
        if (j <= 0 || j >= 8192) {
            ealaVar2.c = ByteBuffer.allocateDirect(8192);
        } else {
            ealaVar2.c = ByteBuffer.allocateDirect(((int) j) + 1);
        }
        eala ealaVar3 = this.b;
        long j2 = ealaVar3.d;
        if (j2 > 0 && j2 <= 2147483647L) {
            ((ealz) ealaVar3).f.setFixedLengthStreamingMode((int) j2);
        } else if (j2 <= 2147483647L) {
            ((ealz) ealaVar3).f.setChunkedStreamingMode(8192);
        } else {
            ((ealz) ealaVar3).f.setFixedLengthStreamingMode(j2);
        }
        if (this.a) {
            this.b.a();
            return;
        }
        this.b.a.set(1);
        eala ealaVar4 = this.b;
        ealaVar4.b.rewind(ealaVar4);
    }
}
