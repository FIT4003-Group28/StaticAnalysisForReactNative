package defpackage;
/* compiled from: PG */
/* renamed from: csgw  reason: default package */
/* loaded from: classes5.dex */
public final class csgw {
    public final csgz a;

    public csgw(csgz csgzVar) {
        this.a = csgzVar;
    }

    public static csgu a() {
        return new csgu(deaf.TAP);
    }

    public final String toString() {
        String obj = super.toString();
        deaf b = deaf.b(this.a.b);
        if (b == null) {
            b = deaf.UNASSIGNED_USER_ACTION_ID;
        }
        String name = b.name();
        String valueOf = String.valueOf(this.a);
        int length = String.valueOf(obj).length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(name).length() + String.valueOf(valueOf).length());
        sb.append(obj);
        sb.append(" ");
        sb.append(name);
        sb.append(" ");
        sb.append(valueOf);
        return sb.toString();
    }
}
