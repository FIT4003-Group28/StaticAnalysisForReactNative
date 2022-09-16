package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ctlm  reason: default package */
/* loaded from: classes5.dex */
public final class ctlm<ValueT> extends ctlg<ValueT> {
    private final z<ValueT> e;
    private final Map<cusr<ValueT>, aa<ValueT>> h;

    public ctlm(Context context, dbrn dbrnVar, ctir ctirVar, Uri uri, ctlp ctlpVar) {
        super(context, dbrnVar, ctirVar, uri, ctlpVar);
        this.h = dcjz.d();
        this.e = new ctll(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ctlg, defpackage.cuss
    public final synchronized void a(ValueT valuet) {
        this.e.g(valuet);
    }

    @Override // defpackage.cuss
    public final synchronized void g(cusr<ValueT> cusrVar) {
        this.e.d(this.h.get(cusrVar));
    }

    @Override // defpackage.cuss
    public final synchronized dbsg<ValueT> h() {
        return dbsg.j(this.e.h());
    }

    @Override // defpackage.cuss
    public final synchronized void q(final cusr<ValueT> cusrVar) {
        aa<? super ValueT> aaVar = new aa(cusrVar) { // from class: ctlk
            private final cusr a;

            {
                this.a = cusrVar;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                cusr cusrVar2 = this.a;
                if (obj != null) {
                    cusrVar2.a(obj);
                }
            }
        };
        this.e.c(aaVar);
        this.h.put(cusrVar, aaVar);
    }
}
