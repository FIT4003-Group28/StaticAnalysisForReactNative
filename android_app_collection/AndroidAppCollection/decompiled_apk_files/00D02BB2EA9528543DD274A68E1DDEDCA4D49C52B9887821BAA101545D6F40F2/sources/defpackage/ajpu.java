package defpackage;
/* compiled from: PG */
/* renamed from: ajpu  reason: default package */
/* loaded from: classes2.dex */
abstract class ajpu extends ajqa {
    @Override // defpackage.ajqa
    public Throwable b() {
        int a = a();
        String str = a != 1 ? a != 2 ? "null" : "ERROR" : "COMPLETED";
        if (a != 0) {
            throw new UnsupportedOperationException(str);
        }
        throw null;
    }
}
