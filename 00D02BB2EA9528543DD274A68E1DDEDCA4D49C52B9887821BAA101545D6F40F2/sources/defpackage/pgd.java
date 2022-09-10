package defpackage;

import androidx.work.WorkerParameters;
import com.google.android.libraries.geller.portable.Geller;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: pgd  reason: default package */
/* loaded from: classes7.dex */
public final class pgd implements irw {
    public final Executor a;
    public final pgf b;
    public final dxio<akfa> c;
    public final dxio<isa> d;

    public pgd(Executor executor, pgf pgfVar, dxio<akfa> dxioVar, dxio<isa> dxioVar2) {
        this.b = pgfVar;
        this.a = executor;
        this.c = dxioVar;
        this.d = dxioVar2;
    }

    @Override // defpackage.irw
    public final dehn<bbx> a(final WorkerParameters workerParameters) {
        return deha.f(new deff(this, workerParameters) { // from class: pfz
            private final pgd a;
            private final WorkerParameters b;

            {
                this.a = this;
                this.b = workerParameters;
            }

            @Override // defpackage.deff
            public final dehn a() {
                pgd pgdVar = this.a;
                try {
                    dbsg r = dcbg.b(this.b.c).r(new dbsl() { // from class: pga
                        private final String a = "GellerCleanup";

                        @Override // defpackage.dbsl
                        public final boolean a(Object obj) {
                            return this.a.equals((String) obj);
                        }
                    });
                    if (!r.a()) {
                        return deha.a(bbx.c());
                    }
                    r.b();
                    List<String> s = pgdVar.c.a().s();
                    pgdVar.b.a().a(dcep.K(s));
                    ArrayList arrayList = new ArrayList();
                    for (final String str : s) {
                        arrayList.add(deew.g(pgdVar.b.b(), new defg(str) { // from class: pgb
                            private final String a;

                            {
                                this.a = str;
                            }

                            @Override // defpackage.defg
                            public final dehn a(Object obj) {
                                String str2 = this.a;
                                Geller geller = (Geller) obj;
                                dbsk.m(true, "cleanup() not allowed if Geller is read-only");
                                return deha.f(new deff(geller, str2) { // from class: cqzf
                                    private final Geller a;
                                    private final String b;

                                    {
                                        this.a = geller;
                                        this.b = str2;
                                    }

                                    @Override // defpackage.deff
                                    public final dehn a() {
                                        Geller geller2 = this.a;
                                        geller2.nativeCleanupAll(geller2.c, geller2.b(this.b));
                                        return dehk.a;
                                    }
                                }, geller.b);
                            }
                        }, pgdVar.a));
                    }
                    return deha.n(arrayList).b(pgc.a, pgdVar.a);
                } catch (RuntimeException e) {
                    pgdVar.d.a().b(6, e);
                    return deha.a(bbx.c());
                }
            }
        }, this.a);
    }
}
