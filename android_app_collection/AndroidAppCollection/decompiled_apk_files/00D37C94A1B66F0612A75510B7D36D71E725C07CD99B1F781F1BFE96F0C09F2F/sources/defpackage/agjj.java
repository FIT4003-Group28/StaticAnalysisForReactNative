package defpackage;

import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: agjj  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class agjj implements Runnable {
    public final /* synthetic */ agjk a;
    public final /* synthetic */ String b;
    private final /* synthetic */ int c;

    public /* synthetic */ agjj(agjk agjkVar, String str) {
        this.a = agjkVar;
        this.b = str;
    }

    public /* synthetic */ agjj(agjk agjkVar, String str, int i) {
        this.c = i;
        this.a = agjkVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            agjk agjkVar = this.a;
            String str = this.b;
            if (!agjkVar.g.z()) {
                return;
            }
            agjkVar.e(str);
        } else if (i == 1) {
            agjk agjkVar2 = this.a;
            String str2 = this.b;
            if (!agjkVar2.g.z()) {
                return;
            }
            ((aglj) agjkVar2.f.get()).K(str2);
            agjkVar2.d(str2);
        } else if (i != 2) {
            agjk agjkVar3 = this.a;
            String str3 = this.b;
            if (!agjkVar3.g.z()) {
                return;
            }
            ylr.b();
            agjz agjzVar = (agjz) agjkVar3.i.get();
            ylr.b();
            if (agjzVar.h.z()) {
                aglj agljVar = (aglj) agjzVar.k.get();
                if (agljVar.c(str3) != null) {
                    try {
                        agqo a = ((agux) agjzVar.g.get()).a(str3);
                        if (agljVar.H(a)) {
                            ((aghk) agjzVar.m.get()).b(a);
                            agjzVar.q(str3);
                            agjzVar.o();
                        }
                    } catch (ExecutionException e) {
                        StringBuilder sb = new StringBuilder(str3.length() + 46);
                        sb.append("[Offline] Failed requesting video ");
                        sb.append(str3);
                        sb.append(" for offline");
                        zep.d(sb.toString(), e);
                    }
                }
            }
            ylr.b();
            if (((aglj) agjkVar3.f.get()).p(str3) == null) {
                zep.b(str3.length() != 0 ? "[Offline] Refresh video failed because snapshot invalid for ".concat(str3) : new String("[Offline] Refresh video failed because snapshot invalid for "));
            } else {
                if (str3.length() != 0) {
                    "[Offline] Updating offlined video ".concat(str3);
                }
                ((agkg) agjkVar3.h.get()).d(str3, true);
            }
            amzs it = ((amyg) agjkVar3.j).iterator();
            while (it.hasNext()) {
                agwh agwhVar = (agwh) agjkVar3.i.get();
                ((agwe) it.next()).a();
            }
        } else {
            agjk agjkVar4 = this.a;
            String str4 = this.b;
            if (!agjkVar4.g.z()) {
                return;
            }
            agjkVar4.c(str4);
            agjkVar4.d(str4);
        }
    }
}
