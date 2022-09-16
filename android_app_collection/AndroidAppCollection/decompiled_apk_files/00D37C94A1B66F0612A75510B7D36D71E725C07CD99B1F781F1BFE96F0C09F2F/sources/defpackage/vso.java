package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: vso  reason: default package */
/* loaded from: classes4.dex */
public class vso {
    private final vss a;

    /* JADX INFO: Access modifiers changed from: protected */
    public vso(vss vssVar) {
        this.a = vssVar;
    }

    public final long a() {
        vss vssVar = this.a;
        return vssVar.a - vssVar.e;
    }

    public final long b() {
        return this.a.d;
    }

    public List c() {
        return new ArrayList();
    }

    public final List d(String str) {
        ArrayList arrayList = new ArrayList();
        for (vso vsoVar : c()) {
            if (vsoVar.a.b.equals(str)) {
                arrayList.add(vsoVar);
            }
        }
        return arrayList;
    }

    public void e(vsn vsnVar) {
        vsn f = vsnVar.f(a());
        f.k(a());
        vsnVar.j(f);
    }
}
