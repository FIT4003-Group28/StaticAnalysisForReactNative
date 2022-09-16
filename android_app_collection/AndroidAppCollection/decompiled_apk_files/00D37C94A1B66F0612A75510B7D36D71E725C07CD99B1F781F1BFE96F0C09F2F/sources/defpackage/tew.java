package defpackage;

import android.graphics.drawable.Drawable;
import j$.util.Objects;
/* compiled from: PG */
/* renamed from: tew  reason: default package */
/* loaded from: classes4.dex */
public final class tew {
    public float a = 0.0f;
    public int b = 0;
    public cyh c = null;
    public Drawable d = null;
    public aodt e;

    public final boolean equals(Object obj) {
        if (obj instanceof tew) {
            tew tewVar = (tew) obj;
            if (Objects.equals(this.d, tewVar.d)) {
                if (Float.valueOf(this.a).floatValue() * 10000.0f == Float.valueOf(tewVar.a).floatValue() * 10000.0f && Objects.equals(this.c, tewVar.c) && this.b == tewVar.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.d, Float.valueOf(this.a), this.c, Integer.valueOf(this.b));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.d);
        float f = this.a;
        String valueOf2 = String.valueOf(this.c);
        int i = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 103 + String.valueOf(valueOf2).length());
        sb.append("StyleBuilderImpl(backgroundDrawable:");
        sb.append(valueOf);
        sb.append(", cornerRadiusPx:");
        sb.append(f);
        sb.append(", border:");
        sb.append(valueOf2);
        sb.append(", borderColor:");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
