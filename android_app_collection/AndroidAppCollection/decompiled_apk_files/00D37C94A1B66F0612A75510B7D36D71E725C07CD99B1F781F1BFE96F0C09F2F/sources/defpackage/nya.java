package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: nya  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class nya implements nyl {
    private final /* synthetic */ int q;
    public static final /* synthetic */ nya p = new nya(15);
    public static final /* synthetic */ nya o = new nya(14);
    public static final /* synthetic */ nya n = new nya(13);
    public static final /* synthetic */ nya m = new nya(12);
    public static final /* synthetic */ nya l = new nya(11);
    public static final /* synthetic */ nya k = new nya(10);
    public static final /* synthetic */ nya j = new nya(9);
    public static final /* synthetic */ nya i = new nya(8);
    public static final /* synthetic */ nya h = new nya(7);
    public static final /* synthetic */ nya g = new nya(6);
    public static final /* synthetic */ nya f = new nya(5);
    public static final /* synthetic */ nya e = new nya(4);
    public static final /* synthetic */ nya d = new nya(3);
    public static final /* synthetic */ nya c = new nya(2);
    public static final /* synthetic */ nya b = new nya(1);
    public static final /* synthetic */ nya a = new nya();

    private /* synthetic */ nya() {
    }

    private /* synthetic */ nya(int i2) {
        this.q = i2;
    }

    @Override // defpackage.nyl
    public final nxn a(View view, int i2, nxe nxeVar, int i3, final nxe nxeVar2, aynx aynxVar, aadd aaddVar) {
        final nxe nxeVar3 = nxeVar;
        switch (this.q) {
            case 0:
                int i4 = nyb.a;
                nyd nydVar = new nyd(view.getContext(), i3, nxeVar3, nxeVar2);
                nxeVar3.K(nydVar);
                nxeVar2.K(nydVar);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(new nxm(0.0f, new nyn(nxeVar3)));
                arrayList.add(new nxm(1.0f, nydVar));
                return new nxn(arrayList, new nxs(nxeVar3, nydVar, nxeVar2, 1));
            case 1:
                int i5 = nyb.a;
                return nys.d(i2, nxeVar, i3, nxeVar2, aynxVar);
            case 2:
                int i6 = nyb.a;
                return nys.d(i2, nxeVar, i3, nxeVar2, aynxVar);
            case 3:
                int i7 = nyb.a;
                final aypf aypfVar = new aypf();
                final nym nymVar = new nym(nxeVar3);
                nxeVar3.K(nymVar);
                aypfVar.d(aynxVar.Z(new nxz(nymVar, 1)));
                final nyo nyoVar = new nyo(view.getContext(), nxeVar, nxeVar2, view.getHeight(), aaddVar);
                nxeVar2.K(nyoVar);
                aypfVar.d(aynxVar.Z(new ayqb() { // from class: nxo
                    @Override // defpackage.ayqb
                    public final void a(Object obj) {
                        nyo nyoVar2 = nyo.this;
                        zaw zawVar = (zaw) obj;
                        zer zerVar = nys.a;
                        boolean z = nyoVar2.c;
                        nyoVar2.c = zawVar.a.b.d() > 0;
                        if (!nyoVar2.b.equals(zawVar.a.a) || nyoVar2.c != z) {
                            nyoVar2.b.set(zawVar.a.a);
                            nyoVar2.b();
                        }
                    }
                }));
                final nyq nyqVar = new nyq(nyoVar, nxeVar2);
                aypfVar.d(aynxVar.Z(new ayqb() { // from class: nxp
                    @Override // defpackage.ayqb
                    public final void a(Object obj) {
                        nyq nyqVar2 = nyq.this;
                        zaw zawVar = (zaw) obj;
                        zer zerVar = nys.a;
                        nyqVar2.b();
                    }
                }));
                ArrayList arrayList2 = new ArrayList(3);
                arrayList2.add(new nxm(0.0f, nymVar));
                arrayList2.add(new nxm(0.95f, nyoVar));
                arrayList2.add(new nxm(1.0f, nyqVar));
                return new nxn(arrayList2, new nxl() { // from class: nxw
                    @Override // defpackage.nxl
                    public final void a() {
                        aypf aypfVar2 = aypf.this;
                        nxe nxeVar4 = nxeVar2;
                        nym nymVar2 = nymVar;
                        nyo nyoVar2 = nyoVar;
                        zer zerVar = nys.a;
                        aypfVar2.c();
                        nxeVar4.L(nymVar2);
                        nxeVar4.L(nyoVar2);
                    }
                });
            case 4:
                int i8 = nyb.a;
                return nys.d(i2, nxeVar, i3, nxeVar2, aynxVar);
            case 5:
                int i9 = nyb.a;
                return nys.d(i2, nxeVar, i3, nxeVar2, aynxVar);
            case 6:
                final nxe nxeVar4 = i2 == 4 ? nxeVar3 : nxeVar2;
                if (i2 == 4) {
                    nxeVar3 = nxeVar2;
                }
                int i10 = nyb.a;
                final nyf nyfVar = new nyf(nxeVar4, nxeVar3);
                final nyg nygVar = new nyg(nyfVar, nxeVar3);
                nxeVar4.K(nyfVar);
                nyfVar.K(nygVar);
                nxeVar3.K(nyfVar);
                nxeVar3.K(nygVar);
                ArrayList arrayList3 = new ArrayList(4);
                arrayList3.add(new nxm(0.0f, new nyn(nxeVar4)));
                arrayList3.add(new nxm(0.15f, nyfVar));
                arrayList3.add(new nxm(0.35f, nygVar));
                arrayList3.add(new nxm(1.0f, new nyc(nxeVar3)));
                nxn nxnVar = new nxn(arrayList3, new nxl() { // from class: nxt
                    @Override // defpackage.nxl
                    public final void a() {
                        nxe nxeVar5 = nxe.this;
                        nyf nyfVar2 = nyfVar;
                        nxe nxeVar6 = nxeVar3;
                        nyg nygVar2 = nygVar;
                        zer zerVar = nys.a;
                        nxeVar5.L(nyfVar2);
                        nxeVar6.L(nyfVar2);
                        nxeVar6.L(nygVar2);
                    }
                });
                if (i2 != 4) {
                    nxnVar.b();
                }
                return nxnVar;
            case 7:
                int i11 = nyb.a;
                return nys.c(view, nxeVar3, nxeVar2);
            case 8:
                nxe nxeVar5 = i2 == 64 ? nxeVar3 : nxeVar2;
                if (i2 == 64) {
                    nxeVar3 = nxeVar2;
                }
                int i12 = nyb.a;
                nyh nyhVar = new nyh(nxeVar5, nxeVar3, view.getHeight());
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(new nxm(0.0f, new nyn(nxeVar5)));
                arrayList4.add(new nxm(nyhVar.c(), nyhVar));
                arrayList4.add(new nxm(nyhVar.c() + 0.001f, new nyi(nxeVar5, nxeVar3, view.getHeight())));
                arrayList4.add(new nxm(1.0f, new nyn(nxeVar3)));
                nxn nxnVar2 = new nxn(arrayList4, null);
                if (i2 != 64) {
                    nxnVar2.b();
                }
                return nxnVar2;
            case 9:
                int i13 = nyb.a;
                return nys.e(view, i2, nxeVar, i3, nxeVar2);
            case 10:
                int i14 = nyb.a;
                return nys.e(view, i2, nxeVar, i3, nxeVar2);
            case 11:
                int i15 = nyb.a;
                return nys.f(i2, nxeVar3, nxeVar2);
            case 12:
                int i16 = nyb.a;
                return nys.e(view, i2, nxeVar, i3, nxeVar2);
            case 13:
                int i17 = nyb.a;
                return nys.f(i2, nxeVar3, nxeVar2);
            case 14:
                int i18 = nyb.a;
                return nys.c(view, nxeVar3, nxeVar2);
            default:
                int i19 = nyb.a;
                final nym nymVar2 = new nym(nxeVar2);
                nxeVar2.K(nymVar2);
                final aypg Z = aynxVar.Z(new nxz(nymVar2));
                nxm nxmVar = new nxm(0.0f, new nyn(nxeVar3));
                ArrayList arrayList5 = new ArrayList(2);
                arrayList5.add(nxmVar);
                arrayList5.add(new nxm(1.0f, nymVar2));
                return new nxn(arrayList5, new nxl() { // from class: nxx
                    @Override // defpackage.nxl
                    public final void a() {
                        aypg aypgVar = aypg.this;
                        nxe nxeVar6 = nxeVar2;
                        nym nymVar3 = nymVar2;
                        zer zerVar = nys.a;
                        azof.f((AtomicReference) aypgVar);
                        nxeVar6.L(nymVar3);
                    }
                });
        }
    }
}
