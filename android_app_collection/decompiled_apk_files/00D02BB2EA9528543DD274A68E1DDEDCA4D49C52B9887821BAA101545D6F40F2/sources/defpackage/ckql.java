package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: ckql  reason: default package */
/* loaded from: classes.dex */
public final class ckql {
    public boolean a = true;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public boolean e = true;
    public boolean f = false;
    public boolean g = false;

    public final boolean equals(@dzsi Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ckql) {
            ckql ckqlVar = (ckql) obj;
            if (this.a == ckqlVar.a) {
                int i = ckqlVar.b;
                if (this.c == ckqlVar.c && this.d == ckqlVar.d && this.e == ckqlVar.e && this.f == ckqlVar.f && this.g == ckqlVar.g) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "[BitmapLoadingOptions: useBitmapCache=%s, bitmapContainerSize=%d, targetWidth=%d, targetHeight=%d, downsample=%s, centerCrop=%s, enableHardwareBitmap=%s]", Boolean.toString(this.a), 0, Integer.valueOf(this.c), Integer.valueOf(this.d), Boolean.toString(this.e), Boolean.toString(this.f), Boolean.toString(this.g));
    }
}
