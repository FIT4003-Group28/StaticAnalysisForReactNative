package defpackage;

import android.view.animation.Interpolator;
import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: chze  reason: default package */
/* loaded from: classes4.dex */
final class chze extends chzh {
    private final long a;
    private final long b;
    private final Interpolator c;
    private final int d;

    public chze(long j, long j2, Interpolator interpolator, int i) {
        this.a = j;
        this.b = j2;
        if (interpolator != null) {
            this.c = interpolator;
            this.d = i;
            return;
        }
        throw new NullPointerException("Null interpolator");
    }

    @Override // defpackage.chzh
    public final long a() {
        return this.a;
    }

    @Override // defpackage.chzh
    public final long b() {
        return this.b;
    }

    @Override // defpackage.chzh
    public final Interpolator c() {
        return this.c;
    }

    @Override // defpackage.chzh
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof chzh) {
            chzh chzhVar = (chzh) obj;
            if (this.a == chzhVar.a() && this.b == chzhVar.b() && this.c.equals(chzhVar.c()) && this.d == chzhVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return this.d ^ ((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        String valueOf = String.valueOf(this.c);
        int i = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + R.styleable.AppCompatTheme_windowMinWidthMinor);
        sb.append("MoveSpec{durationMs=");
        sb.append(j);
        sb.append(", startDelayMs=");
        sb.append(j2);
        sb.append(", interpolator=");
        sb.append(valueOf);
        sb.append(", staggerAfterPosition=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
