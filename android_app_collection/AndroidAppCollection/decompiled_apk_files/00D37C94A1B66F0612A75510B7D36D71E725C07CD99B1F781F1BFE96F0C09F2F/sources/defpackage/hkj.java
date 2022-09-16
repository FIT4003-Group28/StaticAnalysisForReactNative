package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: hkj  reason: default package */
/* loaded from: classes3.dex */
public final class hkj {
    public Uri a;
    public Uri b;
    public atnp c;
    public String d;
    public Long e;
    public String f;
    public String g;
    public amuk h;
    public awbb i;
    public String j;
    public String k;
    public int l;
    private avuk m;
    private Boolean n;
    private Boolean o;

    public final void b(boolean z) {
        this.o = Boolean.valueOf(z);
    }

    public final void c(avuk avukVar) {
        if (avukVar != null) {
            this.m = avukVar;
            return;
        }
        throw new NullPointerException("Null uploadFlowSource");
    }

    public final void d(boolean z) {
        this.n = Boolean.valueOf(z);
    }

    public final hkk a() {
        int i;
        Uri uri;
        Boolean bool;
        avuk avukVar = this.m;
        if (avukVar == null || (i = this.l) == 0 || (uri = this.a) == null || (bool = this.n) == null || this.o == null) {
            StringBuilder sb = new StringBuilder();
            if (this.m == null) {
                sb.append(" uploadFlowSource");
            }
            if (this.l == 0) {
                sb.append(" uploadFlowFlavor");
            }
            if (this.a == null) {
                sb.append(" sourceUri");
            }
            if (this.n == null) {
                sb.append(" usesYTAudioSource");
            }
            if (this.o == null) {
                sb.append(" isShortsEligible");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new hkk(avukVar, i, uri, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, bool.booleanValue(), this.o.booleanValue(), this.j, this.k);
    }
}
