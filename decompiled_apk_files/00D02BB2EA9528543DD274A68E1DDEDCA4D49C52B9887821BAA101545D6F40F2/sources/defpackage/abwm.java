package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: abwm  reason: default package */
/* loaded from: classes2.dex */
final class abwm implements jkh {
    private final List<jkh> a = new ArrayList();

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
        synchronized (abwm.class) {
            for (jkh jkhVar : this.a) {
                jkhVar.L(jkjVar, jjnVar, jjnVar2, jkgVar);
            }
        }
    }

    @Override // defpackage.jkh
    public final void M(jkj jkjVar, jjn jjnVar) {
        synchronized (abwm.class) {
            for (jkh jkhVar : this.a) {
                jkhVar.M(jkjVar, jjnVar);
            }
        }
    }

    @Override // defpackage.jkh
    public final void N(jkj jkjVar, jjn jjnVar) {
        synchronized (abwm.class) {
            for (jkh jkhVar : this.a) {
                jkhVar.N(jkjVar, jjnVar);
            }
        }
    }

    @Override // defpackage.jkh
    public final void O() {
    }

    @Override // defpackage.jkh
    public final void P(jkj jkjVar, jjn jjnVar, float f) {
        synchronized (abwm.class) {
            for (jkh jkhVar : this.a) {
                jkhVar.P(jkjVar, jjnVar, f);
            }
        }
    }

    public final void a(jkh jkhVar) {
        this.a.add(jkhVar);
    }
}
