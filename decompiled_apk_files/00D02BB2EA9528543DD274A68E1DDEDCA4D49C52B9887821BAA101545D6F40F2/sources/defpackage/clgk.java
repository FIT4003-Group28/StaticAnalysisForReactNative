package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: clgk  reason: default package */
/* loaded from: classes5.dex */
public final class clgk {
    public final Context a;
    public final clgu b;
    public final clgq c;
    public final clif d;
    public final clig e;
    public final clfm f;
    private final Executor g;

    public clgk(Context context, clfm clfmVar, clgu clguVar, clgq clgqVar, Executor executor, clif clifVar, clig cligVar) {
        this.a = context;
        this.f = clfmVar;
        this.b = clguVar;
        this.c = clgqVar;
        this.g = executor;
        this.d = clifVar;
        this.e = cligVar;
    }

    public final void a(final clew clewVar, final int i, final Runnable runnable) {
        this.g.execute(new Runnable(this, clewVar, i, runnable) { // from class: clgf
            private final clgk a;
            private final clew b;
            private final int c;
            private final Runnable d;

            {
                this.a = this;
                this.b = clewVar;
                this.c = i;
                this.d = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                clfh a;
                final clgk clgkVar = this.a;
                final clew clewVar2 = this.b;
                final int i2 = this.c;
                Runnable runnable2 = this.d;
                try {
                    clif clifVar = clgkVar.d;
                    final clgu clguVar = clgkVar.b;
                    clguVar.getClass();
                    clifVar.k(new clie(clguVar) { // from class: clgi
                        private final clgu a;

                        {
                            this.a = clguVar;
                        }

                        @Override // defpackage.clie
                        public final Object a() {
                            return Integer.valueOf(this.a.h());
                        }
                    });
                    NetworkInfo activeNetworkInfo = ((ConnectivityManager) clgkVar.a.getSystemService("connectivity")).getActiveNetworkInfo();
                    if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                        clgkVar.d.k(new clie(clgkVar, clewVar2, i2) { // from class: clgj
                            private final clgk a;
                            private final clew b;
                            private final int c;

                            {
                                this.a = clgkVar;
                                this.b = clewVar2;
                                this.c = i2;
                            }

                            @Override // defpackage.clie
                            public final Object a() {
                                clgk clgkVar2 = this.a;
                                clgkVar2.c.a(this.b, this.c + 1);
                                return null;
                            }
                        });
                    } else {
                        clfo a2 = clgkVar.f.a(clewVar2.a());
                        final Iterable<clgz> iterable = (Iterable) clgkVar.d.k(new clie(clgkVar, clewVar2) { // from class: clgg
                            private final clgk a;
                            private final clew b;

                            {
                                this.a = clgkVar;
                                this.b = clewVar2;
                            }

                            @Override // defpackage.clie
                            public final Object a() {
                                clgk clgkVar2 = this.a;
                                return clgkVar2.b.f(this.b);
                            }
                        });
                        if (iterable.iterator().hasNext()) {
                            if (a2 == null) {
                                clfp.b("Uploader");
                                a = clfh.d();
                            } else {
                                ArrayList arrayList = new ArrayList();
                                for (clgz clgzVar : iterable) {
                                    arrayList.add(clgzVar.c());
                                }
                                clfa clfaVar = new clfa();
                                clfaVar.a = arrayList;
                                clfaVar.b = clewVar2.b();
                                String str = "";
                                if (clfaVar.a == null) {
                                    str = " events";
                                }
                                if (!str.isEmpty()) {
                                    throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
                                }
                                a = a2.a(new clfb(clfaVar.a, clfaVar.b));
                            }
                            final clfh clfhVar = a;
                            clgkVar.d.k(new clie(clgkVar, clfhVar, iterable, clewVar2, i2) { // from class: clgh
                                private final clgk a;
                                private final clfh b;
                                private final Iterable c;
                                private final clew d;
                                private final int e;

                                {
                                    this.a = clgkVar;
                                    this.b = clfhVar;
                                    this.c = iterable;
                                    this.d = clewVar2;
                                    this.e = i2;
                                }

                                @Override // defpackage.clie
                                public final Object a() {
                                    clgk clgkVar2 = this.a;
                                    clfh clfhVar2 = this.b;
                                    Iterable<clgz> iterable2 = this.c;
                                    clew clewVar3 = this.d;
                                    int i3 = this.e;
                                    if (clfhVar2.b() == 2) {
                                        clgkVar2.b.a(iterable2);
                                        clgkVar2.c.a(clewVar3, i3 + 1);
                                        return null;
                                    }
                                    clgkVar2.b.b(iterable2);
                                    if (clfhVar2.b() == 1) {
                                        clgkVar2.b.d(clewVar3, System.currentTimeMillis() + clfhVar2.a());
                                    }
                                    if (!clgkVar2.b.e(clewVar3)) {
                                        return null;
                                    }
                                    clgkVar2.c.a(clewVar3, 1);
                                    return null;
                                }
                            });
                        }
                    }
                } catch (clid unused) {
                    clgkVar.c.a(clewVar2, i2 + 1);
                } finally {
                    runnable2.run();
                }
            }
        });
    }
}
