package defpackage;

import com.google.android.filament.R;
import java.net.URI;
/* compiled from: PG */
/* renamed from: dezx  reason: default package */
/* loaded from: classes6.dex */
final class dezx extends dfav {
    public final URI a;
    public final long b;
    public final Integer c;
    public final Integer d;

    public dezx(URI uri, long j, @dzsi Integer num, @dzsi Integer num2) {
        this.a = uri;
        this.b = j;
        this.c = num;
        this.d = num2;
    }

    @Override // defpackage.dfav
    public final URI a() {
        return this.a;
    }

    @Override // defpackage.dfav
    public final long b() {
        return this.b;
    }

    @Override // defpackage.dfav
    @dzsi
    public final Integer c() {
        return this.c;
    }

    @Override // defpackage.dfav
    @dzsi
    public final Integer d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        Integer num;
        Integer num2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dfav) {
            dfav dfavVar = (dfav) obj;
            if (this.a.equals(dfavVar.a()) && this.b == dfavVar.b() && ((num = this.c) != null ? num.equals(dfavVar.c()) : dfavVar.c() == null) && ((num2 = this.d) != null ? num2.equals(dfavVar.d()) : dfavVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        int i = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Integer num = this.c;
        int i2 = 0;
        int hashCode2 = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.d;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return hashCode2 ^ i2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_textAppearancePopupMenuHeader + length2 + String.valueOf(valueOf3).length());
        sb.append("ChannelRuntimeConfig{uri=");
        sb.append(valueOf);
        sb.append(", grpcIdleTimeoutMillis=");
        sb.append(j);
        sb.append(", trafficStatsUid=");
        sb.append(valueOf2);
        sb.append(", trafficStatsTag=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
