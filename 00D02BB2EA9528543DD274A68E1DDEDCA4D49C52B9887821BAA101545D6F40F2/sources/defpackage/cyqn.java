package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cyqn  reason: default package */
/* loaded from: classes5.dex */
public final class cyqn implements cyqx {
    public final dbsl<String> a;
    public final String[] b;
    public final Context c;
    public final cyph d;
    public final cyqh e;
    private final cqat f;
    private final dehp g;

    public cyqn(Context context, dbsl<String> dbslVar, cqat cqatVar, dehp dehpVar, cyph cyphVar) {
        String[] databaseList = context.databaseList();
        cyqh cyqhVar = new cyqh(dehpVar);
        this.c = context;
        this.b = databaseList;
        this.a = dbslVar;
        this.f = cqatVar;
        this.g = dehpVar;
        this.d = cyphVar;
        this.e = cyqhVar;
    }

    @Override // defpackage.cyqx
    public final void a(long j, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j);
        long b = this.f.b();
        final long j2 = b - millis;
        if (b <= 0) {
            this.d.c(60, cyor.a);
            return;
        }
        deha.q(this.g.c(new Callable(this, j2) { // from class: cyqi
            private final cyqn a;
            private final long b;

            {
                this.a = this;
                this.b = j2;
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
                if ((r4 instanceof defpackage.bn) == false) goto L10;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
                if (java.lang.Thread.interrupted() != false) goto L12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
                throw new java.lang.InterruptedException();
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
                if ((r4 instanceof defpackage.bn) != false) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
                ((defpackage.bn) r4).C();
             */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    r9 = this;
                    cyqn r0 = r9.a
                    long r1 = r9.b
                    java.lang.String[] r3 = r0.b
                    dcpd r3 = defpackage.dcgh.s(r3)
                    dbsl<java.lang.String> r4 = r0.a
                    r4.getClass()
                    cyqj r5 = new cyqj
                    r5.<init>(r4)
                    dcpd r3 = defpackage.dcgh.i(r3, r5)
                    cyqk r4 = new cyqk
                    r4.<init>(r0)
                    java.util.Iterator r3 = defpackage.dcgh.l(r3, r4)
                L21:
                    boolean r4 = r3.hasNext()
                    if (r4 == 0) goto L6c
                    java.lang.Object r4 = r3.next()
                    cyqp r4 = (defpackage.cyqp) r4
                    cyph r5 = r0.d
                    cyql r6 = new cyql     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
                    r6.<init>(r4, r1, r5)     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
                    r4.m(r6)     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
                    boolean r5 = r4 instanceof defpackage.bn
                    if (r5 == 0) goto L54
                L3b:
                    bn r4 = (defpackage.bn) r4
                    r4.C()
                    goto L54
                L41:
                    r0 = move-exception
                    goto L61
                L43:
                    r6 = move-exception
                    int r6 = defpackage.cyos.a(r6)     // Catch: java.lang.Throwable -> L41
                    cyor r7 = defpackage.cyor.a     // Catch: java.lang.Throwable -> L41
                    r8 = 25
                    defpackage.cypg.c(r5, r8, r6, r7)     // Catch: java.lang.Throwable -> L41
                    boolean r5 = r4 instanceof defpackage.bn
                    if (r5 == 0) goto L54
                    goto L3b
                L54:
                    boolean r4 = java.lang.Thread.interrupted()
                    if (r4 != 0) goto L5b
                    goto L21
                L5b:
                    java.lang.InterruptedException r0 = new java.lang.InterruptedException
                    r0.<init>()
                    throw r0
                L61:
                    boolean r1 = r4 instanceof defpackage.bn
                    if (r1 != 0) goto L66
                    goto L6b
                L66:
                    bn r4 = (defpackage.bn) r4
                    r4.C()
                L6b:
                    throw r0
                L6c:
                    r0 = 0
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cyqi.call():java.lang.Object");
            }
        }), new cyqm(this, this.d.b()), this.g);
    }
}
