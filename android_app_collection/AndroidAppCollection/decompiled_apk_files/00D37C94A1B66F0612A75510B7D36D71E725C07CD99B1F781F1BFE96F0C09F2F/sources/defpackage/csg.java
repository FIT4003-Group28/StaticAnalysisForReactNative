package defpackage;
/* compiled from: PG */
/* renamed from: csg  reason: default package */
/* loaded from: classes3.dex */
final class csg implements csl {
    final /* synthetic */ csh a;

    public csg(csh cshVar) {
        this.a = cshVar;
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
