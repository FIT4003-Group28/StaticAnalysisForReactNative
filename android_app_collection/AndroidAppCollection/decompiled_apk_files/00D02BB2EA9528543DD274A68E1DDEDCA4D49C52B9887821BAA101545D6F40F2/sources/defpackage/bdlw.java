package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bdlw  reason: default package */
/* loaded from: classes3.dex */
public class bdlw extends bdlo implements bdlv {
    private final Activity c;
    private final bcan d;
    private final apqe e;

    public bdlw(bdkm bdkmVar, bbtm bbtmVar, bcan bcanVar, Activity activity, bbtk bbtkVar, apqe apqeVar, dxio<apni> dxioVar) {
        super(bdkmVar, bbtkVar.b(bbtmVar), dxioVar);
        this.c = activity;
        this.d = bcanVar;
        this.e = apqeVar;
    }

    @Override // defpackage.bdlm
    public Integer f() {
        return 1;
    }

    @Override // defpackage.bdlm
    public String g() {
        dbsk.s(this.b);
        return this.c.getResources().getString(R.string.UGC_MEDIA_SELECTED_FOR_UPLOAD_DESCRIPTION_VIDEO, Integer.valueOf(this.b.intValue() + 1));
    }

    @Override // defpackage.bdlm
    public cqiw<? extends bdlm> k() {
        return new bdlu();
    }

    @Override // defpackage.bdlv
    public CharSequence l() {
        dbsg<Long> j = h().j();
        if (!j.a()) {
            return "";
        }
        long longValue = j.b().longValue();
        if (longValue > 30000) {
            longValue = 30000;
        }
        return this.e.a(longValue);
    }

    @Override // defpackage.bdlv
    public Boolean m() {
        return this.d.w(this.a);
    }
}
