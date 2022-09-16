package defpackage;

import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: fgf  reason: default package */
/* loaded from: classes3.dex */
public class fgf implements fgd {
    public final aizf a;
    private final fgd b;

    public fgf(aizf aizfVar) {
        aizfVar.getClass();
        if (aizfVar instanceof fgd) {
            this.b = (fgd) aizfVar;
        } else {
            this.b = new fge(aizfVar);
        }
        this.a = aizfVar;
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return this.b.c();
    }

    @Override // defpackage.fgd
    public final void h(ezx ezxVar) {
        this.b.h(ezxVar);
    }

    @Override // defpackage.aizf
    public final View kZ() {
        return this.b.kZ();
    }

    @Override // defpackage.fgd
    public boolean mY(ezx ezxVar) {
        return this.b.mY(ezxVar);
    }
}
