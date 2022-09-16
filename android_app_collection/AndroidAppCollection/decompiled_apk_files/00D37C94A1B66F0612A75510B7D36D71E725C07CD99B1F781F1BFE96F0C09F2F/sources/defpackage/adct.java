package defpackage;
/* compiled from: PG */
/* renamed from: adct  reason: default package */
/* loaded from: classes.dex */
public enum adct {
    DISABLED(false, false),
    COUNTERFACTUAL(true, false),
    FULLY_ENABLED(true, true);
    
    public final boolean d;
    public final boolean e;

    adct(boolean z, boolean z2) {
        this.d = z;
        this.e = z2;
    }
}
