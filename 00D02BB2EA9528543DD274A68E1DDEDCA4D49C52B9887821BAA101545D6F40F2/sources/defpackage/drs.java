package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: drs  reason: default package */
/* loaded from: classes6.dex */
public final class drs extends drq {
    public final dbsg<bwrs<ilo>> a;
    public final dbsg<PersonId> b;
    public final boolean c;
    public final int d;

    public drs(int i, dbsg<bwrs<ilo>> dbsgVar, dbsg<PersonId> dbsgVar2, boolean z) {
        this.d = i;
        this.a = dbsgVar;
        this.b = dbsgVar2;
        this.c = z;
    }

    @Override // defpackage.drq
    public final dbsg<bwrs<ilo>> b() {
        return this.a;
    }

    @Override // defpackage.drq
    public final dbsg<PersonId> c() {
        return this.b;
    }

    @Override // defpackage.drq
    public final boolean d() {
        return this.c;
    }

    @Override // defpackage.drq
    public final drp e() {
        return new drr(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof drq)) {
            return false;
        }
        drq drqVar = (drq) obj;
        int i = this.d;
        int g = drqVar.g();
        if (i == 0) {
            throw null;
        }
        return i == g && this.a.equals(drqVar.b()) && this.b.equals(drqVar.c()) && this.c == drqVar.d();
    }

    @Override // defpackage.drq
    public final int g() {
        return this.d;
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return ((((((i ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231);
        }
        throw null;
    }

    public final String toString() {
        int i = this.d;
        String str = i != 1 ? i != 2 ? "null" : "PERSON" : "PLACEMARK";
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        boolean z = this.c;
        StringBuilder sb = new StringBuilder(str.length() + 80 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("ArLighthouseSelectedEntity{targetType=");
        sb.append(str);
        sb.append(", placemarkRef=");
        sb.append(valueOf);
        sb.append(", personId=");
        sb.append(valueOf2);
        sb.append(", arTrams=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
