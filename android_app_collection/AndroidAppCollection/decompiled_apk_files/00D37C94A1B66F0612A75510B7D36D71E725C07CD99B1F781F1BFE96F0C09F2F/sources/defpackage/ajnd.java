package defpackage;
/* compiled from: PG */
/* renamed from: ajnd  reason: default package */
/* loaded from: classes.dex */
public final class ajnd extends afyk {
    private final amqo c;

    public ajnd(ykg ykgVar, afyf afyfVar, snc sncVar, amqo amqoVar) {
        super(ykgVar, afyfVar, sncVar, 7200000L);
        this.c = amqoVar;
    }

    @Override // defpackage.afyk
    protected final void c(ykg ykgVar) {
        if (((ampq) this.c.get()).h()) {
            ((akvm) ((ampq) this.c.get()).c()).b("DEFAULT_IMAGE_CLIENT", ajne.c(ykgVar), false);
        }
    }
}
