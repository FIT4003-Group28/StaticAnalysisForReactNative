package defpackage;

import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcly  reason: default package */
/* loaded from: classes5.dex */
public final class dcly extends dclu<dclz<?>> implements Serializable {
    static final dclu<dclz<?>> a = new dcly();
    private static final long serialVersionUID = 0;

    private dcly() {
    }

    @Override // defpackage.dclu, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        dclz dclzVar = (dclz) obj;
        dclz dclzVar2 = (dclz) obj2;
        return dbzx.b.a(dclzVar.b, dclzVar2.b).a(dclzVar.c, dclzVar2.c).i();
    }
}
