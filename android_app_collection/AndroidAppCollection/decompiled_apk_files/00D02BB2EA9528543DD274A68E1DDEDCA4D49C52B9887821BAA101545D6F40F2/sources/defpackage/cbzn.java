package defpackage;
/* compiled from: PG */
/* renamed from: cbzn  reason: default package */
/* loaded from: classes4.dex */
public final class cbzn {
    public static int a(cbzj cbzjVar, CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence2.length() == 0 || charSequence2.length() > charSequence.length() || !cbzjVar.c(Character.codePointAt(charSequence, charSequence2.length() - 1))) {
            return -1;
        }
        for (int length = charSequence2.length() - 2; length >= 0; length--) {
            if (!Character.isLowSurrogate(charSequence.charAt(length))) {
                int codePointAt = Character.codePointAt(charSequence, length);
                if (cbzjVar.d(codePointAt)) {
                    return length;
                }
                if (cbzjVar.e(codePointAt)) {
                    return -1;
                }
            }
        }
        return -1;
    }
}
