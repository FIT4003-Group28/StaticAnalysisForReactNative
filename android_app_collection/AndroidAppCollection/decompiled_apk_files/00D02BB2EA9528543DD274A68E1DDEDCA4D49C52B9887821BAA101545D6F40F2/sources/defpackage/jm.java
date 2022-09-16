package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Shader;
/* compiled from: PG */
/* renamed from: jm  reason: default package */
/* loaded from: classes.dex */
public final class jm {
    public final Shader a;
    public int b;
    private final ColorStateList c;

    public jm(Shader shader, ColorStateList colorStateList, int i) {
        this.a = shader;
        this.c = colorStateList;
        this.b = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static jm a(int i) {
        return new jm(null, null, i);
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
