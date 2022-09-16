package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: akta  reason: default package */
/* loaded from: classes.dex */
final class akta implements aktc {
    public final snc a;
    public long b;
    private final azqb c;
    private final int d;
    private final long e;

    public akta(azqb azqbVar, aves avesVar, snc sncVar) {
        this.c = azqbVar;
        this.d = avesVar.c;
        this.e = TimeUnit.SECONDS.toMillis(avesVar.d);
        this.a = sncVar;
    }

    @Override // defpackage.aktc
    public final int a() {
        return this.d;
    }

    @Override // defpackage.aktc
    public final boolean b() {
        if (!((aktp) this.c.get()).b()) {
            long j = this.e;
            if (j <= 0 || j + this.b > this.a.d()) {
                return true;
            }
        }
        return false;
    }
}
