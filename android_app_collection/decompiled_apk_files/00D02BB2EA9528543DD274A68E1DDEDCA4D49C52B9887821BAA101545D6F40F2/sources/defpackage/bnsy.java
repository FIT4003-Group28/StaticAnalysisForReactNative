package defpackage;
/* compiled from: PG */
/* renamed from: bnsy  reason: default package */
/* loaded from: classes.dex */
enum bnsy {
    NONE(false, false),
    CLAMP(true, false),
    FULL(true, true);
    
    final boolean d;
    final boolean e;

    bnsy(boolean z, boolean z2) {
        this.d = z;
        this.e = z2;
    }
}
