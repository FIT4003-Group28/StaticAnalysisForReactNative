package defpackage;
/* compiled from: PG */
/* renamed from: bugd  reason: default package */
/* loaded from: classes4.dex */
final class bugd implements degu {
    final /* synthetic */ dssj a;
    final /* synthetic */ btzw b;
    final /* synthetic */ buid c;
    final /* synthetic */ ddbn d;
    final /* synthetic */ btzi e;
    final /* synthetic */ bugg f;

    public bugd(bugg buggVar, dssj dssjVar, btzw btzwVar, buid buidVar, ddbn ddbnVar, btzi btziVar) {
        this.f = buggVar;
        this.a = dssjVar;
        this.b = btzwVar;
        this.c = buidVar;
        this.d = ddbnVar;
        this.e = btziVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (String.valueOf(this.a.getClass().getSimpleName()).length() == 0) {
            new String("GmmNetworkImpl - Rpc onFailure ");
        }
        Class<?> cls = this.a.getClass();
        if (this.f.f.containsKey(cls)) {
            this.f.f.get(cls).a().b(this.a, new btzg<>(null, th));
        }
        try {
            this.f.e(th, this.a, this.c, this.d.h, this.e, this.b);
            if (String.valueOf(this.a.getClass().getSimpleName()).length() != 0) {
                return;
            }
            new String("GmmNetworkImpl - Rpc onFailure ");
        } catch (Throwable th2) {
            if (String.valueOf(this.a.getClass().getSimpleName()).length() == 0) {
                new String("GmmNetworkImpl - Rpc onFailure ");
            }
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [dssj, I] */
    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        dssj dssjVar = (dssj) obj;
        if (String.valueOf(this.a.getClass().getSimpleName()).length() == 0) {
            new String("GmmNetworkImpl - Rpc onSuccess ");
        }
        try {
            this.b.c(this.f.a);
            this.c.a();
            bugg buggVar = this.f;
            dssj dssjVar2 = this.a;
            btzw btzwVar = this.b;
            buggVar.f(dssjVar2, btzwVar.c - btzwVar.b, ckjk.SUCCESS, this.d.h);
            if (this.e != null) {
                Class<?> cls = this.a.getClass();
                if (this.f.f.containsKey(cls)) {
                    this.f.f.get(cls).a().b(this.a, btzg.a(dssjVar));
                }
                btzi btziVar = this.e;
                btzq a = btzr.a();
                a.a = this.a;
                btzq.b(this.d.h);
                buid buidVar = this.c;
                a.b = buidVar.o;
                a.c = buidVar.n;
                a.d = buidVar.p;
                a.e = this.b;
                btziVar.QZ(a.a(), dssjVar);
            }
            if (String.valueOf(this.a.getClass().getSimpleName()).length() != 0) {
                return;
            }
            new String("GmmNetworkImpl - Rpc onSuccess ");
        } catch (Throwable th) {
            if (String.valueOf(this.a.getClass().getSimpleName()).length() == 0) {
                new String("GmmNetworkImpl - Rpc onSuccess ");
            }
            throw th;
        }
    }
}
