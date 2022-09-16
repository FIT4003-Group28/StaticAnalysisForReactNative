package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: jan  reason: default package */
/* loaded from: classes3.dex */
public final class jan {
    public static final long a = TimeUnit.MINUTES.toSeconds(30);
    public final azqb b;
    public final afvn c;
    public final aggo d;
    public final azqb e;
    public final fcl f;
    public final agsd g;
    public final aahf h;
    public final snc i;
    private final Executor j;
    private final fcj k;

    public jan(azqb azqbVar, afvn afvnVar, aggo aggoVar, Executor executor, azqb azqbVar2, fcl fclVar, fcj fcjVar, agsd agsdVar, aahf aahfVar, snc sncVar) {
        this.b = azqbVar;
        this.c = afvnVar;
        this.d = aggoVar;
        this.j = executor;
        this.e = azqbVar2;
        this.f = fclVar;
        this.k = fcjVar;
        this.g = agsdVar;
        this.h = aahfVar;
        this.i = sncVar;
    }

    public final void a() {
        if (this.k.a()) {
            this.j.execute(new jam(this));
        }
        if (!this.c.t() || this.k.b()) {
            return;
        }
        this.j.execute(new jam(this, 1));
    }
}
