package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: xgs  reason: default package */
/* loaded from: classes4.dex */
public final class xgs {
    public static final xgs a = new xgs(null, null, null);
    public final CharSequence b;
    public final CharSequence c;
    public final avhn d;

    public xgs(CharSequence charSequence, CharSequence charSequence2, avhn avhnVar) {
        this.b = charSequence;
        this.c = charSequence2;
        this.d = avhnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        xgs xgsVar = (xgs) obj;
        return akzj.f(this.b, xgsVar.b) && akzj.f(this.c, xgsVar.c) && akzj.f(this.d, xgsVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d});
    }
}
