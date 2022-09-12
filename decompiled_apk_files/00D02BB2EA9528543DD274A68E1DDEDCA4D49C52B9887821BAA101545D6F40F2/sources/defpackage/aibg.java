package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aibg  reason: default package */
/* loaded from: classes2.dex */
public final class aibg {
    public final bvrb a;
    public final bvcm b;
    public final bvcg c;
    public final bvdb d;

    public aibg(bvrb bvrbVar, bvcm bvcmVar, bvcg bvcgVar, bvdb bvdbVar) {
        this.a = bvrbVar;
        this.b = bvcmVar;
        this.c = bvcgVar;
        this.d = bvdbVar;
    }

    public static <I, O> aicd<I, O> a(Executor executor, btzo<I, O> btzoVar, btlu btluVar, @dzsi GmmLocation gmmLocation) {
        buac a = btzoVar.a();
        a.e = btluVar;
        a.f = gmmLocation;
        return new aicd<>(executor, btzoVar.b());
    }
}
