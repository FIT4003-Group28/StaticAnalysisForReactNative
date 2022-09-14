package defpackage;

import java.util.Comparator;
/* renamed from: ajlp  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class ajlp implements Comparator {
    static final Comparator a = new ajlp();

    private ajlp() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = ajlu.i;
        return (int) (((ditl) obj).b - ((ditl) obj2).b);
    }
}
