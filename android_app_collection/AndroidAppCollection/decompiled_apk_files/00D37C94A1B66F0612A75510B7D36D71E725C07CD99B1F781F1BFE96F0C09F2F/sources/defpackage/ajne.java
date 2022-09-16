package defpackage;
/* compiled from: PG */
/* renamed from: ajne  reason: default package */
/* loaded from: classes.dex */
final class ajne implements yiw {
    private final yiw a;
    private final amqo b;
    private final String c = "NOT_CACHED";

    public ajne(yiw yiwVar, amqo amqoVar) {
        this.a = yiwVar;
        this.b = amqoVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(ykg ykgVar) {
        return ykgVar instanceof yko ? "MEMORY" : ykgVar instanceof ykr ? "DISK" : "UNKNOWN";
    }

    @Override // defpackage.yiw
    public final void a(Object obj, Exception exc) {
        if (((ampq) this.b.get()).h()) {
            ((akvm) ((ampq) this.b.get()).c()).b("DEFAULT_IMAGE_CLIENT", this.c, true);
        }
        this.a.a(obj, exc);
    }

    @Override // defpackage.yiw
    public final void b(Object obj, Object obj2) {
        if (((ampq) this.b.get()).h()) {
            ((akvm) ((ampq) this.b.get()).c()).b("DEFAULT_IMAGE_CLIENT", this.c, false);
        }
        this.a.b(obj, obj2);
    }
}
