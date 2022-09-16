package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajal  reason: default package */
/* loaded from: classes.dex */
public final class ajal {
    final /* synthetic */ ajao a;

    public ajal(ajao ajaoVar) {
        this.a = ajaoVar;
    }

    public final aika a() {
        return this.a.n;
    }

    public final ajff b() {
        return this.a.u();
    }

    public final void c(boolean z) {
        ajao ajaoVar = this.a;
        ajbe ajbeVar = ajaoVar.k;
        if (ajbeVar != null) {
            ajjh.u(ajbeVar.a, 0L);
            if (!ajjh.w(ajaoVar.u())) {
                ajbeVar.a.i().g();
            }
            ajao.az(aijw.ENDED, ajbeVar.a);
        }
        if (ajaoVar.j != null) {
            ajaoVar.S();
            if (z) {
                ajfa o = ajaoVar.i.a.o();
                ajey ajeyVar = o.e;
                if (ajeyVar == null) {
                    return;
                }
                wnn wnnVar = ajeyVar.c;
                wnnVar.getClass();
                o.a(new ajeq(wnnVar));
                return;
            }
            ajfa o2 = ajaoVar.i.a.o();
            ajey ajeyVar2 = o2.e;
            if (ajeyVar2 == null) {
                return;
            }
            wnn wnnVar2 = ajeyVar2.c;
            wnnVar2.getClass();
            o2.a(new ajeq(wnnVar2, 1));
        } else if (ajjh.w(ajaoVar.u()) || ajao.a.a) {
        } else {
            ajao.a.a = true;
            afus.b(2, 10, "got onInterstitialVideoEnded without a savedContentVideoState. This should not happen");
        }
    }

    public final void d(aika aikaVar) {
        this.a.ai(aikaVar);
    }

    public final void e(ajff ajffVar, int i, long j, long j2, long j3, long j4) {
        this.a.ay(ajffVar, i, j, j2, j3, j4);
    }

    public final void f(int i) {
        this.a.p = i;
    }

    public final void g(ajff ajffVar, int i) {
        this.a.aw(ajffVar, i, 0);
    }

    public final void h(aikd aikdVar) {
        this.a.ax(aikdVar, 4);
    }
}
