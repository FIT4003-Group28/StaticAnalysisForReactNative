package defpackage;

import android.content.Context;
import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: cxgs  reason: default package */
/* loaded from: classes5.dex */
public final class cxgs extends cxhd {
    private final long a;
    private final dewl b;
    private final Context c;
    private final String d;
    private final cqat e;
    private final cxgq f;
    private final cxgj g;

    public cxgs(long j, dewl dewlVar, Context context, String str, cqat cqatVar, cxgj cxgjVar, cxgq cxgqVar) {
        this.a = j;
        this.b = dewlVar;
        this.c = context;
        this.d = str;
        this.e = cqatVar;
        this.g = cxgjVar;
        this.f = cxgqVar;
    }

    @Override // defpackage.cxhd
    public final long a() {
        return this.a;
    }

    @Override // defpackage.cxhd
    public final dewl b() {
        return this.b;
    }

    @Override // defpackage.cxhd
    public final Context c() {
        return this.c;
    }

    @Override // defpackage.cxhd
    public final String d() {
        return this.d;
    }

    @Override // defpackage.cxhd
    public final cqat e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cxhd) {
            cxhd cxhdVar = (cxhd) obj;
            if (this.a == cxhdVar.a() && this.b.equals(cxhdVar.b()) && this.c.equals(cxhdVar.c()) && this.d.equals(cxhdVar.d()) && this.e.equals(cxhdVar.e()) && this.g.equals(cxhdVar.g()) && this.f.equals(cxhdVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cxhd
    public final cxgq f() {
        return this.f;
    }

    @Override // defpackage.cxhd
    public final cxgj g() {
        return this.g;
    }

    public final int hashCode() {
        long j = this.a;
        return this.f.hashCode() ^ ((((((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String str = this.d;
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.g);
        String valueOf5 = String.valueOf(this.f);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(str).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu + length2 + length3 + length4 + length5 + String.valueOf(valueOf5).length());
        sb.append("Deps{ttlMillis=");
        sb.append(j);
        sb.append(", channelProvider=");
        sb.append(valueOf);
        sb.append(", context=");
        sb.append(valueOf2);
        sb.append(", instanceId=");
        sb.append(str);
        sb.append(", clock=");
        sb.append(valueOf3);
        sb.append(", loggerFactory=");
        sb.append(valueOf4);
        sb.append(", flags=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
