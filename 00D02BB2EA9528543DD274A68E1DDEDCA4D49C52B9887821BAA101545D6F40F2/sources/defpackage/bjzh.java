package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bjzh  reason: default package */
/* loaded from: classes3.dex */
public class bjzh implements bjws {
    private final List<bjwr> a = dchl.a();

    public bjzh(List<dqcq> list) {
        for (final dqcq dqcqVar : list) {
            List<bjwr> list2 = this.a;
            dqcqVar.getClass();
            list2.add(new bjwr(dqcqVar) { // from class: bjzg
                private final dqcq a;

                {
                    this.a = dqcqVar;
                }

                @Override // defpackage.bjwr
                public CharSequence a() {
                    return this.a.a;
                }
            });
        }
    }

    @Override // defpackage.bjws
    public List<bjwr> a() {
        return this.a;
    }
}
