package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahoz  reason: default package */
/* loaded from: classes2.dex */
public final class ahoz {
    public final ckcw a;
    public final ahns b;

    public ahoz(ckcw ckcwVar) {
        this.a = ckcwVar;
        this.b = new ahns(ckcwVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(List<GmmLocation> list, List<GmmLocation> list2) {
        if (this.a == null) {
            return;
        }
        this.b.a(list, ckea.l, list2, ckea.k);
        this.b.b(list, ckea.e, list2, ckea.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(List<GmmLocation> list, List<GmmLocation> list2) {
        if (this.a == null) {
            return;
        }
        this.b.a(list, ckea.n, list2, ckea.m);
        this.b.b(list, ckea.g, list2, ckea.f);
    }
}
