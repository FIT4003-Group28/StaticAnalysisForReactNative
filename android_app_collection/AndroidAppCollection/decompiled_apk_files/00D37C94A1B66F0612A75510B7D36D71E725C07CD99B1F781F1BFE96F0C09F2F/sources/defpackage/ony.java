package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ony  reason: default package */
/* loaded from: classes3.dex */
public final class ony implements ynl {
    public final afvn a;
    public final acrr b;
    public final azpq c;
    public final azpq d;
    private final yve e;
    private final whp f;
    private final Executor g;
    private final boolean h;
    private final aacz i;

    public ony(yve yveVar, afvn afvnVar, yni yniVar, acrr acrrVar, aacz aaczVar, axxi axxiVar, whp whpVar, Executor executor) {
        Boolean bool;
        this.e = yveVar;
        this.a = afvnVar;
        this.b = acrrVar;
        this.i = aaczVar;
        this.f = whpVar;
        this.g = executor;
        aqxe aqxeVar = axxiVar.b.b().C;
        aqxeVar = aqxeVar == null ? aqxe.a : aqxeVar;
        boolean z = false;
        if (aqxeVar.a(45357307L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45357307L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45357307L);
            bool = Boolean.valueOf(aqxfVar.b == 1 ? ((Boolean) aqxfVar.c).booleanValue() : z);
        } else {
            bool = false;
        }
        this.h = bool.booleanValue();
        this.c = azpq.e();
        this.d = azpq.e();
        yniVar.g(this);
        c();
    }

    public final int a() {
        String d = this.a.c().d();
        fgp fgpVar = fgp.a;
        aoqp aoqpVar = ((fgu) this.e.c()).f;
        if (aoqpVar.containsKey(d)) {
            fgpVar = (fgp) aoqpVar.get(d);
        }
        if ((fgpVar.b & 2) != 0) {
            return fgpVar.d;
        }
        apyy b = this.i.b();
        asxj asxjVar = b.e;
        if (asxjVar == null) {
            asxjVar = asxj.a;
        }
        if ((asxjVar.c & 262144) == 0) {
            return 75;
        }
        asxj asxjVar2 = b.e;
        if (asxjVar2 == null) {
            asxjVar2 = asxj.a;
        }
        awcm awcmVar = asxjVar2.G;
        if (awcmVar == null) {
            awcmVar = awcm.a;
        }
        return awcmVar.d;
    }

    public final void b() {
        this.c.c(Boolean.valueOf(g()));
        this.d.c(Integer.valueOf(a()));
    }

    public final void c() {
        if (!this.h) {
            return;
        }
        afvm c = this.a.c();
        String d = c.d();
        final fgp fgpVar = fgp.a;
        aoqp aoqpVar = ((fgu) this.e.c()).f;
        if (aoqpVar.containsKey(d)) {
            fgpVar = (fgp) aoqpVar.get(d);
        }
        ylx.i(vwr.b(c, this.f, this.g), new ylw() { // from class: onu
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                ony onyVar = ony.this;
                fgp fgpVar2 = fgpVar;
                if (!((Boolean) obj).booleanValue() || fgpVar2.c || fgpVar2.e) {
                    return;
                }
                onyVar.d(true);
            }
        });
    }

    public final void d(final boolean z) {
        if (g() == z) {
            return;
        }
        ylx.i(this.e.b(new ampg() { // from class: onx
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                ony onyVar = ony.this;
                boolean z2 = z;
                fgu fguVar = (fgu) obj;
                String d = onyVar.a.c().d();
                fgp fgpVar = fgp.a;
                aoqp aoqpVar = fguVar.f;
                if (aoqpVar.containsKey(d)) {
                    fgpVar = (fgp) aoqpVar.get(d);
                }
                aopa mo52toBuilder = fguVar.mo52toBuilder();
                String d2 = onyVar.a.c().d();
                aopa mo52toBuilder2 = fgpVar.mo52toBuilder();
                mo52toBuilder2.copyOnWrite();
                fgp fgpVar2 = (fgp) mo52toBuilder2.instance;
                fgpVar2.b |= 1;
                fgpVar2.c = z2;
                mo52toBuilder2.copyOnWrite();
                fgp fgpVar3 = (fgp) mo52toBuilder2.instance;
                fgpVar3.b |= 4;
                fgpVar3.e = true;
                mo52toBuilder.j(d2, (fgp) mo52toBuilder2.mo39build());
                return (fgu) mo52toBuilder.mo39build();
            }
        }), new ylw() { // from class: onv
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                ony onyVar = ony.this;
                boolean z2 = z;
                Void r4 = (Void) obj;
                onyVar.c.c(Boolean.valueOf(z2));
                awci a = awcj.a();
                a.copyOnWrite();
                awcj.c((awcj) a.instance, z2);
                arrf a2 = arrh.a();
                a2.copyOnWrite();
                ((arrh) a2.instance).ee((awcj) a.mo39build());
                onyVar.b.c((arrh) a2.mo39build());
            }
        });
    }

    public final void e(final int i) {
        aqxo.p(i > 0);
        if (a() == i) {
            return;
        }
        ylx.i(this.e.b(new ampg() { // from class: onw
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                ony onyVar = ony.this;
                int i2 = i;
                fgu fguVar = (fgu) obj;
                String d = onyVar.a.c().d();
                fgp fgpVar = fgp.a;
                aoqp aoqpVar = fguVar.f;
                if (aoqpVar.containsKey(d)) {
                    fgpVar = (fgp) aoqpVar.get(d);
                }
                aopa mo52toBuilder = fguVar.mo52toBuilder();
                String d2 = onyVar.a.c().d();
                aopa mo52toBuilder2 = fgpVar.mo52toBuilder();
                mo52toBuilder2.copyOnWrite();
                fgp fgpVar2 = (fgp) mo52toBuilder2.instance;
                fgpVar2.b |= 2;
                fgpVar2.d = i2;
                mo52toBuilder.j(d2, (fgp) mo52toBuilder2.mo39build());
                return (fgu) mo52toBuilder.mo39build();
            }
        }), new ylw() { // from class: ont
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                ony onyVar = ony.this;
                int i2 = i;
                Void r4 = (Void) obj;
                onyVar.d.c(Integer.valueOf(i2));
                awck a = awcl.a();
                a.copyOnWrite();
                awcl.c((awcl) a.instance, i2);
                arrf a2 = arrh.a();
                a2.copyOnWrite();
                ((arrh) a2.instance).ef((awcl) a.mo39build());
                onyVar.b.c((arrh) a2.mo39build());
            }
        });
    }

    public final boolean g() {
        String d = this.a.c().d();
        fgp fgpVar = fgp.a;
        aoqp aoqpVar = ((fgu) this.e.c()).f;
        if (aoqpVar.containsKey(d)) {
            fgpVar = (fgp) aoqpVar.get(d);
        }
        if (fgpVar.c || !vwr.d(this.a.c()) || fgpVar.e) {
            return fgpVar.c;
        }
        return true;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afwb afwbVar = (afwb) obj;
                b();
                c();
                return null;
            } else if (i == 1) {
                afwd afwdVar = (afwd) obj;
                b();
                c();
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{afwb.class, afwd.class};
    }
}
