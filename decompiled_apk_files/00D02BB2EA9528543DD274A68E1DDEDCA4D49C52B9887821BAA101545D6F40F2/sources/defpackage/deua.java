package defpackage;
/* compiled from: PG */
/* renamed from: deua  reason: default package */
/* loaded from: classes6.dex */
public final class deua implements detz {
    private static deua a;

    private deua() {
    }

    public static deua getInstance() {
        if (a == null) {
            a = new deua();
        }
        return a;
    }

    @Override // defpackage.detz
    public final long a() {
        return System.currentTimeMillis();
    }
}
