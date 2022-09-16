package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: hkr  reason: default package */
/* loaded from: classes3.dex */
public final class hkr extends xo {
    public hkw d;
    public ampq e;
    private final Context f;
    private final Executor g;
    private final Executor h;

    public hkr(Context context, Executor executor, Executor executor2) {
        this.f = context;
        this.g = executor;
        this.h = executor2;
        hkv a = hkw.a();
        a.b(amuk.q());
        this.d = a.a();
        this.e = amon.a;
    }

    @Override // defpackage.xo
    public final int b() {
        return ((amxx) this.d.a).c;
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ yo f(ViewGroup viewGroup, int i) {
        hlb hlbVar;
        if (this.e.h()) {
            hlbVar = new hlb(this.f, ampq.j(new zbq()), ampq.j(new zbp(ViewConfiguration.get(this.f))));
        } else {
            hlbVar = new hlb(this.f, amon.a, amon.a);
        }
        return new yo(hlbVar);
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ void o(final yo yoVar, int i) {
        final hld hldVar = (hld) this.d.a.get(i);
        final hlb C = yoVar.C();
        Executor executor = this.g;
        Executor executor2 = this.h;
        C.a.setBackground(C.getContext().getDrawable(R.drawable.reel_edit_carousel_thumbnail_loading_background));
        C.a.setImageDrawable(null);
        int i2 = 8;
        C.d.setVisibility(8);
        C.c.setVisibility(0);
        View view = C.b;
        if (true == hldVar.c) {
            i2 = 0;
        }
        view.setVisibility(i2);
        if (C.g.h() && !((aypg) C.g.c()).e()) {
            ((aypg) C.g.c()).qr();
        }
        C.g = ampq.j(ayos.A(new Callable() { // from class: hla
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return hld.this.b.get();
            }
        }).K(azpj.b(executor)).G(azpj.b(executor2)).T(new ayqb() { // from class: hkz
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                String i3;
                hlb hlbVar = hlb.this;
                hld hldVar2 = hldVar;
                ampq ampqVar = (ampq) obj;
                hlbVar.a(ampqVar);
                if (ampqVar.h()) {
                    ampq ampqVar2 = hldVar2.a;
                    if (!ampqVar2.h() || ((Long) ampqVar2.c()).longValue() <= 0) {
                        hlbVar.d.setVisibility(8);
                        return;
                    }
                    hlbVar.d.setVisibility(0);
                    if (((Long) ampqVar2.c()).longValue() >= TimeUnit.SECONDS.toMillis(1L)) {
                        i3 = zgh.i((int) TimeUnit.MILLISECONDS.toSeconds(((Long) ampqVar2.c()).longValue()));
                    } else {
                        i3 = zgh.i(0L);
                    }
                    hlbVar.d.setText(i3);
                }
            }
        }, new ayqb() { // from class: hky
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                Throwable th = (Throwable) obj;
                hlb.this.a(amon.a);
            }
        }));
        if (this.e.h()) {
            zbs zbsVar = new zbs() { // from class: hkp
                @Override // defpackage.zbs
                public final void b(MotionEvent motionEvent) {
                    hkr hkrVar = hkr.this;
                    int a = yoVar.a();
                    ampq ampqVar = hkrVar.d.b;
                    if (!ampqVar.h() || ((Integer) ampqVar.c()).intValue() == a) {
                        return;
                    }
                    ((hku) hkrVar.e.c()).b(a);
                    hkrVar.ok(((Integer) ampqVar.c()).intValue());
                    hkrVar.ok(a);
                }
            };
            if (C.f.h()) {
                ((zbp) C.f.c()).d = zbsVar;
            }
            hkq hkqVar = new hkq(this, yoVar);
            if (!C.f.h()) {
                return;
            }
            ((zbp) C.f.c()).b = hkqVar;
        }
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ void p(yo yoVar) {
        hlb C = yoVar.C();
        C.d.setText("");
        C.d.setVisibility(8);
        C.a.setImageDrawable(null);
        C.a.setBackground(null);
        C.c.setVisibility(8);
        C.b.setVisibility(8);
        if (C.g.h() && !((aypg) C.g.c()).e()) {
            ((aypg) C.g.c()).qr();
        }
        if (C.e.h()) {
            ((zbp) C.f.c()).d = null;
            ((zbp) C.f.c()).b = null;
        }
    }

    public final boolean w(int i) {
        return i >= 0 && i < ((amxx) this.d.a).c;
    }
}
