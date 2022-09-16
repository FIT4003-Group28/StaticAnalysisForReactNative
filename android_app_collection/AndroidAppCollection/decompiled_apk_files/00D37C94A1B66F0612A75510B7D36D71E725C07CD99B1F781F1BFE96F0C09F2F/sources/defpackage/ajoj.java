package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: ajoj  reason: default package */
/* loaded from: classes.dex */
public final class ajoj implements cnq {
    private final cnq a;

    public ajoj(cnq cnqVar) {
        this.a = cnqVar;
    }

    @Override // defpackage.cnq
    public final /* bridge */ /* synthetic */ cnp a(Object obj, int i, int i2, cic cicVar) {
        Uri r = akel.r((avhn) obj, i, i2);
        if (r == null) {
            return null;
        }
        return this.a.a(r, i, i2, cicVar);
    }

    @Override // defpackage.cnq
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return akel.A((avhn) obj);
    }
}
