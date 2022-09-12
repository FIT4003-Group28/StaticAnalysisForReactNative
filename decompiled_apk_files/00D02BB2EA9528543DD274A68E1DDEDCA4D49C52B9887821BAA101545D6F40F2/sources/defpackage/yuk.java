package defpackage;

import java.util.Comparator;
/* renamed from: yuk  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class yuk implements Comparator {
    static final Comparator a = new yuk();

    private yuk() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return (((yvn) obj2).w() > ((yvn) obj).w() ? 1 : (((yvn) obj2).w() == ((yvn) obj).w() ? 0 : -1));
    }
}
