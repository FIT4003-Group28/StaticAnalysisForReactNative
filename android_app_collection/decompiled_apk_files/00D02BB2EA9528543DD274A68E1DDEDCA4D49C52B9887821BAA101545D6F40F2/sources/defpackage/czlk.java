package defpackage;

import android.net.Uri;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: czlk  reason: default package */
/* loaded from: classes5.dex */
public final class czlk<T> implements czmm<T> {
    static final czlg n = new czlg();
    public final String a;
    public final dehn<Uri> b;
    public final czks<T> c;
    public final Executor d;
    public final czif e;
    public final czkt f;
    public final dazg i;
    public T l;
    public boolean m;
    private final czju<T> o;
    public final czjv<T> g = new czli(this);
    public final czjv<T> h = new czlj(this);
    public final Object j = new Object();
    public final degn k = degn.a();
    private final degn p = degn.a();

    public czlk(String str, dehn<Uri> dehnVar, czks<T> czksVar, Executor executor, czif czifVar, czkt czktVar, czju<T> czjuVar, dazg dazgVar) {
        degn.a();
        this.l = null;
        this.a = str;
        this.b = deha.o(dehnVar);
        this.c = czksVar;
        this.d = executor;
        this.e = czifVar;
        this.f = czktVar;
        this.o = czjuVar;
        this.i = dazgVar;
    }

    public static <U> dehn<U> f(final dehn<U> dehnVar, final Closeable closeable, Executor executor) {
        return deha.k(dehnVar).b(new Callable(closeable, dehnVar) { // from class: czld
            private final Closeable a;
            private final dehn b;

            {
                this.a = closeable;
                this.b = dehnVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Closeable closeable2 = this.a;
                dehn dehnVar2 = this.b;
                closeable2.close();
                return deha.r(dehnVar2);
            }
        }, executor);
    }

    private final Closeable j(Uri uri) {
        try {
            czif czifVar = this.e;
            czjh czjhVar = new czjh(true);
            czjhVar.a = true;
            return (Closeable) czifVar.d(uri, czjhVar, new czio[0]);
        } catch (cziz unused) {
            return null;
        }
    }

    @Override // defpackage.czmm
    public final deff<Void> a() {
        return new deff(this) { // from class: czkv
            private final czlk a;

            {
                this.a = this;
            }

            @Override // defpackage.deff
            public final dehn a() {
                final czlk czlkVar = this.a;
                return czlkVar.f.b(deha.o(czlkVar.b), new Runnable(czlkVar) { // from class: czkx
                    private final czlk a;

                    {
                        this.a = czlkVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        czlk czlkVar2 = this.a;
                        synchronized (czlkVar2.j) {
                            czlkVar2.l = null;
                            czlkVar2.m = true;
                            synchronized (czlkVar2.j) {
                            }
                        }
                    }
                }, czjw.a);
            }
        };
    }

    @Override // defpackage.czmm
    public final dehn<Void> b(final defg<? super T, T> defgVar, final Executor executor) {
        return this.k.b(dazv.f(new deff(this, defgVar, executor) { // from class: czkz
            private final czlk a;
            private final defg b;
            private final Executor c;

            {
                this.a = this;
                this.b = defgVar;
                this.c = executor;
            }

            @Override // defpackage.deff
            public final dehn a() {
                final dehn g;
                final czlk czlkVar = this.a;
                defg defgVar2 = this.b;
                Executor executor2 = this.c;
                final Uri uri = (Uri) deha.r(czlkVar.b);
                czix a = czix.a((Closeable) czlkVar.e.d(uri, czjh.b(), new czio[0]));
                try {
                    try {
                        g = deha.a(czlkVar.d(uri));
                    } catch (IOException e) {
                        g = deew.g(czlkVar.g(e, czlkVar.h), dazv.h(new defg(czlkVar, uri) { // from class: czlf
                            private final czlk a;
                            private final Uri b;

                            {
                                this.a = czlkVar;
                                this.b = uri;
                            }

                            @Override // defpackage.defg
                            public final dehn a(Object obj) {
                                Void r3 = (Void) obj;
                                return deha.a(this.a.d(this.b));
                            }
                        }), czlkVar.d);
                    }
                    final dehn g2 = deew.g(g, defgVar2, executor2);
                    dehn f = czlk.f(deew.g(g2, dazv.h(new defg(czlkVar, g, g2) { // from class: czla
                        private final czlk a;
                        private final dehn b;
                        private final dehn c;

                        {
                            this.a = czlkVar;
                            this.b = g;
                            this.c = g2;
                        }

                        @Override // defpackage.defg
                        public final dehn a(Object obj) {
                            czlk czlkVar2 = this.a;
                            dehn dehnVar = this.b;
                            dehn dehnVar2 = this.c;
                            if (deha.r(dehnVar).equals(deha.r(dehnVar2))) {
                                return dehk.a;
                            }
                            return czlkVar2.e(dehnVar2);
                        }
                    }), dege.a), a.b(), czlkVar.d);
                    a.close();
                    return f;
                } catch (Throwable th) {
                    try {
                        a.close();
                    } catch (Throwable th2) {
                        deki.a(th, th2);
                    }
                    throw th;
                }
            }
        }), this.d);
    }

    @Override // defpackage.czmm
    public final String c() {
        return this.a;
    }

    public final dehn<Void> e(final dehn<T> dehnVar) {
        return deew.g(this.f.a(this.b, czjw.a), dazv.h(new defg(this, dehnVar) { // from class: czlb
            private final czlk a;
            private final dehn b;

            {
                this.a = this;
                this.b = dehnVar;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                final czlk czlkVar = this.a;
                Void r3 = (Void) obj;
                return deew.g(this.b, dazv.h(new defg(czlkVar) { // from class: czlc
                    private final czlk a;

                    {
                        this.a = czlkVar;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.defg
                    public final dehn a(Object obj2) {
                        czlk czlkVar2 = this.a;
                        Uri uri = (Uri) deha.r(czlkVar2.b);
                        Uri a = czmp.a(uri, ".tmp");
                        try {
                            dazg dazgVar = czlkVar2.i;
                            String valueOf = String.valueOf(czlkVar2.a);
                            dazk b = dazgVar.b(valueOf.length() != 0 ? "Write ".concat(valueOf) : new String("Write "), dbab.a);
                            czio czioVar = new czio();
                            try {
                                OutputStream outputStream = (OutputStream) czlkVar2.e.d(a, czjk.b(), czioVar);
                                try {
                                    czlkVar2.c.a(obj2, outputStream);
                                    czioVar.a();
                                    if (outputStream != null) {
                                        outputStream.close();
                                    }
                                    if (b != null) {
                                        b.close();
                                    }
                                    czlkVar2.e.c(a, uri);
                                    synchronized (czlkVar2.j) {
                                        czlkVar2.l = obj2;
                                    }
                                    return dehk.a;
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
                                throw czmo.b(czlkVar2.e, uri, e);
                            }
                        } catch (IOException e2) {
                            if (czlkVar2.e.b(a)) {
                                try {
                                    czlkVar2.e.a(a);
                                } catch (IOException e3) {
                                    deki.a(e2, e3);
                                }
                            }
                            throw e2;
                        }
                    }
                }), czlkVar.d);
            }
        }), dege.a);
    }

    public final dehn<Void> g(IOException iOException, czjv<T> czjvVar) {
        if ((iOException instanceof czir) || (iOException.getCause() instanceof czir)) {
            return deha.b(iOException);
        }
        return this.o.a(iOException, czjvVar);
    }

    @Override // defpackage.czmm
    public final dehn<T> h() {
        synchronized (this.j) {
            T t = this.l;
            if (t != null) {
                return deha.a(t);
            }
            return deha.o(this.p.b(dazv.f(new deff(this) { // from class: czky
                private final czlk a;

                {
                    this.a = this;
                }

                @Override // defpackage.deff
                public final dehn a() {
                    czlk czlkVar = this.a;
                    Uri uri = (Uri) deha.r(czlkVar.b);
                    try {
                        return deha.a(czlkVar.i(uri));
                    } catch (IOException e) {
                        return deew.g(czlkVar.g(e, czlkVar.g), dazv.h(new defg(czlkVar, uri) { // from class: czkw
                            private final czlk a;
                            private final Uri b;

                            {
                                this.a = czlkVar;
                                this.b = uri;
                            }

                            @Override // defpackage.defg
                            public final dehn a(Object obj) {
                                Void r3 = (Void) obj;
                                return deha.a(this.a.i(this.b));
                            }
                        }), czlkVar.d);
                    }
                }
            }), this.d));
        }
    }

    public final T i(Uri uri) {
        Closeable j;
        synchronized (this.j) {
            T t = this.l;
            if (t != null) {
                return t;
            }
            try {
                j = j(uri);
            } catch (FileNotFoundException unused) {
                T d = d(uri);
                synchronized (this.j) {
                    if (!this.m) {
                        this.l = d;
                    } else {
                        d = null;
                    }
                    if (d != null) {
                        return d;
                    }
                    j = j(uri);
                }
            }
            try {
                T d2 = d(uri);
                synchronized (this.j) {
                    if (j != null) {
                        this.l = d2;
                        j.close();
                    }
                }
                return d2;
            } catch (Throwable th) {
                if (j != null) {
                    try {
                        j.close();
                    } catch (Throwable th2) {
                        deki.a(th, th2);
                    }
                }
                throw th;
            }
        }
    }

    public final T d(Uri uri) {
        try {
            dazg dazgVar = this.i;
            String valueOf = String.valueOf(this.a);
            dazk b = dazgVar.b(valueOf.length() != 0 ? "Read ".concat(valueOf) : new String("Read "), dbab.a);
            try {
                InputStream inputStream = (InputStream) this.e.d(uri, czjj.b(), new czio[0]);
                T t = (T) ((czmv) this.c).e(inputStream);
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
            if (this.e.b(uri)) {
                throw e;
            }
            return ((czmu) this.c).a;
        } catch (IOException e2) {
            throw czmo.a(this.e, uri, e2);
        }
    }
}
