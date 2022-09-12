package defpackage;
/* compiled from: PG */
/* renamed from: bzdj  reason: default package */
/* loaded from: classes4.dex */
public enum bzdj {
    UNINITIALIZED(false),
    NOT_STARTED(false),
    STARTED(true),
    STOPPED(false);
    
    public final boolean e;

    bzdj(boolean z) {
        this.e = z;
    }

    public final boolean a() {
        return this == UNINITIALIZED;
    }
}
