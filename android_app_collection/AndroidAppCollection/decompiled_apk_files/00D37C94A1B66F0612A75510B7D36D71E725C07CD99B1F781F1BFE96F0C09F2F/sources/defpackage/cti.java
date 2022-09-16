package defpackage;
/* compiled from: PG */
/* renamed from: cti  reason: default package */
/* loaded from: classes3.dex */
public enum cti {
    RUNNING(false),
    PAUSED(false),
    CLEARED(false),
    SUCCESS(true),
    FAILED(true);
    
    public final boolean f;

    cti(boolean z) {
        this.f = z;
    }
}
