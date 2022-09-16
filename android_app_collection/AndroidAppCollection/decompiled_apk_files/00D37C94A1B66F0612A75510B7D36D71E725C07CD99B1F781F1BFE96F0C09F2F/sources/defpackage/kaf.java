package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: kaf  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kaf implements ayqe {
    public final /* synthetic */ aynx a;
    private final /* synthetic */ int b;

    public /* synthetic */ kaf(aynx aynxVar, int i) {
        this.b = i;
        this.a = aynxVar;
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        int i = this.b;
        if (i == 0) {
            aynx aynxVar = this.a;
            kao kaoVar = kag.b;
            return ((Boolean) obj).booleanValue() ? aynxVar : aynx.r();
        } else if (i != 1) {
            if (i != 2) {
                return ((Boolean) obj).booleanValue() ? this.a : aynx.r();
            }
            return ((nnh) obj) == nnh.NON_ENGAGEMENT_PANEL ? aynx.r() : this.a;
        } else {
            aynx aynxVar2 = this.a;
            aynx E = aynx.E(aynxVar2.ak(), aynx.S(kag.a.toMillis(), TimeUnit.MILLISECONDS));
            ayrd.b(E, "other is null");
            ayzi ayziVar = new ayzi(aynxVar2, E);
            azqc.j();
            return ayziVar;
        }
    }
}
