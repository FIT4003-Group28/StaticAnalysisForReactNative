package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cdnm  reason: default package */
/* loaded from: classes4.dex */
public final class cdnm extends cdvg<cdnp> {
    public Executor a;
    public cebd b;
    public cchz c;

    @Override // defpackage.fd
    public final void ah(View view, @dzsi Bundle bundle) {
        dbsk.s((cdnp) this.ai);
        dbsk.s(this.b);
        cdvv a = cdvv.a(this, this.b);
        a.b(R.id.usernameTextView).b(((cdnp) this.ai).a);
        cdwi b = a.b(R.id.avatarImageView);
        v a2 = am.a(((cdnp) this.ai).d, new ahp() { // from class: cdvy
            @Override // defpackage.ahp
            public final Object a(Object obj) {
                return new jic((String) obj, ckqc.FIFE_MERGE, 2131232998);
            }
        });
        m mVar = b.b;
        final WebImageView webImageView = (WebImageView) b.c;
        webImageView.getClass();
        a2.b(mVar, new aa(webImageView) { // from class: cdvz
            private final WebImageView a;

            {
                this.a = webImageView;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                this.a.o((jic) obj);
            }
        });
    }

    @Override // defpackage.cdvg
    protected final Class<cdnp> g() {
        return cdnp.class;
    }

    @Override // defpackage.cdvg
    protected final int i() {
        return R.layout.profile_bar;
    }

    @Override // defpackage.cdvg, defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        dbsk.s((cdnp) this.ai);
        dbsk.s(this.a);
        dbsk.s(this.c);
        this.c.d().d((crzp) this.ai, this.a);
    }
}
