package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kyh  reason: default package */
/* loaded from: classes3.dex */
public final class kyh extends kqs {
    public static final /* synthetic */ int o = 0;
    private final Context p;
    private final ajrx q;
    private final ajrp r;

    public kyh(Context context, ajmy ajmyVar, gem gemVar, aafo aafoVar, ajyc ajycVar, ajxz ajxzVar, ViewGroup viewGroup) {
        super(context, ajmyVar, ajycVar, R.layout.playlist_card_item, ajxzVar, viewGroup, null, null);
        this.p = context;
        this.q = gemVar;
        final View view = this.d;
        gemVar.c(view);
        this.r = new ajrp(aafoVar, gemVar);
        a().setTag(R.id.offset_adjuster_tag, new fqw() { // from class: kyg
            @Override // defpackage.fqw
            public final void a(Rect rect) {
                View view2 = view;
                int i = kyh.o;
                rect.left -= view2.getPaddingLeft();
                rect.right -= view2.getPaddingRight();
                rect.top -= view2.getPaddingTop();
            }
        });
        a().setLayoutDirection(context.getResources().getConfiguration().getLayoutDirection());
    }

    private final int n() {
        return this.p.getResources().getDimensionPixelSize(R.dimen.playlist_card_width) + this.d.getPaddingLeft() + this.d.getPaddingRight();
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.q).b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        apzg apzgVar;
        arag aragVar;
        int n;
        auce auceVar = (auce) obj;
        ajrp ajrpVar = this.r;
        acti actiVar = ajrsVar.a;
        arag aragVar2 = null;
        if ((auceVar.b & 8) != 0) {
            apzgVar = auceVar.g;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        ajrpVar.a(actiVar, apzgVar, ajrsVar.e());
        ajrsVar.a.u(new acte(auceVar.j), null);
        if (a().getLayoutParams() != null) {
            Resources resources = this.p.getResources();
            if ((auceVar.b & 32) == 0 || resources.getConfiguration().orientation != 1) {
                n = n();
            } else {
                int i = resources.getDisplayMetrics().widthPixels;
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.horizontal_card_list_item_spacing);
                int cg = awwc.cg(auceVar.i);
                if (cg == 0) {
                    cg = 1;
                }
                int i2 = cg - 1;
                if (i2 == 0) {
                    n = n();
                } else if (i2 != 1) {
                    n = (i - ((dimensionPixelSize * 3) + resources.getDimensionPixelSize(R.dimen.playlist_card_peek_width_two_or_more_fully_visible))) / 2;
                } else {
                    n = i - ((dimensionPixelSize + dimensionPixelSize) + resources.getDimensionPixelSize(R.dimen.playlist_card_peek_width_one_fully_visible));
                }
            }
            zgd.t(a(), zgd.r(n), ViewGroup.LayoutParams.class);
        }
        aueo aueoVar = auceVar.c;
        if (aueoVar == null) {
            aueoVar = aueo.a;
        }
        h(aueoVar, null);
        i(auceVar.f);
        if ((auceVar.b & 2) != 0) {
            aragVar = auceVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        k(ajgl.b(aragVar));
        if ((auceVar.b & 4) != 0 && (aragVar2 = auceVar.e) == null) {
            aragVar2 = arag.a;
        }
        d(ajgl.b(aragVar2));
        View view = ((gem) this.q).b;
        ates atesVar = auceVar.h;
        if (atesVar == null) {
            atesVar = ates.a;
        }
        f(view, atesVar, auceVar, ajrsVar.a);
        this.q.e(ajrsVar);
    }

    @Override // defpackage.kqs, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        super.qZ(ajsaVar);
        this.r.c();
    }
}
