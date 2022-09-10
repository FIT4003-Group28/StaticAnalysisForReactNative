package defpackage;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: czly  reason: default package */
/* loaded from: classes5.dex */
public final class czly<T> implements czmm<T> {
    public final dehn<Uri> a;
    public final Executor b;
    public final czif c;
    public final czju<T> d;
    private final String g;
    private final czks<T> h;
    private final dazg i;
    private final degn j = degn.a();
    public final AtomicReference<dehn<T>> e = new AtomicReference<>();
    public final AtomicReference<czjx> f = new AtomicReference<>();

    public czly(String str, dehn<Uri> dehnVar, czks<T> czksVar, Executor executor, czif czifVar, czju<T> czjuVar, dazg dazgVar) {
        this.g = str;
        this.a = deha.o(dehnVar);
        this.h = czksVar;
        this.b = dehx.b(executor);
        this.c = czifVar;
        this.d = czjuVar;
        this.i = dazgVar;
    }

    private final dehn<T> f() {
        dehn<T> dehnVar;
        deig deigVar = null;
        do {
            dehnVar = this.e.get();
            if (dehnVar != null) {
                if (dehnVar.isDone()) {
                    try {
                        deha.r(dehnVar);
                    } catch (ExecutionException unused) {
                    }
                }
                return dehnVar;
            }
            if (deigVar == null) {
                deigVar = deig.d();
            }
        } while (!this.e.compareAndSet(dehnVar, deigVar));
        deigVar.p(this.j.b(dazv.f(new deff(this) { // from class: czlp
            private final czly a;

            {
                this.a = this;
            }

            @Override // defpackage.deff
            public final dehn a() {
                final czly czlyVar = this.a;
                try {
                    return deha.a(czlyVar.d((Uri) deha.r(czlyVar.a)));
                } catch (IOException e) {
                    czlx czlxVar = new czlx(czlyVar);
                    if ((e instanceof czir) || (e.getCause() instanceof czir)) {
                        return deha.b(e);
                    }
                    return deew.g(czlyVar.d.a(e, czlxVar), dazv.h(new defg(czlyVar) { // from class: czls
                        private final czly a;

                        {
                            this.a = czlyVar;
                        }

                        @Override // defpackage.defg
                        public final dehn a(Object obj) {
                            czly czlyVar2 = this.a;
                            Void r2 = (Void) obj;
                            return deha.a(czlyVar2.d((Uri) deha.r(czlyVar2.a)));
                        }
                    }), czlyVar.b);
                }
            }
        }), this.b));
        return deigVar;
    }

    @Override // defpackage.czmm
    public final deff<Void> a() {
        return new deff(this) { // from class: czlm
            private final czly a;

            {
                this.a = this;
            }

            @Override // defpackage.deff
            public final dehn a() {
                final czly czlyVar = this.a;
                return deha.o(deew.g(czlyVar.a, dazv.h(new defg(czlyVar) { // from class: czlu
                    private final czly a;

                    {
                        this.a = czlyVar;
                    }

                    @Override // defpackage.defg
                    public final dehn a(Object obj) {
                        czly czlyVar2 = this.a;
                        Uri uri = (Uri) obj;
                        Uri a = czmp.a(uri, ".bak");
                        try {
                            if (czlyVar2.c.b(a)) {
                                czlyVar2.c.c(a, uri);
                            }
                            return dehk.a;
                        } catch (IOException e) {
                            return deha.b(e);
                        }
                    }
                }), czlyVar.b));
            }
        };
    }

    @Override // defpackage.czmm
    public final dehn<Void> b(final defg<? super T, T> defgVar, final Executor executor) {
        final dehn<T> f = f();
        return this.j.b(dazv.f(new deff(this, f, defgVar, executor) { // from class: czln
            private final czly a;
            private final dehn b;
            private final defg c;
            private final Executor d;

            {
                this.a = this;
                this.b = f;
                this.c = defgVar;
                this.d = executor;
            }

            @Override // defpackage.deff
            public final dehn a() {
                final czly czlyVar = this.a;
                dehn dehnVar = this.b;
                defg defgVar2 = this.c;
                Executor executor2 = this.d;
                final dehn g = deew.g(dehnVar, new defg(czlyVar) { // from class: czlo
                    private final czly a;

                    {
                        this.a = czlyVar;
                    }

                    @Override // defpackage.defg
                    public final dehn a(Object obj) {
                        return (dehn) this.a.e.get();
                    }
                }, dege.a);
                final dehn g2 = deew.g(g, defgVar2, executor2);
                return deew.g(g2, dazv.h(new defg(czlyVar, g, g2) { // from class: czlq
                    private final czly a;
                    private final dehn b;
                    private final dehn c;

                    {
                        this.a = czlyVar;
                        this.b = g;
                        this.c = g2;
                    }

                    @Override // defpackage.defg
                    public final dehn a(Object obj) {
                        final czly czlyVar2 = this.a;
                        dehn dehnVar2 = this.b;
                        final dehn dehnVar3 = this.c;
                        if (!deha.r(dehnVar2).equals(deha.r(dehnVar3))) {
                            dehn g3 = deew.g(dehnVar3, dazv.h(new defg(czlyVar2, dehnVar3) { // from class: czlr
                                private final czly a;
                                private final dehn b;

                                {
                                    this.a = czlyVar2;
                                    this.b = dehnVar3;
                                }

                                @Override // defpackage.defg
                                public final dehn a(Object obj2) {
                                    czly czlyVar3 = this.a;
                                    dehn dehnVar4 = this.b;
                                    czlyVar3.e((Uri) deha.r(czlyVar3.a), obj2);
                                    czlyVar3.e.set(dehnVar4);
                                    return dehk.a;
                                }
                            }), czlyVar2.b);
                            czjx czjxVar = czlyVar2.f.get();
                            if (czjxVar == null) {
                                return g3;
                            }
                            deha.q(g3, new czlv(czjxVar), dege.a);
                            return g3;
                        }
                        return dehk.a;
                    }
                }), dege.a);
            }
        }), dege.a);
    }

    @Override // defpackage.czmm
    public final String c() {
        return this.g;
    }

    public final void e(Uri uri, T t) {
        Uri a = czmp.a(uri, ".tmp");
        try {
            dazg dazgVar = this.i;
            String valueOf = String.valueOf(this.g);
            dazk b = dazgVar.b(valueOf.length() != 0 ? "Write ".concat(valueOf) : new String("Write "), dbab.a);
            czio czioVar = new czio();
            try {
                OutputStream outputStream = (OutputStream) this.c.d(a, czjk.b(), czioVar);
                try {
                    this.h.a(t, outputStream);
                    czioVar.a();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (b != null) {
                        b.close();
                    }
                    this.c.c(a, uri);
                } catch (Throwable th) {
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (Throwable th2) {
                            deki.a(th, th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                throw czmo.b(this.c, uri, e);
            }
        } catch (IOException e2) {
            if (this.c.b(a)) {
                try {
                    this.c.a(a);
                } catch (IOException e3) {
                    deki.a(e2, e3);
                }
            }
            throw e2;
        }
    }

    @Override // defpackage.czmm
    public final dehn<T> h() {
        return f();
    }

    public final T d(Uri uri) {
        try {
            dazg dazgVar = this.i;
            String valueOf = String.valueOf(this.g);
            dazk b = dazgVar.b(valueOf.length() != 0 ? "Read ".concat(valueOf) : new String("Read "), dbab.a);
            try {
                InputStream inputStream = (InputStream) this.c.d(uri, czjj.b(), new czio[0]);
                T t = (T) ((czmv) this.h).e(inputStream);
                if (inputStream != null) {
                    inputStream.close();
                }
                if (b != null) {
                    b.close();
                }
                return t;
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
        } catch (FileNotFoundException e) {
            if (this.c.b(uri)) {
                throw e;
            }
            return ((czmu) this.h).a;
        } catch (IOException e2) {
            throw czmo.a(this.c, uri, e2);
        }
    }
}
