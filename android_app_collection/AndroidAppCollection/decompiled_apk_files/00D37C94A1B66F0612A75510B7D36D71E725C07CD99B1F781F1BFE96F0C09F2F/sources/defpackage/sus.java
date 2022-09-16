package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.Component;
import com.google.android.libraries.elements.interfaces.ComponentConfig;
import com.google.android.libraries.elements.interfaces.ComponentElement;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.android.libraries.elements.interfaces.EntitiesProcessorResolver;
import com.google.android.libraries.elements.interfaces.JSEntitiesProcessors;
import com.google.android.libraries.elements.interfaces.JSEnvironment;
import com.youtube.android.libraries.elements.StatusOr;
import com.youtube.android.libraries.elements.templates.UnifiedTemplateResolver;
import io.grpc.Status;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: sus  reason: default package */
/* loaded from: classes4.dex */
public final class sus implements svy {
    public static final /* synthetic */ int n = 0;
    private static final aoos o;
    public final tdb a;
    public final teb b;
    public final tfh c;
    public final tfa d;
    public final axnm e;
    public final tax f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final ComponentConfig j;
    public final boolean k;
    public final azqb l;
    public final azqb m;
    private final ampq p;
    private final boolean q;
    private final ampq r;

    static {
        aoos c = aoos.c();
        c.e(awoy.b);
        c.e(awmx.b);
        o = c;
    }

    public sus(tfh tfhVar, tdb tdbVar, ampq ampqVar, teb tebVar, tfa tfaVar, axnm axnmVar, tax taxVar, azqb azqbVar, azqb azqbVar2, ampq ampqVar2, ampq ampqVar3, ampq ampqVar4, ampq ampqVar5, ampq ampqVar6, ampq ampqVar7, ampq ampqVar8, ampq ampqVar9) {
        this.c = tfhVar;
        this.a = tdbVar;
        this.p = ampqVar;
        this.b = tebVar;
        this.d = tfaVar;
        this.f = taxVar;
        this.i = ((Boolean) ampqVar2.e(false)).booleanValue();
        this.q = ((Boolean) ampqVar3.e(false)).booleanValue();
        this.g = ((Boolean) ampqVar5.e(true)).booleanValue();
        this.h = ((Boolean) ampqVar4.e(false)).booleanValue();
        this.e = axnmVar;
        this.j = new ComponentConfig(((Boolean) ampqVar6.e(false)).booleanValue(), ((Integer) ampqVar7.e(0)).intValue());
        this.k = ((Boolean) ampqVar8.e(false)).booleanValue();
        this.l = azqbVar;
        this.m = azqbVar2;
        this.r = ampqVar9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(ByteBuffer byteBuffer) {
        try {
            awow awowVar = ((awnn) aopi.parseFrom(awnn.a, byteBuffer, o)).c;
            if (awowVar == null) {
                awowVar = awow.a;
            }
            awos awosVar = ((awmx) awowVar.qm(awmx.b)).d;
            if (awosVar == null) {
                awosVar = awos.a;
            }
            awoy awoyVar = (awoy) awosVar.qm(awoy.b);
            return (awoyVar.c & 1) != 0 ? awoyVar.d : "Unknown template";
        } catch (aopx unused) {
            return "Unknown template";
        }
    }

    @Override // defpackage.svy
    public final /* bridge */ /* synthetic */ cyp a(cyv cyvVar, final tda tdaVar, Object obj, final String str, final aodt aodtVar, suc sucVar, List list) {
        final axmv axmvVar = (axmv) obj;
        tfd tfdVar = tfd.b;
        tfd tfdVar2 = tdaVar.e;
        if (tfdVar2 != null) {
            tfdVar = tfdVar2;
        }
        final tff a = tfdVar.a();
        ayoi z = ayoi.z(new Callable() { // from class: suh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] bArr;
                final List list2;
                ayoi V;
                ayoi af;
                final sus susVar = sus.this;
                final tda tdaVar2 = tdaVar;
                final axmv axmvVar2 = axmvVar;
                final String str2 = str;
                final aodt aodtVar2 = aodtVar;
                final tff tffVar = a;
                final boolean z2 = susVar.h;
                final String l = ((tdc) susVar.m.get()).a() ? tbs.l(aodtVar2) : null;
                if (z2 && (!susVar.i || susVar.k)) {
                    af = susVar.b(axmvVar2.aH(), tdaVar2, tffVar, l, axmvVar2.aJ());
                } else {
                    if (!z2 || !susVar.i) {
                        ByteBuffer i = axmvVar2.i(6);
                        if (i == null) {
                            throw new ted("Invalid ComponentType: null templateConfig");
                        }
                        int b = axmvVar2.b(6);
                        bArr = new byte[b != 0 ? axmvVar2.d(b) : 0];
                        i.get(bArr);
                    } else {
                        aoos c = aoos.c();
                        c.e(awmx.b);
                        try {
                            awnn awnnVar = (awnn) aopi.parseFrom(awnn.a, axmvVar2.aH(), c);
                            awow awowVar = awnnVar.c;
                            if (awowVar == null) {
                                awowVar = awow.a;
                            }
                            if (awowVar.qn(awmx.b)) {
                                awow awowVar2 = awnnVar.c;
                                if (awowVar2 == null) {
                                    awowVar2 = awow.a;
                                }
                                awmx awmxVar = (awmx) awowVar2.qm(awmx.b);
                                if ((awmxVar.c & 2) == 0) {
                                    throw new ted("Invalid ComponentType: null templateConfig");
                                }
                                awos awosVar = awmxVar.d;
                                if (awosVar == null) {
                                    awosVar = awos.a;
                                }
                                bArr = awosVar.toByteArray();
                            } else {
                                throw new ted("No ComponentType extension on Element");
                            }
                        } catch (aopx e) {
                            throw new ted("Error parsing element proto", e);
                        }
                    }
                    final byte[] bArr2 = bArr;
                    List q = amuk.q();
                    if (susVar.i) {
                        try {
                            awos awosVar2 = (awos) aopi.parseFrom(awos.a, bArr2, aoos.b());
                            List arrayList = new ArrayList();
                            String str3 = ((awoy) awosVar2.qm(awoy.b)).d;
                            if (!str3.isEmpty()) {
                                arrayList.add(str3);
                            }
                            awos awosVar3 = ((awnh) awosVar2.qm(awnh.b)).c;
                            if (awosVar3 == null) {
                                awosVar3 = awos.a;
                            }
                            String str4 = ((awoy) awosVar3.qm(awoy.b)).d;
                            if (!str4.isEmpty()) {
                                arrayList.add(str4);
                            }
                            list2 = arrayList;
                        } catch (aopx e2) {
                            throw new ted("Failed to parse a TemplateConfig", e2);
                        }
                    } else {
                        list2 = q;
                    }
                    final tfh tfhVar = susVar.c;
                    if (list2.isEmpty()) {
                        V = ayoi.O(new Callable() { // from class: sui
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                tff tffVar2 = tff.this;
                                tfh tfhVar2 = tfhVar;
                                byte[] bArr3 = bArr2;
                                aodt aodtVar3 = aodtVar2;
                                String str5 = str2;
                                int i2 = sus.n;
                                tffVar2.h();
                                tfg c2 = tfhVar2.c(bArr3, aodtVar3, str5);
                                tffVar2.b();
                                return c2;
                            }
                        });
                    } else {
                        azfn azfnVar = new azfn(ayoi.Q(list2).V(new ayqe() { // from class: suo
                            @Override // defpackage.ayqe
                            public final Object a(Object obj2) {
                                tdb tdbVar = sus.this.a;
                                String valueOf = String.valueOf((String) obj2);
                                return tdbVar.a(valueOf.length() != 0 ? "/system/template/".concat(valueOf) : new String("/system/template/"));
                            }
                        }), ayrb.a, Integer.MAX_VALUE, aynx.a);
                        azqc.i();
                        V = azfnVar.V(new ayqe() { // from class: sug
                            @Override // defpackage.ayqe
                            public final Object a(Object obj2) {
                                sus susVar2 = sus.this;
                                List<String> list3 = list2;
                                tff tffVar2 = tffVar;
                                tfh tfhVar2 = tfhVar;
                                byte[] bArr3 = bArr2;
                                aodt aodtVar3 = aodtVar2;
                                String str5 = str2;
                                if (susVar2.i) {
                                    tfa tfaVar = susVar2.d;
                                    UnifiedTemplateResolver unifiedTemplateResolver = (UnifiedTemplateResolver) susVar2.e.get();
                                    for (String str6 : list3) {
                                        byte[] b2 = tfaVar.b(str6);
                                        if (b2 != null) {
                                            unifiedTemplateResolver.jni_setTemplateConfig(str6, b2);
                                        } else {
                                            StringBuilder sb = new StringBuilder(String.valueOf(str6).length() + 33);
                                            sb.append("Failed to load \"");
                                            sb.append(str6);
                                            sb.append("\" from Dev Server");
                                            throw new ted(sb.toString());
                                        }
                                    }
                                }
                                tffVar2.h();
                                tfg c2 = tfhVar2.c(bArr3, aodtVar3, str5);
                                tffVar2.b();
                                return c2;
                            }
                        });
                    }
                    af = V.af(new ayqe() { // from class: suq
                        /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
                            if (defpackage.aosl.a(r2.n()) != defpackage.awne.b.a()) goto L26;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
                        /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
                        @Override // defpackage.ayqe
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object a(java.lang.Object r10) {
                            /*
                                r9 = this;
                                sus r1 = defpackage.sus.this
                                axmv r0 = r2
                                boolean r2 = r3
                                tda r4 = r4
                                tff r3 = r5
                                java.lang.String r5 = r6
                                tfg r10 = (defpackage.tfg) r10
                                if (r2 == 0) goto L23
                                java.nio.ByteBuffer r10 = r0.aH()
                                boolean r6 = r0.aJ()
                                r0 = r1
                                r1 = r10
                                r2 = r4
                                r4 = r5
                                r5 = r6
                                ayoi r10 = r0.b(r1, r2, r3, r4, r5)
                                goto Lb1
                            L23:
                                aodt r2 = r0.aK()
                                if (r2 != 0) goto L60
                                java.nio.ByteBuffer r2 = r0.aI()
                                if (r2 != 0) goto L30
                                goto L4b
                            L30:
                                aoog r2 = defpackage.aoog.N(r2)     // Catch: java.io.IOException -> L57
                                boolean r6 = r2.E()     // Catch: java.io.IOException -> L57
                                if (r6 != 0) goto L4b
                                int r2 = r2.n()     // Catch: java.io.IOException -> L57
                                int r2 = defpackage.aosl.a(r2)     // Catch: java.io.IOException -> L57
                                aopg r6 = defpackage.awne.b     // Catch: java.io.IOException -> L57
                                int r6 = r6.a()     // Catch: java.io.IOException -> L57
                                if (r2 == r6) goto L4b
                                goto L60
                            L4b:
                                tdb r2 = r1.a
                                tal r6 = new tal
                                r6.<init>()
                                ayoi r0 = defpackage.ayoi.z(r6)
                                goto L88
                            L57:
                                r10 = move-exception
                                ted r0 = new ted
                                java.lang.String r1 = "Error reading model"
                                r0.<init>(r1, r10)
                                throw r0
                            L60:
                                boolean r2 = r1.g
                                if (r2 == 0) goto L76
                                tdb r2 = r1.a
                                tax r6 = r1.f
                                ayoi r6 = r6.b(r4)
                                tai r7 = new tai
                                r7.<init>(r0, r2, r6)
                                ayoi r0 = defpackage.ayoi.z(r7)
                                goto L88
                            L76:
                                tdb r2 = r1.a
                                tax r6 = r1.f
                                ayoi r6 = r6.b(r4)
                                tai r7 = new tai
                                r8 = 1
                                r7.<init>(r0, r2, r6, r8)
                                ayoi r0 = defpackage.ayoi.z(r7)
                            L88:
                                azqb r2 = r1.m
                                java.lang.Object r2 = r2.get()
                                tdc r2 = (defpackage.tdc) r2
                                boolean r2 = r2.a()
                                if (r2 == 0) goto La2
                                tbq r2 = new tbq
                                r2.<init>(r5)
                                azpq r6 = r2.a
                                ayoi r0 = defpackage.ayoi.W(r0, r6)
                                goto La3
                            La2:
                                r2 = 0
                            La3:
                                r7 = r0
                                r6 = r2
                                sup r8 = new sup
                                r0 = r8
                                r2 = r3
                                r3 = r10
                                r0.<init>()
                                ayoi r10 = r7.V(r8)
                            Lb1:
                                return r10
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.suq.a(java.lang.Object):java.lang.Object");
                        }
                    });
                }
                ayoi E = af.E(new sun(tffVar), ayrb.c);
                final sun sunVar = new sun(tffVar, 1);
                ayoi q2 = E.q(new ayol() { // from class: tgj
                    @Override // defpackage.ayol
                    public final ayok a(ayoi ayoiVar) {
                        azgw azgwVar = new azgw(ayoiVar, new tgl(ayqb.this));
                        azqc.i();
                        return azgwVar;
                    }
                });
                tffVar.getClass();
                return q2.D(new aypv() { // from class: sul
                    @Override // defpackage.aypv
                    public final void a() {
                        tff.this.a();
                    }
                });
            }
        });
        sud sudVar = new sud();
        sud.c(sudVar, cyvVar, new suf());
        sudVar.a.a = tdaVar;
        sudVar.d.set(0);
        sudVar.a.f = z;
        sudVar.d.set(5);
        sudVar.a.g = this.b;
        sudVar.d.set(6);
        sudVar.a.v = a;
        sudVar.d.set(7);
        sudVar.a.b = this.q;
        sudVar.d.set(1);
        sudVar.a.w = new suv(axmvVar, aodtVar);
        sudVar.d.set(8);
        sudVar.a.e = this.i;
        sudVar.d.set(4);
        sudVar.a.d = this.m;
        sudVar.d.set(3);
        sudVar.a.c = this.l;
        sudVar.d.set(2);
        return sudVar;
    }

    public final ayoi b(final ByteBuffer byteBuffer, final tda tdaVar, final tff tffVar, final String str, boolean z) {
        final ByteStore byteStore = (ByteStore) ((azqb) ((ampv) this.p).a).get();
        final EntitiesProcessorResolver entitiesProcessorResolver = (EntitiesProcessorResolver) EntitiesProcessorResolver.create(byteStore, z ? new swh(this.f.b(tdaVar)) : null).a(suj.b);
        JSEntitiesProcessors.registerProcessors(((JSEnvironment) ((stf) ((azqb) ((ampv) this.r).a).get()).a.get()).getController(), entitiesProcessorResolver);
        final ComponentElement create = ComponentElement.create(byteBuffer);
        return ayoi.w(new ayoj() { // from class: suk
            @Override // defpackage.ayoj
            public final void a(azeh azehVar) {
                aodt aodtVar;
                awqm k;
                final sus susVar = sus.this;
                ComponentElement componentElement = create;
                ByteStore byteStore2 = byteStore;
                EntitiesProcessorResolver entitiesProcessorResolver2 = entitiesProcessorResolver;
                String str2 = str;
                tff tffVar2 = tffVar;
                final tda tdaVar2 = tdaVar;
                ByteBuffer byteBuffer2 = byteBuffer;
                susVar.e.get();
                try {
                    final Component component = (Component) Component.createWithElement(componentElement, byteStore2, null, entitiesProcessorResolver2, susVar.j).a(suj.a);
                    final tbq tbqVar = ((tdc) susVar.m.get()).a() ? new tbq(str2, component) : null;
                    String templateUri = component.getTemplateUri();
                    tffVar2.g(templateUri);
                    StringBuilder sb = tdaVar2.m;
                    if (sb != null && !TextUtils.isEmpty(templateUri)) {
                        sb.append(templateUri);
                        sb.append("|");
                    }
                    sur surVar = new sur(susVar, tdaVar2, tffVar2, byteBuffer2, component, tbqVar, azehVar);
                    awrg f = ((tdc) surVar.f.m.get()).b() ? tbs.f(surVar.a) : null;
                    try {
                        sus susVar2 = surVar.f;
                        tff tffVar3 = surVar.b;
                        ByteBuffer byteBuffer3 = surVar.c;
                        tffVar3.j();
                        if (f != null) {
                            awrm a = awrn.a();
                            a.copyOnWrite();
                            awrn.d((awrn) a.instance, f);
                            String c = sus.c(byteBuffer3);
                            a.copyOnWrite();
                            awrn.c((awrn) a.instance, c);
                            awro a2 = awrp.a();
                            aorw e = tbs.e();
                            a2.copyOnWrite();
                            ((awrp) a2.instance).p(e);
                            a2.copyOnWrite();
                            ((awrp) a2.instance).o((awrn) a.mo39build());
                            ((DebuggerClient) susVar2.l.get()).sendTimelineEvent(((awrp) a2.mo39build()).toByteArray());
                        }
                        StatusOr materialize = surVar.d.materialize(true);
                        byte[] bArr = (byte[]) materialize.value;
                        if (bArr == null) {
                            String valueOf = String.valueOf(materialize.status);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 41);
                            sb2.append("Error materializing SharedComponentType: ");
                            sb2.append(valueOf);
                            throw new ted(sb2.toString(), materialize.status.asException());
                        }
                        aodtVar = aodt.au(ByteBuffer.wrap(bArr));
                        try {
                            sus susVar3 = surVar.f;
                            Component component2 = surVar.d;
                            tbq tbqVar2 = surVar.e;
                            if (((tdc) susVar3.m.get()).a() && tbqVar2 != null && (k = tbs.k(aodtVar, tet.b(component2.latestModel()), component2.latestEntitiesConfig(), tbqVar2.c)) != null) {
                                tbqVar2.a(k);
                            }
                            surVar.g.a(swr.a(aodtVar, surVar.e));
                            surVar.f.d(surVar.b, f, surVar.d, aodtVar, surVar.a);
                            component.setObserver(surVar);
                            azehVar.f(new ayqa() { // from class: sum
                                @Override // defpackage.ayqa
                                public final void a() {
                                    sus susVar4 = sus.this;
                                    tbq tbqVar3 = tbqVar;
                                    Component component3 = component;
                                    tda tdaVar3 = tdaVar2;
                                    if (tbqVar3 != null) {
                                        synchronized (tbqVar3.e) {
                                            tbqVar3.b = null;
                                        }
                                    }
                                    Status dispose = component3.dispose();
                                    if (!dispose.f()) {
                                        susVar4.b.a(28, "Error disposing Component", tdaVar3, dispose.d());
                                    }
                                }
                            });
                        } catch (Throwable th) {
                            th = th;
                            surVar.f.d(surVar.b, f, surVar.d, aodtVar, surVar.a);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        aodtVar = null;
                    }
                } catch (ted e2) {
                    azehVar.d(e2);
                }
            }
        });
    }

    public final void d(tff tffVar, awrg awrgVar, Component component, aodt aodtVar, tda tdaVar) {
        awqm k;
        tffVar.d();
        if (awrgVar != null) {
            awrk a = awrl.a();
            a.copyOnWrite();
            awrl.c((awrl) a.instance, awrgVar);
            if (aodtVar != null && (k = tbs.k(aodtVar, tet.b(component.latestModel()), component.latestEntitiesConfig(), tdaVar.s)) != null) {
                a.copyOnWrite();
                awrl.d((awrl) a.instance, k);
            }
            awro a2 = awrp.a();
            aorw e = tbs.e();
            a2.copyOnWrite();
            awrp.c((awrp) a2.instance, e);
            a2.copyOnWrite();
            awrp.e((awrp) a2.instance, (awrl) a.mo39build());
            ((DebuggerClient) this.l.get()).sendTimelineEvent(((awrp) a2.mo39build()).toByteArray());
        }
    }
}
