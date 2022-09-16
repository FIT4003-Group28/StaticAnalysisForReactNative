package defpackage;

import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: hbk  reason: default package */
/* loaded from: classes3.dex */
public final class hbk implements ajry {
    private final hkl a;
    private final hvy b;
    private final hci c;
    private final hba d;
    private final ayor e;

    public hbk(hkl hklVar, hvy hvyVar, hci hciVar, hba hbaVar, ayor ayorVar) {
        this.a = hklVar;
        this.b = hvyVar;
        this.c = hciVar;
        this.d = hbaVar;
        this.e = ayorVar;
    }

    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        return new hbm(this.b, this.c, this.d, this.e, this.a, viewGroup);
    }
}
