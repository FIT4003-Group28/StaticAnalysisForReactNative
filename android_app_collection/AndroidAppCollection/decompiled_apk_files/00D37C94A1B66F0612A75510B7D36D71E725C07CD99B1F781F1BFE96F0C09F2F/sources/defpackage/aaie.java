package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: aaie  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aaie implements Callable {
    public final /* synthetic */ aaik a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ayoi c;
    private final /* synthetic */ int d;

    public /* synthetic */ aaie(aaik aaikVar, String str, ayoi ayoiVar) {
        this.a = aaikVar;
        this.b = str;
        this.c = ayoiVar;
    }

    public /* synthetic */ aaie(aaik aaikVar, String str, ayoi ayoiVar, int i) {
        this.d = i;
        this.a = aaikVar;
        this.b = str;
        this.c = ayoiVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.d == 0) {
            return this.c.ac(this.a.f(this.b).w(yps.s).j(amon.a).O());
        }
        aaik aaikVar = this.a;
        String str = this.b;
        ayoi ayoiVar = this.c;
        ayoc w = zhn.a(aaikVar.c.e(str)).w(new fcr(str, 14));
        aajn a = aajp.a();
        a.c(str);
        return ayoiVar.ac(w.j(a.a()).O());
    }
}
