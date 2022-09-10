package defpackage;
/* compiled from: PG */
/* renamed from: ctjo  reason: default package */
/* loaded from: classes5.dex */
public enum ctjo {
    UNKNOWN(0),
    PHONE_NUMBER(1),
    EMAIL(2),
    HANDLER(3),
    GROUP(4),
    DEVICE_ID(5);
    
    public final int g;

    ctjo(int i) {
        this.g = i;
    }

    public static ctjo a(final int i) {
        return (ctjo) dcbg.c(values()).r(new dbsl(i) { // from class: ctjn
            private final int a;

            {
                this.a = i;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                int i2 = this.a;
                ctjo ctjoVar = ctjo.UNKNOWN;
                return ((ctjo) obj).g == i2;
            }
        }).c(UNKNOWN);
    }
}
