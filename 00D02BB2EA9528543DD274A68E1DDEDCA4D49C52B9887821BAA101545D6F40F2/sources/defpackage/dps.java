package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.net.Uri;
import com.google.android.apps.gmm.locationsharing.api.PersonId;
import com.google.android.apps.gmm.locationsharing.api.Profile;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dps  reason: default package */
/* loaded from: classes6.dex */
public final class dps implements aila {
    public final Executor a;
    public final akfa b;
    public final ailb<aigo> c;
    @dzsi
    public PersonId d;
    @dzsi
    public btlu e;
    @dzsi
    public crzm<btlu> f;
    public final crzp<btlu> g = new dpq(this);
    private final dpr h;
    private final czo i;

    public dps(akfa akfaVar, Executor executor, ailb<aigo> ailbVar, czo czoVar, dpr dprVar) {
        this.c = ailbVar;
        this.a = executor;
        this.b = akfaVar;
        this.h = dprVar;
        this.i = czoVar;
    }

    public final void a(@dzsi btlu btluVar) {
        btlu btluVar2;
        if (btluVar != null && ((btluVar2 = this.e) == null || dbsd.a(btluVar, btluVar2))) {
            if (btluVar.f == btlt.GOOGLE || btluVar.f == btlt.SIGNED_OUT) {
                this.e = btluVar;
                c(dbsg.i(btluVar));
                return;
            }
            this.i.c(czh.LIGHTHOUSE);
            return;
        }
        this.i.c(czh.LIGHTHOUSE);
    }

    @Override // defpackage.aila
    public final void b(final dbsg<btlu> dbsgVar) {
        this.a.execute(new Runnable(this, dbsgVar) { // from class: dpo
            private final dps a;
            private final dbsg b;

            {
                this.a = this;
                this.b = dbsgVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.c(this.b);
            }
        });
    }

    public final void c(dbsg<btlu> dbsgVar) {
        String str;
        if (this.d == null) {
            return;
        }
        dbsg<aigo> b = this.c.b(dbsgVar);
        if (!b.a()) {
            return;
        }
        ahwk g = Profile.g();
        PersonId personId = this.d;
        dbsk.s(personId);
        ((ahuw) g).a = personId;
        dbsg<ahvg> b2 = b.b().b(g.a());
        if (!b2.a()) {
            this.i.c(czh.LIGHTHOUSE);
            return;
        }
        ahvg b3 = b2.b();
        final dra draVar = (dra) this.h;
        if (draVar.f == b3) {
            return;
        }
        draVar.f = b3;
        if (draVar.h) {
            return;
        }
        draVar.c.e();
        final Profile a = b3.a();
        dbsg<dhjz> g2 = b3.g();
        if (g2.a()) {
            dpw dpwVar = draVar.c;
            akqq j = akqq.j(g2.b());
            dfhd bZ = dfhg.f.bZ();
            dpw.i(bZ, j);
            dfhg bK = bZ.bK();
            if (dpwVar.e != null) {
                dpwVar.d(bK, null);
            } else {
                dpwVar.b(dpw.j(bK).bK(), null);
            }
            draVar.c.f = new dpu(draVar, a) { // from class: dqx
                private final dra a;
                private final Profile b;

                {
                    this.a = draVar;
                    this.b = a;
                }

                @Override // defpackage.dpu
                public final Picture a(float f) {
                    dra draVar2 = this.a;
                    return draVar2.d.b(this.b.b().c(""), draVar2.d.c(f));
                }
            };
            if (b3.a().d().a() && ((str = draVar.g) == null || !str.equals(b3.a().d().b()))) {
                draVar.g = b3.a().d().b();
                final dhm dhmVar = draVar.d;
                String str2 = draVar.g;
                final Picture picture = new Picture();
                brw<Bitmap> g3 = brc.d(dhmVar.a).g();
                g3.j(Uri.parse(str2));
                if (chw.a == null) {
                    chw.a = new chw().y(cdi.c, new ccw()).E();
                }
                dehn h = deew.h(bsv.a(g3.e(chw.a)), new dbrn(dhmVar, picture) { // from class: dhl
                    private final dhm a;
                    private final Picture b;

                    {
                        this.a = dhmVar;
                        this.b = picture;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        dhm dhmVar2 = this.a;
                        Picture picture2 = this.b;
                        Bitmap bitmap = (Bitmap) obj;
                        int i = dhmVar2.d;
                        int i2 = i + i;
                        Canvas beginRecording = picture2.beginRecording(bitmap.getWidth() + i2, bitmap.getHeight() + i2);
                        beginRecording.drawColor(0, PorterDuff.Mode.CLEAR);
                        float f = i2 / 2;
                        beginRecording.drawBitmap(bitmap, f, f, new Paint());
                        beginRecording.drawCircle(beginRecording.getWidth() / 2, beginRecording.getHeight() / 2, (beginRecording.getWidth() / 2) - (dhmVar2.d / 2), dhmVar2.c);
                        picture2.endRecording();
                        return picture2;
                    }
                }, dhmVar.b);
                dqz dqzVar = new dqz(draVar);
                dehq dehqVar = draVar.b;
                dbsk.s(dehqVar);
                deha.q(h, dqzVar, dehqVar);
            }
        }
        draVar.a();
        dehu dehuVar = draVar.i;
        if (dehuVar != null) {
            dehuVar.cancel(true);
        }
        draVar.i = draVar.b.f(new Runnable(draVar) { // from class: dqy
            private final dra a;

            {
                this.a = draVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a();
            }
        }, 1L, 1L, TimeUnit.SECONDS);
    }
}
