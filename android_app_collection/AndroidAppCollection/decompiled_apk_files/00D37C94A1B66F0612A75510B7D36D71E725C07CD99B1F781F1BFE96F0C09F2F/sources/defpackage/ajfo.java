package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: ajfo  reason: default package */
/* loaded from: classes.dex */
public final class ajfo {
    public final long a;
    public final long b;
    public final boolean c;
    public final ajbr d;

    public ajfo(ajbr ajbrVar, long j, long j2, boolean z) {
        this.d = ajbrVar;
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final PlayerResponseModel a() {
        return this.d.a();
    }

    public final String b() {
        return this.d.A();
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == ajfo.class) {
            ajfo ajfoVar = (ajfo) obj;
            if (this.b == ajfoVar.b && TextUtils.equals(this.d.A(), ajfoVar.d.A())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        return ((((((((int) (j >> 32)) + 527) * 31) + ((int) j)) * 31) + this.d.A().hashCode()) * 31) + (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        boolean z = this.c;
        StringBuilder sb = new StringBuilder(103);
        sb.append("(startPos: ");
        sb.append(j);
        sb.append(", transitionNextPosMillis: ");
        sb.append(j2);
        sb.append(", transitionAtEnd: ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
