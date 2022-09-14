package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: nqb  reason: default package */
/* loaded from: classes7.dex */
final class nqb extends nrc {
    private final cqvj a;
    private final cqtv b;
    private final cqtv c;
    private final float d;
    private final dbsg<cqss> e;
    private final dbsg<cqjb<? extends cqkp, cqss>> f;
    private final dbsg<cqlc<? extends cqkp, cqss>> g;
    private final dbsg<? extends cqtv> h;
    private final dbsg<? extends cqtv> i;
    private final TextUtils.TruncateAt j;

    public nqb(cqvj cqvjVar, cqtv cqtvVar, cqtv cqtvVar2, float f, dbsg<cqss> dbsgVar, dbsg<cqjb<? extends cqkp, cqss>> dbsgVar2, dbsg<cqlc<? extends cqkp, cqss>> dbsgVar3, dbsg<? extends cqtv> dbsgVar4, dbsg<? extends cqtv> dbsgVar5, TextUtils.TruncateAt truncateAt) {
        this.a = cqvjVar;
        this.b = cqtvVar;
        this.c = cqtvVar2;
        this.d = f;
        this.e = dbsgVar;
        this.f = dbsgVar2;
        this.g = dbsgVar3;
        this.h = dbsgVar4;
        this.i = dbsgVar5;
        this.j = truncateAt;
    }

    @Override // defpackage.nrc
    public final cqvj a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.nrc
    public final cqtv b() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.nrc
    public final cqtv c() {
        return this.c;
    }

    @Override // defpackage.nrc
    public final float d() {
        return this.d;
    }

    @Override // defpackage.nrc
    public final dbsg<cqss> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nrc) {
            nrc nrcVar = (nrc) obj;
            if (this.a.equals(nrcVar.a()) && this.b.equals(nrcVar.b()) && this.c.equals(nrcVar.c()) && Float.floatToIntBits(this.d) == Float.floatToIntBits(nrcVar.d()) && this.e.equals(nrcVar.e()) && this.f.equals(nrcVar.f()) && this.g.equals(nrcVar.g()) && this.h.equals(nrcVar.h()) && this.i.equals(nrcVar.i()) && this.j.equals(nrcVar.j())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.nrc
    public final dbsg<cqjb<? extends cqkp, cqss>> f() {
        return this.f;
    }

    @Override // defpackage.nrc
    public final dbsg<cqlc<? extends cqkp, cqss>> g() {
        return this.g;
    }

    @Override // defpackage.nrc
    public final dbsg<? extends cqtv> h() {
        return this.h;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ ((cqrp) this.b).a) * 1000003) ^ ((cqrp) this.c).a) * 1000003) ^ Float.floatToIntBits(this.d)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode();
    }

    @Override // defpackage.nrc
    public final dbsg<? extends cqtv> i() {
        return this.i;
    }

    @Override // defpackage.nrc
    public final TextUtils.TruncateAt j() {
        return this.j;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        float f = this.d;
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        String valueOf6 = String.valueOf(this.g);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.i);
        String valueOf9 = String.valueOf(this.j);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(valueOf7).length();
        StringBuilder sb = new StringBuilder(length + 191 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(valueOf8).length() + String.valueOf(valueOf9).length());
        sb.append("TextStyleDefinition{typeface=");
        sb.append(valueOf);
        sb.append(", sizeOnly=");
        sb.append(valueOf2);
        sb.append(", extraPaddingOnly=");
        sb.append(valueOf3);
        sb.append(", letterSpacingEm=");
        sb.append(f);
        sb.append(", color=");
        sb.append(valueOf4);
        sb.append(", colorCallback=");
        sb.append(valueOf5);
        sb.append(", colorVmFunction=");
        sb.append(valueOf6);
        sb.append(", outsideTopPadding=");
        sb.append(valueOf7);
        sb.append(", outsideBottomPadding=");
        sb.append(valueOf8);
        sb.append(", truncation=");
        sb.append(valueOf9);
        sb.append("}");
        return sb.toString();
    }
}
