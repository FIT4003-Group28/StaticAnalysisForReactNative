package defpackage;

import com.google.android.libraries.youtube.ads.model.MediaAd;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aggg  reason: default package */
/* loaded from: classes.dex */
public final class aggg extends xil {
    private final azqb h;
    private final azqb i;
    private final aadd j;
    private final agwp k;
    private final ahdn l;
    private final ahdf m;

    public aggg(yni yniVar, ailv ailvVar, aimy aimyVar, azqb azqbVar, azqb azqbVar2, aadd aaddVar, agwp agwpVar, Executor executor, Executor executor2, Set set, zey zeyVar, ahdn ahdnVar, ahdf ahdfVar) {
        super(yniVar, ailvVar, aimyVar, executor, executor2, set, zeyVar);
        azqbVar.getClass();
        this.h = azqbVar;
        azqbVar2.getClass();
        this.i = azqbVar2;
        this.j = aaddVar;
        this.k = agwpVar;
        this.l = ahdnVar;
        this.m = ahdfVar;
    }

    @Override // defpackage.xil
    public final ailf a(MediaAd mediaAd) {
        ArrayList arrayList = new ArrayList(this.f);
        arrayList.add(new xim(mediaAd));
        return new agsv(this.a, this.b, this.c, this.h, this.i, this.d, this.e, arrayList, this.j, this.k, this.g, this.l, this.m);
    }
}
