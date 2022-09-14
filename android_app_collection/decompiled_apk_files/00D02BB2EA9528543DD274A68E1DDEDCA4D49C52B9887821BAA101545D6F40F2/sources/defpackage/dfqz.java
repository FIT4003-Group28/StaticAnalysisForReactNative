package defpackage;

import com.google.geo.imagery.viewer.api.Callback;
import com.google.geo.imagery.viewer.api.PhotoHandle;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dfqz  reason: default package */
/* loaded from: classes6.dex */
public class dfqz extends Callback {
    public static final Object a = new Object();
    public static dftd b = dftd.d;
    @dzsi
    public final dfqt c;
    @dzsi
    protected final dfua d;
    protected final dfrr e;
    protected final dfuh f;
    protected final Executor g;
    protected final Executor h;
    protected final dfrh i;
    @dzsi
    protected dfuj<?> j;
    protected final Object k = new Object();
    private final dfuk l;
    private final List<dfqz> m;

    public dfqz(Executor executor, Executor executor2, @dzsi dfua dfuaVar, dfuk dfukVar, dfuh dfuhVar, dfrr dfrrVar, dfrh dfrhVar, List<dfqz> list, @dzsi dfqt dfqtVar) {
        this.g = executor;
        this.h = executor2;
        this.d = dfuaVar;
        this.l = dfukVar;
        this.f = dfuhVar;
        this.e = dfrrVar;
        this.i = dfrhVar;
        this.m = list;
        this.c = dfqtVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @dzsi
    public static Runnable e(@dzsi final dfqt dfqtVar, final dfuj<?> dfujVar, final float f) {
        if (dfqtVar == null) {
            return null;
        }
        return new Runnable(dfqtVar, dfujVar, f) { // from class: dfqw
            private final dfqt a;
            private final dfuj b;
            private final float c;

            {
                this.a = dfqtVar;
                this.b = dfujVar;
                this.c = f;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dfqt dfqtVar2 = this.a;
                dfuj<?> dfujVar2 = this.b;
                float f2 = this.c;
                Object obj = dfqz.a;
                dfqtVar2.b(dfujVar2, f2);
            }
        };
    }

    public final boolean a(dftd dftdVar, dhjz dhjzVar) {
        dfua dfuaVar = this.d;
        if (dfuaVar == null || dfuaVar.d()) {
            return false;
        }
        synchronized (a) {
            b = dftdVar;
        }
        this.l.a(dftdVar, dhjzVar, new dfqy(dftdVar, this));
        synchronized (this.m) {
            this.m.add(this);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(PhotoHandle photoHandle, @dzsi dfqt dfqtVar) {
        dfuj<?> dfujVar;
        synchronized (this.k) {
            dfujVar = this.j;
        }
        if (dfujVar == null) {
            return;
        }
        if (dfqtVar != null) {
            dhjz dhjzVar = dfujVar.a.c;
            if (dhjzVar == null) {
                dhjzVar = dhjz.e;
            }
            dfqtVar.c(1, dhjzVar);
        }
        dhjw bZ = dhjx.f.bZ();
        dhjz dhjzVar2 = dfujVar.a.c;
        if (dhjzVar2 == null) {
            dhjzVar2 = dhjz.e;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhjx dhjxVar = (dhjx) bZ.b;
        dhjzVar2.getClass();
        dhjxVar.b = dhjzVar2;
        dhjxVar.a = 1 | dhjxVar.a;
        this.i.b(photoHandle, bZ.bK(), 0L, e(dfqtVar, dfujVar, 0.0f));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c() {
        synchronized (this.m) {
            d();
            this.m.remove(this);
        }
    }

    public void d() {
        if (this.m.contains(this)) {
            delete();
        }
        synchronized (this.k) {
            this.j = null;
        }
    }

    @Override // com.google.geo.imagery.viewer.api.Callback
    public final void onComplete(int i, final PhotoHandle photoHandle) {
        if (i == 0) {
            this.g.execute(new Runnable(this, photoHandle) { // from class: dfqv
                private final dfqz a;
                private final PhotoHandle b;

                {
                    this.a = this;
                    this.b = photoHandle;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    dfqz dfqzVar = this.a;
                    dfqzVar.b(this.b, dfqzVar.c);
                    dfqzVar.f.a();
                    dfqzVar.c();
                }
            });
        } else if (i == 1) {
            c();
        } else {
            dfqt dfqtVar = this.c;
            if (dfqtVar != null) {
                dfqtVar.a();
            }
            c();
        }
    }
}
