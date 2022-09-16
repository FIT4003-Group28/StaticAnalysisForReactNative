package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: aafg  reason: default package */
/* loaded from: classes.dex */
public final class aafg extends aafi {
    private final amup a;

    public aafg(Map map) {
        this.a = amup.j(map);
    }

    @Override // defpackage.aafi
    public final aafl f(apzg apzgVar) {
        Object a = aafp.a(apzgVar);
        if (a == null) {
            return aafl.x;
        }
        aafl aaflVar = (aafl) this.a.get(a.getClass());
        return aaflVar != null ? aaflVar : aafl.x;
    }
}
