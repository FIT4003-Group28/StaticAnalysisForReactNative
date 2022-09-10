package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zzp  reason: default package */
/* loaded from: classes7.dex */
public class zzp extends ivw {
    private final zzn c;
    private final zzk d;

    public zzp(Activity activity, zzn zznVar, zzk zzkVar) {
        super(activity, ivu.FIXED, jaq.DAY_NIGHT_WHITE_ON_BLUE, cqrt.f(2131231580), activity.getString(R.string.DISTANCE_TOOL_ADD_POINT), cjtd.a(dtxn.eG), true, 0);
        this.c = zznVar;
        this.d = zzkVar;
    }

    @Override // defpackage.jar
    public cqkl a(cjqm cjqmVar) {
        akqq a = this.c.a();
        if (a != null) {
            this.d.b(a);
        }
        return cqkl.a;
    }
}
