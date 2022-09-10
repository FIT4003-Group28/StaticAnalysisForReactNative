package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: amby  reason: default package */
/* loaded from: classes.dex */
public final class amby {
    public final akry a;
    public final amcl b;
    @dzsi
    public final amci c;
    @dzsi
    public final amci d;
    public int e = 1;
    private final long f;
    private final dehq g;

    public amby(akry akryVar, amcl amclVar, @dzsi amci amciVar, @dzsi amci amciVar2, dehq dehqVar) {
        this.a = akryVar;
        this.b = amclVar;
        this.d = amciVar2;
        this.c = amciVar;
        this.f = akryVar == akry.SATELLITE ? 1000L : 3000L;
        this.g = dehqVar;
    }

    public final synchronized void a(boolean z) {
        if (z) {
            int i = this.e;
            if (i != 1 && i != 2) {
                if (i != 3 && i != 5 && i == 4) {
                    this.e = 5;
                    return;
                }
            }
            this.e = 3;
            this.g.execute(new ambx(this));
            return;
        }
        int i2 = this.e;
        if (i2 == 1) {
            this.e = 2;
            bvqd.a(this.g.d(new ambx(this), this.f, TimeUnit.MILLISECONDS), this.g);
        } else if (i2 != 2 && i2 != 3 && i2 != 5 && i2 == 4) {
            this.e = 5;
        }
    }
}
