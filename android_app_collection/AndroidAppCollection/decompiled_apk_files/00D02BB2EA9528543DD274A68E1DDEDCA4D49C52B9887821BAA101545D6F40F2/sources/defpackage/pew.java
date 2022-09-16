package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: pew  reason: default package */
/* loaded from: classes7.dex */
public final class pew<T> extends btrh<T> {
    private final int d;

    public pew(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            pev pevVar = (pev) this.a;
            pfp pfpVar = (pfp) obj;
            if (pfpVar.b != 1) {
                return;
            }
            ilo iloVar = pfpVar.a;
            Uri.Builder ax = iloVar.ax();
            pevVar.b.a().W(ax, "");
            pevVar.e(pevVar.c, ax.build().toString(), iloVar.y());
            ((pfs) pevVar.d).a(pex.VIEW, iloVar);
        } else if (i == 1) {
            pev pevVar2 = (pev) this.a;
            alim alimVar = (alim) obj;
        } else if (i != 2) {
            ((pfs) ((pev) this.a).d).a(pex.BOOKMARK, ((azrf) obj).a);
        } else {
            pev pevVar3 = (pev) this.a;
            brll brllVar = (brll) obj;
            pevVar3.e(pevVar3.c, pevVar3.b.a().X(brllVar.a), brllVar.a);
            if (brllVar.b.size() != 1) {
                return;
            }
            ((pfs) pevVar3.d).a(pex.FIND, brllVar.b.get(0));
        }
    }
}
