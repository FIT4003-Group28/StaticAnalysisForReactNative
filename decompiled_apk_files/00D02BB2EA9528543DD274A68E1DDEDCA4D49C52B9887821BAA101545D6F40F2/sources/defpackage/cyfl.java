package defpackage;
/* compiled from: PG */
/* renamed from: cyfl  reason: default package */
/* loaded from: classes5.dex */
final class cyfl {
    public final Object a;
    private final long b;

    public cyfl(cyfn cyfnVar, Object obj) {
        this.a = obj;
        this.b = System.currentTimeMillis() + cyfnVar.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        return System.currentTimeMillis() > this.b;
    }
}
