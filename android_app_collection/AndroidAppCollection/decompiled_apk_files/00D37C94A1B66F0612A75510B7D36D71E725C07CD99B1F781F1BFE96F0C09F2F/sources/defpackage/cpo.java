package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;
/* compiled from: PG */
/* renamed from: cpo  reason: default package */
/* loaded from: classes3.dex */
public final class cpo implements cig {
    private final cig b;

    public cpo(cig cigVar) {
        this.b = cigVar;
    }

    @Override // defpackage.chy
    public final void a(MessageDigest messageDigest) {
    }

    @Override // defpackage.cig
    public final cku b(Context context, cku ckuVar, int i, int i2) {
        cld cldVar = cfk.b(context).a;
        Drawable drawable = (Drawable) ckuVar.c();
        cku a = cpn.a(cldVar, drawable, i, i2);
        if (a == null) {
            String valueOf = String.valueOf(drawable);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb.append("Unable to convert ");
            sb.append(valueOf);
            sb.append(" to a Bitmap");
            throw new IllegalArgumentException(sb.toString());
        } else if (!a.equals(a)) {
            return cpw.f(context.getResources(), a);
        } else {
            a.e();
            return ckuVar;
        }
    }

    @Override // defpackage.chy
    public final boolean equals(Object obj) {
        if (obj instanceof cpo) {
            return this.b.equals(((cpo) obj).b);
        }
        return false;
    }

    @Override // defpackage.chy
    public final int hashCode() {
        return this.b.hashCode();
    }
}
