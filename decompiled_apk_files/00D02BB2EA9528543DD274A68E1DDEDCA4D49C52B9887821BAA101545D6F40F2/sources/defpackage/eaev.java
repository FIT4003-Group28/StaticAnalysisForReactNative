package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: eaev  reason: default package */
/* loaded from: classes6.dex */
final class eaev implements Comparator<String> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (str3 == str4) {
            return 0;
        }
        if (str3 == null) {
            return -1;
        }
        if (str4 != null) {
            return String.CASE_INSENSITIVE_ORDER.compare(str3, str4);
        }
        return 1;
    }
}
