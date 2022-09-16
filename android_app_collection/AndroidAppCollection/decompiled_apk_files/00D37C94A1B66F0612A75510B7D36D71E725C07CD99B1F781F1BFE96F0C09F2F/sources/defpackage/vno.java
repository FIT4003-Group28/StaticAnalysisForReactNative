package defpackage;
/* compiled from: PG */
/* renamed from: vno  reason: default package */
/* loaded from: classes4.dex */
public final class vno {
    public final vok a;

    public vno(vok vokVar) {
        this.a = vokVar;
    }

    public final ankt a(final vow vowVar) {
        return this.a.b().c(ammo.d(new aniz() { // from class: vnn
            @Override // defpackage.aniz
            public final anjd a(anjb anjbVar, Object obj) {
                vow vowVar2 = vow.this;
                vnv vnvVar = (vnv) obj;
                vnvVar.a();
                final vox voxVar = new vox(vnvVar.a);
                amlp l = amna.l("Transaction");
                try {
                    final anku b = anku.b(ammo.g(new vnt(vnvVar, vowVar2, voxVar)));
                    vnvVar.c.execute(b);
                    b.qY(new Runnable() { // from class: vnr
                        @Override // java.lang.Runnable
                        public final void run() {
                            anku ankuVar = anku.this;
                            vox voxVar2 = voxVar;
                            if (ankuVar.isCancelled()) {
                                voxVar2.a.cancel();
                            }
                        }
                    }, anjk.a);
                    l.a(b);
                    l.close();
                    return anjd.b(b);
                } catch (Throwable th) {
                    try {
                        l.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            }
        }), anjk.a).h();
    }
}
