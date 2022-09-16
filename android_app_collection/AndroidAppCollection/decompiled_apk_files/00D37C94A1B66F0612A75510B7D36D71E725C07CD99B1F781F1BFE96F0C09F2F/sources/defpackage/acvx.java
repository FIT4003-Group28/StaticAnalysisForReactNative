package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: acvx  reason: default package */
/* loaded from: classes.dex */
final class acvx implements ynj {
    final /* synthetic */ acvz a;
    private final String b;

    public acvx(acvz acvzVar, String str) {
        this.a = acvzVar;
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
