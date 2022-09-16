package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ahey  reason: default package */
/* loaded from: classes.dex */
public final class ahey {
    final /* synthetic */ ahez a;

    public ahey(ahez ahezVar) {
        this.a = ahezVar;
    }

    public final /* bridge */ /* synthetic */ int a(Object obj) {
        ahez ahezVar = this.a;
        int i = ahezVar.n;
        ahezVar.d((PlayerResponseModel) obj);
        if (aiix.e(this.a.h).o || i != 3) {
            return 1;
        }
        ahez ahezVar2 = this.a;
        if (ahezVar2.n == 2 || ahezVar2.c.m) {
            return 1;
        }
        ((aisq) ahezVar2.g.get()).d(new aikd(13, 3, this.a.a.getString(R.string.unplayable_in_background)));
        return 2;
    }
}
