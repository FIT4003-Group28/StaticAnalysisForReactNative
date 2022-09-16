package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: bahx  reason: default package */
/* loaded from: classes2.dex */
public abstract class bahx implements Serializable {
    public static final bahx a = new bahw("eras", (byte) 1);
    public static final bahx b = new bahw("centuries", (byte) 2);
    public static final bahx c = new bahw("weekyears", (byte) 3);
    public static final bahx d = new bahw("years", (byte) 4);
    public static final bahx e = new bahw("months", (byte) 5);
    public static final bahx f = new bahw("weeks", (byte) 6);
    public static final bahx g = new bahw("days", (byte) 7);
    public static final bahx h = new bahw("halfdays", (byte) 8);
    public static final bahx i = new bahw("hours", (byte) 9);
    public static final bahx j = new bahw("minutes", (byte) 10);
    public static final bahx k = new bahw("seconds", (byte) 11);
    public static final bahx l = new bahw("millis", (byte) 12);
    private static final long serialVersionUID = 8765135187319L;
    public final String m;

    /* JADX INFO: Access modifiers changed from: protected */
    public bahx(String str) {
        this.m = str;
    }

    public abstract bahv a(bahl bahlVar);

    public final String toString() {
        return this.m;
    }
}
