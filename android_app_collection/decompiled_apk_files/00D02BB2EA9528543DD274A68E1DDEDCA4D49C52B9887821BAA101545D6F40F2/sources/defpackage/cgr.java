package defpackage;
/* compiled from: PG */
/* renamed from: cgr  reason: default package */
/* loaded from: classes4.dex */
final class cgr implements cgv {
    final /* synthetic */ cgs a;

    public cgr(cgs cgsVar) {
        this.a = cgsVar;
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
