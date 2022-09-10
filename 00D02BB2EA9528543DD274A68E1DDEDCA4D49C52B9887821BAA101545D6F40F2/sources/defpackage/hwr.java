package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: hwr  reason: default package */
/* loaded from: classes.dex */
public final class hwr<T> extends btrh<T> {
    private final int d;

    public hwr(int i, Class<?> cls, T t) {
        super(cls, t);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            gds gdsVar = (gds) obj;
            ((hwp) this.a).a.aj().f();
        } else if (i == 1) {
            akox akoxVar = ((hwp) this.a).a;
            amwd amwdVar = ((amwe) obj).a;
            akoxVar.a().d(amwdVar);
            akoxVar.aj().al(amwdVar);
        } else if (i == 2) {
            bvkc bvkcVar = (bvkc) obj;
            ((hwp) this.a).a.aj().am();
        } else if (i != 3) {
            akox akoxVar2 = ((hwp) this.a).a;
            GmmLocation a = ((amqo) obj).a();
            akoxVar2.aj().aq(a);
            if (!akoxVar2.q || !akoxVar2.n.a().b() || a == null) {
                return;
            }
            akoxVar2.ah();
            alad n = akoxVar2.n();
            if (n == null) {
                return;
            }
            alaa b = alad.b(n);
            akoxVar2.n.a().f(b, a.B());
            akoxVar2.aj().ag(akyt.e(b.a()), null);
        } else {
            btvr btvrVar = (btvr) obj;
            ((hwp) this.a).a.aj().an();
        }
    }

    public hwr(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }
}
