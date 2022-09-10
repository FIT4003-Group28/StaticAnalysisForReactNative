package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: vsc  reason: default package */
/* loaded from: classes7.dex */
final class vsc implements amfq {
    final /* synthetic */ bvlw a;
    final /* synthetic */ vtk b;
    final /* synthetic */ vsf c;

    public vsc(vsf vsfVar, bvlw bvlwVar, vtk vtkVar) {
        this.c = vsfVar;
        this.a = bvlwVar;
        this.b = vtkVar;
    }

    @Override // defpackage.amfq
    public final synchronized void a(amfu amfuVar) {
        if (amfuVar.a()) {
            final cqtd i = amfuVar.i(this.a);
            Executor executor = this.c.a;
            final vtk vtkVar = this.b;
            executor.execute(new Runnable(vtkVar, i) { // from class: vsb
                private final vtk a;
                private final cqtd b;

                {
                    this.a = vtkVar;
                    this.b = i;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a(this.b);
                }
            });
        }
    }
}
