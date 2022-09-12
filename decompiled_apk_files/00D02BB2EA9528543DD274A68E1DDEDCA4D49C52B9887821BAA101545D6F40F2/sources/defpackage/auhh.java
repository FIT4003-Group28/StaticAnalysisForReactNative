package defpackage;
/* compiled from: PG */
/* renamed from: auhh  reason: default package */
/* loaded from: classes.dex */
public enum auhh {
    SHOWN,
    SUPPRESSED,
    SUPPRESSED_FOR_OPTOUT,
    SUPPRESSED_FOR_COUNTERFACTUAL,
    SUPPRESSED_FOR_INCOGNITO;

    public final boolean a() {
        return this == SHOWN || this == SUPPRESSED_FOR_COUNTERFACTUAL || this == SUPPRESSED_FOR_OPTOUT;
    }
}
