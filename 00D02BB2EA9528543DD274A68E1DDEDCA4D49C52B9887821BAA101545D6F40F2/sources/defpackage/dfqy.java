package defpackage;

import com.google.geo.imagery.viewer.api.Renderer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dfqy  reason: default package */
/* loaded from: classes6.dex */
public final class dfqy implements dfui {
    public final dftd a;
    public final dfqz b;

    public dfqy(dftd dftdVar, dfqz dfqzVar) {
        this.a = dftdVar;
        this.b = dfqzVar;
    }

    @Override // defpackage.dfui
    public final void a(@dzsi dfuj<?> dfujVar) {
        if (dfujVar != null && dfujVar.a != null) {
            synchronized (this.b.k) {
                this.b.j = dfujVar;
            }
            this.b.h.execute(new Runnable(this) { // from class: dfqx
                private final dfqy a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean equals;
                    dfua dfuaVar;
                    dfqy dfqyVar = this.a;
                    dfua dfuaVar2 = dfqyVar.b.d;
                    boolean z = dfuaVar2 == null || dfuaVar2.d();
                    synchronized (dfqz.a) {
                        equals = z | (true ^ dfqyVar.a.equals(dfqz.b));
                    }
                    if (equals) {
                        dfqyVar.b.c();
                        return;
                    }
                    synchronized (dfqyVar.b.k) {
                        dfqz dfqzVar = dfqyVar.b;
                        dfuj<?> dfujVar2 = dfqzVar.j;
                        if (dfujVar2 != null && (dfuaVar = dfqzVar.d) != null) {
                            dftb dftbVar = dfujVar2.a;
                            synchronized (dfuaVar.b) {
                                Renderer renderer = dfuaVar.a;
                                if (renderer != null) {
                                    renderer.e(dftbVar, dfqzVar);
                                }
                            }
                        }
                    }
                    dfqyVar.b.f.a();
                }
            });
            return;
        }
        dfqt dfqtVar = this.b.c;
        if (dfqtVar == null) {
            return;
        }
        dfqtVar.a();
    }
}
