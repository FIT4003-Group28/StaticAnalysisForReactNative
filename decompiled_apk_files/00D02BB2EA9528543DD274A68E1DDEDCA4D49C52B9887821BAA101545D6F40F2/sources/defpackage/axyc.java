package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: axyc  reason: default package */
/* loaded from: classes3.dex */
final class axyc implements axyf<azvo> {
    @Override // defpackage.axyf
    public final /* bridge */ /* synthetic */ azwv a(azwv azwvVar, azvo azvoVar) {
        azvo azvoVar2 = azvoVar;
        List<azvo> i = azwvVar.i();
        if (i == null) {
            return azwvVar;
        }
        dccx F = dcdc.F();
        for (azvo azvoVar3 : i) {
            if (azvoVar3.g() != azvoVar2.g()) {
                F.g(azvoVar3);
            }
        }
        azwq o = azwvVar.o();
        o.f(F.f());
        return o.i();
    }

    @Override // defpackage.axyf
    public final /* bridge */ /* synthetic */ azwv b(azwv azwvVar, azvo azvoVar) {
        azvo azvoVar2 = azvoVar;
        dccx F = dcdc.F();
        List<azvo> i = azwvVar.i();
        if (i != null) {
            F.i(i);
        }
        F.g(azvoVar2);
        azwq o = azwvVar.o();
        o.f(F.f());
        return o.i();
    }
}
