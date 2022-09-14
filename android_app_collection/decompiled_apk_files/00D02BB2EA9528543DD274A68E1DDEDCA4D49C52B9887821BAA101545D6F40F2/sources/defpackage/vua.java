package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: vua  reason: default package */
/* loaded from: classes7.dex */
final class vua extends akvn<aktd> {
    final /* synthetic */ dozz a;
    final /* synthetic */ aktc b;
    final /* synthetic */ vue c;

    public vua(vue vueVar, dozz dozzVar, aktc aktcVar) {
        this.c = vueVar;
        this.a = dozzVar;
        this.b = aktcVar;
    }

    @Override // defpackage.akvo
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        aktd aktdVar = (aktd) obj;
        vue vueVar = this.c;
        final vud vudVar = vueVar.a;
        if (vudVar != null) {
            Executor executor = vueVar.b;
            final dozz dozzVar = this.a;
            final aktc aktcVar = this.b;
            executor.execute(new Runnable(vudVar, dozzVar, aktcVar) { // from class: vtz
                private final vud a;
                private final dozz b;
                private final aktc c;

                {
                    this.a = vudVar;
                    this.b = dozzVar;
                    this.c = aktcVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a(this.b, this.c.g());
                }
            });
        }
    }
}
