package defpackage;
/* compiled from: PG */
/* renamed from: cgx  reason: default package */
/* loaded from: classes4.dex */
final class cgx implements cgv {
    final /* synthetic */ cgy a;

    public cgx(cgy cgyVar) {
        this.a = cgyVar;
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
