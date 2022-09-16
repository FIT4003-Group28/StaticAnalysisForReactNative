package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: adci  reason: default package */
/* loaded from: classes.dex */
public final class adci {
    public static final /* synthetic */ int d = 0;
    public final azqb a;
    public final adcs b;
    public final Executor c;

    static {
        zep.a("Handoff.Store");
    }

    public adci(azqb azqbVar, adcs adcsVar, Executor executor) {
        this.a = azqbVar;
        this.b = adcsVar;
        this.c = executor;
    }

    public final ankt a() {
        return anii.h(((vne) this.a.get()).a(), adch.a, this.c);
    }

    public final void b() {
        ylx.i(a(), new ylw() { // from class: adcf
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                adci adciVar = adci.this;
                String str = (String) obj;
                String.format("RecordingUserAction: [id=%s]", str);
                adciVar.b.a(str);
                adciVar.c();
            }
        });
    }

    public final void c() {
        ((vne) this.a.get()).b(adch.b, this.c);
    }
}
