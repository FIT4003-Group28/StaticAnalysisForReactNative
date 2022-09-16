package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* compiled from: PG */
/* renamed from: ayqz  reason: default package */
/* loaded from: classes2.dex */
public final class ayqz implements ayqe {
    final Comparator a;

    public ayqz(Comparator comparator) {
        this.a = comparator;
    }

    @Override // defpackage.ayqe
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        List list = (List) obj;
        Collections.sort(list, this.a);
        return list;
    }
}
