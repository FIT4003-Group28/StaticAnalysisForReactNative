package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: eakw  reason: default package */
/* loaded from: classes6.dex */
final class eakw implements eamd {
    final /* synthetic */ boolean a;
    final /* synthetic */ eala b;

    public eakw(eala ealaVar, boolean z) {
        this.b = ealaVar;
        this.a = z;
    }

    @Override // defpackage.eamd
    public final void a() {
        eala ealaVar;
        eala ealaVar2;
        this.b.c.flip();
        eala ealaVar3 = this.b;
        long j = ealaVar3.d;
        if (j == -1 || j - ealaVar3.e >= ealaVar3.c.remaining()) {
            this.b.e += ealaVar.f(ealaVar.c);
            eala ealaVar4 = this.b;
            long j2 = ealaVar4.e;
            long j3 = ealaVar4.d;
            if (j2 < j3 || (j3 == -1 && !this.a)) {
                ealaVar4.c.clear();
                this.b.a.set(0);
                this.b.b(new eakv(this));
                return;
            } else if (j3 == -1) {
                ealaVar4.g();
                return;
            } else if (j3 == j2) {
                ealaVar4.g();
                return;
            } else {
                ealaVar4.e(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(this.b.e), Long.valueOf(this.b.d))));
                return;
            }
        }
        this.b.e(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(this.b.e + ealaVar2.c.remaining()), Long.valueOf(this.b.d))));
    }
}
