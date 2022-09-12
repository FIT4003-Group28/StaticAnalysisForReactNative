package defpackage;

import android.text.TextUtils;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cxvt  reason: default package */
/* loaded from: classes5.dex */
public final class cxvt {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final cxsq f;

    public cxvt(cxvs cxvsVar) {
        this.a = TextUtils.isEmpty(cxvsVar.b) ? cxvsVar.a.getString(R.string.peoplekit_maxview_select_people) : cxvsVar.b;
        this.b = cxvsVar.c;
        this.c = cxvsVar.d;
        this.d = cxvsVar.e;
        this.e = cxvsVar.f;
        this.f = cxvsVar.g;
    }

    public static cxvs a() {
        return new cxvs();
    }
}
