package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bcmn  reason: default package */
/* loaded from: classes3.dex */
public class bcmn extends ivw {
    private final ilo c;
    private final bbut d;

    public bcmn(ilo iloVar, bbut bbutVar, Context context, ivu ivuVar, jaq jaqVar, int i, String str, cjtd cjtdVar, boolean z, int i2) {
        super(context, ivuVar, jaqVar, cqrt.f(2131231769), str, cjtdVar, z, R.id.photo_gallery_add_a_photo_button);
        this.c = iloVar;
        this.d = bbutVar;
    }

    @Override // defpackage.ivw, defpackage.jar
    public Integer I() {
        return 8388693;
    }

    @Override // defpackage.jar
    public cqkl a(cjqm cjqmVar) {
        bbut bbutVar = this.d;
        bbuz m = bbve.m();
        m.b(bbuy.SHOW_FULLY_EXPANDED_PLACESHEET);
        m.e(dwyd.GALLERY);
        ((bbsu) m).b = this.c;
        bbutVar.j(m.a());
        return cqkl.a;
    }
}
