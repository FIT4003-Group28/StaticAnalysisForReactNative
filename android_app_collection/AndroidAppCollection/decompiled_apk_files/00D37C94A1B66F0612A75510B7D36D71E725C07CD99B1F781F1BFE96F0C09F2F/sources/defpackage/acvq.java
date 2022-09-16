package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
@Deprecated
/* renamed from: acvq  reason: default package */
/* loaded from: classes.dex */
public final class acvq extends afyl {
    private final Set a;
    private final afvm b;

    public acvq(String str, ytz ytzVar, Set set, afvm afvmVar, cez cezVar) {
        super(str, ytzVar, cezVar);
        set.getClass();
        this.a = set;
        afvmVar.getClass();
        this.b = afvmVar;
    }

    @Override // defpackage.afyl, defpackage.afye
    public final afvm e() {
        return this.b;
    }

    @Override // defpackage.yua
    public final Map f() {
        HashMap hashMap = new HashMap();
        try {
            for (afxq afxqVar : this.a) {
                afxqVar.b(hashMap, this);
            }
        } catch (ceq unused) {
            zep.b("CsiRequest: unexpected AuthFailureError");
        }
        return hashMap;
    }

    @Override // defpackage.yua
    public final cfb qy(cew cewVar) {
        return cfb.b(null, null);
    }

    @Override // defpackage.yua
    public final /* bridge */ /* synthetic */ void qz(Object obj) {
        Void r1 = (Void) obj;
    }
}
