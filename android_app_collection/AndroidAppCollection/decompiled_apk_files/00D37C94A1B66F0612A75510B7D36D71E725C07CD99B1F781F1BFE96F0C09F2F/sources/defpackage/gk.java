package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Shader;
/* compiled from: PG */
/* renamed from: gk  reason: default package */
/* loaded from: classes3.dex */
public final class gk {
    public final Shader a;
    public int b;
    private final ColorStateList c;

    public gk(Shader shader, ColorStateList colorStateList, int i) {
        this.a = shader;
        this.c = colorStateList;
        this.b = i;
    }

    public static gk a(int i) {
        return new gk(null, null, i);
    }

    public final boolean b() {
        return this.a != null;
    }

    public final boolean c() {
        ColorStateList colorStateList;
        return this.a == null && (colorStateList = this.c) != null && colorStateList.isStateful();
    }

    public final boolean d(int[] iArr) {
        if (c()) {
            ColorStateList colorStateList = this.c;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState == this.b) {
                return false;
            }
            this.b = colorForState;
            return true;
        }
        return false;
    }

    public final boolean e() {
        return b() || this.b != 0;
    }
}
