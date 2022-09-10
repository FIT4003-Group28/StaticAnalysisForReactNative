package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: awhz  reason: default package */
/* loaded from: classes3.dex */
public final class awhz implements awid {
    public static final long a = TimeUnit.DAYS.toMillis(3);
    public final avki b;
    private final btpc c;
    private final Executor d;

    public awhz(btpc btpcVar, Executor executor, avki avkiVar) {
        this.c = btpcVar;
        this.d = executor;
        this.b = avkiVar;
    }

    @Override // defpackage.awid
    public final dehn<Boolean> a() {
        return deew.g(this.c.d(), new defg(this) { // from class: awhx
            private final awhz a;

            {
                this.a = this;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                awhz awhzVar = this.a;
                btoy btoyVar = (btoy) obj;
                if (btoyVar.b() || !btoyVar.a()) {
                    return deha.a(true);
                }
                deig d = deig.d();
                awhzVar.b.O(new awhy(d, btoyVar));
                return d;
            }
        }, this.d);
    }
}
