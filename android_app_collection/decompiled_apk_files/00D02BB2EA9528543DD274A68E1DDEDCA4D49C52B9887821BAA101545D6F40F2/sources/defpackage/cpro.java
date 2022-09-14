package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cpro  reason: default package */
/* loaded from: classes5.dex */
public final class cpro<D> implements cpru<D> {
    @Override // defpackage.cpru
    public final List<String> a(List<D> list) {
        ArrayList b = cpwi.b(list.size());
        for (D d : list) {
            b.add(d.toString());
        }
        return b;
    }
}
