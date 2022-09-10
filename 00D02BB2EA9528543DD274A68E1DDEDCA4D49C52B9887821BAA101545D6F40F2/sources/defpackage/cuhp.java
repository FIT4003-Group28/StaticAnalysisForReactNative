package defpackage;
/* compiled from: PG */
/* renamed from: cuhp  reason: default package */
/* loaded from: classes5.dex */
public enum cuhp {
    UNKNOWN(0),
    TITLE(1),
    SUBTITLE(2),
    BODY_TEXT(3),
    CAPTION_TEXT(4),
    LABEL_TEXT(5);
    
    public final int g;

    cuhp(int i) {
        this.g = i;
    }

    public static cuhp a(final int i) {
        return (cuhp) dcbg.c(values()).r(new dbsl(i) { // from class: cuho
            private final int a;

            {
                this.a = i;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                int i2 = this.a;
                cuhp cuhpVar = cuhp.UNKNOWN;
                return ((cuhp) obj).g == i2;
            }
        }).c(UNKNOWN);
    }
}
