package defpackage;

import com.google.android.libraries.youtube.ads.model.MediaAd;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: xil  reason: default package */
/* loaded from: classes4.dex */
public class xil {
    protected final yni a;
    protected final ailv b;
    protected final aimy c;
    protected final Executor d;
    protected final Executor e;
    protected final Set f;
    protected final zey g;

    public xil(yni yniVar, ailv ailvVar, aimy aimyVar, Executor executor, Executor executor2, Set set, zey zeyVar) {
        yniVar.getClass();
        this.a = yniVar;
        ailvVar.getClass();
        this.b = ailvVar;
        aimyVar.getClass();
        this.c = aimyVar;
        executor.getClass();
        this.d = executor;
        executor2.getClass();
        this.e = executor2;
        this.f = set;
        this.g = zeyVar;
    }

    public ailf a(MediaAd mediaAd) {
        ArrayList arrayList = new ArrayList(this.f);
        arrayList.add(new xim(mediaAd));
        return new ailf(this.a, this.b, this.c, this.d, this.e, arrayList, this.g);
    }
}
