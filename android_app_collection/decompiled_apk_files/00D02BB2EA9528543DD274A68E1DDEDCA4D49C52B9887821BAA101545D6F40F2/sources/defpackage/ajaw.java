package defpackage;
/* compiled from: PG */
/* renamed from: ajaw  reason: default package */
/* loaded from: classes2.dex */
final class ajaw implements ajxw {
    final /* synthetic */ ajbb a;

    public ajaw(ajbb ajbbVar) {
        this.a = ajbbVar;
    }

    @Override // defpackage.ajxw
    public final void a(boolean z) {
        ajbb ajbbVar = this.a;
        boolean z2 = ajbbVar.h;
        ajbbVar.h = z;
        if (!z) {
            ajbbVar.e.clear();
            this.a.f.clear();
        } else if (z2) {
            return;
        }
        cqkx.p(this.a);
    }

    @Override // defpackage.ajxw
    public final void b(final czha czhaVar) {
        ajbb ajbbVar = this.a;
        if (ajbbVar.d.a(czhaVar, ajbbVar.b)) {
            this.a.a.b(czhaVar, new Runnable(this, czhaVar) { // from class: ajav
                private final ajaw a;
                private final czha b;

                {
                    this.a = this;
                    this.b = czhaVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ajaw ajawVar = this.a;
                    czha czhaVar2 = this.b;
                    cxsx cxsxVar = ajawVar.a.g;
                    dbsk.s(cxsxVar);
                    cxsxVar.a(czhaVar2);
                }
            });
            this.a.e.add(czhaVar);
        }
    }

    @Override // defpackage.ajxw
    public final void c(czha czhaVar) {
        boolean isEmpty = this.a.e.remove(czhaVar) ? this.a.e.isEmpty() : false;
        if (this.a.f.remove(czhaVar)) {
            isEmpty = this.a.f.isEmpty();
        }
        if (isEmpty) {
            cqkx.p(this.a);
        }
    }
}
