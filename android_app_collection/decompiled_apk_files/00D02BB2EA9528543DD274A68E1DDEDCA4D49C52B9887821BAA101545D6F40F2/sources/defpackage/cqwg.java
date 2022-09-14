package defpackage;

import java.io.Closeable;
/* renamed from: cqwg  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cqwg implements deft {
    static final deft a = new cqwg();

    private cqwg() {
    }

    @Override // defpackage.deft
    public final Object a(defu defuVar, Object obj) {
        final cqwc cqwcVar = (cqwc) obj;
        defuVar.a(new Closeable(cqwcVar) { // from class: cqwi
            private final cqwc a;

            {
                this.a = cqwcVar;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                cqwc cqwcVar2 = this.a;
                if (cqwcVar2 instanceof cqwb) {
                    ((cqwb) cqwcVar2).a();
                }
            }
        }, dege.a);
        return cqwcVar;
    }
}
