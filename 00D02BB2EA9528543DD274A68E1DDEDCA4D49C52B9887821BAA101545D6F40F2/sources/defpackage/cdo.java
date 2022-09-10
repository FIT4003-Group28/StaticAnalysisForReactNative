package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;
/* compiled from: PG */
/* renamed from: cdo  reason: default package */
/* loaded from: classes4.dex */
public final class cdo implements bue<Drawable> {
    private final bue<Bitmap> b;
    private final boolean c;

    public cdo(bue<Bitmap> bueVar, boolean z) {
        this.b = bueVar;
        this.c = z;
    }

    @Override // defpackage.btw
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // defpackage.bue
    public final bxd<Drawable> b(Context context, bxd<Drawable> bxdVar, int i, int i2) {
        bxn bxnVar = brc.a(context).a;
        Drawable b = bxdVar.b();
        bxd<Bitmap> a = cdn.a(bxnVar, b, i, i2);
        if (a != null) {
            bxd<Bitmap> b2 = this.b.b(context, a, i, i2);
            if (!b2.equals(a)) {
                return cdw.f(context.getResources(), b2);
            }
            b2.d();
            return bxdVar;
        } else if (!this.c) {
            return bxdVar;
        } else {
            String valueOf = String.valueOf(b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb.append("Unable to convert ");
            sb.append(valueOf);
            sb.append(" to a Bitmap");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @Override // defpackage.btw
    public final boolean equals(Object obj) {
        if (obj instanceof cdo) {
            return this.b.equals(((cdo) obj).b);
        }
        return false;
    }

    @Override // defpackage.btw
    public final int hashCode() {
        return this.b.hashCode();
    }
}
