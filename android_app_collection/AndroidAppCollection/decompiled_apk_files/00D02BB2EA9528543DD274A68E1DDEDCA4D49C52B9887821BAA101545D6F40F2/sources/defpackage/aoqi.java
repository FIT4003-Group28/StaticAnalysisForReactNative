package defpackage;
/* compiled from: PG */
/* renamed from: aoqi  reason: default package */
/* loaded from: classes2.dex */
public final class aoqi implements angt<aogb, aoge> {
    private final ff a;
    private final aoqj b;
    private final gfq c;
    private final aotx d;
    private final angv e;
    private final aorm f;
    private final aoha g;
    private final aoqh h;

    public aoqi(ff ffVar, aoqj aoqjVar, gfq gfqVar, aotx aotxVar, angv angvVar, aorm aormVar, aoha aohaVar, aoqh aoqhVar) {
        this.a = ffVar;
        this.c = gfqVar;
        this.b = aoqjVar;
        this.d = aotxVar;
        this.e = angvVar;
        this.f = aormVar;
        this.g = aohaVar;
        this.h = aoqhVar;
    }

    @Override // defpackage.angt
    public final void a(angu<aogb, aoge> anguVar) {
        dbsg dbsgVar;
        bvrj.UI_THREAD.c();
        aouv aouvVar = (aouv) anguVar;
        angs<D> angsVar = aouvVar.c;
        angf angfVar = (angf) angsVar;
        if (angfVar.a == angr.ABSENT) {
            this.e.c((aogb) aouvVar.b, dbpy.a);
        }
        if (angsVar.e()) {
            aoge aogeVar = (aoge) angsVar.f();
            angr angrVar = angfVar.a;
            boolean z = false;
            if (this.h.b && (angrVar == angr.PENDING_PARTIAL_DATA || angrVar == angr.SUCCESS)) {
                if (this.h.a) {
                    this.a.g().g(gfu.b(anut.class, gfu.ACTIVITY_FRAGMENT, new gfs[0]), 0);
                    return;
                }
                gfq.l(this.b);
                return;
            }
            aoha aohaVar = this.g;
            dcdc<dvay> c = aogeVar.c();
            int size = c.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    dvay dvayVar = c.get(i);
                    dvap dvapVar = dvayVar.e;
                    if (dvapVar == null) {
                        dvapVar = dvap.d;
                    }
                    i++;
                    if (aohaVar.equals(aoha.d(dvapVar))) {
                        dbsgVar = dbsg.i(dvayVar);
                        break;
                    }
                } else {
                    dbsgVar = dbpy.a;
                    break;
                }
            }
            if (dbsgVar.a()) {
                aorm aormVar = this.f;
                dvay dvayVar2 = (dvay) dbsgVar.b();
                if (angrVar == angr.PENDING_DIRTY_OR_ABSENT_DATA) {
                    z = true;
                }
                aormVar.f(dvayVar2, aogeVar, z);
            } else {
                gfq.l(this.b);
                return;
            }
        }
        this.d.a(this.f.b());
    }
}
