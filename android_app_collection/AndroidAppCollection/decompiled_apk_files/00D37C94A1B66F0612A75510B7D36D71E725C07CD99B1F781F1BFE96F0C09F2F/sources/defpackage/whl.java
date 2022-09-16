package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: whl  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class whl implements Callable {
    public final /* synthetic */ vzv a;
    private final /* synthetic */ int b;

    public /* synthetic */ whl(vzv vzvVar, int i) {
        this.b = i;
        this.a = vzvVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return this.a.v();
            }
            afvm c = this.a.c();
            if (wey.b(c).equals("youtube-incognito")) {
                aopc aopcVar = (aopc) ambp.a.createBuilder();
                String c2 = wey.c(c);
                aopcVar.copyOnWrite();
                ambp ambpVar = (ambp) aopcVar.instance;
                ambpVar.b = 1 | ambpVar.b;
                ambpVar.c = c2;
                aopcVar.copyOnWrite();
                ambp ambpVar2 = (ambp) aopcVar.instance;
                ambpVar2.b |= 256;
                ambpVar2.i = "youtube-incognito";
                return amuk.r((ambp) aopcVar.mo39build());
            }
            return amuk.q();
        }
        return this.a.w();
    }
}
