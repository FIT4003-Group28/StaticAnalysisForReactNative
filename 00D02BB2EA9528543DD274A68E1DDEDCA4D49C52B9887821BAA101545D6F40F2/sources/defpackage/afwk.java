package defpackage;

import android.text.Spannable;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: afwk  reason: default package */
/* loaded from: classes2.dex */
public class afwk {
    public final gga a;
    public final avik b;
    public final avij c;
    cjkr d;
    cjkr e;
    private final bvjj f;
    private final Executor g;
    private final bvsx h;

    public afwk(gga ggaVar, bvjj bvjjVar, avik avikVar, Executor executor, avij avijVar) {
        this.a = ggaVar;
        this.f = bvjjVar;
        this.b = avikVar;
        this.g = executor;
        this.c = avijVar;
        this.h = new bvsx(ggaVar.getResources());
    }

    public final void a() {
        degp<Boolean> w = this.c.w();
        boolean z = w.isDone() && Boolean.TRUE.equals(deha.s(w));
        if (!z) {
            bvsu c = this.h.c(R.string.WIFI_ONLY_TITLE);
            c.i();
            Spannable c2 = c.c();
            cjkp B = cjkr.B();
            B.t(this.a.getResources().getString(R.string.NO_OFFLINE_AREAS_HEADER));
            bvsu c3 = this.h.c(R.string.NO_OFFLINE_AREAS_WIFI_BODY);
            c3.a(c2);
            ((cjke) B).e = c3.c();
            B.y(this.a.getResources().getString(R.string.LATER_BUTTON), null, cjtd.a(dtxx.bG));
            B.z(this.a.getResources().getString(R.string.OFFLINE_MAPS_TITLE), new View.OnClickListener(this) { // from class: afwh
                private final afwk a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.b.j();
                }
            }, cjtd.a(dtxx.bH));
            cjkr u = B.u(this.a);
            this.d = u;
            u.q().show();
        }
        if (this.f.m(bvjk.eu, false)) {
            if (!z) {
                return;
            }
            b();
            return;
        }
        bvsu c4 = this.h.c(R.string.WIFI_ONLY_TITLE);
        c4.i();
        Spannable c5 = c4.c();
        cjkp B2 = cjkr.B();
        B2.t(this.a.getResources().getString(R.string.DATA_USE_CAVEAT_TITLE));
        bvsu c6 = this.h.c(R.string.DATA_USE_CAVEAT_WIFI_BODY);
        c6.a(c5);
        ((cjke) B2).e = c6.c();
        B2.y(this.a.getResources().getString(R.string.TUTORIAL_GOT_IT), new View.OnClickListener(this) { // from class: afwi
            private final afwk a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                afwk afwkVar = this.a;
                degp<Boolean> w2 = afwkVar.c.w();
                if (!w2.isDone() || !Boolean.TRUE.equals(deha.s(w2))) {
                    return;
                }
                afwkVar.b();
            }
        }, cjtd.a(dtxx.bF));
        cjkr u2 = B2.u(this.a);
        this.e = u2;
        u2.q().show();
        this.f.S(bvjk.eu, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.g.execute(new Runnable(this) { // from class: afwj
            private final afwk a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ckos.b(this.a.a.findViewById(16908290), R.string.WIFI_ONLY_TURNED_ON, 0).c();
            }
        });
    }
}
