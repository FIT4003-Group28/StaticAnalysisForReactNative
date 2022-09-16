package defpackage;
/* compiled from: PG */
/* renamed from: cfhr  reason: default package */
/* loaded from: classes4.dex */
enum cfhr {
    UNKNOWN(false),
    BEGIN(false),
    BEGIN_TO_CENTER(true),
    CENTER_TO_BEGIN(true),
    CENTER(false),
    CENTER_TO_END(true),
    END_TO_CENTER(true),
    END(false);
    
    final boolean i;

    cfhr(boolean z) {
        this.i = z;
    }
}
