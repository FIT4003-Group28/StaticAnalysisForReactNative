package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: ahxe  reason: default package */
/* loaded from: classes.dex */
public final class ahxe implements ahxb {
    public final ahwz a;
    public final Map b;
    private final aagi c;
    private final afvn d;

    public ahxe(ahwz ahwzVar, aagi aagiVar, afvn afvnVar, Map map) {
        this.a = ahwzVar;
        this.c = aagiVar;
        this.d = afvnVar;
        this.b = map;
    }

    @Override // defpackage.ahxb
    public final void a(boolean z, final String str) {
        if (!z) {
            this.a.g(str, false);
        } else if (str == null) {
        } else {
            final Runnable runnable = new Runnable() { // from class: ahxd
                @Override // java.lang.Runnable
                public final void run() {
                    ahxe ahxeVar = ahxe.this;
                    ahxeVar.a.g(str, true);
                }
            };
            this.c.a(this.d.c()).f(str).r(new zwb(12)).g(asxb.class).T(new ayqb() { // from class: ahxc
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    aicb aicbVar;
                    ahxe ahxeVar = ahxe.this;
                    Runnable runnable2 = runnable;
                    asxb asxbVar = (asxb) obj;
                    int ac = almu.ac(asxbVar.getMarkersListModel().b.c);
                    if (ac == 0) {
                        ac = 1;
                    }
                    int i = ac - 1;
                    if (i == 1) {
                        aicbVar = aicb.TIMESTAMP_MARKER;
                    } else if (i == 2) {
                        aicbVar = aicb.CHAPTER;
                    } else if (i == 3) {
                        aicbVar = aicb.HEATMAP_MARKER;
                    } else {
                        aicbVar = aicb.UNKNOWN;
                    }
                    ahxf ahxfVar = (ahxf) ahxeVar.b.get(aicbVar);
                    if (ahxfVar != null) {
                        ahxfVar.a(asxbVar);
                        runnable2.run();
                    }
                }
            });
        }
    }
}
