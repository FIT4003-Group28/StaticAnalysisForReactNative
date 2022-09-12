package defpackage;

import android.content.res.Configuration;
/* compiled from: PG */
/* renamed from: bvlc  reason: default package */
/* loaded from: classes4.dex */
final class bvlc extends bvlt {
    private final Configuration a;
    private final int b;

    public bvlc(Configuration configuration, int i) {
        this.a = configuration;
        this.b = i;
    }

    @Override // defpackage.bvlt
    public final Configuration a() {
        return this.a;
    }

    @Override // defpackage.bvlt
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bvlt) {
            bvlt bvltVar = (bvlt) obj;
            if (this.a.equals(bvltVar.a()) && this.b == bvltVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
        sb.append("PictureKey{configuration=");
        sb.append(valueOf);
        sb.append(", resourceId=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
