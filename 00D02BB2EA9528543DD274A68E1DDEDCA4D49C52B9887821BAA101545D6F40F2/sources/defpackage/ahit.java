package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahit  reason: default package */
/* loaded from: classes2.dex */
public class ahit extends ahhv {
    public final dxio<afzv> a;
    private final ahar b;
    private final List<agwu> c;
    private final List<agxa<?>> d;
    private final cjta e;

    public ahit(ahas ahasVar, ahht ahhtVar, dxio<afzv> dxioVar, dlcv dlcvVar, agyh agyhVar, List<agxa<?>> list, List<agwu> list2, cjta cjtaVar, String str) {
        super(ahhtVar, dlcvVar, agyhVar);
        dlal dlalVar;
        this.a = dxioVar;
        this.c = list2;
        this.d = list;
        this.e = cjtaVar;
        gga ggaVar = this.k;
        Object[] objArr = new Object[1];
        dlam dlamVar = dlcvVar.g;
        dlamVar = dlamVar == null ? dlam.d : dlamVar;
        if (dlamVar.a == 4) {
            dlalVar = (dlal) dlamVar.b;
        } else {
            dlalVar = dlal.b;
        }
        objArr[0] = dlalVar.a;
        this.b = ahasVar.a(ggaVar.getString(R.string.LOCALSTREAM_TRIP_CARD_TRIP_NAME_LABEL, objArr), null, new jic((String) null, ckqc.FULLY_QUALIFIED, iup.e(R.raw.localstream_trip_icon_svg), 0), null, cjtd.b, str, null, this);
    }

    @Override // defpackage.agxe
    public List<agxa<?>> a() {
        return this.d;
    }

    @Override // defpackage.agxe
    public cjtd b(ddho ddhoVar) {
        return this.e.b(ddhoVar);
    }

    @Override // defpackage.agxe
    public cqix<agyq> c() {
        return cqgr.fT(new agdv(), this.b);
    }

    @Override // defpackage.agxe
    public List<agwu> g() {
        return this.c;
    }

    @Override // defpackage.ahhv
    protected final List<jho> r() {
        jhm jhmVar = new jhm();
        jhmVar.a = this.k.getString(R.string.LOCALSTREAM_MANAGE_TRIPS_SUGGESTIONS);
        jhmVar.d(new View.OnClickListener(this) { // from class: ahir
            private final ahit a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.a().k();
            }
        });
        return dcdc.f(jhmVar.c());
    }
}
