package defpackage;
/* compiled from: PG */
/* renamed from: joh  reason: default package */
/* loaded from: classes.dex */
public final class joh implements jol {
    private final jok a;

    public joh(jok jokVar) {
        this.a = jokVar;
    }

    @Override // defpackage.jol
    public final boolean a(dlfv dlfvVar) {
        djwd djwdVar;
        dspd dspdVar;
        dlgn dlgnVar = dlfvVar.g;
        if (dlgnVar == null) {
            dlgnVar = dlgn.G;
        }
        dsrj<dlhl> dsrjVar = dlgnVar.s;
        dcdg dcdgVar = new dcdg();
        for (dlhl dlhlVar : dsrjVar) {
            dcdgVar.f(dlhlVar.d, dlhlVar);
        }
        dcdn b = dcdgVar.b();
        if (b.containsKey("notification_context")) {
            dlhl dlhlVar2 = (dlhl) b.get("notification_context");
            if (dlhlVar2.b == 10) {
                dspdVar = (dspd) dlhlVar2.c;
            } else {
                dspdVar = dspd.b;
            }
            djwdVar = (djwd) bvrs.c(dspdVar, (dssr) djwd.a.cu(7));
        } else {
            djwdVar = null;
        }
        try {
            dkdo dkdoVar = this.a.a(djwdVar, 1).get().a;
            if (dkdoVar != null) {
                int size = dkdoVar.a.size();
                StringBuilder sb = new StringBuilder(21);
                sb.append("#entries: ");
                sb.append(size);
                sb.toString();
            }
            if (dkdoVar != null) {
                if (dkdoVar.a.size() != 0) {
                    return false;
                }
            }
        } catch (Exception unused) {
        }
        return true;
    }
}
