package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: eadg  reason: default package */
/* loaded from: classes6.dex */
final class eadg implements Comparator<String> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        int min = Math.min(str3.length(), str4.length());
        for (int i = 4; i < min; i++) {
            char charAt = str3.charAt(i);
            char charAt2 = str4.charAt(i);
            if (charAt != charAt2) {
                return charAt >= charAt2 ? 1 : -1;
            }
        }
        int length = str3.length();
        int length2 = str4.length();
        if (length != length2) {
            return length >= length2 ? 1 : -1;
        }
        return 0;
    }
}
