package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vuc  reason: default package */
/* loaded from: classes7.dex */
public final class vuc extends akvn<akte> {
    final /* synthetic */ dozz a;
    final /* synthetic */ vue b;

    public vuc(vue vueVar, dozz dozzVar) {
        this.b = vueVar;
        this.a = dozzVar;
    }

    @Override // defpackage.akvo
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        akte akteVar = (akte) obj;
        vue vueVar = this.b;
        final vud vudVar = vueVar.a;
        if (vudVar != null) {
            Executor executor = vueVar.b;
            final dozz dozzVar = this.a;
            executor.execute(new Runnable(vudVar, dozzVar) { // from class: vub
                private final vud a;
                private final dozz b;

                {
                    this.a = vudVar;
                    this.b = dozzVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a(this.b, dbpy.a);
                }
            });
        }
    }
}
