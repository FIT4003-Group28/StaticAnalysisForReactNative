package defpackage;
/* compiled from: PG */
/* renamed from: atxi  reason: default package */
/* loaded from: classes2.dex */
final class atxi implements ajxw {
    final /* synthetic */ atxm a;

    public atxi(atxm atxmVar) {
        this.a = atxmVar;
    }

    @Override // defpackage.ajxw
    public final void a(boolean z) {
        atxm atxmVar = this.a;
        boolean z2 = atxmVar.B;
        atxmVar.B = z;
        if (z) {
            atxmVar.q();
            if (z2) {
                return;
            }
        } else {
            atxmVar.D.clear();
            this.a.E.clear();
            this.a.t();
        }
        cqkx.p(this.a);
    }

    @Override // defpackage.ajxw
    public final void b(final czha czhaVar) {
        this.a.A.execute(new Runnable(this, czhaVar) { // from class: atxg
            private final atxi a;
            private final czha b;

            {
                this.a = this;
                this.b = czhaVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                atxi atxiVar = this.a;
                czha czhaVar2 = this.b;
                atxm atxmVar = atxiVar.a;
                ajus ajusVar = atxmVar.d;
                btlu j = atxmVar.a.j();
                dbsk.s(j);
                if (ajusVar.a(czhaVar2, j)) {
                    boolean isEmpty = atxiVar.a.D.isEmpty();
                    atxiVar.a.D.add(czhaVar2);
                    if (!isEmpty) {
                        return;
                    }
                    cqkx.p(atxiVar.a);
                }
            }
        });
    }

    @Override // defpackage.ajxw
    public final void c(final czha czhaVar) {
        this.a.A.execute(new Runnable(this, czhaVar) { // from class: atxh
            private final atxi a;
            private final czha b;

            {
                this.a = this;
                this.b = czhaVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                atxi atxiVar = this.a;
                czha czhaVar2 = this.b;
                boolean isEmpty = atxiVar.a.D.remove(czhaVar2) ? atxiVar.a.D.isEmpty() : false;
                if (atxiVar.a.E.remove(czhaVar2)) {
                    isEmpty = atxiVar.a.E.isEmpty();
                }
                if (isEmpty) {
                    cqkx.p(atxiVar.a);
                }
            }
        });
    }
}
