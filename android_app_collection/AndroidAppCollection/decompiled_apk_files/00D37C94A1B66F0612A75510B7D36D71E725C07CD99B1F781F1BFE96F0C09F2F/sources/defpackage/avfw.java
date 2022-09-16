package defpackage;
/* compiled from: PG */
/* renamed from: avfw  reason: default package */
/* loaded from: classes2.dex */
public enum avfw {
    PREFETCH_CONFIG,
    CONFIG_NOT_SET;

    public static avfw a(int i) {
        if (i != 0) {
            if (i == 6) {
                return PREFETCH_CONFIG;
            }
            return null;
        }
        return CONFIG_NOT_SET;
    }
}
