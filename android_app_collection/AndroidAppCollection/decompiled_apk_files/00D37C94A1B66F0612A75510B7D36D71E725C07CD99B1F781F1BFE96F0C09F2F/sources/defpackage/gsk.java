package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.RatingCompat;
import android.util.Base64;
/* compiled from: PG */
/* renamed from: gsk  reason: default package */
/* loaded from: classes3.dex */
public final class gsk extends is {
    public final azqb e;
    private final gsm f;
    private final gsp g;
    private final acti h;

    public gsk(azqb azqbVar, gsm gsmVar, gsp gspVar, acti actiVar) {
        this.e = azqbVar;
        this.f = gsmVar;
        this.g = gspVar;
        this.h = actiVar;
    }

    @Override // defpackage.is
    public final void b() {
        this.f.a().b();
        s("onFastForward()", gsq.a);
    }

    @Override // defpackage.is
    public final void c() {
        s("onPause()", this.f.b());
    }

    @Override // defpackage.is
    public final void d() {
        gsq gsqVar;
        gsm gsmVar = this.f;
        if (!gsmVar.d()) {
            gsqVar = gsq.c;
        } else {
            gsmVar.a().d();
            gsqVar = gsq.a;
        }
        s("onPlay()", gsqVar);
    }

    @Override // defpackage.is
    public final void e(Uri uri, Bundle bundle) {
        String string = bundle.getString("android.intent.extra.youtube_click_tracking_id");
        byte[] decode = string != null ? Base64.decode(string, 8) : null;
        if (decode != null) {
            this.h.d(acuo.a(22678), null, null);
            acte acteVar = new acte(decode);
            ((acsx) this.h).D(acteVar);
            this.h.H(3, acteVar, null);
        }
        gsm gsmVar = this.f;
        gsl gslVar = new gsl(gsmVar, uri, decode);
        eza ezaVar = gsmVar.e;
        if (uri.getPath().equals("/playlist")) {
            uri = uri.buildUpon().path("watch").build();
        }
        ezaVar.o(uri, null, gslVar);
        gslVar.a.S(new ayqb() { // from class: gsj
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                gsk.this.s("onPlayFromUri()", (gsq) obj);
            }
        });
    }

    @Override // defpackage.is
    public final void f() {
        s("onPrepare()", this.f.b());
    }

    @Override // defpackage.is
    public final void g() {
        this.f.a().g();
        s("onRewind()", gsq.a);
    }

    @Override // defpackage.is
    public final void h(long j) {
        this.f.a().h(j);
        s("onSeekTo()", gsq.a);
    }

    @Override // defpackage.is
    public final void j() {
        gsq gsqVar;
        gsm gsmVar = this.f;
        if (!gsmVar.d()) {
            gsqVar = gsq.c;
        } else {
            gsmVar.a().j();
            gsqVar = gsq.a;
        }
        s("onSkipToNext()", gsqVar);
    }

    @Override // defpackage.is
    public final void k() {
        gsq gsqVar;
        gsm gsmVar = this.f;
        if (!gsmVar.d()) {
            gsqVar = gsq.c;
        } else {
            gsmVar.a().k();
            gsqVar = gsq.a;
        }
        s("onSkipToPrevious()", gsqVar);
    }

    @Override // defpackage.is
    public final void l() {
        gsm gsmVar = this.f;
        gsmVar.c().L();
        gsmVar.c().K();
        s("onStop()", gsq.a);
    }

    @Override // defpackage.is
    public final void n() {
        s("onPlayFromMediaId()", gsq.b);
    }

    @Override // defpackage.is
    public final void o() {
        s("onPlayFromSearch()", gsq.b);
    }

    @Override // defpackage.is
    public final void p() {
        s("onPrepareFromMediaId()", gsq.b);
    }

    @Override // defpackage.is
    public final void q() {
        s("onPrepareFromSearch()", gsq.b);
    }

    @Override // defpackage.is
    public final void r() {
        s("onPrepareFromUri()", gsq.b);
    }

    public final void s(String str, gsq gsqVar) {
        if (!gsqVar.d) {
            return;
        }
        String gsqVar2 = gsqVar.toString();
        StringBuilder sb = new StringBuilder(str.length() + 3 + String.valueOf(gsqVar2).length());
        sb.append(str);
        sb.append(" : ");
        sb.append(gsqVar2);
        zep.b(sb.toString());
        jc jcVar = new jc();
        aqxo.y(gsqVar.d);
        int i = gsqVar.e;
        aqxo.y(gsqVar.d);
        String str2 = gsqVar.f;
        jcVar.c = i;
        jcVar.d = str2;
        jcVar.c(7, 0L, 1.0f);
        ((iz) this.e.get()).i(jcVar.a());
    }

    @Override // defpackage.is
    public final void i(RatingCompat ratingCompat) {
        aspb aspbVar;
        gsq gsqVar;
        float f = ratingCompat.b;
        if (f < 0.0f) {
            aspbVar = aspb.INDIFFERENT;
        } else {
            aspbVar = (ratingCompat.a == 2 && f == 1.0f) ? aspb.LIKE : aspb.DISLIKE;
        }
        final gsp gspVar = this.g;
        String q = this.f.c().q();
        if (q == null) {
            gsqVar = gsq.a;
        } else if (!gspVar.a.t()) {
            gsqVar = gsq.c;
        } else {
            gspVar.b.b();
            ylv ylvVar = new ylv() { // from class: gsn
                @Override // defpackage.zdt
                /* renamed from: b */
                public final void a(Throwable th) {
                    gsp gspVar2 = gsp.this;
                    zep.d("Error rating", th);
                    gspVar2.c.e(th);
                }
            };
            Runnable runnable = anlf.a;
            int ordinal = aspbVar.ordinal();
            if (ordinal == 0) {
                aaxr b = gspVar.d.b();
                b.i();
                b.w(q);
                ylx.l(gspVar.d.h(b, gspVar.e), gspVar.e, ylvVar, new gso(gspVar, q, aspbVar), runnable);
            } else if (ordinal == 1) {
                aaxq a = gspVar.d.a();
                a.i();
                a.w(q);
                ylx.l(gspVar.d.f(a, gspVar.e), gspVar.e, ylvVar, new gso(gspVar, q, aspbVar, 1), runnable);
            } else {
                aaxs d = gspVar.d.d();
                d.i();
                d.w(q);
                ylx.l(gspVar.d.j(d, gspVar.e), gspVar.e, ylvVar, new gso(gspVar, q, aspbVar, 2), runnable);
            }
            gsqVar = gsq.a;
        }
        s("onSetRating()", gsqVar);
    }
}
