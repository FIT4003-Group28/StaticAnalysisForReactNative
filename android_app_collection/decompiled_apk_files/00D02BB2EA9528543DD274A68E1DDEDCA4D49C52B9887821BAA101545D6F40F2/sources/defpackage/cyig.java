package defpackage;

import android.content.Context;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Callable;
/* compiled from: PG */
@Deprecated
/* renamed from: cyig  reason: default package */
/* loaded from: classes5.dex */
public final class cyig implements cyib {
    public final Context a;
    public final dbty<cqwo> b;
    public final cyhv c;

    public cyig(Context context, final cyhv cyhvVar) {
        this.a = context;
        this.c = cyhvVar;
        context.getPackageName();
        this.b = dbud.a(new dbty(cyhvVar) { // from class: cyic
            private final cyhv a;

            {
                this.a = cyhvVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return ((cqwn) czhd.a(this.a.a, cqwn.class)).a();
            }
        });
    }

    @Override // defpackage.cyib
    public final dehn<Void> a(final ClientConfigInternal clientConfigInternal, dehp dehpVar) {
        cxju.c(this.a);
        cqvx a = this.c.a().a();
        this.c.b();
        final dbrn dbrnVar = new dbrn(this, clientConfigInternal) { // from class: cyid
            private final cyig a;
            private final ClientConfigInternal b;

            {
                this.a = this;
                this.b = clientConfigInternal;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                cyig cyigVar = this.a;
                ClientConfigInternal clientConfigInternal2 = this.b;
                cqvz cqvzVar = (cqvz) obj;
                cqwo a2 = cyigVar.b.a();
                ArrayList arrayList = new ArrayList();
                arrayList.add(clientConfigInternal2.u.s);
                arrayList.add(clientConfigInternal2.v.s);
                arrayList.add(cyfk.SENDKIT.s);
                dcpd<cyfk> it = clientConfigInternal2.w.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().s);
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                return a2.a();
            }
        };
        a.b();
        final cqvz a2 = a.a();
        dazk a3 = dbaa.a("Connecting GoogleApiClient");
        try {
            deig d = deig.d();
            a2.d();
            a2.e();
            a2.b();
            a3.a(d);
            a3.close();
            defw e = defw.b(d).e(new defq(dbrnVar, a2) { // from class: cqwe
                private final dbrn a;
                private final cqvz b;

                {
                    this.a = dbrnVar;
                    this.b = a2;
                }

                @Override // defpackage.defq
                public final defw a(defu defuVar, Object obj) {
                    Void r5 = (Void) obj;
                    final cqwa cqwaVar = (cqwa) this.a.a(this.b);
                    final deig d2 = deig.d();
                    cqwaVar.b();
                    defw d3 = defw.b(d2).d(cqwg.a, dege.a);
                    d3.c().Pk(new Runnable(d2, cqwaVar) { // from class: cqwh
                        private final deig a;
                        private final cqwa b;

                        {
                            this.a = d2;
                            this.b = cqwaVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            deig deigVar = this.a;
                            cqwa cqwaVar2 = this.b;
                            if (deigVar.isCancelled()) {
                                cqwaVar2.a();
                            }
                        }
                    }, dege.a);
                    return d3;
                }
            }, dehpVar).e(new defq(a2) { // from class: cqwf
                private final cqvz a;

                {
                    this.a = a2;
                }

                @Override // defpackage.defq
                public final defw a(defu defuVar, Object obj) {
                    final cqvz cqvzVar = this.a;
                    cqwc cqwcVar = (cqwc) obj;
                    if (cqwcVar instanceof cqwb) {
                        cqvzVar.getClass();
                        defuVar.a(new Closeable(cqvzVar) { // from class: cqwj
                            private final cqvz a;

                            {
                                this.a = cqvzVar;
                            }

                            @Override // java.io.Closeable, java.lang.AutoCloseable
                            public final void close() {
                                this.a.c();
                            }
                        }, dege.a);
                        return defw.b(deha.a(cqwcVar));
                    }
                    try {
                        cqvzVar.c();
                    } catch (Throwable unused) {
                    }
                    return defw.b(deha.a(cqwcVar));
                }
            }, dege.a);
            deha.q(e.c(), new cqwk(a2), dege.a);
            return e.d(cyie.a, dege.a).f();
        } catch (Throwable th) {
            try {
                a3.close();
            } catch (Throwable th2) {
                deki.a(th, th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cyib
    public final dehn<Void> b(String str, dehp dehpVar) {
        return dehpVar.c(new Callable(this) { // from class: cyif
            private final cyig a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                cyig cyigVar = this.a;
                cqvx a = cyigVar.c.a().a();
                cyigVar.c.b();
                cqvz a2 = a.b().a();
                if (!a2.a().a()) {
                    throw new cyia("connect failed");
                }
                boolean a3 = ((cqwm) czhd.a(cyigVar.c.a, cqwm.class)).a().a();
                a2.c();
                if (!a3) {
                    throw new cyia("commitForUser failed");
                }
                return null;
            }
        });
    }
}
