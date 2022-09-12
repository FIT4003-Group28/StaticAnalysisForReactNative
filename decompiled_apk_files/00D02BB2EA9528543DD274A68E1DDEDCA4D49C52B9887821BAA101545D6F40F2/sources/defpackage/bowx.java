package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bowx  reason: default package */
/* loaded from: classes3.dex */
public enum bowx {
    PERMANENTLY_CLOSED(R.string.RAP_PLACE_IS_PERMANENTLY_CLOSED, dqgh.CLOSED, dtya.au),
    DOES_NOT_EXIST(R.string.RAP_PLACE_DOES_NOT_EXIST, dqgh.DOES_NOT_EXIST, dtya.W),
    SPAM(R.string.RAP_PLACE_IS_SPAM, dqgh.SPAM, dtya.bG),
    PRIVATE(R.string.RAP_PLACE_IS_PRIVATE, dqgh.PRIVATE, dtya.ay),
    MOVED(R.string.RAP_PLACE_IS_MOVED, dqgh.MOVED, dtya.ar),
    DUPLICATE(R.string.RAP_PLACE_IS_DUPLICATE, dqgh.DUPLICATE, dtya.X);
    
    public static final bowx[] g;
    public static final int h;
    public final int i;
    public final dqgh j;
    public final ddho k;

    static {
        bowx[] values = values();
        g = values;
        h = values.length;
    }

    bowx(int i, dqgh dqghVar, ddho ddhoVar) {
        this.i = i;
        this.j = dqghVar;
        this.k = ddhoVar;
    }
}
