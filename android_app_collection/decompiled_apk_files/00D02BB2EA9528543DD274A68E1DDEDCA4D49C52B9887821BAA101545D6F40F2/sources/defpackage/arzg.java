package defpackage;

import android.os.Handler;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: arzg  reason: default package */
/* loaded from: classes2.dex */
public final class arzg implements btph {
    public final cqat a;
    public final arzd b;
    public final asik c;
    public final jzv d;
    public final Handler e;
    @dzsi
    public amut f;
    @dzsi
    public cray g;
    public boolean h;
    public boolean i;
    public long j;
    @dzsi
    public amuo k;
    public final Runnable l = new arze(this);
    public final Runnable m = new arzf(this);

    public arzg(cqat cqatVar, arzd arzdVar, asik asikVar, jzv jzvVar) {
        this.a = cqatVar;
        dbsk.s(arzdVar);
        this.b = arzdVar;
        dbsk.s(asikVar);
        this.c = asikVar;
        dbsk.s(jzvVar);
        this.d = jzvVar;
        this.e = new Handler();
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.b.d(b(), d(), this.j, this.g, this.f);
    }

    public final boolean b() {
        return this.h && !this.i && !((mwo) this.d).a && !((asio) this.c).b;
    }

    public final boolean d() {
        return this.j != 0 && !this.i;
    }
}
