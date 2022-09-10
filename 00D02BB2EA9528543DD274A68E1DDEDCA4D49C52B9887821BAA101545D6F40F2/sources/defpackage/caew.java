package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: caew  reason: default package */
/* loaded from: classes4.dex */
final class caew extends cagi<dwvz, dwwb> {
    public dwvy a;
    private final duls h;
    private final anhk i;

    /* JADX INFO: Access modifiers changed from: protected */
    public caew(buvk buvkVar, nvg nvgVar, duls dulsVar, anhk anhkVar) {
        super(buvkVar, nvgVar);
        this.a = dwvy.NEWEST;
        this.h = dulsVar;
        this.i = anhkVar;
    }

    @Override // defpackage.cagi
    protected final dssr<dwvz> c() {
        return (dssr) dwvz.n.cu(7);
    }

    @Override // defpackage.cagi
    public final void d(duld duldVar) {
        dwvz dwvzVar = (dwvz) this.e;
        if (dwvzVar == null) {
            return;
        }
        duvr duvrVar = duldVar.a;
        if (duvrVar == null) {
            duvrVar = duvr.b;
        }
        dwvz dwvzVar2 = duvrVar.a;
        if (dwvzVar2 == null) {
            dwvzVar2 = dwvz.n;
        }
        dsqp dsqpVar = (dsqp) dwvzVar2.cu(5);
        dsqpVar.bC(dwvzVar2);
        dwvu dwvuVar = (dwvu) dsqpVar;
        duls dulsVar = this.h;
        if (dwvuVar.c) {
            dwvuVar.bF();
            dwvuVar.c = false;
        }
        dwvz dwvzVar3 = (dwvz) dwvuVar.b;
        dulsVar.getClass();
        dwvzVar3.c = dulsVar;
        dwvzVar3.a |= 2;
        if ((this.i.a().a & 8) != 0) {
            String str = this.i.a().d;
            if (dwvuVar.c) {
                dwvuVar.bF();
                dwvuVar.c = false;
            }
            dwvz dwvzVar4 = (dwvz) dwvuVar.b;
            str.getClass();
            dwvzVar4.a |= 64;
            dwvzVar4.g = str;
        }
        dwvw dwvwVar = dwvzVar.f;
        if (dwvwVar == null) {
            dwvwVar = dwvw.c;
        }
        if (dwvuVar.c) {
            dwvuVar.bF();
            dwvuVar.c = false;
        }
        dwvz dwvzVar5 = (dwvz) dwvuVar.b;
        dwvwVar.getClass();
        dwvzVar5.f = dwvwVar;
        dwvzVar5.a |= 32;
        dwvy b = dwvy.b(dwvzVar.e);
        if (b == null) {
            b = dwvy.NEWEST;
        }
        if (dwvuVar.c) {
            dwvuVar.bF();
            dwvuVar.c = false;
        }
        dwvz dwvzVar6 = (dwvz) dwvuVar.b;
        dwvzVar6.e = b.f;
        dwvzVar6.a |= 16;
        k(dwvuVar.bK());
    }

    @Override // defpackage.cagi
    protected final /* bridge */ /* synthetic */ void e(dwwb dwwbVar) {
        duld duldVar;
        dwwb dwwbVar2 = dwwbVar;
        for (dulb dulbVar : dwwbVar2.c) {
            this.b.p(l(dulbVar), dwwbVar2.i);
        }
        dusk duskVar = dwwbVar2.b;
        if (duskVar == null) {
            duskVar = dusk.c;
        }
        if ((duskVar.a & 2) != 0) {
            dusk duskVar2 = dwwbVar2.b;
            if (duskVar2 == null) {
                duskVar2 = dusk.c;
            }
            duldVar = duskVar2.b;
            if (duldVar == null) {
                duldVar = duld.f;
            }
        } else {
            duldVar = null;
        }
        this.c = duldVar;
        if ((dwwbVar2.a & 2) != 0) {
            this.g = dwwbVar2.f;
        }
    }

    @Override // defpackage.cagi
    public final void f(Bundle bundle) {
        super.f(bundle);
        bundle.putInt("arg_key_sort_order", this.a.f);
    }

    @Override // defpackage.cagi
    public final void g(Bundle bundle) {
        super.g(bundle);
        this.a = dwvy.b(bundle.getInt("arg_key_sort_order"));
    }
}
