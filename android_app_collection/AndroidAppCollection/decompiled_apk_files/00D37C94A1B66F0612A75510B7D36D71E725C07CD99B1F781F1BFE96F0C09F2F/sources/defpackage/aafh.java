package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: aafh  reason: default package */
/* loaded from: classes.dex */
public final class aafh extends aafi {
    private final amup a;

    public aafh(Map map) {
        this.a = amup.j(map);
    }

    @Override // defpackage.aafi
    public final aafl f(apzg apzgVar) {
        Object a = aafp.a(apzgVar);
        if (a == null) {
            return aafl.x;
        }
        azqb azqbVar = (azqb) this.a.get(a.getClass());
        if (azqbVar == null) {
            return aafl.x;
        }
        aafl aaflVar = (aafl) azqbVar.get();
        return aaflVar != null ? aaflVar : aafl.x;
    }
}
