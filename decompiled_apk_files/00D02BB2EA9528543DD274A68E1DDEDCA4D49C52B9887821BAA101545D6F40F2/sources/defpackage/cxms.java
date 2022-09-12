package defpackage;

import android.os.StrictMode;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: cxms  reason: default package */
/* loaded from: classes5.dex */
final class cxms extends cxlb<Object> {
    public cxms(cxji cxjiVar, String str) {
        super(cxjiVar, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cxlb
    public final Map<String, Object> a() {
        final cxmx cxmxVar;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            try {
                cxmxVar = (cxmx) cxmv.b(this.d, this.e, false).b().get();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new cxmr(e);
            } catch (CancellationException | ExecutionException unused) {
                String str = this.e;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
                sb.append("Unable to retrieve flag snapshot for ");
                sb.append(str);
                sb.append(" from storage.");
                sb.toString();
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                cxmxVar = null;
            }
            if (cxmxVar != null && !cxmxVar.b.isEmpty()) {
                this.d.c().execute(new Runnable(this, cxmxVar) { // from class: cxmn
                    private final cxms a;
                    private final cxmx b;

                    {
                        this.a = this;
                        this.b = cxmxVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        final cxms cxmsVar = this.a;
                        final dehn<Void> a = cxmsVar.d.d().a(this.b.b);
                        a.Pk(new Runnable(cxmsVar, a) { // from class: cxmo
                            private final cxms a;
                            private final dehn b;

                            {
                                this.a = cxmsVar;
                                this.b = a;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                cxms cxmsVar2 = this.a;
                                try {
                                    deha.r(this.b);
                                } catch (ExecutionException e2) {
                                    if (!(e2.getCause() instanceof cxkc) || ((cxkc) e2.getCause()).a != 29501) {
                                        return;
                                    }
                                    String str2 = cxmsVar2.e;
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 68);
                                    sb2.append("Failed to commit due to stale snapshot for ");
                                    sb2.append(str2);
                                    sb2.append(", triggering flag update.");
                                    sb2.toString();
                                    cxmsVar2.b();
                                }
                            }
                        }, cxmsVar.d.c());
                    }
                });
                return cxmv.f(cxmxVar);
            }
            this.d.c().execute(new Runnable(this) { // from class: cxmm
                private final cxms a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b();
                }
            });
            String str2 = this.e;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 54);
            sb2.append("Unable to retrieve flag snapshot for ");
            sb2.append(str2);
            sb2.append(", using defaults.");
            sb2.toString();
            return dcmn.a;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cxlb
    public final void b() {
        final dehn<cxmx> c = cxmv.c(this.d, this.e, "");
        deew.g(c, new defg(this) { // from class: cxmp
            private final cxms a;

            {
                this.a = this;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                cxms cxmsVar = this.a;
                return cxmv.d(cxmsVar.d, cxmsVar.e, (cxmx) obj, false);
            }
        }, this.d.c()).Pk(new Runnable(this, c) { // from class: cxmq
            private final cxms a;
            private final dehn b;

            {
                this.a = this;
                this.b = c;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.c(this.b);
            }
        }, this.d.c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void c(dehn dehnVar) {
        try {
            if (this.f.a(cxmv.f((cxmx) deha.r(dehnVar)))) {
                return;
            }
            cxly.a(this.d.c());
        } catch (CancellationException | ExecutionException unused) {
            String str = this.e;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
            sb.append("Unable to update local snapshot for ");
            sb.append(str);
            sb.append(", may result in stale flags.");
            sb.toString();
        }
    }
}
