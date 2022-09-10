package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cfry  reason: default package */
/* loaded from: classes4.dex */
public final class cfry {
    public static final /* synthetic */ int g = 0;
    private static final long h = TimeUnit.DAYS.toMillis(7);
    public final cqat a;
    public final bzwd<cfsa> b;
    public final Executor c;
    public final z<cfsa> d = new z<>();
    public final akfa e;
    @dzsi
    public cfsa f;
    private final Executor i;

    public cfry(cqat cqatVar, bzwc bzwcVar, Executor executor, Executor executor2, akfa akfaVar) {
        this.a = cqatVar;
        this.b = bzwcVar.a("ugc_tab_cache_file_name", (dssr) cfsa.f.cu(7));
        this.c = executor;
        this.i = executor2;
        this.e = akfaVar;
    }

    public final void a(@dzsi final cfsa cfsaVar) {
        this.i.execute(new Runnable(this, cfsaVar) { // from class: cfrw
            private final cfry a;
            private final cfsa b;

            {
                this.a = this;
                this.b = cfsaVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cfry cfryVar = this.a;
                cfryVar.d.g(this.b);
            }
        });
    }

    public final boolean b(final cfsa cfsaVar) {
        return (cfsaVar.a & 4) != 0 && h >= this.a.b() - cfsaVar.e && ((Boolean) dbsg.j(this.e.j()).h(new dbrn(cfsaVar) { // from class: cfrx
            private final cfsa a;

            {
                this.a = cfsaVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                cfsa cfsaVar2 = this.a;
                btlu btluVar = (btlu) obj;
                int i = cfry.g;
                boolean z = false;
                if (btlu.i(btluVar).equals(btlt.GOOGLE) && cfsaVar2.b.equals(btluVar.d)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }).c(false)).booleanValue();
    }
}
