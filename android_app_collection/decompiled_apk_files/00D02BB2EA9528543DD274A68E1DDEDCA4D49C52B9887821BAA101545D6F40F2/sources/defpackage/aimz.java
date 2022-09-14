package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
import com.google.android.apps.gmm.locationsharing.api.Profile;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aimz  reason: default package */
/* loaded from: classes2.dex */
public final class aimz extends aink {
    public final PersonId a;
    private final dbsg<Profile> b;
    private final dcdc<ahwg> c;
    private final dcdc<ahvg> d;
    private final dcep<aioj> e;
    private final Boolean f;
    private final cqat g;
    private final int h;

    public aimz(dbsg<Profile> dbsgVar, PersonId personId, dcdc<ahwg> dcdcVar, dcdc<ahvg> dcdcVar2, dcep<aioj> dcepVar, int i, Boolean bool, cqat cqatVar) {
        this.b = dbsgVar;
        if (personId != null) {
            this.a = personId;
            if (dcdcVar != null) {
                this.c = dcdcVar;
                if (dcdcVar2 != null) {
                    this.d = dcdcVar2;
                    if (dcepVar != null) {
                        this.e = dcepVar;
                        this.h = i;
                        this.f = bool;
                        this.g = cqatVar;
                        return;
                    }
                    throw new NullPointerException("Null currentLoadingStates");
                }
                throw new NullPointerException("Null incomingShares");
            }
            throw new NullPointerException("Null outgoingSharesInternal");
        }
        throw new NullPointerException("Null personId");
    }

    @Override // defpackage.aink
    public final dbsg<Profile> a() {
        return this.b;
    }

    @Override // defpackage.aink
    public final PersonId b() {
        return this.a;
    }

    @Override // defpackage.aink
    public final dcdc<ahwg> c() {
        return this.c;
    }

    @Override // defpackage.aink
    public final dcdc<ahvg> d() {
        return this.d;
    }

    @Override // defpackage.aink
    public final dcep<aioj> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aink) {
            aink ainkVar = (aink) obj;
            if (this.b.equals(ainkVar.a()) && this.a.equals(ainkVar.b()) && dchl.m(this.c, ainkVar.c()) && dchl.m(this.d, ainkVar.d()) && this.e.equals(ainkVar.e()) && this.h == ainkVar.h() && this.f.equals(ainkVar.f()) && this.g.equals(ainkVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aink
    public final Boolean f() {
        return this.f;
    }

    @Override // defpackage.aink
    public final cqat g() {
        return this.g;
    }

    @Override // defpackage.aink
    public final int h() {
        return this.h;
    }

    public final int hashCode() {
        return ((((((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.h) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.a);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        int i = this.h;
        String str = i != 1 ? i != 2 ? i != 3 ? "HAS_REQUESTED_LOCATION" : "IS_REQUESTING_LOCATION" : "CAN_REQUEST_LOCATION" : "REQUEST_LOCATION_UNAVAILABLE";
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 148 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length() + str.length() + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length());
        sb.append("PersonUiState{profile=");
        sb.append(valueOf);
        sb.append(", personId=");
        sb.append(valueOf2);
        sb.append(", outgoingSharesInternal=");
        sb.append(valueOf3);
        sb.append(", incomingShares=");
        sb.append(valueOf4);
        sb.append(", currentLoadingStates=");
        sb.append(valueOf5);
        sb.append(", requestLocationState=");
        sb.append(str);
        sb.append(", isHiddenFromMap=");
        sb.append(valueOf6);
        sb.append(", clock=");
        sb.append(valueOf7);
        sb.append("}");
        return sb.toString();
    }
}
