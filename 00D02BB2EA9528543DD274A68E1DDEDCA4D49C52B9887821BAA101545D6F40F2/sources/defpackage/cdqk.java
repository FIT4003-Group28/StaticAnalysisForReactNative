package defpackage;

import com.google.android.filament.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cdqk  reason: default package */
/* loaded from: classes4.dex */
public final class cdqk extends cdrr {
    public final bvrt<docg> a;
    public final cdja b;
    public final dbsg<cdrt> c;
    public final dbsg<cdrh> d;
    public final dbsg<cdis> e;

    public cdqk(bvrt<docg> bvrtVar, cdja cdjaVar, dbsg<cdrt> dbsgVar, dbsg<cdrh> dbsgVar2, dbsg<cdis> dbsgVar3) {
        this.a = bvrtVar;
        this.b = cdjaVar;
        this.c = dbsgVar;
        this.d = dbsgVar2;
        this.e = dbsgVar3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdrr) {
            cdrr cdrrVar = (cdrr) obj;
            if (this.a.equals(cdrrVar.j()) && this.b.equals(cdrrVar.k()) && this.c.equals(cdrrVar.l()) && this.d.equals(cdrrVar.m()) && this.e.equals(cdrrVar.n())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    @Override // defpackage.cdrr
    public final bvrt<docg> j() {
        return this.a;
    }

    @Override // defpackage.cdrr
    public final cdja k() {
        return this.b;
    }

    @Override // defpackage.cdrr
    public final dbsg<cdrt> l() {
        return this.c;
    }

    @Override // defpackage.cdrr
    public final dbsg<cdrh> m() {
        return this.d;
    }

    @Override // defpackage.cdrr
    public final dbsg<cdis> n() {
        return this.e;
    }

    @Override // defpackage.cdrr
    public final cdrl o() {
        return new cdqj(this);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_tooltipFrameBackground + length2 + length3 + length4 + String.valueOf(valueOf5).length());
        sb.append("TactileReviewPost{serializableReview=");
        sb.append(valueOf);
        sb.append(", publicationState=");
        sb.append(valueOf2);
        sb.append(", tactileReviewText=");
        sb.append(valueOf3);
        sb.append(", tactileReviewOwnerResponse=");
        sb.append(valueOf4);
        sb.append(", author=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
