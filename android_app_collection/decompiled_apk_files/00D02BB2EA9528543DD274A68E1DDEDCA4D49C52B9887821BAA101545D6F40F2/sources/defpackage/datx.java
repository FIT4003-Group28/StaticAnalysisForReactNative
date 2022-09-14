package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: datx  reason: default package */
/* loaded from: classes5.dex */
final class datx implements Comparator<String> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (dbsd.a(str3, str4)) {
            return 0;
        }
        if (str3 == null) {
            return -1;
        }
        if (str4 != null) {
            return str3.compareTo(str4);
        }
        return 1;
    }
}
