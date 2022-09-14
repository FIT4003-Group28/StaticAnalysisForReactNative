package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: btrx  reason: default package */
/* loaded from: classes.dex */
public final class btrx implements crzp<List<btue>> {
    final /* synthetic */ btry a;

    public btrx(btry btryVar) {
        this.a = btryVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<List<btue>> crzmVar) {
        List<btue> l = crzmVar.l();
        if (l != null) {
            this.a.a.b(new gdp(l));
        }
    }
}
