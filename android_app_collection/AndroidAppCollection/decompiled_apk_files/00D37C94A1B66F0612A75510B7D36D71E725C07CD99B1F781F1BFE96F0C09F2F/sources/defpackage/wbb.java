package defpackage;

import java.util.HashSet;
/* compiled from: PG */
/* renamed from: wbb  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class wbb implements Runnable {
    public final /* synthetic */ wbc a;
    private final /* synthetic */ int b;

    public /* synthetic */ wbb(wbc wbcVar) {
        this.a = wbcVar;
    }

    public /* synthetic */ wbb(wbc wbcVar, int i) {
        this.b = i;
        this.a = wbcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            wbc wbcVar = this.a;
            wbcVar.e(wbcVar.b);
        } else if (i == 1) {
            wbc wbcVar2 = this.a;
            HashSet hashSet = new HashSet();
            wcw.a(0, hashSet);
            if (wbcVar2.l()) {
                wcw.a(1, hashSet);
            }
            wbcVar2.f(new wcx(almu.y(hashSet)));
        } else if (i == 2) {
            wbc wbcVar3 = this.a;
            wbcVar3.g(wbcVar3.c);
        } else if (i != 3) {
            wbc wbcVar4 = this.a;
            wbcVar4.h(wbcVar4.e);
        } else {
            wbc wbcVar5 = this.a;
            wbcVar5.i(wbcVar5.d);
        }
    }
}
