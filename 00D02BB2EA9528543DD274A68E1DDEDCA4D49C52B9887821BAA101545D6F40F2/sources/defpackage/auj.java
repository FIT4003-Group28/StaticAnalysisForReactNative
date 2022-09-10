package defpackage;

import androidx.preference.Preference;
/* compiled from: PG */
/* renamed from: auj  reason: default package */
/* loaded from: classes2.dex */
public final class auj implements Runnable {
    final /* synthetic */ Preference a;
    final /* synthetic */ aup b;

    public auj(aup aupVar, Preference preference) {
        this.b = aupVar;
        this.a = preference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        abg abgVar = this.b.c.k;
        if (!(abgVar instanceof aur)) {
            if (abgVar != null) {
                throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
            }
            return;
        }
        int b = ((aur) abgVar).b(this.a);
        if (b != -1) {
            this.b.c.l(b);
        } else {
            abgVar.o(new auo(abgVar, this.b.c, this.a));
        }
    }
}
