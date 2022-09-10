package defpackage;

import java.util.Comparator;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: xlq  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class xlq implements Comparator {
    static final Comparator a = new xlq();

    private xlq() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((xli) obj).k.i().compareTo(((xli) obj2).k.i());
    }
}
