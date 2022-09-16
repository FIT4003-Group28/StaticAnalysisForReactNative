package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dclh  reason: default package */
/* loaded from: classes5.dex */
public final class dclh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(dclb<?> dclbVar, Object obj) {
        if (obj == dclbVar) {
            return true;
        }
        if (obj instanceof dclb) {
            dclb dclbVar2 = (dclb) obj;
            if (dclbVar.size() == dclbVar2.size() && dclbVar.l().size() == dclbVar2.l().size()) {
                for (dcla dclaVar : dclbVar2.l()) {
                    if (dclbVar.a(dclaVar.a()) != dclaVar.b()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> Iterator<E> b(dclb<E> dclbVar) {
        return new dclg(dclbVar, dclbVar.l().iterator());
    }
}
