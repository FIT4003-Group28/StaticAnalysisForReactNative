package defpackage;
/* compiled from: PG */
/* renamed from: anbc  reason: default package */
/* loaded from: classes.dex */
public enum anbc {
    GENERAL(true),
    BOOLEAN(false),
    CHARACTER(false),
    INTEGRAL(false),
    FLOAT(true);
    
    public final boolean f;

    anbc(boolean z) {
        this.f = z;
    }
}
