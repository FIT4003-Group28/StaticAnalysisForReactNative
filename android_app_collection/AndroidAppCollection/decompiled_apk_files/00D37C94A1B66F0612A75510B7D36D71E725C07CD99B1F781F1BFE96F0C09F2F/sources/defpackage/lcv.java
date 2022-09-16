package defpackage;

import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: lcv  reason: default package */
/* loaded from: classes3.dex */
public final class lcv {
    public final fnp a;
    public final String b;
    private final ScheduledExecutorService c;
    private final acgf d;

    public lcv(fnp fnpVar, acgf acgfVar, ScheduledExecutorService scheduledExecutorService, String str, byte[] bArr) {
        this.a = fnpVar;
        this.d = acgfVar;
        this.c = scheduledExecutorService;
        this.b = str;
    }

    public final ankt a() {
        akqe b;
        fnp fnpVar = this.a;
        if (fnpVar.b.t()) {
            b = akqe.a(fnpVar.b.c().d(), "search_namespace", "voice_language");
        } else {
            b = akqe.b("search_namespace", "voice_language");
        }
        ankt i = anhq.i(anii.i(anko.q(fnpVar.a.a(b, aeqi.b)), new lcu(this), this.c), akqf.class, new lcu(this, 1), anjk.a);
        ankt i2 = anii.i(this.d.d(), new lcu(this, 2), this.c);
        return anlz.k(i2, i).b(new abfk(i2, i, 1), anjk.a);
    }
}
