package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ktv  reason: default package */
/* loaded from: classes3.dex */
public final class ktv extends kss {
    private final ajyc b;
    private final View c;
    private final jku d;
    private final jqr e;
    private jqq f;

    public ktv(Context context, aafo aafoVar, gem gemVar, ajyc ajycVar, jkv jkvVar, ktc ktcVar, jqr jqrVar) {
        super(context, aafoVar, gemVar, ktcVar, R.layout.offline_bundle_item_layout, new xx(context.getResources().getDimensionPixelSize(R.dimen.offline_bundle_item_image_width), context.getResources().getDimensionPixelSize(R.dimen.offline_bundle_item_image_height)), new xx(context.getResources().getDimensionPixelSize(R.dimen.offline_bundle_item_image_width), context.getResources().getDimensionPixelSize(R.dimen.offline_bundle_item_image_double_height)), context.getResources().getDimensionPixelSize(R.dimen.bundle_item_avatar_width_height));
        this.b = ajycVar;
        this.c = a().findViewById(R.id.contextual_menu_anchor);
        this.d = jkvVar.a((ViewStub) a().findViewById(R.id.offline_badge), null);
        this.e = jqrVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.kss, defpackage.ajsl
    public final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        atep atepVar;
        atqb atqbVar = (atqb) obj;
        super.d(ajrsVar, atqbVar);
        ajrsVar.f("PlaylistPresenterConstants.PLAYLIST_ID", atqbVar.g);
        this.d.b(ajrsVar);
        acti actiVar = ajrsVar.a;
        ajyc ajycVar = this.b;
        View a = a();
        View view = this.c;
        ates atesVar = atqbVar.j;
        if (atesVar == null) {
            atesVar = ates.a;
        }
        if ((atesVar.b & 1) != 0) {
            ates atesVar2 = atqbVar.j;
            if (atesVar2 == null) {
                atesVar2 = ates.a;
            }
            atepVar = atesVar2.c;
            if (atepVar == null) {
                atepVar = atep.a;
            }
        } else {
            atepVar = null;
        }
        ajycVar.e(a, view, atepVar, atqbVar, actiVar);
        if (this.f == null) {
            if (atqbVar.g.isEmpty()) {
                return;
            }
            jqr jqrVar = this.e;
            View a2 = a();
            Context context = (Context) ((axov) jqrVar.a).a;
            context.getClass();
            fcl fclVar = (fcl) jqrVar.b.get();
            fclVar.getClass();
            azqb azqbVar = jqrVar.c;
            jkz jkzVar = (jkz) jqrVar.d.get();
            jkzVar.getClass();
            yni yniVar = (yni) jqrVar.e.get();
            yniVar.getClass();
            a2.getClass();
            this.f = new jqq(context, fclVar, azqbVar, jkzVar, yniVar, a2);
        }
        jqq jqqVar = this.f;
        if (atqbVar.g.isEmpty() || !jqqVar.a.i(atqbVar.g) || !(ajrsVar.c("sectionListController") instanceof jsy)) {
            return;
        }
        jqqVar.e = atqbVar.g;
        jqqVar.a();
        jqqVar.b.g(jqqVar);
        nni.x(ajrsVar, atqbVar);
    }

    @Override // defpackage.kss, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        jqq jqqVar = this.f;
        if (jqqVar != null) {
            jqqVar.b.m(jqqVar);
            zag.o(jqqVar.c, false);
            zag.o(jqqVar.d, true);
            jqqVar.e = null;
            this.f = null;
        }
    }
}
