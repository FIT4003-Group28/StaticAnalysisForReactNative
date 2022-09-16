package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: acwg  reason: default package */
/* loaded from: classes.dex */
final class acwg implements ynj {
    final /* synthetic */ acwi a;
    private final String b;

    public acwg(acwi acwiVar, String str) {
        this.a = acwiVar;
        zgh.m(str);
        this.b = str;
    }

    @Override // defpackage.ynj
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ymg ymgVar = (ymg) obj;
        ymgVar.g(this.b);
        Iterator it = this.a.a.iterator();
        while (it.hasNext()) {
            acvk acvkVar = (acvk) it.next();
            if (acvkVar.a(ymgVar)) {
                it.remove();
                if (!acvkVar.a) {
                    this.a.b.add(acvkVar);
                }
            }
        }
    }
}
