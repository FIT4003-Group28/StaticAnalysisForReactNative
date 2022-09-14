package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: tnt  reason: default package */
/* loaded from: classes7.dex */
public class tnt extends tog {
    public final dcep<tnz> a;
    public final dcep<tob> b;
    public final dcep<drsm> c;

    public tnt(dcep<tnz> dcepVar, dcep<tob> dcepVar2, dcep<drsm> dcepVar3) {
        if (dcepVar != null) {
            this.a = dcepVar;
            if (dcepVar2 != null) {
                this.b = dcepVar2;
                if (dcepVar3 != null) {
                    this.c = dcepVar3;
                    return;
                }
                throw new NullPointerException("Null unselectedNonTransitModes");
            }
            throw new NullPointerException("Null routeOptions");
        }
        throw new NullPointerException("Null preferredModes");
    }

    @Override // defpackage.tog
    public final dcep<tnz> a() {
        return this.a;
    }

    @Override // defpackage.tog
    public final dcep<tob> b() {
        return this.b;
    }

    @Override // defpackage.tog
    public final dcep<drsm> c() {
        return this.c;
    }

    @Override // defpackage.tog
    public final tof d() {
        return new tns(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tog) {
            tog togVar = (tog) obj;
            if (this.a.equals(togVar.a()) && this.b.equals(togVar.b()) && this.c.equals(togVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 80 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("UserPreferencesModel{preferredModes=");
        sb.append(valueOf);
        sb.append(", routeOptions=");
        sb.append(valueOf2);
        sb.append(", unselectedNonTransitModes=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
