package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bdlq  reason: default package */
/* loaded from: classes3.dex */
public class bdlq extends bdlo implements bdlm {
    private final Activity c;

    public bdlq(bdkm bdkmVar, bbtm bbtmVar, bbtk bbtkVar, Activity activity, dxio<apni> dxioVar) {
        super(bdkmVar, bbtkVar.b(bbtmVar), dxioVar);
        this.c = activity;
    }

    @Override // defpackage.bdlm
    public Integer f() {
        return 1;
    }

    @Override // defpackage.bdlm
    public String g() {
        dbsk.s(this.b);
        return this.c.getResources().getString(R.string.UGC_MEDIA_SELECTED_FOR_UPLOAD_DESCRIPTION_PHOTO, Integer.valueOf(this.b.intValue() + 1));
    }

    @Override // defpackage.bdlm
    public cqiw<? extends bdlm> k() {
        return new bdlp();
    }
}
