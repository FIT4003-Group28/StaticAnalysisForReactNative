package defpackage;
/* compiled from: PG */
/* renamed from: aacm  reason: default package */
/* loaded from: classes.dex */
public enum aacm {
    UNKNOWN(-1),
    AVAILABLE(0),
    STALE(1),
    EXPIRED(2),
    MISSING(3);
    
    public final int f;

    aacm(int i) {
        this.f = i;
    }
}
