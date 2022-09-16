package defpackage;

import com.google.android.exoplayer.ColorInfo;
/* compiled from: PG */
/* renamed from: ahpj  reason: default package */
/* loaded from: classes.dex */
public final class ahpj {
    public final ColorInfo a;
    public final androidx.media3.common.ColorInfo b;

    public ahpj(androidx.media3.common.ColorInfo colorInfo) {
        this.a = null;
        this.b = colorInfo;
    }

    public ahpj(ColorInfo colorInfo) {
        this.a = colorInfo;
        this.b = null;
    }

    public final int a() {
        ColorInfo colorInfo = this.a;
        return colorInfo != null ? colorInfo.a : this.b.a;
    }

    public final int b() {
        ColorInfo colorInfo = this.a;
        return colorInfo != null ? colorInfo.c : this.b.c;
    }

    public final byte[] c() {
        ColorInfo colorInfo = this.a;
        return colorInfo != null ? colorInfo.d : this.b.d;
    }

    public final int hashCode() {
        ColorInfo colorInfo = this.a;
        if (colorInfo != null) {
            return colorInfo.hashCode();
        }
        return this.b.hashCode();
    }

    public final String toString() {
        ColorInfo colorInfo = this.a;
        if (colorInfo != null) {
            return colorInfo.toString();
        }
        return this.b.toString();
    }
}
