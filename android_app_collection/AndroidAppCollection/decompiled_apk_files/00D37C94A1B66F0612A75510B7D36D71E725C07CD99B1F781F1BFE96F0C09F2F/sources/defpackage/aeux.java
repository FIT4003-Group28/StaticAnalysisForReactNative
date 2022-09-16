package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: aeux  reason: default package */
/* loaded from: classes.dex */
final class aeux extends ovd {
    final /* synthetic */ aeva a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeux(aeva aevaVar, oxq oxqVar) {
        super(oxqVar);
        this.a = aevaVar;
    }

    @Override // defpackage.ovd, defpackage.oyf
    public final void g(final long j, int i, int i2, int i3, byte[] bArr) {
        Long l;
        final aeva aevaVar = this.a;
        if (aevaVar.j && (l = aevaVar.i) != null) {
            final long longValue = l.longValue();
            Handler handler = aevaVar.c;
            if (handler != null && aevaVar.d != null) {
                handler.post(new Runnable() { // from class: aeuu
                    @Override // java.lang.Runnable
                    public final void run() {
                        aeva aevaVar2 = aeva.this;
                        long j2 = longValue;
                        long j3 = j;
                        afdv afdvVar = (afdv) aevaVar2.d;
                        if (aevaVar2.e != afdvVar.u()) {
                            return;
                        }
                        afdvVar.D = (j2 - j3) / 1000;
                    }
                });
            }
            this.a.j = false;
        }
        aevc aevcVar = this.a.l;
        if (aevcVar.p < 0) {
            aevcVar.p = j;
        }
        aevcVar.q = j;
        this.a.l(j);
        super.g(j, i, i2, i3, bArr);
    }
}
