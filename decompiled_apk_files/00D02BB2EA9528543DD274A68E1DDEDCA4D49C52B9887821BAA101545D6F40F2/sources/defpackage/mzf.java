package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: mzf  reason: default package */
/* loaded from: classes7.dex */
final class mzf extends mzj {
    private final int a;
    private final String b;
    private final String c;
    private final String d;
    private final knz e;
    private final boolean f;

    public mzf(int i, String str, @dzsi String str2, @dzsi String str3, knz knzVar, boolean z) {
        this.a = i;
        if (str != null) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            if (knzVar != null) {
                this.e = knzVar;
                this.f = z;
                return;
            }
            throw new NullPointerException("Null batteryOnArrival");
        }
        throw new NullPointerException("Null placeName");
    }

    @Override // defpackage.mzj
    public final int a() {
        return this.a;
    }

    @Override // defpackage.mzj
    public final String b() {
        return this.b;
    }

    @Override // defpackage.mzj
    @dzsi
    public final String c() {
        return this.c;
    }

    @Override // defpackage.mzj
    @dzsi
    public final String d() {
        return this.d;
    }

    @Override // defpackage.mzj
    public final knz e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof mzj) {
            mzj mzjVar = (mzj) obj;
            if (this.a == mzjVar.a() && this.b.equals(mzjVar.b()) && ((str = this.c) != null ? str.equals(mzjVar.c()) : mzjVar.c() == null) && ((str2 = this.d) != null ? str2.equals(mzjVar.d()) : mzjVar.d() == null) && this.e.equals(mzjVar.e()) && this.f == mzjVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.mzj
    public final boolean f() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = (((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((hashCode2 ^ i) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String valueOf = String.valueOf(this.e);
        boolean z = this.f;
        int length = str.length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_windowFixedHeightMinor + length2 + length3 + String.valueOf(valueOf).length());
        sb.append("DestinationItem{index=");
        sb.append(i);
        sb.append(", placeName=");
        sb.append(str);
        sb.append(", chargingTimeText=");
        sb.append(str2);
        sb.append(", timeText=");
        sb.append(str3);
        sb.append(", batteryOnArrival=");
        sb.append(valueOf);
        sb.append(", isFinalDestination=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
