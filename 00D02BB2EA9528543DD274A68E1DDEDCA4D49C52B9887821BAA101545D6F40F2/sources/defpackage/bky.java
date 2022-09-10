package defpackage;

import android.graphics.Path;
import java.util.List;
/* compiled from: PG */
/* renamed from: bky  reason: default package */
/* loaded from: classes3.dex */
public final class bky implements bku, blb {
    private final boolean b;
    private final bjr c;
    private final blc<?, Path> d;
    private boolean e;
    private final Path a = new Path();
    private final bkj f = new bkj();

    public bky(bjr bjrVar, bnl bnlVar, bnf bnfVar) {
        this.b = bnfVar.b;
        this.c = bjrVar;
        blc<bnc, Path> a = bnfVar.a.a();
        this.d = a;
        bnlVar.i(a);
        a.a(this);
    }

    @Override // defpackage.blb
    public final void a() {
        this.e = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.bkk
    public final void b(List<bkk> list, List<bkk> list2) {
        for (int i = 0; i < list.size(); i++) {
            bkk bkkVar = list.get(i);
            if (bkkVar instanceof bla) {
                bla blaVar = (bla) bkkVar;
                if (blaVar.e == 1) {
                    this.f.a(blaVar);
                    blaVar.c(this);
                }
            }
        }
    }

    @Override // defpackage.bkk
    public final String g() {
        throw null;
    }

    @Override // defpackage.bku
    public final Path j() {
        if (this.e) {
            return this.a;
        }
        this.a.reset();
        if (this.b) {
            this.e = true;
            return this.a;
        }
        this.a.set(this.d.h());
        this.a.setFillType(Path.FillType.EVEN_ODD);
        this.f.b(this.a);
        this.e = true;
        return this.a;
    }
}
