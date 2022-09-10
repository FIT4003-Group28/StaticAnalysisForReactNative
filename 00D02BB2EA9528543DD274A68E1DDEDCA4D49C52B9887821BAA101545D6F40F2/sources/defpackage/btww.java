package defpackage;

import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: btww  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class btww {
    private final btxa a;

    public btww(btxa btxaVar) {
        this.a = btxaVar;
    }

    public final void a(dund dundVar, btlu btluVar, final Locale locale) {
        boolean d;
        final dund e;
        final btxa btxaVar = this.a;
        final String h = btlu.h(btluVar);
        dspd dspdVar = dundVar.b;
        dsrj<dvgo> dsrjVar = dundVar.a;
        synchronized (btxaVar) {
            d = btxaVar.g.d(h, dspdVar, dsrjVar);
            btxaVar.h = btxaVar.f.b();
            btxaVar.k(4);
            e = btxaVar.g.e().e();
        }
        if (d) {
            btxaVar.l.a(btxaVar.g, false);
        }
        final long j = btxaVar.h;
        btxaVar.c.execute(new Runnable(btxaVar, locale, j, e, h) { // from class: btwx
            private final btxa a;
            private final Locale b;
            private final long c;
            private final dund d;
            private final String e;

            {
                this.a = btxaVar;
                this.b = locale;
                this.c = j;
                this.d = e;
                this.e = h;
            }

            @Override // java.lang.Runnable
            public final void run() {
                btxa btxaVar2 = this.a;
                Locale locale2 = this.b;
                long j2 = this.c;
                dund dundVar2 = this.d;
                String str = this.e;
                if (!btxaVar2.d.a() || btxaVar2.d.c()) {
                    btxaVar2.b.g(str, locale2, j2, dundVar2);
                } else {
                    btxaVar2.b.h(locale2, j2, dundVar2);
                }
                btxaVar2.i.countDown();
            }
        });
    }
}
