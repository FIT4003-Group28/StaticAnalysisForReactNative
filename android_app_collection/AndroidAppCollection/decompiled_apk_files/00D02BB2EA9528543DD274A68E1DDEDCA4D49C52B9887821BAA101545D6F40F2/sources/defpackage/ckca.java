package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ckca  reason: default package */
/* loaded from: classes.dex */
public final class ckca<T> extends btrh<T> {
    public ckca(Class<?> cls, T t) {
        super(cls, t);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        boolean z;
        ckbw ckbwVar = (ckbw) this.a;
        btvs btvsVar = (btvs) obj;
        duxm duxmVar = btvsVar.a;
        List<Integer> u = ckbz.u(duxmVar, btvsVar.b);
        synchronized (ckbwVar.a) {
            if (!u.equals(ckbwVar.a.r)) {
                ckbwVar.a.q = null;
                z = true;
            } else {
                z = false;
            }
            ckbwVar.a.r = u;
        }
        ckbz ckbzVar = ckbwVar.a;
        ddln ddlnVar = duxmVar.K;
        if (ddlnVar == null) {
            ddlnVar = ddln.a;
        }
        ckbzVar.s = ddlnVar;
        if (z) {
            ((ckco) ckbwVar.a.a(ckgf.a)).a(ckge.a(2));
            ckbwVar.a.w();
        }
    }
}
