package defpackage;

import com.google.android.gms.cast.CastDevice;
/* compiled from: PG */
/* renamed from: adhz  reason: default package */
/* loaded from: classes.dex */
public final class adhz extends adie {
    public final CastDevice a;

    public adhz() {
    }

    public adhz(CastDevice castDevice) {
        this.a = castDevice;
    }

    public static adhz a(CastDevice castDevice) {
        return new adhz(castDevice);
    }

    @Override // defpackage.adig
    public final String b() {
        return this.a.d;
    }

    @Override // defpackage.adig
    public final String c() {
        String valueOf = String.valueOf(this.a.e);
        return valueOf.length() != 0 ? "Cast:".concat(valueOf) : new String("Cast:");
    }

    @Override // defpackage.adig
    public final int d() {
        return 2;
    }

    @Override // defpackage.adie
    public final adit e() {
        return new adit(this.a.b());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof adhz)) {
            return false;
        }
        return this.a.equals(((adhz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("MdxCastScreen{castDevice=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
