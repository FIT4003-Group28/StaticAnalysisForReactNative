package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ahkj  reason: default package */
/* loaded from: classes.dex */
public enum ahkj {
    UPDATE_FREQUENCY_NONE(0),
    UPDATE_FREQUENCY_SLOW(15),
    UPDATE_FREQUENCY_FAST(30);
    
    public final int d;

    ahkj(int i) {
        this.d = (int) (i == 0 ? 0L : TimeUnit.SECONDS.toMicros(1L) / i);
    }
}
