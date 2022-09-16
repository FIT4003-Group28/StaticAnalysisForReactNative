package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: nys  reason: default package */
/* loaded from: classes3.dex */
public final class nys {
    public static final zer a = new nyb();

    public static int a(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 8) {
                        return 4;
                    }
                    if (i != 32 && i != 64) {
                        if (i != 128) {
                            return i != 256 ? 0 : 3;
                        }
                    }
                }
                return 2;
            }
            return 1;
        }
        return 3;
    }

    public static boolean b(int i, int i2) {
        return ((SparseArray) a.get()).get(i | i2) != null;
    }

    public static nxn c(View view, final nxe nxeVar, final nxe nxeVar2) {
        final nyj nyjVar = new nyj(false, nxeVar, nxeVar2);
        nxeVar2.K(nyjVar);
        nxeVar.K(nyjVar);
        nyj nyjVar2 = new nyj(true, nxeVar, nxeVar2);
        nxeVar2.K(nyjVar2);
        nxeVar.K(nyjVar2);
        nye nyeVar = new nye(view.getContext(), nxeVar, nxeVar2, 0.05f, view.getHeight());
        nye nyeVar2 = new nye(view.getContext(), nxeVar, nxeVar2, 0.3f, view.getHeight());
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new nxm(0.0f, nyjVar));
        arrayList.add(new nxm(0.01f, nyjVar2));
        arrayList.add(new nxm(0.15f, nyeVar));
        arrayList.add(new nxm(1.0f, nyeVar2));
        return new nxn(arrayList, new nxl() { // from class: nxu
            @Override // defpackage.nxl
            public final void a() {
                nxe nxeVar3 = nxe.this;
                nyj nyjVar3 = nyjVar;
                nxe nxeVar4 = nxeVar;
                zer zerVar = nys.a;
                nxeVar3.L(nyjVar3);
                nxeVar4.L(nyjVar3);
            }
        });
    }

    public static nxn d(int i, nxe nxeVar, int i2, nxe nxeVar2, aynx aynxVar) {
        final Runnable runnable;
        nxe nxeVar3;
        final nxe nxeVar4 = i2 == 1 ? nxeVar : nxeVar2;
        final nxe nxeVar5 = i2 == 1 ? nxeVar2 : nxeVar;
        final nyk nykVar = new nyk(nxeVar4, nxeVar5);
        nxeVar4.K(nykVar);
        nxeVar5.K(nykVar);
        if (i == 2 || i2 == 2) {
            final nym nymVar = new nym(nxeVar4);
            nxeVar4.K(nymVar);
            final aypg Z = aynxVar.Z(new nxz(nymVar, 2));
            runnable = new Runnable() { // from class: nxr
                @Override // java.lang.Runnable
                public final void run() {
                    nxe nxeVar6 = nxe.this;
                    nyk nykVar2 = nykVar;
                    nxe nxeVar7 = nxeVar5;
                    nym nymVar2 = nymVar;
                    aypg aypgVar = Z;
                    zer zerVar = nys.a;
                    nxeVar6.L(nykVar2);
                    nxeVar7.L(nykVar2);
                    nxeVar6.L(nymVar2);
                    azof.f((AtomicReference) aypgVar);
                }
            };
            nxeVar3 = nymVar;
        } else {
            nxe nynVar = new nyn(nxeVar4);
            runnable = new Runnable() { // from class: nxq
                @Override // java.lang.Runnable
                public final void run() {
                    nxe nxeVar6 = nxe.this;
                    nyk nykVar2 = nykVar;
                    nxe nxeVar7 = nxeVar5;
                    zer zerVar = nys.a;
                    nxeVar6.L(nykVar2);
                    nxeVar7.L(nykVar2);
                }
            };
            nxeVar3 = nynVar;
        }
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new nxm(0.0f, nxeVar3));
        arrayList.add(new nxm(1.0f, nykVar));
        nxn nxnVar = new nxn(arrayList, new nxl() { // from class: nxy
            @Override // defpackage.nxl
            public final void a() {
                runnable.run();
            }
        });
        if (i2 == 1) {
            return nxnVar;
        }
        nxnVar.b();
        return nxnVar;
    }

    public static nxn e(View view, int i, nxe nxeVar, int i2, nxe nxeVar2) {
        int a2 = a(i);
        nxe nxeVar3 = a2 == 2 ? nxeVar : nxeVar2;
        if (a2 == 2) {
            nxeVar = nxeVar2;
        }
        Context context = view.getContext();
        if (a2 == 2) {
            i = i2;
        }
        nyd nydVar = new nyd(context, i, nxeVar3, nxeVar);
        nxeVar3.K(nydVar);
        nxeVar.K(nydVar);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new nxm(0.0f, new nyn(nxeVar3)));
        arrayList.add(new nxm(1.0f, nydVar));
        nxn nxnVar = new nxn(arrayList, new nxs(nxeVar3, nydVar, nxeVar));
        if (a2 == 2) {
            return nxnVar;
        }
        nxnVar.b();
        return nxnVar;
    }

    public static nxn f(int i, nxe nxeVar, final nxe nxeVar2) {
        if (i == 32) {
            nxeVar = nxeVar2;
        }
        final nyp nypVar = new nyp(nxeVar);
        nxeVar2.K(nypVar);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new nxm(0.0f, nypVar));
        arrayList.add(new nxm(1.0f, nxeVar2));
        return new nxn(arrayList, new nxl() { // from class: nxv
            @Override // defpackage.nxl
            public final void a() {
                nxe nxeVar3 = nxe.this;
                nyp nypVar2 = nypVar;
                zer zerVar = nys.a;
                nxeVar3.L(nypVar2);
            }
        });
    }
}
