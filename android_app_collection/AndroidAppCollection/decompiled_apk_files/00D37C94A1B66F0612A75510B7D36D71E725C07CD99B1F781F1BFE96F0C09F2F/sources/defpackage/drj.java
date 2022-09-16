package defpackage;

import java.util.Arrays;
import java.util.Comparator;
/* compiled from: PG */
/* renamed from: drj  reason: default package */
/* loaded from: classes3.dex */
public final class drj implements Comparator {
    final /* synthetic */ dqs a;
    final /* synthetic */ dpu b;

    public drj(dqs dqsVar, dpu dpuVar) {
        this.a = dqsVar;
        this.b = dpuVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        dqz dqzVar = (dqz) obj;
        dqz dqzVar2 = (dqz) obj2;
        dqs dqsVar = this.a;
        dpu dpuVar = this.b;
        if (dqzVar instanceof drd) {
            return !(dqzVar2 instanceof drd) ? 1 : 0;
        } else if (dqzVar2 instanceof drd) {
            return -1;
        } else {
            if (dqsVar == null) {
                return dqzVar.i().compareTo(dqzVar2.i());
            }
            return (int) dqt.e(dqsVar.a(dpuVar, Arrays.asList(dqzVar, dqzVar2)).h().doubleValue());
        }
    }
}
