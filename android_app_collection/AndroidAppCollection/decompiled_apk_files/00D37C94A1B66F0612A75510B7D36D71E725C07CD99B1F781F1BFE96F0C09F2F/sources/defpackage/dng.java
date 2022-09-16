package defpackage;
/* compiled from: PG */
/* renamed from: dng  reason: default package */
/* loaded from: classes3.dex */
final class dng implements anyr {
    static final dng a = new dng();
    private static final anyq b;

    static {
        anyp a2 = anyq.a("messagingClientEvent");
        anyv a3 = anyv.a();
        a3.a = 1;
        a2.b(a3.b());
        b = a2.a();
    }

    private dng() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.anyn
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        obj2.b(b, ((aodi) obj).a);
    }
}
