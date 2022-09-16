package defpackage;

import java.util.HashMap;
/* compiled from: PG */
/* renamed from: aaok  reason: default package */
/* loaded from: classes.dex */
public final class aaok implements aaqx {
    private final yni a;

    public aaok(yni yniVar) {
        yniVar.getClass();
        this.a = yniVar;
    }

    @Override // defpackage.aaqx
    public final void c(arpa arpaVar) {
        if (!arpaVar.d.isEmpty()) {
            asmc[] asmcVarArr = null;
            for (arpb arpbVar : arpaVar.d) {
                int G = akpq.G(arpbVar.b);
                if (G == 0) {
                    G = 1;
                }
                int i = G - 1;
                if (i == 1) {
                    HashMap hashMap = new HashMap();
                    for (asmc asmcVar : arpbVar.c) {
                        hashMap.put(asmcVar.e, asmcVar.c == 2 ? (String) asmcVar.d : "");
                    }
                    this.a.d(new aaoe(hashMap));
                } else if (i == 2) {
                    this.a.d(new aaog((asmc[]) arpbVar.c.toArray(new asmc[0])));
                } else if (i == 6) {
                    asmcVarArr = (asmc[]) arpbVar.c.toArray(new asmc[0]);
                } else if (i == 7) {
                    this.a.d(new aaol((asmc[]) arpbVar.c.toArray(new asmc[0])));
                } else if (i == 8) {
                    this.a.d(new aaoj(arpbVar.c));
                }
            }
            this.a.d(new aaof(asmcVarArr));
        }
    }

    @Override // defpackage.aaqx
    public final /* synthetic */ boolean e(aaqs aaqsVar) {
        return true;
    }
}
