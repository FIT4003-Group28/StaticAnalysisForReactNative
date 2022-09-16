package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: agva  reason: default package */
/* loaded from: classes.dex */
final class agva implements Comparator {
    final /* synthetic */ agvb a;

    public agva(agvb agvbVar) {
        this.a = agvbVar;
    }

    private final int a(Object obj) {
        Integer num = (Integer) this.a.d.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return a(obj2) - a(obj);
    }
}
