package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
/* compiled from: PG */
/* renamed from: aicl  reason: default package */
/* loaded from: classes2.dex */
final class aicl extends aicz {
    private final PersonId a;
    private final boolean b;
    private final ahvf c;
    private final String d;
    private final int e;

    public aicl(PersonId personId, boolean z, ahvf ahvfVar, String str, int i) {
        this.a = personId;
        this.b = z;
        this.c = ahvfVar;
        this.d = str;
        this.e = i;
    }

    @Override // defpackage.aicz
    public final PersonId a() {
        return this.a;
    }

    @Override // defpackage.aicz
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.aicz
    public final ahvf c() {
        return this.c;
    }

    @Override // defpackage.aicz
    public final String d() {
        return this.d;
    }

    @Override // defpackage.aicz
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aicz) {
            aicz aiczVar = (aicz) obj;
            if (this.a.equals(aiczVar.a()) && this.b == aiczVar.b() && this.c.equals(aiczVar.c()) && this.d.equals(aiczVar.d()) && this.e == aiczVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        String valueOf2 = String.valueOf(this.c);
        String str = this.d;
        int i = this.e;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 83 + String.valueOf(valueOf2).length() + String.valueOf(str).length());
        sb.append("BitmapSpec{personId=");
        sb.append(valueOf);
        sb.append(", selected=");
        sb.append(z);
        sb.append(", freshness=");
        sb.append(valueOf2);
        sb.append(", avatarUrl=");
        sb.append(str);
        sb.append(", numUsers=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
