package defpackage;

import android.app.Service;
import android.graphics.drawable.Drawable;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bzas  reason: default package */
/* loaded from: classes4.dex */
public final class bzas extends byzq {
    public final dbty<Drawable> a;
    public final dbty<Drawable> e;
    public final byzt f;
    private final bvsl g;

    public bzas(vyl vylVar, Service service, bvsl bvslVar, btvo btvoVar, byzt byztVar) {
        super(vylVar, service, btvoVar);
        this.a = dbud.a(new dbty(this) { // from class: bzaq
            private final bzas a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.g(2131231819);
            }
        });
        this.e = dbud.a(new dbty(this) { // from class: bzar
            private final bzas a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.g(2131231820);
            }
        });
        this.g = bvslVar;
        this.f = byztVar;
    }

    @Override // defpackage.byzz
    public final byzy a(bzdk bzdkVar, byzg byzgVar) {
        throw null;
    }

    public final vyk b(int i, int i2, @dzsi dowa dowaVar) {
        return this.b.a(f(R.string.TRANSIT_GUIDANCE_NOTIFICATION_WALK_TO_DESTINATION, bvtb.e(e(), Math.max(60, i), bvsz.ABBREVIATED), this.g.c(i2, dowaVar, true, true)));
    }
}
