package defpackage;
/* compiled from: PG */
/* renamed from: bbqw  reason: default package */
/* loaded from: classes3.dex */
final class bbqw<T> {
    public final T a;

    public bbqw(T t) {
        this.a = t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bbqw<bbtm> a(bbtm bbtmVar) {
        return new bbqw<>(bbtmVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dbsg<String> b() {
        T t = this.a;
        if (t instanceof bbtm) {
            return ((bbtm) t).l();
        }
        return t instanceof dwfl ? dbsg.i(((dwfl) t).d) : dbpy.a;
    }
}
