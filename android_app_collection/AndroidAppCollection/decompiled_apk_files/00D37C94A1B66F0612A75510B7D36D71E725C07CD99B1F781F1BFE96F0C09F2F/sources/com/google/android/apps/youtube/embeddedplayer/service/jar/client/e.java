package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.os.RemoteException;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ alyf a;
    private final /* synthetic */ int b;

    public /* synthetic */ e(alyf alyfVar, int i) {
        this.b = i;
        this.a = alyfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                alyf alyfVar = this.a;
                alyl alylVar = alyfVar.O;
                if (alylVar == null || !alyfVar.au()) {
                    return;
                }
                try {
                    alylVar.px(1, alylVar.pv());
                    return;
                } catch (RemoteException e) {
                    throw new alyv(e);
                }
            case 1:
                alyf alyfVar2 = this.a;
                alyl alylVar2 = alyfVar2.O;
                if (alylVar2 == null || !alyfVar2.au()) {
                    return;
                }
                try {
                    alylVar2.px(3, alylVar2.pv());
                    return;
                } catch (RemoteException e2) {
                    throw new alyv(e2);
                }
            case 2:
                alyf alyfVar3 = this.a;
                alyo alyoVar = alyfVar3.K;
                if (alyoVar == null || !alyfVar3.au()) {
                    return;
                }
                try {
                    alyoVar.a();
                    return;
                } catch (RemoteException e3) {
                    throw new alyv(e3);
                }
            case 3:
                alyf alyfVar4 = this.a;
                alyk alykVar = alyfVar4.P;
                if (alykVar == null || !alyfVar4.au()) {
                    return;
                }
                try {
                    alykVar.px(2, alykVar.pv());
                    return;
                } catch (RemoteException e4) {
                    throw new alyv(e4);
                }
            case 4:
                alyf alyfVar5 = this.a;
                alyk alykVar2 = alyfVar5.P;
                if (alykVar2 == null || !alyfVar5.au()) {
                    return;
                }
                try {
                    alykVar2.px(1, alykVar2.pv());
                    return;
                } catch (RemoteException e5) {
                    throw new alyv(e5);
                }
            case 5:
                alyf alyfVar6 = this.a;
                alyo alyoVar2 = alyfVar6.K;
                if (alyoVar2 == null || !alyfVar6.au()) {
                    return;
                }
                try {
                    alyoVar2.f();
                    return;
                } catch (RemoteException e6) {
                    throw new alyv(e6);
                }
            case 6:
                alyf alyfVar7 = this.a;
                alyo alyoVar3 = alyfVar7.K;
                if (alyoVar3 == null || !alyfVar7.au()) {
                    return;
                }
                try {
                    alyoVar3.g();
                    return;
                } catch (RemoteException e7) {
                    throw new alyv(e7);
                }
            case 7:
                alyf alyfVar8 = this.a;
                alyk alykVar3 = alyfVar8.P;
                if (alykVar3 == null || !alyfVar8.au()) {
                    return;
                }
                try {
                    alykVar3.px(3, alykVar3.pv());
                    return;
                } catch (RemoteException e8) {
                    throw new alyv(e8);
                }
            case 8:
                alyf alyfVar9 = this.a;
                alyl alylVar3 = alyfVar9.O;
                if (alylVar3 == null || !alyfVar9.au()) {
                    return;
                }
                try {
                    alylVar3.px(5, alylVar3.pv());
                    return;
                } catch (RemoteException e9) {
                    throw new alyv(e9);
                }
            default:
                alyf alyfVar10 = this.a;
                alyl alylVar4 = alyfVar10.O;
                if (alylVar4 == null || !alyfVar10.au()) {
                    return;
                }
                try {
                    alylVar4.px(4, alylVar4.pv());
                    return;
                } catch (RemoteException e10) {
                    throw new alyv(e10);
                }
        }
    }
}
