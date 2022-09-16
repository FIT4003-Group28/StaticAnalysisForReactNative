package defpackage;
/* compiled from: PG */
/* renamed from: dcrh  reason: default package */
/* loaded from: classes.dex */
public enum dcrh {
    GENERAL(true),
    BOOLEAN(false),
    CHARACTER(false),
    INTEGRAL(false),
    FLOAT(true);
    
    public final boolean f;

    dcrh(boolean z) {
        this.f = z;
    }
}
