package defpackage;

import com.google.android.apps.gmm.location.rawlocationevents.AndroidLocationEvent;
/* compiled from: PG */
/* renamed from: aerc  reason: default package */
/* loaded from: classes2.dex */
public final class aerc<T> extends btrh<T> {
    private final int d;

    public aerc(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            AndroidLocationEvent androidLocationEvent = (AndroidLocationEvent) obj;
            if (!((aerb) this.a).r() || androidLocationEvent.getLocation() == null) {
                return;
            }
            amvs amvsVar = new amvs();
            amvsVar.j(androidLocationEvent.getLocation());
            amvsVar.d();
        } else if (i == 1) {
            aerb aerbVar = (aerb) this.a;
            boolean z = ((alhj) obj).a;
            if (!aerbVar.r() || aerbVar.h == z) {
                return;
            }
            aerbVar.h = z;
        } else {
            aerb aerbVar2 = (aerb) this.a;
            alia aliaVar = (alia) obj;
            if (!aerbVar2.r() || !aerbVar2.h) {
                return;
            }
            aerbVar2.a.j(aerbVar2.e.g().d(aerbVar2.f(aerbVar2.e())), aerbVar2.f(aerbVar2.e()));
            aeui aeuiVar = aerbVar2.f;
            jjn jjnVar = jjn.HIDDEN;
            dhiz dhizVar = dhiz.UNKNOWN_CONTEXT;
            aerbVar2.e();
            if (aerbVar2.d.a().b(dqkc.BLUE_DOT) != bzmk.VISIBLE) {
                aerbVar2.d.a().e(dqkc.BLUE_DOT);
            }
            aerbVar2.q();
        }
    }
}
