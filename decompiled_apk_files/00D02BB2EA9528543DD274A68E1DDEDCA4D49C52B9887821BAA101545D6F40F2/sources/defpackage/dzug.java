package defpackage;
/* compiled from: PG */
/* renamed from: dzug  reason: default package */
/* loaded from: classes6.dex */
final class dzug extends dzvy implements dzvi<String, dzum, String> {
    public static final dzug a = new dzug();

    @Override // defpackage.dzvi
    public final /* bridge */ /* synthetic */ String a(String str, dzum dzumVar) {
        String str2 = str;
        dzum dzumVar2 = dzumVar;
        dzvx.c(str2, "acc");
        dzvx.c(dzumVar2, "element");
        if (str2.length() == 0) {
            return dzumVar2.toString();
        }
        return str2 + ", " + dzumVar2;
    }
}
