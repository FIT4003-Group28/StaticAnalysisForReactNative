package defpackage;

import android.graphics.RectF;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dadj  reason: default package */
/* loaded from: classes.dex */
public final class dadj implements dadk {
    private final dadk a;
    private final float b;

    public dadj(float f, dadk dadkVar) {
        while (dadkVar instanceof dadj) {
            dadkVar = ((dadj) dadkVar).a;
            f += ((dadj) dadkVar).b;
        }
        this.a = dadkVar;
        this.b = f;
    }

    @Override // defpackage.dadk
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dadj)) {
            return false;
        }
        dadj dadjVar = (dadj) obj;
        return this.a.equals(dadjVar.a) && this.b == dadjVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
