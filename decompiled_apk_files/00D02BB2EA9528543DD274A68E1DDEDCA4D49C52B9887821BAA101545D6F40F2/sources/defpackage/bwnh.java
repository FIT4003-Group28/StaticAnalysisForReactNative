package defpackage;

import java.util.Arrays;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bwnh  reason: default package */
/* loaded from: classes4.dex */
public final class bwnh {
    public static final bwnh a = new bwnh(-1, 0);
    public final int b;
    public final long c;

    public bwnh(int i, long j) {
        this.b = i;
        this.c = j;
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof bwnh) {
            bwnh bwnhVar = (bwnh) obj;
            if (this.b == bwnhVar.b && this.c == bwnhVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Long.valueOf(this.c)});
    }

    public final String toString() {
        return String.format(Locale.US, "<moduleType:%d, moduleSubtype:%d>", Integer.valueOf(this.b), Long.valueOf(this.c));
    }
}
