package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: lpm  reason: default package */
/* loaded from: classes3.dex */
public final class lpm extends ajzg implements ynl {
    public final ajxh a;
    public final yzj b;
    public final aafo c;
    public final yni d;
    public final kse e;
    public boolean f;
    public String g;
    private final fcl n;
    private final jml o;
    private atfa p;

    public lpm(ajyi ajyiVar, yni yniVar, yzj yzjVar, aafo aafoVar, kse kseVar, fcl fclVar, jml jmlVar, aari aariVar, ajxh ajxhVar, acti actiVar) {
        super(aariVar, ajyiVar, yniVar, yzjVar, actiVar);
        this.f = false;
        this.a = ajxhVar;
        this.b = yzjVar;
        this.c = aafoVar;
        this.d = yniVar;
        this.e = kseVar;
        this.n = fclVar;
        this.o = jmlVar;
        this.h.mG(new ajrt() { // from class: lpk
            @Override // defpackage.ajrt
            public final void a(ajrs ajrsVar, ajqm ajqmVar, int i) {
                lpm lpmVar = lpm.this;
                if (lpmVar.f) {
                    lnu.g(ajrsVar, "DragReorderCoordinator.DATA_ADAPTER_KEY", lpmVar.h);
                }
            }
        });
    }

    @Override // defpackage.ajzg
    public final void c(abbn abbnVar) {
        super.c(abbnVar);
    }

    @Override // defpackage.ajzg
    protected final void d(List list, aues auesVar) {
        int i = auesVar.b;
        if ((i & 16) != 0) {
            aukm aukmVar = auesVar.g;
            if (aukmVar == null) {
                aukmVar = aukm.a;
            }
            list.add(aukmVar);
        } else if ((i & 64) == 0) {
        } else {
            atfa atfaVar = auesVar.i;
            if (atfaVar == null) {
                atfaVar = atfa.a;
            }
            list.add(atfaVar);
        }
    }

    public final void i() {
        if (this.p == null) {
            this.p = (atfa) this.o.g(fcl.class, atfa.class, this.n, null);
            this.m.add(this.p);
        }
    }

    @Override // defpackage.ajxl, defpackage.ajxh, defpackage.zdx
    public final void j() {
        this.m.remove(this.p);
        this.p = null;
        this.g = null;
        super.j();
    }

    @Override // defpackage.ajzg
    protected final void k(aueq aueqVar) {
        avxe avxeVar;
        avxe avxeVar2;
        String str = aueqVar.f;
        this.g = str;
        if (this.p != null) {
            return;
        }
        if (str.isEmpty() || !this.n.i(aueqVar.f)) {
            for (aues auesVar : aueqVar.d) {
                auex auexVar = auesVar.c;
                if (auexVar == null) {
                    auexVar = auex.a;
                }
                auev auevVar = auexVar.x;
                if (auevVar == null) {
                    auevVar = auev.a;
                }
                if (auevVar.b == 135739233) {
                    avxeVar = (avxe) auevVar.c;
                } else {
                    avxeVar = avxe.a;
                }
                if ((avxeVar.b & 1) != 0) {
                    fcl fclVar = this.n;
                    auev auevVar2 = auexVar.x;
                    if (auevVar2 == null) {
                        auevVar2 = auev.a;
                    }
                    if (auevVar2.b == 135739233) {
                        avxeVar2 = (avxe) auevVar2.c;
                    } else {
                        avxeVar2 = avxe.a;
                    }
                    if (fclVar.l(avxeVar2.c)) {
                    }
                }
            }
            return;
        }
        i();
    }

    @Override // defpackage.ajzg
    public final void l(aueq aueqVar) {
        boolean z = false;
        if (aueqVar != null && aueqVar.g) {
            z = true;
        }
        this.f = z;
        super.l(aueqVar);
    }

    @Override // defpackage.ajzg, defpackage.ajxl, defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        aueq aueqVar;
        if (cls == lpm.class) {
            switch (i) {
                case -1:
                    return new Class[]{isw.class, lnw.class, aabk.class, abbh.class, abbn.class, agnk.class};
                case 0:
                    G(((isw) obj).h());
                    return null;
                case 1:
                    lnw lnwVar = (lnw) obj;
                    if (!this.f || !akzj.f(lnwVar.b, this.h)) {
                        return null;
                    }
                    int i2 = lnwVar.c;
                    int i3 = lnwVar.d;
                    if (i2 == i3) {
                        return null;
                    }
                    Object obj2 = lnwVar.b.get(i3);
                    if (!(obj2 instanceof auex)) {
                        return null;
                    }
                    auex auexVar = (auex) obj2;
                    if ((auexVar.b & 4096) == 0) {
                        return null;
                    }
                    int i4 = lnwVar.d - 1;
                    Object obj3 = i4 >= 0 ? lnwVar.b.get(i4) : null;
                    if (obj3 != null && !(obj3 instanceof auex)) {
                        return null;
                    }
                    auex auexVar2 = (auex) obj3;
                    String str = (auexVar2 == null || (auexVar2.b & 4096) == 0) ? null : auexVar2.o;
                    String str2 = (String) auexVar.qm(aueu.b);
                    this.e.a(str2, auexVar.o, str, new lpl(this, obj2, str2));
                    return null;
                case 2:
                    G(((aabk) obj).b());
                    return null;
                case 3:
                    abbh abbhVar = (abbh) obj;
                    asat asatVar = abbhVar.b;
                    if (asatVar == null) {
                        return null;
                    }
                    asaw asawVar = asatVar.e;
                    if (asawVar == null) {
                        asawVar = asaw.a;
                    }
                    if (asawVar.b != 54681060) {
                        return null;
                    }
                    asaw asawVar2 = abbhVar.b.e;
                    if (asawVar2 == null) {
                        asawVar2 = asaw.a;
                    }
                    if (asawVar2.b == 54681060) {
                        aueqVar = (aueq) asawVar2.c;
                    } else {
                        aueqVar = aueq.a;
                    }
                    l(aueqVar);
                    ajxh ajxhVar = this.a;
                    if (ajxhVar == null) {
                        return null;
                    }
                    ajxhVar.A();
                    return null;
                case 4:
                    super.c((abbn) obj);
                    return null;
                case 5:
                    if (!((agnk) obj).a.equals(this.g)) {
                        return null;
                    }
                    i();
                    return null;
                default:
                    StringBuilder sb = new StringBuilder(32);
                    sb.append("unsupported op code: ");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
            }
        }
        return super.ky(cls, obj, i);
    }
}
