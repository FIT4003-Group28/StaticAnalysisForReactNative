package defpackage;

import java.io.InputStream;
/* compiled from: PG */
/* renamed from: uah  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class uah implements anir {
    public final /* synthetic */ uam a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ uah(uam uamVar, int i) {
        this.a = uamVar;
        this.b = i;
    }

    public /* synthetic */ uah(uam uamVar, int i, int i2) {
        this.c = i2;
        this.a = uamVar;
        this.b = i;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        if (this.c == 0) {
            final uam uamVar = this.a;
            int i = this.b;
            final uav uavVar = (uav) obj;
            if (!uam.l(uavVar) || !uam.k(uavVar)) {
                return anlz.q(uamVar.g());
            }
            uay uayVar = uamVar.a;
            uau uauVar = uavVar.c;
            if (uauVar == null) {
                uauVar = uau.a;
            }
            return amne.f(uayVar.a(uauVar, i)).h(tvv.t, anjk.a).b(Exception.class, tvv.u, anjk.a).i(new anir() { // from class: uaj
                @Override // defpackage.anir
                public final ankt a(Object obj2) {
                    uam uamVar2 = uam.this;
                    uav uavVar2 = uavVar;
                    ampq ampqVar = (ampq) obj2;
                    if (ampqVar.h()) {
                        if (!uam.m(uavVar2)) {
                            ubi.c((InputStream) ampqVar.c());
                            return anlz.p(new uad());
                        }
                        return anlz.q(ampqVar);
                    }
                    return anlz.q(uamVar2.g());
                }
            }, anjk.a);
        }
        uam uamVar2 = this.a;
        int i2 = this.b;
        uav uavVar2 = (uav) obj;
        if (!uam.m(uavVar2)) {
            return anlz.p(new uad());
        }
        uay uayVar2 = uamVar2.a;
        uau uauVar2 = uavVar2.c;
        if (uauVar2 == null) {
            uauVar2 = uau.a;
        }
        return uayVar2.a(uauVar2, i2);
    }
}
