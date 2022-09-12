package defpackage;

import java.util.Comparator;
/* renamed from: amvv  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class amvv implements Comparator {
    public static final Comparator a = new amvv();

    private amvv() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Float.compare(((amvl) obj2).b(), ((amvl) obj).b());
    }
}
