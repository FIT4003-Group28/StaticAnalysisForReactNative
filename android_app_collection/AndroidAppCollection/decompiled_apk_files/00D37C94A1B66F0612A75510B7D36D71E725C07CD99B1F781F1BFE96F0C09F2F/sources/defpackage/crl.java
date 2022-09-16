package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: crl  reason: default package */
/* loaded from: classes3.dex */
public final class crl implements crm {
    private final cld a;
    private final crm b;
    private final crm c;

    public crl(cld cldVar, crm crmVar, crm crmVar2) {
        this.a = cldVar;
        this.b = crmVar;
        this.c = crmVar2;
    }

    @Override // defpackage.crm
    public final cku a(cku ckuVar, cic cicVar) {
        Drawable drawable = (Drawable) ckuVar.c();
        if (drawable instanceof BitmapDrawable) {
            return this.b.a(coy.f(((BitmapDrawable) drawable).getBitmap(), this.a), cicVar);
        }
        if (!(drawable instanceof cqy)) {
            return null;
        }
        return this.c.a(ckuVar, cicVar);
    }
}
