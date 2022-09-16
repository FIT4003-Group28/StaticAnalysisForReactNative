package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: kxe  reason: default package */
/* loaded from: classes7.dex */
public final class kxe implements algf {
    private final kxc a;
    private final algf b;

    public kxe(Context context, akvz akvzVar, algf algfVar) {
        this.a = new kxc(context, akvzVar, -12828605, -1512723, -1, -14671580, -1512723, -12828605, -15043608, -7686920);
        this.b = algfVar;
    }

    @Override // defpackage.algf
    public final void a() {
        this.a.b();
        this.b.a();
    }

    @Override // defpackage.algf
    public final dmpn b(Context context, alfa alfaVar, alez alezVar, alfb alfbVar, boolean z, boolean z2, String str, int i, int i2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        if (alfaVar != alfa.CAR_ALTERNATES) {
            return this.b.b(context, alfaVar, alezVar, alfbVar, z, z2, str, i, i2, z3, z4, z5, z6, z7, z8);
        }
        return this.a.a(null, str, z, z3);
    }
}
