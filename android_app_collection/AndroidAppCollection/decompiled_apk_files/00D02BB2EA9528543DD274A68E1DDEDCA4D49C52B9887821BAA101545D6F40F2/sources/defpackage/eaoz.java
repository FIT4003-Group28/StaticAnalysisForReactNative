package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: eaoz  reason: default package */
/* loaded from: classes.dex */
public abstract class eaoz implements Serializable {
    public static final eaoz a = new eaoy("eras", (byte) 1);
    public static final eaoz b = new eaoy("centuries", (byte) 2);
    public static final eaoz c = new eaoy("weekyears", (byte) 3);
    public static final eaoz d = new eaoy("years", (byte) 4);
    public static final eaoz e = new eaoy("months", (byte) 5);
    public static final eaoz f = new eaoy("weeks", (byte) 6);
    public static final eaoz g = new eaoy("days", (byte) 7);
    public static final eaoz h = new eaoy("halfdays", (byte) 8);
    public static final eaoz i = new eaoy("hours", (byte) 9);
    public static final eaoz j = new eaoy("minutes", (byte) 10);
    public static final eaoz k = new eaoy("seconds", (byte) 11);
    public static final eaoz l = new eaoy("millis", (byte) 12);
    private static final long serialVersionUID = 8765135187319L;
    public final String m;

    /* JADX INFO: Access modifiers changed from: protected */
    public eaoz(String str) {
        this.m = str;
    }

    public abstract eaox a(eaok eaokVar);

    public final String toString() {
        return this.m;
    }
}
