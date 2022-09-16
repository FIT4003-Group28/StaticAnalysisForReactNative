package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dezu  reason: default package */
/* loaded from: classes6.dex */
public final class dezu extends dyex {
    public final Object a = new Object();
    public final Queue<Runnable> b = new ArrayDeque();
    public dyex c;
    final /* synthetic */ dyeu d;
    final /* synthetic */ dyib e;
    final /* synthetic */ dyet f;

    public dezu(dyeu dyeuVar, dyib dyibVar, dyet dyetVar) {
        this.d = dyeuVar;
        this.e = dyibVar;
        this.f = dyetVar;
        this.c = dyeuVar.a(dyibVar, dyetVar);
    }

    @Override // defpackage.dyex
    public final void a(final dyew dyewVar, dyhw dyhwVar) {
        synchronized (this.a) {
            final dyhw dyhwVar2 = new dyhw();
            dyhwVar2.k(dyhwVar);
            this.b.add(new Runnable(this, dyewVar, dyhwVar2) { // from class: dezo
                private final dezu a;
                private final dyew b;
                private final dyhw c;

                {
                    this.a = this;
                    this.b = dyewVar;
                    this.c = dyhwVar2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    dezu dezuVar = this.a;
                    dezuVar.b().a(this.b, this.c);
                }
            });
            b().a(new dezt(this, dyewVar), dyhwVar);
        }
    }

    public final dyex b() {
        dyex dyexVar;
        synchronized (this.a) {
            dyexVar = this.c;
        }
        return dyexVar;
    }

    @Override // defpackage.dyex
    public final void c(final int i) {
        synchronized (this.a) {
            this.b.add(new Runnable(this, i) { // from class: dezp
                private final dezu a;
                private final int b;

                {
                    this.a = this;
                    this.b = i;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    dezu dezuVar = this.a;
                    dezuVar.b().c(this.b);
                }
            });
            b().c(i);
        }
    }

    @Override // defpackage.dyex
    public final void d(@dzsi final String str, @dzsi final Throwable th) {
        synchronized (this.a) {
            this.b.add(new Runnable(this, str, th) { // from class: dezq
                private final dezu a;
                private final String b;
                private final Throwable c;

                {
                    this.a = this;
                    this.b = str;
                    this.c = th;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    dezu dezuVar = this.a;
                    dezuVar.b().d(this.b, this.c);
                }
            });
            b().d(str, th);
        }
    }

    @Override // defpackage.dyex
    public final void e() {
        synchronized (this.a) {
            this.b.add(new Runnable(this) { // from class: dezr
                private final dezu a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b().e();
                }
            });
            b().e();
        }
    }

    @Override // defpackage.dyex
    public final void f(final Object obj) {
        synchronized (this.a) {
            this.b.add(new Runnable(this, obj) { // from class: dezs
                private final dezu a;
                private final Object b;

                {
                    this.a = this;
                    this.b = obj;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    dezu dezuVar = this.a;
                    dezuVar.b().f(this.b);
                }
            });
            b().f(obj);
        }
    }
}
