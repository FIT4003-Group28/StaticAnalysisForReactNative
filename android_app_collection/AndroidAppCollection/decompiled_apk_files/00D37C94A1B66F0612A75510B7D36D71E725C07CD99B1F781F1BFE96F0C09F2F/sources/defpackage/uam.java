package defpackage;

import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.g;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: uam  reason: default package */
/* loaded from: classes4.dex */
public final class uam implements uab, uaz, uba {
    public final uay a;
    public final tzw b;
    private final Map c = new LinkedHashMap();
    private final Object d = new Object();
    private final ubb e;

    public uam(ubb ubbVar, uay uayVar, tzw tzwVar) {
        this.e = ubbVar;
        this.a = uayVar;
        this.b = tzwVar;
    }

    public static boolean k(uav uavVar) {
        uau uauVar = uavVar.c;
        if (uauVar == null) {
            uauVar = uau.a;
        }
        return !uauVar.equals(uau.a);
    }

    public static boolean l(uav uavVar) {
        return !uav.a.equals(uavVar);
    }

    public static boolean m(uav uavVar) {
        aogp aogpVar = uavVar.b;
        if (aogpVar == null) {
            aogpVar = aogp.a;
        }
        alzf b = ubi.b(aogpVar);
        return b != null && !b.e;
    }

    @Override // defpackage.uab
    public final ankt a() {
        return amne.f(amne.f(this.b.a()).h(new ampg() { // from class: uae
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                uam uamVar = uam.this;
                uav uavVar = (uav) obj;
                if (uam.l(uavVar)) {
                    aogp aogpVar = uavVar.b;
                    if (aogpVar == null) {
                        aogpVar = aogp.a;
                    }
                    return ampq.j(aogpVar);
                }
                return uamVar.g();
            }
        }, anjk.a)).c(Exception.class, new g(15), anjk.a).h(new uag(), anjk.a);
    }

    @Override // defpackage.uab
    public final ankt b(uaa uaaVar, int i) {
        return amne.f(this.b.a()).i(new uah(this, i), anjk.a).c(Exception.class, new g(16), anjk.a).h(new uag(2), anjk.a);
    }

    @Override // defpackage.uab
    public final ankt c() {
        return amne.f(amne.f(this.b.a()).i(new uaf(this, 1), anjk.a).h(uag.b, anjk.a)).c(Exception.class, new g(17), anjk.a).h(new uag(3), anjk.a);
    }

    @Override // defpackage.uab
    public final ankt d(final uaa uaaVar, final int i) {
        return amne.f(this.b.a()).i(new anir() { // from class: uai
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                final uam uamVar = uam.this;
                final uaa uaaVar2 = uaaVar;
                final int i2 = i;
                final uav uavVar = (uav) obj;
                if (!uam.l(uavVar) || !uam.k(uavVar)) {
                    return uamVar.n(i2);
                }
                uay uayVar = uamVar.a;
                uau uauVar = uavVar.c;
                if (uauVar == null) {
                    uauVar = uau.a;
                }
                return amne.f(uayVar.a(uauVar, i2)).h(tvv.t, anjk.a).b(Exception.class, uag.a, anjk.a).i(new anir() { // from class: uak
                    @Override // defpackage.anir
                    public final ankt a(Object obj2) {
                        uam uamVar2 = uam.this;
                        uav uavVar2 = uavVar;
                        int i3 = i2;
                        ampq ampqVar = (ampq) obj2;
                        if (ampqVar.h()) {
                            if (!uam.m(uavVar2)) {
                                ubi.c((InputStream) ampqVar.c());
                                return anlz.p(new uad());
                            }
                            return anlz.q((InputStream) ampqVar.c());
                        }
                        return uamVar2.n(i3);
                    }
                }, anjk.a);
            }
        }, anjk.a).c(Exception.class, new g(18), anjk.a).h(new uag(4), anjk.a);
    }

    @Override // defpackage.uab
    public final void e(tzz tzzVar, Executor executor) {
        executor.getClass();
        synchronized (this.d) {
            this.c.put(tzzVar, executor);
        }
    }

    @Override // defpackage.uab
    public final void f(tzz tzzVar) {
        synchronized (this.d) {
            this.c.remove(tzzVar);
        }
    }

    public final ampq g() {
        this.e.a();
        return amon.a;
    }

    public final ankt h() {
        return amnt.f(this.e.a(), new uaf(this), anjk.a);
    }

    @Override // defpackage.uaz
    public final void i() {
        amup j;
        synchronized (this.d) {
            j = amup.j(this.c);
        }
        amzs it = j.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            tzz tzzVar = (tzz) entry.getKey();
            tzzVar.getClass();
            ((Executor) entry.getValue()).execute(ammo.f(new ual(tzzVar, 1)));
        }
    }

    @Override // defpackage.uba
    public final void j() {
        amup j;
        synchronized (this.d) {
            j = amup.j(this.c);
        }
        amzs it = j.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            tzz tzzVar = (tzz) entry.getKey();
            tzzVar.getClass();
            ((Executor) entry.getValue()).execute(ammo.f(new ual(tzzVar)));
        }
    }

    public final ankt n(int i) {
        return amnt.f(h(), new uah(this, i, 1), anjk.a);
    }
}
