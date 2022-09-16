package defpackage;

import androidx.window.java.layout.WindowInfoRepositoryCallbackAdapter;
import androidx.window.layout.WindowLayoutInfo;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: zbl  reason: default package */
/* loaded from: classes4.dex */
public final class zbl implements zbc {
    private final ayoi a;
    private final /* synthetic */ int b;

    public zbl(zbc zbcVar, final azqb azqbVar, ypf ypfVar, int i) {
        this.b = i;
        this.a = zbcVar.a().af(new ayqe() { // from class: zbg
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                azqb azqbVar2 = azqb.this;
                zbb zbbVar = (zbb) obj;
                if (zbbVar instanceof zbf) {
                    return ((zbc) azqbVar2.get()).a();
                }
                return ayoi.T(zbbVar);
            }
        }).aE().aI().q(zna.t(ypfVar.a()));
    }

    @Override // defpackage.zbc
    public final ayoi a() {
        return this.b != 0 ? this.a : this.a;
    }

    public zbl(final WindowInfoRepositoryCallbackAdapter windowInfoRepositoryCallbackAdapter, ypf ypfVar, final Executor executor, ayor ayorVar, final ayor ayorVar2) {
        windowInfoRepositoryCallbackAdapter.getClass();
        ayoi V = ayoi.w(new ayoj() { // from class: zbj
            @Override // defpackage.ayoj
            public final void a(final azeh azehVar) {
                final WindowInfoRepositoryCallbackAdapter windowInfoRepositoryCallbackAdapter2 = WindowInfoRepositoryCallbackAdapter.this;
                Executor executor2 = executor;
                final ji jiVar = new ji() { // from class: zbi
                    @Override // defpackage.ji
                    public final void accept(Object obj) {
                        azeh azehVar2 = azeh.this;
                        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
                        if (!azehVar2.e()) {
                            azehVar2.a(windowLayoutInfo);
                        }
                    }
                };
                ayqi.f(azehVar, banl.n(new aypv() { // from class: zbk
                    @Override // defpackage.aypv
                    public final void a() {
                        WindowInfoRepositoryCallbackAdapter.this.removeWindowLayoutInfoListener(jiVar);
                    }
                }));
                windowInfoRepositoryCallbackAdapter2.addWindowLayoutInfoListener(executor2, jiVar);
            }
        }).V(yps.f).V(yps.g);
        final zbf b = zdb.b();
        final TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        aqxo.q(true, "waitUntil must be more than 0");
        timeUnit.getClass();
        ayorVar2.getClass();
        this.a = V.q(new ayol() { // from class: zhp
            @Override // defpackage.ayol
            public final ayok a(ayoi ayoiVar) {
                final Object obj = b;
                final TimeUnit timeUnit2 = timeUnit;
                final ayor ayorVar3 = ayorVar2;
                azhn azhnVar = new azhn(ayoiVar, new ayqe() { // from class: zhr
                    @Override // defpackage.ayqe
                    public final Object a(Object obj2) {
                        ayoi ayoiVar2 = (ayoi) obj2;
                        ayoi v = ayoi.T(obj).aC(10L, timeUnit2, ayorVar3).v(ayoiVar2);
                        ayrd.b(ayoiVar2, "other is null");
                        azdr azdrVar = new azdr(new ayok[]{v, ayoiVar2});
                        azqc.i();
                        return azdrVar;
                    }
                });
                azqc.i();
                return azhnVar;
            }
        }).B().X(ayorVar).q(zna.t(ypfVar.a()));
    }
}
