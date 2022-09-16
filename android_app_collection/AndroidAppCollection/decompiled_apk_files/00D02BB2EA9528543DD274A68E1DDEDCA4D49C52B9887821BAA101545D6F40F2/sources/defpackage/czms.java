package defpackage;

import defpackage.dssj;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: czms  reason: default package */
/* loaded from: classes5.dex */
public final class czms<T extends dssj> implements czju<T> {
    private final T a;

    public czms(T t) {
        this.a = t;
    }

    @Override // defpackage.czju
    public final dehn<Void> a(final IOException iOException, czjv<T> czjvVar) {
        if ((iOException instanceof dsrm) || (iOException.getCause() instanceof dsrm)) {
            return deee.h(czjvVar.a(deha.a(this.a)), IOException.class, new defg(iOException) { // from class: czmr
                private final IOException a;

                {
                    this.a = iOException;
                }

                @Override // defpackage.defg
                public final dehn a(Object obj) {
                    IOException iOException2 = this.a;
                    deki.a(iOException2, (IOException) obj);
                    throw iOException2;
                }
            }, dege.a);
        }
        return deha.b(iOException);
    }
}
