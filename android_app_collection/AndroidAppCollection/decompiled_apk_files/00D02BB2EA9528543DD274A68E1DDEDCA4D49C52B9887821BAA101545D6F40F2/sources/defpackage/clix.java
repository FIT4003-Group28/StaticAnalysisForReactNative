package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: clix  reason: default package */
/* loaded from: classes5.dex */
final class clix extends clkr {
    private final int a;
    private final int b;
    private final int c;

    public clix(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // defpackage.clkr
    public final int a() {
        return this.a;
    }

    @Override // defpackage.clkr
    public final int b() {
        return this.b;
    }

    @Override // defpackage.clkr
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof clkr) {
            clkr clkrVar = (clkr) obj;
            if (this.a == clkrVar.a() && this.b == clkrVar.b() && this.c == clkrVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        StringBuilder sb = new StringBuilder((int) R.styleable.AppCompatTheme_viewInflaterClass);
        sb.append("State{numDownloadsInFlight=");
        sb.append(i);
        sb.append(", numQueuedDownloads=");
        sb.append(i2);
        sb.append(", numDownloadsPendingConnectivity=");
        sb.append(i3);
        sb.append("}");
        return sb.toString();
    }
}
