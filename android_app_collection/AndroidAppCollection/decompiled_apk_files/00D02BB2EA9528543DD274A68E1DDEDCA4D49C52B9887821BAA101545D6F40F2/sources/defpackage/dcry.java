package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: dcry  reason: default package */
/* loaded from: classes.dex */
public final class dcry {
    private static final dcru<Object, dcqx> a = new dcrw();
    private static final dcrt<Object, dcqx> b = new dcrx();

    public static dcrv<dcqx> a(Set<dcqy<?>> set) {
        dcrr dcrrVar = new dcrr(a);
        dcrrVar.e = b;
        for (dcqy<?> dcqyVar : set) {
            dcuj.a(dcqyVar, "key");
            dcru<Object, Object> dcruVar = dcrr.a;
            dcuj.a(dcqyVar, "key");
            dcrrVar.c.remove(dcqyVar);
            dcrrVar.b.put(dcqyVar, dcruVar);
        }
        return new dcrs(dcrrVar);
    }
}
