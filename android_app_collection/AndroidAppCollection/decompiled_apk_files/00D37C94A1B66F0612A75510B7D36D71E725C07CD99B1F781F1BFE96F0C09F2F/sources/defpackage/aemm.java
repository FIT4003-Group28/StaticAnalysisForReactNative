package defpackage;

import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: aemm  reason: default package */
/* loaded from: classes.dex */
public final class aemm {
    public final snc a;
    public final aadd b;
    public final ExecutorService c;

    public aemm(ExecutorService executorService, ExecutorService executorService2, snc sncVar, aadd aaddVar, aacz aaczVar) {
        this.a = sncVar;
        this.b = aaddVar;
        atfw atfwVar = aaczVar.b().k;
        atts attsVar = (atfwVar == null ? atfw.a : atfwVar).s;
        if ((attsVar == null ? atts.b : attsVar).r) {
            this.c = executorService2;
        } else {
            this.c = executorService;
        }
    }
}
