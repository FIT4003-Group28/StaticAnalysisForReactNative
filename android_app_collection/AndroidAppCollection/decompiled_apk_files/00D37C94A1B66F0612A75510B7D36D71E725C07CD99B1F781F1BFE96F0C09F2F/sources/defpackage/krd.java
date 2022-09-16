package defpackage;
/* compiled from: PG */
/* renamed from: krd  reason: default package */
/* loaded from: classes3.dex */
final class krd implements yiw {
    final /* synthetic */ kre a;
    private final String b;

    public krd(kre kreVar, String str) {
        this.a = kreVar;
        zgh.m(str);
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
            this.a.F = bool;
        }
    }
}
