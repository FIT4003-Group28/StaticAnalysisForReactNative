package defpackage;

import java.util.Comparator;
import java.util.Map;
/* renamed from: duhw  reason: default package */
/* loaded from: classes6.dex */
final /* synthetic */ class duhw implements Comparator {
    static final Comparator a = new duhw();

    private duhw() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
    }
}
