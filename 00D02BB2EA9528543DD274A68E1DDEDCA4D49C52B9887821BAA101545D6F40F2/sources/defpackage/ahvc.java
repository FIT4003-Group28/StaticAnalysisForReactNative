package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
import com.google.android.apps.gmm.locationsharing.api.Profile;
import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: ahvc  reason: default package */
/* loaded from: classes2.dex */
final class ahvc extends ahwg {
    private final dqzv a;
    private final dbsg<eapd> b;
    private final dbsg<Profile> c;
    private final PersonId d;
    private final boolean e;
    private final dbsg<ahvj> f;

    public ahvc(dqzv dqzvVar, dbsg<eapd> dbsgVar, dbsg<Profile> dbsgVar2, PersonId personId, boolean z, dbsg<ahvj> dbsgVar3) {
        if (dqzvVar != null) {
            this.a = dqzvVar;
            this.b = dbsgVar;
            this.c = dbsgVar2;
            this.d = personId;
            this.e = z;
            this.f = dbsgVar3;
            return;
        }
        throw new NullPointerException("Null shareAcl");
    }

    @Override // defpackage.ahwg
    public final dqzv a() {
        return this.a;
    }

    @Override // defpackage.ahwg
    public final dbsg<eapd> b() {
        return this.b;
    }

    @Override // defpackage.ahwg
    public final dbsg<Profile> c() {
        return this.c;
    }

    @Override // defpackage.ahwg
    public final PersonId d() {
        return this.d;
    }

    @Override // defpackage.ahwg
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahwg) {
            ahwg ahwgVar = (ahwg) obj;
            if (this.a.equals(ahwgVar.a()) && this.b.equals(ahwgVar.b()) && this.c.equals(ahwgVar.c()) && this.d.equals(ahwgVar.d()) && this.e == ahwgVar.e() && this.f.equals(ahwgVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ahwg
    public final dbsg<ahvj> f() {
        return this.f;
    }

    public final int hashCode() {
        dqzv dqzvVar = this.a;
        int i = dqzvVar.bC;
        if (i == 0) {
            i = dsst.a.b(dqzvVar).c(dqzvVar);
            dqzvVar.bC = i;
        }
        return this.f.hashCode() ^ ((((((((((i ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        boolean z = this.e;
        String valueOf5 = String.valueOf(this.f);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_toolbarNavigationButtonStyle + length2 + length3 + length4 + String.valueOf(valueOf5).length());
        sb.append("OutgoingShareInfo{shareAcl=");
        sb.append(valueOf);
        sb.append(", lastShareAclModificationTimestamp=");
        sb.append(valueOf2);
        sb.append(", profile=");
        sb.append(valueOf3);
        sb.append(", personId=");
        sb.append(valueOf4);
        sb.append(", isPending=");
        sb.append(z);
        sb.append(", journey=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
