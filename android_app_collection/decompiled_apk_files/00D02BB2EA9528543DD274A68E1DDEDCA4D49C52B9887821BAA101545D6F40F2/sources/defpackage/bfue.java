package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bfue  reason: default package */
/* loaded from: classes3.dex */
public class bfue implements bfub {
    private final List<bfua> a = new ArrayList();
    private final List<bfua> b = new ArrayList();

    public bfue(List<dqws> list) {
        boolean z = true;
        for (dqws dqwsVar : list) {
            int i = dqwsVar.a;
            if ((i & 4) != 0 && (i & 2) != 0 && (i & 1) != 0) {
                (z ? this.a : this.b).add(new bfud(dqwsVar));
                z = !z;
            }
        }
    }

    @Override // defpackage.bfub
    public List<bfua> a() {
        return this.a;
    }

    @Override // defpackage.bfub
    public List<bfua> b() {
        return this.b;
    }
}
