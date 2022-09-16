package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bfcl  reason: default package */
/* loaded from: classes3.dex */
public final class bfcl implements bexy {
    final /* synthetic */ bfco a;

    public bfcl(bfco bfcoVar) {
        this.a = bfcoVar;
    }

    @Override // defpackage.bexy
    public final void a(final bexz bexzVar, boolean z) {
        bwrs<ilo> bwrsVar;
        if (!z) {
            this.a.f.b(new Runnable(this) { // from class: bfcj
                private final bfcl a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bfcl bfclVar = this.a;
                    bfco bfcoVar = bfclVar.a;
                    bfcoVar.k = false;
                    bfcoVar.l = false;
                    cqkx.p(bfclVar.a);
                }
            }, bvrj.UI_THREAD);
            return;
        }
        bfco bfcoVar = this.a;
        if (!bfcoVar.l || (bwrsVar = bfcoVar.i) == null) {
            return;
        }
        ilo c = bwrsVar.c();
        dbsk.s(c);
        this.a.j = bexzVar.c(c);
        if (this.a.j == null) {
            bvoo.h("placeItem should never be null after FollowPlaceController has been successfully set up", new Object[0]);
        }
        bfco bfcoVar2 = this.a;
        bfcoVar2.k = true;
        bfcoVar2.l = false;
        this.a.f.b(new Runnable(this, bexzVar) { // from class: bfck
            private final bfcl a;
            private final bexz b;

            {
                this.a = this;
                this.b = bexzVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bfcl bfclVar = this.a;
                bexz bexzVar2 = this.b;
                bfco bfcoVar3 = bfclVar.a;
                baal baalVar = bfcoVar3.j;
                if (baalVar != null) {
                    bfcoVar3.a = bexzVar2.e(baalVar);
                    cqkx.p(bfclVar.a);
                }
            }
        }, bvrj.UI_THREAD);
    }
}
