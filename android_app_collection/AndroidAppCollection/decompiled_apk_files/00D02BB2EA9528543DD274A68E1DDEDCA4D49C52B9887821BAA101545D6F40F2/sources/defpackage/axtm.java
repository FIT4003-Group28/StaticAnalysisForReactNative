package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: axtm  reason: default package */
/* loaded from: classes3.dex */
public final class axtm implements axvp {
    public final dndr a;
    public boolean b = false;
    final /* synthetic */ axtp c;
    private final axtn d;

    public axtm(axtp axtpVar, dndr dndrVar, axtn axtnVar) {
        this.c = axtpVar;
        this.a = dndrVar;
        this.d = axtnVar;
    }

    @Override // defpackage.axvp
    public final void E(boolean z, @dzsi azvc azvcVar, Context context) {
        this.b = true;
        if (z) {
            dafk a = ckos.a(this.c.b.findViewById(16908290), this.c.b.getString(axtr.b(azvb.DELETE, this.a, true)), 0);
            a.p(this.c.b.getString(R.string.UNDO), this.d);
            a.c();
        }
    }
}
