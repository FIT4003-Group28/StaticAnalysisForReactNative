package defpackage;

import android.util.Pair;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aqka  reason: default package */
/* loaded from: classes2.dex */
public final class aqka {
    final z<btlu> a;
    final z<dcep<String>> b;
    final x<Pair<btlu, dcep<String>>> c;
    private final dxio<apyu> d;

    public aqka(dxio<apyu> dxioVar) {
        z<btlu> zVar = new z<>();
        this.a = zVar;
        z<dcep<String>> zVar2 = new z<>(dcmr.a);
        this.b = zVar2;
        x<Pair<btlu, dcep<String>>> xVar = new x<>();
        this.c = xVar;
        this.d = dxioVar;
        xVar.m(zVar, new aa(this) { // from class: aqjx
            private final aqka a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                aqka aqkaVar = this.a;
                aqkaVar.c.g(Pair.create((btlu) obj, dcmr.a));
                aqkaVar.a();
            }
        });
        xVar.m(zVar2, new aa(this) { // from class: aqjy
            private final aqka a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                dcep dcepVar = (dcep) obj;
                this.a.a();
            }
        });
    }

    public final void a() {
        final btlu h = this.a.h();
        if (h == null) {
            return;
        }
        dcep<String> h2 = this.b.h();
        dbsk.s(h2);
        bvqj.d(this.d.a().c(h2, h), new bvqg(this, h) { // from class: aqjz
            private final aqka a;
            private final btlu b;

            {
                this.a = this;
                this.b = h;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                this.a.c.f(Pair.create(this.b, dcep.K((Set) obj)));
            }
        }, dege.a);
    }
}
