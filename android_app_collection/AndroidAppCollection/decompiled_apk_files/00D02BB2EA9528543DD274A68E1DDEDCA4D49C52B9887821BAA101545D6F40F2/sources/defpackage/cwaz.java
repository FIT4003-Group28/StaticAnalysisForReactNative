package defpackage;

import android.graphics.drawable.Animatable;
import android.view.View;
/* compiled from: PG */
/* renamed from: cwaz  reason: default package */
/* loaded from: classes5.dex */
final class cwaz extends cwcp {
    public final cwaw a;
    public final cwap b;
    public Animatable c;
    public int d;
    private final cwau l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cwaz(defpackage.cwau r4) {
        /*
            r3 = this;
            cwaw r0 = r4.a()
            java.lang.String r1 = r0.d()
            android.graphics.drawable.Drawable r2 = r0.e()
            r3.<init>(r1, r2)
            r3.l = r4
            r3.a = r0
            cwap r4 = r0.n()
            r3.b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwaz.<init>(cwau):void");
    }

    public final void b(dbsg<cwat> dbsgVar) {
        dbsk.b(dbsgVar.a(), "Can't update in progress icon without upload info present.");
        dbsgVar.b().c();
        dbsgVar.b().b();
        this.b.a();
    }

    public final void c(Animatable animatable) {
        this.c = animatable;
        dbsk.b(!animatable.isRunning(), "Animatable icon should not be already running when calling startAnimatedIcon()");
        this.c.start();
    }

    public final void d(dbsg<cwat> dbsgVar) {
        dbsk.b(dbsgVar.a(), "Can't tell how many remaining items left to upload without UploadInfo");
        cwaw cwawVar = this.a;
        dbsgVar.b().b();
        i(dbsg.i(cwawVar.p()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cwbn
    public final void e(m mVar) {
        this.l.a.e(mVar);
        this.l.f.e(mVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cwbn
    public final void l(m mVar) {
        this.l.a.b(mVar, new aa(this) { // from class: cwax
            private final cwaz a;

            {
                this.a = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x01b7  */
            @Override // defpackage.aa
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void m(java.lang.Object r9) {
                /*
                    Method dump skipped, instructions count: 492
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cwax.m(java.lang.Object):void");
            }
        });
        this.l.f.b(mVar, new aa(this) { // from class: cway
            private final cwaz a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                cwaz cwazVar = this.a;
                dbsg dbsgVar = (dbsg) obj;
                if (dbsgVar.a()) {
                    cwazVar.i = (View.OnClickListener) dbsgVar.b();
                    cwazVar.f();
                }
            }
        });
    }
}
