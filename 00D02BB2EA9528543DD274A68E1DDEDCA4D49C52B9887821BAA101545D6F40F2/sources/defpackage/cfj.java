package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;
/* compiled from: PG */
/* renamed from: cfj  reason: default package */
/* loaded from: classes4.dex */
public final class cfj implements bue<cfg> {
    private final bue<Bitmap> b;

    public cfj(bue<Bitmap> bueVar) {
        cjn.b(bueVar);
        this.b = bueVar;
    }

    @Override // defpackage.btw
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // defpackage.bue
    public final bxd<cfg> b(Context context, bxd<cfg> bxdVar, int i, int i2) {
        cfg b = bxdVar.b();
        bxd<Bitmap> ccqVar = new ccq(b.a(), brc.a(context).a);
        bxd<Bitmap> b2 = this.b.b(context, ccqVar, i, i2);
        if (!ccqVar.equals(b2)) {
            ccqVar.d();
        }
        bue<Bitmap> bueVar = this.b;
        b.a.a.a(bueVar, b2.b());
        return bxdVar;
    }

    @Override // defpackage.btw
    public final boolean equals(Object obj) {
        if (obj instanceof cfj) {
            return this.b.equals(((cfj) obj).b);
        }
        return false;
    }

    @Override // defpackage.btw
    public final int hashCode() {
        return this.b.hashCode();
    }
}
