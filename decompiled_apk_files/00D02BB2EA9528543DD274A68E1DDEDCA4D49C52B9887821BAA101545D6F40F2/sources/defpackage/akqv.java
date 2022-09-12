package defpackage;
/* compiled from: PG */
/* renamed from: akqv  reason: default package */
/* loaded from: classes2.dex */
public final class akqv {
    @dzsi
    public static akqq a(String str) {
        try {
            String[] split = str.split(",");
            if (split.length == 2) {
                return new akqq(Double.parseDouble(split[0]), Double.parseDouble(split[1]));
            }
            throw new NumberFormatException("not a pair of doubles");
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
