package defpackage;

import android.view.MenuItem;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: lmg  reason: default package */
/* loaded from: classes3.dex */
public final class lmg implements fry {
    private final aafo a;
    private final apoj b;

    public lmg(aafo aafoVar, apoj apojVar) {
        this.a = aafoVar;
        apojVar.getClass();
        this.b = apojVar;
    }

    @Override // defpackage.fry
    public final int g() {
        return R.id.add_connection;
    }

    @Override // defpackage.fry
    public final int h() {
        return R.menu.connections_overflow;
    }

    @Override // defpackage.fry
    public final frx i() {
        return null;
    }

    @Override // defpackage.fry
    public final void j(MenuItem menuItem) {
    }

    @Override // defpackage.fry
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.fry
    public final boolean l() {
        return true;
    }

    @Override // defpackage.fry
    public final boolean m() {
        apoj apojVar = this.b;
        if ((apojVar.b & 16384) != 0) {
            aafo aafoVar = this.a;
            apzg apzgVar = apojVar.o;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, null);
            return true;
        }
        return true;
    }
}
