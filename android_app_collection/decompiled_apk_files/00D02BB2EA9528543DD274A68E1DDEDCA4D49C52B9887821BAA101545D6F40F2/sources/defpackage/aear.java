package defpackage;

import android.view.View;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aear  reason: default package */
/* loaded from: classes2.dex */
final class aear implements aeaw {
    final /* synthetic */ aeat a;

    public aear(aeat aeatVar) {
        this.a = aeatVar;
    }

    @Override // defpackage.aeaw
    public final aeav b() {
        return aeav.QUERY_SUGGESTION;
    }

    @Override // defpackage.aeaw
    public final void c(final deig<Boolean> deigVar, final deig<Void> deigVar2) {
        if (this.a.c.isEmpty()) {
            deigVar.j(false);
        } else if (this.a.b()) {
            this.a.a.e().c(this.a.i).execute(new Runnable(this, deigVar, deigVar2) { // from class: aeaq
                private final aear a;
                private final deig b;
                private final deig c;

                {
                    this.a = this;
                    this.b = deigVar;
                    this.c = deigVar2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    aear aearVar = this.a;
                    aearVar.a.a.c(this.b, this.c);
                }
            });
            aeat aeatVar = this.a;
            synchronized (aeatVar.c) {
                for (View view : aeatVar.c) {
                    aeatVar.a(view, true);
                }
                aeatVar.c.clear();
            }
        } else {
            deigVar.j(false);
            this.a.d = false;
        }
    }

    @Override // defpackage.aeaw
    public final int d() {
        return this.a.a.d();
    }

    @Override // defpackage.aeaw
    public final dbsg<Executor> e() {
        return dbsg.i(this.a.h);
    }
}
