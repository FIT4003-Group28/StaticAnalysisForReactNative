package defpackage;
/* compiled from: PG */
/* renamed from: csn  reason: default package */
/* loaded from: classes3.dex */
final class csn implements csl {
    final /* synthetic */ cso a;

    public csn(cso csoVar) {
        this.a = csoVar;
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 11 + String.valueOf(valueOf).length());
        sb.append(obj);
        sb.append("{fragment=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
