package defpackage;

import java.util.Comparator;
/* renamed from: deoo  reason: default package */
/* loaded from: classes6.dex */
public final /* synthetic */ class deoo implements Comparator {
    public static final Comparator a = new deoo();

    private deoo() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        if (str == null) {
            return str2 != null ? -1 : 0;
        } else if (str2 != null) {
            return str.compareTo(str2);
        } else {
            return 1;
        }
    }
}
