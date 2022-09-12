package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: btht  reason: default package */
/* loaded from: classes4.dex */
public final class btht {
    private final gga a;

    public btht(gga ggaVar) {
        this.a = ggaVar;
    }

    public final void a(bths bthsVar) {
        gga ggaVar = this.a;
        bthd bthdVar = new bthd();
        Bundle bundle = new Bundle();
        bundle.putSerializable("options", bthsVar);
        bthdVar.B(bundle);
        ggaVar.D(bthdVar);
    }
}
