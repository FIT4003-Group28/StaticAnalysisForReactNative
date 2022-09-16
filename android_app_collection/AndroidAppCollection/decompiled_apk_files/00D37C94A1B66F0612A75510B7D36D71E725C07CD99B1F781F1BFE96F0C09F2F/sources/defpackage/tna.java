package defpackage;

import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: tna  reason: default package */
/* loaded from: classes4.dex */
public final class tna {
    private final int a;
    private final List d;
    private final SparseIntArray e;
    private final angg b = tle.a();
    private final List c = new ArrayList();
    private final List f = new ArrayList();
    private final SparseIntArray g = new SparseIntArray();

    public tna(int i, int i2) {
        this.a = i;
        this.d = new ArrayList(i2);
        this.e = new SparseIntArray(i2);
    }

    public tmh b(tmb tmbVar, int i) {
        tmbVar.c = this.a;
        if (i == -1) {
            i = -1;
        }
        int size = this.d.size();
        aopc aopcVar = tmbVar.f;
        int d = tmbVar.d();
        aopcVar.copyOnWrite();
        tmh tmhVar = (tmh) aopcVar.instance;
        tmh tmhVar2 = tmh.a;
        tmhVar.e = d - 1;
        tmhVar.b |= 2;
        angg anggVar = this.b;
        aopc aopcVar2 = tmbVar.f;
        angf angfVar = ((tmh) aopcVar2.instance).d;
        if (angfVar == null) {
            angfVar = angf.a;
        }
        aopa mo52toBuilder = angfVar.mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        angf angfVar2 = (angf) mo52toBuilder.instance;
        anggVar.getClass();
        angfVar2.e = anggVar;
        angfVar2.b |= 2048;
        mo52toBuilder.copyOnWrite();
        angf angfVar3 = (angf) mo52toBuilder.instance;
        angfVar3.b |= 1;
        angfVar3.c = size;
        angf angfVar4 = (angf) mo52toBuilder.mo39build();
        aopcVar2.copyOnWrite();
        tmh tmhVar3 = (tmh) aopcVar2.instance;
        angfVar4.getClass();
        tmhVar3.d = angfVar4;
        tmhVar3.b |= 1;
        tmt tmtVar = tmbVar.a;
        if (!tmtVar.a.isEmpty()) {
            for (tmr tmrVar : tmtVar.a) {
                tmrVar.e();
            }
        }
        tmh a = tmbVar.a();
        this.d.add(a);
        this.e.append(size, i);
        return a;
    }

    public tni c() {
        return new tni(this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public void e(tnh tnhVar) {
        boolean z = true;
        if (tnhVar.b == 1) {
            if (this.e.valueAt(tnhVar.c()) != -1) {
                z = false;
            }
            aqxo.p(z);
        }
        this.c.add(tnhVar);
    }

    public void f(tmb tmbVar, List list) {
        int f = anhg.f(((tmh) list.get(0)).e);
        if (f == 0 || f == 1) {
            e(new tnh(2, list, this.f.size()));
            tmz tmzVar = new tmz(this);
            angf angfVar = ((tmh) tmbVar.f.instance).d;
            if (angfVar == null) {
                angfVar = angf.a;
            }
            angg anggVar = angfVar.e;
            if (anggVar == null) {
                anggVar = angg.a;
            }
            if ((anggVar.b & 2) == 0) {
                return;
            }
            tmzVar.a(tmbVar);
            return;
        }
        e(new tnh(3, list, -1));
    }
}
