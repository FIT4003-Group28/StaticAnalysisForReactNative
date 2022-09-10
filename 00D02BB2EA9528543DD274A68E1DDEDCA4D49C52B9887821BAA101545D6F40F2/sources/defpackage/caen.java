package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: caen  reason: default package */
/* loaded from: classes4.dex */
public class caen implements cage {
    public dvlu a;
    private final dzsj<cdfx> b;
    private final dzsj<chnm> c;
    private final Resources d;
    private final btvo e;
    @dzsi
    private final String f;

    public caen(dzsj<cdfx> dzsjVar, dzsj<chnm> dzsjVar2, Resources resources, btvo btvoVar, dvlu dvluVar, @dzsi String str) {
        this.b = dzsjVar;
        this.c = dzsjVar2;
        this.d = resources;
        this.e = btvoVar;
        this.f = str;
        this.a = dvluVar;
    }

    @Override // defpackage.cafy
    public void a(cqiv cqivVar) {
        cqivVar.a(new catc(), this);
    }

    @Override // defpackage.cafy
    public cjtd b() {
        cjta b = cjtd.b();
        b.d = dtyc.aD;
        b.b = this.f;
        return b.a();
    }

    @Override // defpackage.cafy
    public cqtd c() {
        if (j().booleanValue()) {
            return cqrt.f(2131232482);
        }
        return cqrt.f(2131231572);
    }

    @Override // defpackage.cafy
    public String d() {
        if (j().booleanValue()) {
            return this.d.getString(R.string.TODO_PHOTO_RICHER_ENTRY_POINT_TITLE);
        }
        return this.d.getString(R.string.TODO_PHOTO_ENTRY_POINT);
    }

    @Override // defpackage.cafy
    public String e() {
        if (j().booleanValue()) {
            return this.d.getString(R.string.TODO_PHOTO_RICHER_ENTRY_POINT_DETAILS);
        }
        return this.d.getString(R.string.TODO_PHOTO_ENTRY_POINT_DETAILS);
    }

    @Override // defpackage.cafy
    public cqkl f() {
        if (this.c.a().n()) {
            drrt bZ = drry.d.bZ();
            bZ.a(drrx.PHOTO);
            this.c.a().i(bZ.bK());
            return cqkl.a;
        }
        this.b.a().e(null, dwyd.PUBLISH_PRIVATE_PHOTO, cdfv.SHOW_EMPTY_PAGE, this.a.d);
        return cqkl.a;
    }

    @Override // defpackage.cafv
    public cqtd g() {
        return cqtt.g(ibm.x());
    }

    @Override // defpackage.cage
    public jic h(int i) {
        String str;
        ckqc ckqcVar = ckqc.FULLY_QUALIFIED;
        if (!i(i).booleanValue()) {
            str = null;
        } else {
            str = this.a.c.get(i).h;
            if (dsna.e(str)) {
                ckqcVar = ckqc.FIFE;
            }
        }
        return new jic(str, ckqcVar, cqrt.f(R.drawable.generic_image_placeholder), 0, null);
    }

    @Override // defpackage.cage
    public Boolean i(int i) {
        return Boolean.valueOf(i < this.a.c.size());
    }

    @Override // defpackage.cage
    public Boolean j() {
        return Boolean.valueOf(!this.e.getEnableFeatureParameters().am);
    }

    @Override // defpackage.cage
    public Boolean k() {
        boolean z = false;
        if (j().booleanValue() && this.a.b > 4) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cage
    public CharSequence l() {
        return j().booleanValue() ? this.d.getString(R.string.LAST_THUMBNAIL_MORE_TEXT) : "";
    }
}
