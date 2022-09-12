package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: alvf  reason: default package */
/* loaded from: classes.dex */
public abstract class alvf implements alvb {
    protected final akry a;
    long b = 0;
    final alve c = new alve();
    @dzsi
    protected bnrs d = null;
    protected final alyx e;

    /* JADX INFO: Access modifiers changed from: protected */
    public alvf(akry akryVar, alyx alyxVar) {
        this.a = akryVar;
        this.e = alyxVar;
    }

    @Override // defpackage.alvb
    @dzsi
    public final alyh a(alyh alyhVar, akra akraVar) {
        int c = g(akraVar).c(alyhVar.a);
        if (c < 0) {
            return null;
        }
        return alyhVar.j(c);
    }

    @Override // defpackage.alvb
    public final List<alyh> b(alyh alyhVar, akra akraVar) {
        ArrayList arrayList = new ArrayList();
        int d = g(akraVar).d(alyhVar.a);
        if (d < 0) {
            return arrayList;
        }
        int i = d - alyhVar.a;
        int i2 = 1 << i;
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                arrayList.add(new alyh(d, (alyhVar.b << i) + i4, (alyhVar.c << i) + i3, alyhVar.d));
            }
        }
        return arrayList;
    }

    @Override // defpackage.alvb
    public final float c(akra akraVar) {
        return g(akraVar).a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final alyv g(akra akraVar) {
        return this.e.b(akraVar, this.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h(List<alyh> list, akra akraVar) {
        if (list.size() > 1) {
            alve alveVar = this.c;
            alveVar.a = akraVar.a;
            alveVar.b = akraVar.b;
            Collections.sort(list, alveVar);
        }
    }
}
