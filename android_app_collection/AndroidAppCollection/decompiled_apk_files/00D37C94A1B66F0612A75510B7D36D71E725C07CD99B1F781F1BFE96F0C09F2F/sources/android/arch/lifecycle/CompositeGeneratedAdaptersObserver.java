package android.arch.lifecycle;

import java.util.HashMap;
/* compiled from: PG */
/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements j {
    private final h[] a;

    public CompositeGeneratedAdaptersObserver(h[] hVarArr) {
        this.a = hVarArr;
    }

    @Override // defpackage.j
    public final void a(apy apyVar, aps apsVar) {
        new HashMap();
        for (h hVar : this.a) {
            hVar.a();
        }
        for (h hVar2 : this.a) {
            hVar2.a();
        }
    }
}
