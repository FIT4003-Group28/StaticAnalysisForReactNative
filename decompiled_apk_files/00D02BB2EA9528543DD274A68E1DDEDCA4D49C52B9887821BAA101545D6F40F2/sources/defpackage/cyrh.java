package defpackage;
/* renamed from: cyrh  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class cyrh implements dbsl {
    public static final dbsl a = new cyrh();

    private cyrh() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        String str = (String) obj;
        return str.startsWith("peopleCache") && str.endsWith(".db");
    }
}
