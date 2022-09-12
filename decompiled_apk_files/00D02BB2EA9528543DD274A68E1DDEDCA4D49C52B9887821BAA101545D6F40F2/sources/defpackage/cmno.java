package defpackage;

import java.util.Comparator;
/* renamed from: cmno  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cmno implements Comparator {
    static final Comparator a = new cmno();

    private cmno() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Float.compare(((cmnp) obj).c, ((cmnp) obj2).c);
    }
}
