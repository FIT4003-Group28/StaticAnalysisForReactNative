package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.learning.InAppTrainerOptions;
import java.util.Collection;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ahln  reason: default package */
/* loaded from: classes2.dex */
public final class ahln implements ahlr {
    public final Executor a;
    public final Context b;
    public final akfa c;
    public final cjqy d;
    public final btvo f;
    public final cspt<Void, Collection<cspy<eavq>>> h;
    public final cspt<Void, Collection<cspy<eavq>>> i;
    public final cspt<Void, Collection<cspy<eavq>>> j;
    private final afdw k;
    public String e = "federated_location_population";
    private final ahle l = new ahle();
    public dkkx g = dkkx.h;

    public ahln(Executor executor, Application application, btvo btvoVar, afdw afdwVar, akfa akfaVar, cjqy cjqyVar, cspt<Void, Collection<cspy<eavq>>> csptVar, cspt<Void, Collection<cspy<eavq>>> csptVar2, cspt<Void, Collection<cspy<eavq>>> csptVar3) {
        this.a = executor;
        this.b = application;
        this.k = afdwVar;
        this.c = akfaVar;
        this.f = btvoVar;
        this.d = cjqyVar;
        this.h = csptVar;
        this.i = csptVar2;
        this.j = csptVar3;
    }

    private final void b(cogy cogyVar, final String str, eavq eavqVar) {
        cogy.a(str);
        deha.q(cogyVar.b.a(new dbrn(str) { // from class: cogv
            private final String a;

            {
                this.a = str;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                String str2 = this.a;
                ((cohc) obj).a.delete("collections", "collection_name = ?", new String[]{str2});
                if (str2.length() == 0) {
                    new String("Cleared collection ");
                }
                int i = cohd.e;
                return null;
            }
        }), new ahlm(this, str, cogyVar, eavqVar), this.a);
    }

    public final void a() {
        btlu j = this.c.j();
        if (this.k.a() && j != null && j.m()) {
            final Context context = this.b;
            final Executor executor = this.a;
            final cpct cpctVar = new cpct();
            executor.execute(new Runnable(context, cpctVar, executor) { // from class: coil
                private final Context a;
                private final cpct b;
                private final Executor c;

                {
                    this.a = context;
                    this.b = cpctVar;
                    this.c = executor;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Context context2 = this.a;
                    cpct cpctVar2 = this.b;
                    Executor executor2 = this.c;
                    try {
                        coig coigVar = (coig) cohu.a(context2, "com.google.android.gms.learning.dynamite.training.InAppTrainerCancellerImpl", coim.a);
                        try {
                            coigVar.f(cobb.b(context2), cobb.b(executor2), new coin(cpctVar2, coigVar));
                        } catch (RemoteException e) {
                            cpctVar2.d(new cnob(new Status(8, dbue.g(e))));
                        }
                    } catch (cohs e2) {
                        String valueOf = String.valueOf(e2.getMessage());
                        cpctVar2.d(new cnob(new Status(17, valueOf.length() != 0 ? "Cannot create in-app canceller: ".concat(valueOf) : new String("Cannot create in-app canceller: "))));
                    }
                }
            });
            cpctVar.a.g(this.a, ahlf.a).m(new cpcf(this) { // from class: ahlg
                private final ahln a;

                {
                    this.a = this;
                }

                @Override // defpackage.cpcf
                public final void a(cpcq cpcqVar) {
                    ahln ahlnVar = this.a;
                    cpcqVar.b();
                    try {
                        bvow.e(ahlnVar.b, "learning_bg");
                    } catch (bvov unused) {
                    }
                }
            });
            return;
        }
        dkkx dkkxVar = this.g;
        if ((dkkxVar.a & 2) != 0) {
            this.e = dkkxVar.c;
        }
        final Context context2 = this.b;
        final Executor executor2 = this.a;
        cogi cogiVar = new cogi();
        dbsk.a(true);
        cogiVar.a = "federated_location_session";
        cogiVar.b = 2345;
        cogiVar.c = true;
        String str = this.e;
        dbsk.s(str);
        dbsk.a(true ^ str.isEmpty());
        cogiVar.d = str;
        final InAppTrainerOptions inAppTrainerOptions = new InAppTrainerOptions(cogiVar.a, cogiVar.b, cogiVar.c, cogiVar.d, 0, null, null, null, 0L, null, null, cogiVar.e, null);
        final cpct cpctVar2 = new cpct();
        executor2.execute(new Runnable(context2, cpctVar2, executor2, inAppTrainerOptions) { // from class: coiq
            private final Context a;
            private final cpct b;
            private final Executor c;
            private final InAppTrainerOptions d;

            {
                this.a = context2;
                this.b = cpctVar2;
                this.c = executor2;
                this.d = inAppTrainerOptions;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                Context context3 = this.a;
                cpct cpctVar3 = this.b;
                Executor executor3 = this.c;
                InAppTrainerOptions inAppTrainerOptions2 = this.d;
                synchronized (cogb.a) {
                    z = cogb.b;
                }
                if (!z) {
                    Class<?> cls = context3.getApplicationContext().getClass();
                    if (!cls.equals(Application.class) && !"android.support.multidex.MultiDexApplication".equals(cls.getName())) {
                        String name = cls.getName();
                        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 146);
                        sb.append("Cannot create in-app trainer: android.app.Application class has been subclassed (");
                        sb.append(name);
                        sb.append(") and BrellaInit.myAppCanHandleMultipleProcesses() was not called");
                        cpctVar3.d(new cnob(new Status(10, sb.toString())));
                        return;
                    }
                }
                try {
                    coif coifVar = (coif) cohu.a(context3, "com.google.android.gms.learning.dynamite.training.InAppTrainerImpl", coir.a);
                    cois coisVar = new cois(cpctVar3, coifVar);
                    try {
                        if (coifVar.i(cobb.b(context3), cobb.b(executor3), inAppTrainerOptions2, coisVar)) {
                            return;
                        }
                        if (inAppTrainerOptions2.l != null) {
                            cpctVar3.d(new cnob(new Status(10, "local computation plan with TensorflowSpec is not supported.")));
                            return;
                        }
                        try {
                            if (coifVar.h(cobb.b(context3), cobb.b(executor3), inAppTrainerOptions2, coisVar)) {
                                return;
                            }
                            if (inAppTrainerOptions2.a().length > 0) {
                                cpctVar3.d(new cnob(new Status(10, "Context data is not supported.")));
                                return;
                            }
                            try {
                                if (coifVar.g(cobb.b(context3), cobb.b(executor3), inAppTrainerOptions2, coisVar)) {
                                    return;
                                }
                                if (inAppTrainerOptions2.d == null || inAppTrainerOptions2.k == null) {
                                    try {
                                        if (coifVar.f(cobb.b(context3), cobb.b(executor3), inAppTrainerOptions2, coisVar)) {
                                            return;
                                        }
                                        int i = inAppTrainerOptions2.e;
                                        if (i == 0 || i == 1) {
                                            try {
                                                if (coifVar.e(cobb.b(context3), cobb.b(executor3), inAppTrainerOptions2, coisVar)) {
                                                    return;
                                                }
                                                cpctVar3.d(new cnob(new Status(17, "Failed to init impl")));
                                                return;
                                            } catch (RemoteException e) {
                                                cpctVar3.d(new cnob(new Status(8, dbue.g(e))));
                                                return;
                                            }
                                        }
                                        cpctVar3.d(new cnob(new Status(10, "Unsupported AttestationMode")));
                                        return;
                                    } catch (RemoteException e2) {
                                        cpctVar3.d(new cnob(new Status(8, dbue.g(e2))));
                                        return;
                                    }
                                }
                                cpctVar3.d(new cnob(new Status(10, "Training interval is not supported for federated computation.")));
                            } catch (RemoteException e3) {
                                cpctVar3.d(new cnob(new Status(8, dbue.g(e3))));
                            }
                        } catch (RemoteException e4) {
                            cpctVar3.d(new cnob(new Status(8, dbue.g(e4))));
                        }
                    } catch (RemoteException e5) {
                        cpctVar3.d(new cnob(new Status(8, dbue.g(e5))));
                    }
                } catch (cohs e6) {
                    String valueOf = String.valueOf(e6.getMessage());
                    cpctVar3.d(new cnob(new Status(17, valueOf.length() != 0 ? "Cannot create in-app trainer: ".concat(valueOf) : new String("Cannot create in-app trainer: "))));
                }
            }
        });
        cpcq g = cpctVar2.a.g(this.a, ahlh.a);
        g.s(new cpcl() { // from class: ahli
            @Override // defpackage.cpcl
            public final void c(Object obj) {
                cpcq cpcqVar = (cpcq) obj;
            }
        });
        g.r(new cpci(this) { // from class: ahlj
            private final ahln a;

            {
                this.a = this;
            }

            @Override // defpackage.cpci
            public final void d(Exception exc) {
            }
        });
        cogy a = cohf.a(this.b);
        eavr bZ = eavs.c.bZ();
        eavy bZ2 = eavz.b.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        eavz eavzVar = (eavz) bZ2.b;
        dsri dsriVar = eavzVar.a;
        if (!dsriVar.a()) {
            eavzVar.a = dsqw.ci(dsriVar);
        }
        eavzVar.a.d(1L);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        eavs eavsVar = (eavs) bZ.b;
        eavz bK = bZ2.bK();
        bK.getClass();
        eavsVar.b = bK;
        eavsVar.a = 3;
        eavp bZ3 = eavq.b.bZ();
        eavt bZ4 = eavv.b.bZ();
        bZ4.a("client_count", bZ.bK());
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        eavv bK2 = bZ4.bK();
        bK2.getClass();
        ((eavq) bZ3.b).a = bK2;
        b(a, "/federated_location_count_collection", bZ3.bK());
        ahle ahleVar = this.l;
        eavt bZ5 = eavv.b.bZ();
        dcpd<String> it = ahle.b.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (ahleVar.a.nextDouble() >= 0.5d) {
                eavw bZ6 = eavx.b.bZ();
                for (int i = 0; i < 11; i++) {
                    float nextFloat = (ahleVar.a.nextFloat() * 20.0f) - 10.0f;
                    if (bZ6.c) {
                        bZ6.bF();
                        bZ6.c = false;
                    }
                    eavx eavxVar = (eavx) bZ6.b;
                    dsre dsreVar = eavxVar.a;
                    if (!dsreVar.a()) {
                        eavxVar.a = dsqw.cj(dsreVar);
                    }
                    eavxVar.a.g(nextFloat);
                }
                eavr bZ7 = eavs.c.bZ();
                if (bZ7.c) {
                    bZ7.bF();
                    bZ7.c = false;
                }
                eavs eavsVar2 = (eavs) bZ7.b;
                eavx bK3 = bZ6.bK();
                bK3.getClass();
                eavsVar2.b = bK3;
                eavsVar2.a = 2;
                bZ5.a(next, bZ7.bK());
            }
        }
        eavp bZ8 = eavq.b.bZ();
        if (bZ8.c) {
            bZ8.bF();
            bZ8.c = false;
        }
        eavv bK4 = bZ5.bK();
        bK4.getClass();
        ((eavq) bZ8.b).a = bK4;
        b(a, "/federated_location_dummy_elsa_collection", bZ8.bK());
    }
}
