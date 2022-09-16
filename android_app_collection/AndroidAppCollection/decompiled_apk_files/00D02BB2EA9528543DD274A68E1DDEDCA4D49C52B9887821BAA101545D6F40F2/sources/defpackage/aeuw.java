package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: aeuw  reason: default package */
/* loaded from: classes2.dex */
public final class aeuw<T> extends btrh<T> {
    private final int d;

    public aeuw(int i, Class<?> cls, T t) {
        super(cls, t);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        GmmLocation gmmLocation;
        int i = this.d;
        if (i == 0) {
            alhl alhlVar = (alhl) obj;
            aeuv aeuvVar = ((aeuu) this.a).a;
        } else if (i == 1) {
            alhy alhyVar = (alhy) obj;
            aeuv aeuvVar2 = ((aeuu) this.a).a;
        } else if (i != 2) {
            final aeuu aeuuVar = (aeuu) this.a;
            aeuuVar.a.ak = ((amqo) obj).a();
            aeuv aeuvVar3 = aeuuVar.a;
            if (aeuvVar3.ai != null || (gmmLocation = aeuvVar3.ak) == null) {
                return;
            }
            final dehn<aeuk> b = aeuvVar3.af.b(gmmLocation, 4);
            aeuuVar.a.ai = b;
            b.Pk(new Runnable(aeuuVar, b) { // from class: aeut
                private final aeuu a;
                private final dehn b;

                {
                    this.a = aeuuVar;
                    this.b = b;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    aeuu aeuuVar2 = this.a;
                    dehn<aeuk> dehnVar = this.b;
                    if (dehnVar.isDone()) {
                        if (dehnVar.isCancelled()) {
                            aeuv aeuvVar4 = aeuuVar2.a;
                            if (dehnVar != aeuvVar4.ai) {
                                return;
                            }
                            aeuvVar4.ai = null;
                            return;
                        }
                        aeuv aeuvVar5 = aeuuVar2.a;
                        if (!aeuvVar5.aD || aeuvVar5.J() == null) {
                            return;
                        }
                        aeuuVar2.a.aj = (aeuk) deha.s(dehnVar);
                        aeuuVar2.a.i();
                    }
                }
            }, aeuuVar.a.ad.h());
        } else {
            ardp ardpVar = (ardp) obj;
            aeuv aeuvVar4 = ((aeuu) this.a).a;
        }
    }

    public aeuw(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = 3;
    }
}
