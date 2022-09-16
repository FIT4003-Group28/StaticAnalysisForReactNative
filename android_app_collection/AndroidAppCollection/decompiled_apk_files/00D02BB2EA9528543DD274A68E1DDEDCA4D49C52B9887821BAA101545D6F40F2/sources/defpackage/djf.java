package defpackage;

import android.location.Location;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: djf  reason: default package */
/* loaded from: classes6.dex */
public final class djf implements dag {
    private static final dcza d = dcze.a(64);
    public final dehp a;
    public final dbsg<dlq> b;
    public final djj c;
    private final dbuj<dcyz, czm> e;

    public djf(cqat cqatVar, dehp dehpVar, dbsg<dlq> dbsgVar, djj djjVar) {
        dbuo<Object, Object> a = dbuo.a();
        a.j(25L);
        a.m(new dje(cqatVar));
        a.g(5L, TimeUnit.MINUTES);
        this.e = a.e();
        this.a = dehpVar;
        this.b = dbsgVar;
        this.c = djjVar;
    }

    @Override // defpackage.dag
    public final czm a(final Location location) {
        dcyz p = d.f().j(dcvf.c(dcvs.b(location.getLatitude(), location.getLongitude())).p(16).b).p();
        dbsk.l(true);
        try {
            return this.e.c(p, new Callable(this, location) { // from class: djd
                private final djf a;
                private final Location b;

                {
                    this.a = this;
                    this.b = location;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    djf djfVar = this.a;
                    Location location2 = this.b;
                    djj djjVar = djfVar.c;
                    dfkr dfkrVar = ((dlq) ((dbsu) djfVar.b).a).a;
                    dehp dehpVar = djfVar.a;
                    btvo a = djjVar.a.a();
                    djj.a(a, 1);
                    djj.a(dfkrVar, 2);
                    djj.a(dehpVar, 3);
                    djj.a(location2, 4);
                    return new dji(a, dfkrVar, dehpVar, location2);
                }
            });
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
