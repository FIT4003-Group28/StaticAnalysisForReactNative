package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: czml  reason: default package */
/* loaded from: classes5.dex */
public class czml<T> {
    public final String a;
    public final czmm<T> b;
    public final dayy<Void> c;
    public final dazg e;
    private final dehn<String> g;
    private final degn h;
    private final czmt j;
    private final dayy<?> i = new dayy<>(new czmh(this), dege.a);
    public final Object d = new Object();
    public List<defg<czmk, ?>> f = new ArrayList();

    public czml(czmm czmmVar, czmt czmtVar, dehn dehnVar, boolean z, boolean z2) {
        this.b = czmmVar;
        this.j = czmtVar;
        this.g = dehnVar;
        this.a = czmmVar.c();
        this.c = new dayy<>(czmmVar.a(), dege.a);
        if (z2) {
            this.e = dazg.d();
        } else {
            this.e = dazg.c();
        }
        a(new defg(this) { // from class: czma
            private final czml a;

            {
                this.a = this;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                czmk czmkVar = (czmk) obj;
                return this.a.c.a();
            }
        });
        this.h = z ? degn.a() : null;
    }

    public final void a(defg<czmk, ?> defgVar) {
        synchronized (this.d) {
            this.f.add(defgVar);
        }
    }

    public final dehn<T> b() {
        dehn<T> dehnVar;
        this.e.a();
        if (this.i.d.isDone()) {
            dehnVar = this.b.h();
        } else {
            dazg dazgVar = this.e;
            String valueOf = String.valueOf(this.a);
            dazk b = dazgVar.b(valueOf.length() != 0 ? "Get ".concat(valueOf) : new String("Get "), dbab.a);
            try {
                dehn<T> g = deew.g(this.i.a(), dazv.h(new defg(this) { // from class: czmb
                    private final czml a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.defg
                    public final dehn a(Object obj) {
                        return this.a.b.h();
                    }
                }), dege.a);
                b.a(g);
                if (b != null) {
                    b.close();
                }
                dehnVar = g;
            } catch (Throwable th) {
                if (b != null) {
                    try {
                        b.close();
                    } catch (Throwable th2) {
                        deki.a(th, th2);
                    }
                }
                throw th;
            }
        }
        deha.o(this.g);
        return deha.o(dehnVar);
    }

    public final dehn<Void> c(final dbrn<? super T, T> dbrnVar, final Executor executor) {
        dehn<Void> b;
        final defg h = dazv.h(new defg(dbrnVar) { // from class: czme
            private final dbrn a;

            {
                this.a = dbrnVar;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                return deha.a(this.a.a(obj));
            }
        });
        dazg dazgVar = this.e;
        String valueOf = String.valueOf(this.a);
        dazk b2 = dazgVar.b(valueOf.length() != 0 ? "Update ".concat(valueOf) : new String("Update "), dbab.a);
        try {
            final dehn<?> a = this.i.a();
            degn degnVar = this.h;
            if (degnVar != null) {
                b = degnVar.b(dazv.f(new deff(this, a, h, executor) { // from class: czmd
                    private final czml a;
                    private final dehn b;
                    private final defg c;
                    private final Executor d;

                    {
                        this.a = this;
                        this.b = a;
                        this.c = h;
                        this.d = executor;
                    }

                    @Override // defpackage.deff
                    public final dehn a() {
                        final czml czmlVar = this.a;
                        dehn dehnVar = this.b;
                        final defg defgVar = this.c;
                        final Executor executor2 = this.d;
                        return deew.g(dehnVar, dazv.h(new defg(czmlVar, defgVar, executor2) { // from class: czmf
                            private final czml a;
                            private final defg b;
                            private final Executor c;

                            {
                                this.a = czmlVar;
                                this.b = defgVar;
                                this.c = executor2;
                            }

                            @Override // defpackage.defg
                            public final dehn a(Object obj) {
                                czml czmlVar2 = this.a;
                                return czmlVar2.b.b(this.b, this.c);
                            }
                        }), dege.a);
                    }
                }), dege.a);
            } else {
                b = deew.g(a, dazv.h(new defg(this, h, executor) { // from class: czmc
                    private final czml a;
                    private final defg b;
                    private final Executor c;

                    {
                        this.a = this;
                        this.b = h;
                        this.c = executor;
                    }

                    @Override // defpackage.defg
                    public final dehn a(Object obj) {
                        czml czmlVar = this.a;
                        return czmlVar.b.b(this.b, this.c);
                    }
                }), dege.a);
            }
            deha.o(this.g);
            b2.a(b);
            if (b2 != null) {
                b2.close();
            }
            return b;
        } catch (Throwable th) {
            if (b2 != null) {
                try {
                    b2.close();
                } catch (Throwable th2) {
                    deki.a(th, th2);
                }
            }
            throw th;
        }
    }
}
