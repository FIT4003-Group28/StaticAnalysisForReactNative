package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: jgz  reason: default package */
/* loaded from: classes3.dex */
public final class jgz implements ynl {
    public final Context a;
    public final ankw b;
    public final jgu c;
    public final aapv d;
    public final afvn e;
    public final Object f = new Object();
    public ankt g;

    public jgz(Context context, ankw ankwVar, jgu jguVar, aapv aapvVar, afvn afvnVar) {
        this.a = context;
        this.b = ankwVar;
        this.c = jguVar;
        this.d = aapvVar;
        this.e = afvnVar;
    }

    public final ankt a() {
        ankt anktVar;
        synchronized (this.f) {
            if (this.g == null) {
                this.g = anii.i(this.b.qp(new Callable() { // from class: jgy
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        jgz jgzVar = jgz.this;
                        ylr.b();
                        try {
                            return (arbf) aopi.parseFrom(arbf.a, jgzVar.a.getResources().openRawResource(R.raw.downloads_platform_persistent_android_fut), aoos.b());
                        } catch (IOException e) {
                            zep.d("Could not load persisted framework update transport", e);
                            return arbf.a;
                        }
                    }
                }), new anir() { // from class: jgv
                    @Override // defpackage.anir
                    public final ankt a(Object obj) {
                        final jgz jgzVar = jgz.this;
                        final arbf arbfVar = (arbf) obj;
                        final jgu jguVar = jgzVar.c;
                        Runnable runnable = new Runnable() { // from class: jgx
                            @Override // java.lang.Runnable
                            public final void run() {
                                jgz jgzVar2 = jgz.this;
                                jgzVar2.d.a(jgzVar2.e.c(), arbfVar, null);
                            }
                        };
                        final aqvw a = aaje.a(arbfVar);
                        if (a == null) {
                            return jguVar.c.qq(runnable, arbfVar);
                        }
                        return anii.i(jguVar.c.qq(runnable, arbfVar), new aefs(aed.c(new agr() { // from class: jgp
                            @Override // defpackage.agr
                            public final Object a(final agp agpVar) {
                                final jgu jguVar2 = jgu.this;
                                aqvw aqvwVar = a;
                                final arbf arbfVar2 = arbfVar;
                                for (aqwd aqwdVar : aqvwVar.d) {
                                    if (aqwdVar.c.equals("Egl0aGVtZS1zZXQgSygB")) {
                                        aqwe aqweVar = aqwdVar.f;
                                        if (aqweVar == null) {
                                            aqweVar = aqwe.a;
                                        }
                                        byte[] a2 = aajd.a(aqweVar.toByteString());
                                        if (a2 != null) {
                                            try {
                                                jguVar2.f = (avgi) aopi.parseFrom(avgi.a, a2, aoos.b());
                                            } catch (aopx unused) {
                                                zep.b("Could not parse persisted ThemeSetEntity");
                                                agpVar.c(arbfVar2);
                                            }
                                            avgi avgiVar = jguVar2.f;
                                            jguVar2.d = avgiVar.c;
                                            jguVar2.e = new String[Collections.unmodifiableMap(avgiVar.d).size()];
                                            Collections.unmodifiableMap(jguVar2.f.d).values().toArray(jguVar2.e);
                                            final Runnable runnable2 = new Runnable() { // from class: jgt
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    agp.this.c(arbfVar2);
                                                }
                                            };
                                            jguVar2.a.put(jguVar2.d, jguVar2.b.a("Egl0aGVtZS1zZXQgSygB").X(azpj.b(jguVar2.c)).I(jgs.a).i(aynq.LATEST).C(iyw.j).C(iyw.k).p(new ailz(agpVar, 1)).Z(new ayqb() { // from class: jgq
                                                @Override // defpackage.ayqb
                                                public final void a(Object obj2) {
                                                    jgu jguVar3 = jgu.this;
                                                    Runnable runnable3 = runnable2;
                                                    if (((avgi) obj2).c.equals(jguVar3.d)) {
                                                        jguVar3.b(jguVar3.d, runnable3);
                                                    }
                                                }
                                            }));
                                            String[] strArr = jguVar2.e;
                                            if (strArr != null) {
                                                for (final String str : strArr) {
                                                    jguVar2.a.put(str, jguVar2.b.a(str).X(azpj.b(jguVar2.c)).I(jgs.a).as(new ayqb() { // from class: jgr
                                                        @Override // defpackage.ayqb
                                                        public final void a(Object obj2) {
                                                            ampq ampqVar = (ampq) obj2;
                                                            jgu.this.b(str, runnable2);
                                                        }
                                                    }));
                                                }
                                            }
                                        }
                                    }
                                }
                                return null;
                            }
                        }), 1), jguVar.c);
                    }
                }, this.b);
            }
            anktVar = this.g;
        }
        return anktVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(zdt zdtVar) {
        try {
            ampq.j((arbf) a().get(5000L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e) {
            e = e;
            zdtVar.a(e);
        } catch (ExecutionException e2) {
            e = e2;
            zdtVar.a(e);
        } catch (TimeoutException e3) {
            this.c.a(amon.a);
            zdtVar.a(e3);
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afwd afwdVar = (afwd) obj;
                this.b.execute(new Runnable() { // from class: jgw
                    @Override // java.lang.Runnable
                    public final void run() {
                        jgz jgzVar = jgz.this;
                        synchronized (jgzVar.f) {
                            ankt anktVar = jgzVar.g;
                            if (anktVar != null) {
                                anktVar.cancel(false);
                            }
                            jgzVar.g = null;
                        }
                    }
                });
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{afwd.class};
    }
}
