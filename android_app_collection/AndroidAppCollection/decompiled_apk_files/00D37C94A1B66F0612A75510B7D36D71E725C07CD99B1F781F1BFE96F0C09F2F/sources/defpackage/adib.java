package defpackage;

import android.os.Bundle;
import com.google.android.libraries.youtube.mdx.model.ScreenId;
/* compiled from: PG */
/* renamed from: adib  reason: default package */
/* loaded from: classes.dex */
public final class adib extends adig {
    public adhy a;
    public ampq b;
    public String c;
    public final adim d;
    public final String e;
    public final ScreenId f;
    public final adit g;
    public final adit h;
    public final adit i;

    public adib() {
        throw null;
    }

    public adib(adim adimVar, adit aditVar, String str, ScreenId screenId, adit aditVar2, adit aditVar3) {
        this.b = amon.a;
        this.d = adimVar;
        this.g = aditVar;
        this.e = str;
        this.f = screenId;
        this.h = aditVar2;
        this.i = aditVar3;
    }

    public static adia e() {
        return new adia();
    }

    @Override // defpackage.adig
    public final String b() {
        return this.e;
    }

    @Override // defpackage.adig
    public final String c() {
        return "cloudPairedDevice";
    }

    @Override // defpackage.adig
    public final int d() {
        return 4;
    }

    public final boolean equals(Object obj) {
        adit aditVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof adib) {
            adib adibVar = (adib) obj;
            if (this.d.equals(adibVar.d) && ((aditVar = this.g) != null ? aditVar.equals(adibVar.g) : adibVar.g == null) && this.e.equals(adibVar.e) && this.f.equals(adibVar.f) && this.h.equals(adibVar.h)) {
                adit aditVar2 = this.i;
                adit aditVar3 = adibVar.i;
                if (aditVar2 != null ? aditVar2.equals(aditVar3) : aditVar3 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final adia f() {
        adia adiaVar = new adia(this);
        adiaVar.a = this.a;
        if (this.b.h()) {
            adiaVar.c((adis) this.b.c());
        }
        return adiaVar;
    }

    @Override // defpackage.adig
    public final String g() {
        return this.h.c;
    }

    public final boolean h() {
        return this.a != null;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() ^ 1000003) * 1000003;
        adit aditVar = this.g;
        int i = 0;
        int hashCode2 = (((((((hashCode ^ (aditVar == null ? 0 : aditVar.hashCode())) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003;
        adit aditVar2 = this.i;
        if (aditVar2 != null) {
            i = aditVar2.hashCode();
        }
        return hashCode2 ^ i;
    }

    @Override // defpackage.adig
    public final boolean i(adig adigVar) {
        if (!(adigVar instanceof adib)) {
            return false;
        }
        return this.h.equals(((adib) adigVar).h);
    }

    @Override // defpackage.adig
    public final Bundle r() {
        Bundle bundle = new Bundle();
        bundle.putString("screen", this.h.c);
        bundle.putInt("mdx_session_type", 3);
        return bundle;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.g);
        String str = this.e;
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.h);
        String valueOf5 = String.valueOf(this.i);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(str).length();
        int length4 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 90 + length2 + length3 + length4 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("MdxCloudScreen{pairingType=");
        sb.append(valueOf);
        sb.append(", pairingCode=");
        sb.append(valueOf2);
        sb.append(", name=");
        sb.append(str);
        sb.append(", screenId=");
        sb.append(valueOf3);
        sb.append(", loungeDeviceId=");
        sb.append(valueOf4);
        sb.append(", clientName=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
