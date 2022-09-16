package defpackage;

import java.util.HashMap;
/* compiled from: PG */
/* renamed from: ahyw  reason: default package */
/* loaded from: classes.dex */
public final class ahyw implements ynl {
    final /* synthetic */ ahyz a;

    public ahyw(ahyz ahyzVar) {
        this.a = ahyzVar;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                aicc aiccVar = (aicc) obj;
                ahyz ahyzVar = this.a;
                if (ahyzVar.F == null) {
                    ahyzVar.F = new HashMap();
                }
                this.a.F.put(aiccVar.a, aiccVar.b);
                ahyz ahyzVar2 = this.a;
                ahyzVar2.s.nP(ahyzVar2.F);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{aicc.class};
    }
}
