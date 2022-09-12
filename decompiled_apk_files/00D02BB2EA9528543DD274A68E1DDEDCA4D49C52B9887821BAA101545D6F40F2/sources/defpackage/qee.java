package defpackage;
/* compiled from: PG */
/* renamed from: qee  reason: default package */
/* loaded from: classes7.dex */
public enum qee {
    DISABLED(0),
    ENABLED(1),
    ENABLED_DUE_TO_STICKINESS(2),
    OPTED_OUT(3),
    DOGFOOD_OPT_IN_ENABLED(4),
    ENABLED_DUE_TO_DOGFOOD_OPT_IN(5);
    
    public final int g;

    qee(int i) {
        this.g = i;
    }
}
