package defpackage;

import android.graphics.RectF;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: almr  reason: default package */
/* loaded from: classes.dex */
public final class almr implements alms {
    private final alms a;
    private final float b;

    public almr(float f, alms almsVar) {
        while (almsVar instanceof almr) {
            almsVar = ((almr) almsVar).a;
            f += ((almr) almsVar).b;
        }
        this.a = almsVar;
        this.b = f;
    }

    @Override // defpackage.alms
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof almr)) {
            return false;
        }
        almr almrVar = (almr) obj;
        return this.a.equals(almrVar.a) && this.b == almrVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
