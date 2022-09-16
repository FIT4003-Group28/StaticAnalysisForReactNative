package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: sdw  reason: default package */
/* loaded from: classes4.dex */
public final class sdw implements sdl {
    private final sed[] a;

    public sdw(sed[] sedVarArr) {
        this.a = sedVarArr;
    }

    @Override // defpackage.sdl
    public final List b(List list, sek sekVar, int i, sbz sbzVar, sdj sdjVar, sda sdaVar, set setVar, boolean z) {
        sed[] sedVarArr = this.a;
        for (int i2 = 0; i2 < 6; i2++) {
            sed sedVar = sedVarArr[i2];
            if (sedVar.a.f(sekVar) >= 3) {
                return sedVar.b(list, sekVar, i, sbzVar, sdjVar, sdaVar, setVar, z);
            }
        }
        return this.a[5].b(list, sekVar, i, sbzVar, sdjVar, sdaVar, setVar, z);
    }
}
