package defpackage;

import java.util.Comparator;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: amum  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class amum implements Comparator {
    static final Comparator a = new amum();

    private amum() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = amuo.S;
        return ((amup) obj2).c().length() - ((amup) obj).c().length();
    }
}
