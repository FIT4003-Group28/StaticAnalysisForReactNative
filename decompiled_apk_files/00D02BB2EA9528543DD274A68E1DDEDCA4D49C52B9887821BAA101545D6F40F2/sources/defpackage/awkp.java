package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: awkp  reason: default package */
/* loaded from: classes3.dex */
final class awkp implements avlm {
    final /* synthetic */ awkq a;

    public awkp(awkq awkqVar) {
        this.a = awkqVar;
    }

    @Override // defpackage.avlm
    public final void a(final dlpt dlptVar) {
        long j = awkq.a;
        int i = dlptVar.h;
        dltz dltzVar = dltz.AUTOMATIC;
        int i2 = dlptVar.g;
        int i3 = dlptVar.c;
        int i4 = dlptVar.a;
        bvrj.UI_THREAD.c();
        if ((dlptVar.a & 128) != 0) {
            dltz b = dltz.b(dlptVar.h);
            if (b == null) {
                b = dltz.AUTOMATIC;
            }
            if (b != dltz.DYNAMIC) {
                return;
            }
            awkq awkqVar = this.a;
            if (awkqVar.m != this || awkqVar.n != null) {
                return;
            }
            dlts dltsVar = dlptVar.j;
            if (dltsVar == null) {
                dltsVar = dlts.c;
            }
            int i5 = dltsVar.a;
            long j2 = dltsVar.b;
            awkq awkqVar2 = this.a;
            awkqVar2.n = awkqVar2.g.d(new Runnable(this, dlptVar) { // from class: awko
                private final awkp a;
                private final dlpt b;

                {
                    this.a = this;
                    this.b = dlptVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    awkp awkpVar = this.a;
                    dlpt dlptVar2 = this.b;
                    bvrj.UI_THREAD.c();
                    awkq awkqVar3 = awkpVar.a;
                    if (awkqVar3.n == null) {
                        return;
                    }
                    awkqVar3.n = null;
                    avzg l = awkqVar3.e.l();
                    if (l == null) {
                        return;
                    }
                    dlsw b2 = l.a().b();
                    dlsw dlswVar = dlptVar2.k;
                    if (dlswVar == null) {
                        dlswVar = dlsw.d;
                    }
                    if (!dlswVar.equals(b2)) {
                        return;
                    }
                    dlts dltsVar2 = dlptVar2.j;
                    if (dltsVar2 == null) {
                        dltsVar2 = dlts.c;
                    }
                    awkpVar.a.a(b2, dltsVar2.a);
                }
            }, dltsVar.b, TimeUnit.MILLISECONDS);
            awkq awkqVar3 = this.a;
            bvqd.a(awkqVar3.n, awkqVar3.f);
        }
    }
}
