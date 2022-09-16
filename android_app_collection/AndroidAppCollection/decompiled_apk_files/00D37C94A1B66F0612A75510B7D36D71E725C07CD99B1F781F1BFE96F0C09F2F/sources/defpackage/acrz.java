package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: acrz  reason: default package */
/* loaded from: classes.dex */
final class acrz implements Runnable {
    final /* synthetic */ cff a;
    final /* synthetic */ acsb b;

    public acrz(acsb acsbVar, cff cffVar) {
        this.b = acsbVar;
        this.a = cffVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        acsb acsbVar = this.b;
        acsc acscVar = acsbVar.b;
        acscVar.c.i(acscVar.d, new ArrayList(Arrays.asList(acsbVar.c)), this.a);
    }
}
