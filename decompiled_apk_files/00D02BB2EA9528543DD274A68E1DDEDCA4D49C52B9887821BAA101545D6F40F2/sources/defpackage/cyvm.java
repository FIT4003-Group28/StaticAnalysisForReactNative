package defpackage;
/* compiled from: PG */
/* renamed from: cyvm  reason: default package */
/* loaded from: classes5.dex */
final class cyvm implements dbrn<cyvv, String> {
    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ String a(cyvv cyvvVar) {
        cyvv cyvvVar2 = cyvvVar;
        String duejVar = cyvvVar2.b().d().toString();
        String a = cyvvVar2.a();
        StringBuilder sb = new StringBuilder(String.valueOf(duejVar).length() + 1 + String.valueOf(a).length());
        sb.append(duejVar);
        sb.append(":");
        sb.append(a);
        return sb.toString();
    }
}
