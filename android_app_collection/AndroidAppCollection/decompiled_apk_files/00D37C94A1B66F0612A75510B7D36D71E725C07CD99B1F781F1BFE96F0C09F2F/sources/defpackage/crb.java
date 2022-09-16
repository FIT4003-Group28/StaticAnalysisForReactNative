package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;
/* compiled from: PG */
/* renamed from: crb  reason: default package */
/* loaded from: classes3.dex */
public final class crb implements cig {
    private final cig b;

    public crb(cig cigVar) {
        hy.N(cigVar);
        this.b = cigVar;
    }

    @Override // defpackage.chy
    public final void a(MessageDigest messageDigest) {
    }

    @Override // defpackage.cig
    public final cku b(Context context, cku ckuVar, int i, int i2) {
        cqy cqyVar = (cqy) ckuVar.c();
        coy coyVar = new coy(cqyVar.a(), cfk.b(context).a);
        if (!coyVar.equals(coyVar)) {
            coyVar.e();
        }
        Bitmap bitmap = coyVar.a;
        cqyVar.a.a.e(this.b, bitmap);
        return ckuVar;
    }

    @Override // defpackage.chy
    public final boolean equals(Object obj) {
        if (obj instanceof crb) {
            return this.b.equals(((crb) obj).b);
        }
        return false;
    }

    @Override // defpackage.chy
    public final int hashCode() {
        return this.b.hashCode();
    }
}
