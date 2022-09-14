package defpackage;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aede  reason: default package */
/* loaded from: classes2.dex */
final class aede implements aeck {
    public static final dcdn<dpwr, dktk> a = dcdn.k(dpwr.HOMESCREEN_EXPLORE_PROMINENT, dktk.EXPLORE);
    public static final awwt b;
    public static final int c;
    public final aecm d;
    private final dxio<awwq> f;
    public Map<String, Set<dktk>> e = dcjz.d();
    private final awwn g = new aedd(this);

    static {
        awws u = awwt.u();
        u.t(dcdc.f("major_events_attention_module"));
        u.e(awvv.f);
        b = u.a();
        c = (int) TimeUnit.DAYS.toSeconds(28L);
    }

    public aede(dxio<awwq> dxioVar, aecm aecmVar) {
        this.f = dxioVar;
        this.d = aecmVar;
    }

    @Override // defpackage.aeck
    public final String a() {
        return "major_events";
    }

    @Override // defpackage.aeck
    public final void b() {
        this.f.a().f(this.g);
    }

    @Override // defpackage.aeck
    public final void c() {
        this.f.a().i(this.g);
    }
}
