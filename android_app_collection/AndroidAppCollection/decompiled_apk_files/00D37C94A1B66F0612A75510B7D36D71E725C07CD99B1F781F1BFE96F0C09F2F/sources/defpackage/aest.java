package defpackage;
/* compiled from: PG */
/* renamed from: aest  reason: default package */
/* loaded from: classes.dex */
public class aest implements afip {
    public static final afip b = new aest("rqs");
    public static final afip c = new aest("manifestless");
    public final String d;

    public aest(String str) {
        this.d = str;
    }

    @Override // defpackage.afip
    public String a(long j) {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aest) {
            return this.d.equals(((aest) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
