package defpackage;
/* compiled from: PG */
/* renamed from: ksu  reason: default package */
/* loaded from: classes3.dex */
final class ksu implements yiw {
    final /* synthetic */ ksv a;
    private final String b;

    public ksu(ksv ksvVar, String str) {
        this.a = ksvVar;
        this.b = str;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        String str = (String) obj;
        zep.d("Encountered exception when syncing playlist", exc);
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj2;
        if (this.b.equals((String) obj)) {
            this.a.c = bool;
        }
    }
}
