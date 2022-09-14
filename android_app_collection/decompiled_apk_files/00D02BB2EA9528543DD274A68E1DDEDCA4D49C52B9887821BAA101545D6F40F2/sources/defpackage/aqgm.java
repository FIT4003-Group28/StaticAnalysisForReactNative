package defpackage;

import java.util.Collection;
/* compiled from: PG */
/* renamed from: aqgm  reason: default package */
/* loaded from: classes2.dex */
public final class aqgm implements aqgo {
    private final dxio<aqgn> a;
    private final dbsl<cufw> b = cvbo.a(dbss.ALWAYS_TRUE);

    public aqgm(dxio<aqgn> dxioVar) {
        this.a = dxioVar;
    }

    @Override // defpackage.aqgo
    public final boolean a(@dzsi cufw cufwVar, String str) {
        return b(cufwVar, dcdc.f(str));
    }

    @Override // defpackage.aqgo
    public final boolean b(@dzsi cufw cufwVar, Collection<String> collection) {
        if (cufwVar == null || !this.a.a().b(cufwVar) || !this.b.a(cufwVar)) {
            return false;
        }
        dspd dspdVar = cufwVar.b().get("gmbl");
        String b = aqco.b(dspdVar != null ? dspdVar.G() : null);
        if (b != null) {
            return collection.contains(b);
        }
        return false;
    }
}
