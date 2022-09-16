package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: alrg  reason: default package */
/* loaded from: classes.dex */
final class alrg extends alrn {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alrg(alri alriVar, alvg alvgVar) {
        super(alriVar, alvgVar);
        new alrz("OnCompleteUpdateCallback");
    }

    @Override // defpackage.alrn
    public final void a(Bundle bundle) {
        super.a(bundle);
        if (alri.a(bundle) != 0) {
            this.b.a(new alrs(alri.a(bundle)));
        } else {
            this.b.b(null);
        }
    }
}
