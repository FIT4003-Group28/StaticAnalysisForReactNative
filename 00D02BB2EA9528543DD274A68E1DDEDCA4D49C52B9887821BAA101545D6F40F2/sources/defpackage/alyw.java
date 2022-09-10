package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: alyw  reason: default package */
/* loaded from: classes2.dex */
final class alyw {
    public final ArrayList<alyh> a;
    public final alyv b;

    public alyw(alyv alyvVar, List<drsu> list) {
        this.b = alyvVar;
        this.a = new ArrayList<>(list.size());
        for (drsu drsuVar : list) {
            this.a.add(new alyh(drsuVar.b, drsuVar.c, drsuVar.d));
        }
    }
}
