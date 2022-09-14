package defpackage;
/* compiled from: PG */
/* renamed from: csac  reason: default package */
/* loaded from: classes5.dex */
public final class csac {
    public static <V> dehn<V> a(cpcq<V> cpcqVar) {
        final deig d = deig.d();
        cpcqVar.n(dege.a, new cpcf(d) { // from class: csaa
            private final deig a;

            {
                this.a = d;
            }

            @Override // defpackage.cpcf
            public final void a(cpcq cpcqVar2) {
                deig deigVar = this.a;
                if (((cpcx) cpcqVar2).d) {
                    deigVar.cancel(false);
                } else if (cpcqVar2.b()) {
                    deigVar.j(cpcqVar2.d());
                } else {
                    Exception e = cpcqVar2.e();
                    if (e != null) {
                        deigVar.k(e);
                        return;
                    }
                    throw new IllegalStateException();
                }
            }
        });
        return d;
    }

    public static <T extends cnom> dehn<T> b(cnoh<T> cnohVar) {
        final deig d = deig.d();
        cnohVar.i(new cnon(d) { // from class: csab
            private final deig a;

            {
                this.a = d;
            }

            @Override // defpackage.cnon
            public final void Om(cnom cnomVar) {
                deig deigVar = this.a;
                if (cnomVar.a().g != 16) {
                    if (cnomVar.a().d()) {
                        deigVar.j(cnomVar);
                        return;
                    } else if (cnomVar.a().i != null) {
                        deigVar.k(new cnok(cnomVar.a()));
                        return;
                    } else {
                        deigVar.k(new cnob(cnomVar.a()));
                        return;
                    }
                }
                deigVar.cancel(false);
            }
        });
        return d;
    }
}
