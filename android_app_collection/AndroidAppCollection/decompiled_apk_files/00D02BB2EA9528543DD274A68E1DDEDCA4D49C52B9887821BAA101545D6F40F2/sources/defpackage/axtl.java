package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: axtl  reason: default package */
/* loaded from: classes3.dex */
public final class axtl implements Runnable {
    final /* synthetic */ axtm a;

    public axtl(axtm axtmVar) {
        this.a = axtmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        axtm axtmVar = this.a;
        if (!axtmVar.b) {
            View findViewById = axtmVar.c.b.findViewById(16908290);
            axtm axtmVar2 = this.a;
            gga ggaVar = axtmVar2.c.b;
            dndr dndrVar = axtmVar2.a;
            dndr dndrVar2 = dndr.UNKNOWN_ALIAS_TYPE;
            dvvl dvvlVar = dvvl.UNKNOWN;
            int ordinal = dndrVar.ordinal();
            if (ordinal == 1) {
                i = R.string.HOME_LOCATION_IS_BEING_DELETED;
            } else if (ordinal == 2) {
                i = R.string.WORK_LOCATION_IS_BEING_DELETED;
            } else if (ordinal != 4) {
                throw new IllegalArgumentException(String.format("Not expected to be called with aliasType %s", Integer.valueOf(dndrVar.h)));
            } else {
                i = R.string.NICKNAME_IS_BEING_DELETED;
            }
            ckos.a(findViewById, ggaVar.getString(i), 0).c();
        }
    }
}
