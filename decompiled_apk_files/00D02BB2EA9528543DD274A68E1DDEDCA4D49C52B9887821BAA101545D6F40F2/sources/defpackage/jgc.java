package defpackage;

import java.util.Comparator;
/* renamed from: jgc  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class jgc implements Comparator {
    static final Comparator a = new jgc();

    private jgc() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((jge) obj).a - ((jge) obj2).a;
    }
}
