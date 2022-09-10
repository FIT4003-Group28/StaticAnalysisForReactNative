package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: abue  reason: default package */
/* loaded from: classes2.dex */
public class abue implements abql {
    private static final jic a = new jic((String) null, ckqc.FULLY_QUALIFIED, 2131231690, 0);
    private final dxio<abfb> b;
    private final String c;
    private final cjtd d;
    @dzsi
    private final acwt e;
    private final abse f;

    public abue(Activity activity, dxio<abfb> dxioVar, ddho ddhoVar, @dzsi acwt acwtVar, abse abseVar) {
        this.e = acwtVar;
        this.b = dxioVar;
        this.c = activity.getString(R.string.EXPLORE_MORE_SUBINTENTS);
        this.d = cjtd.a(ddhoVar);
        this.f = abseVar;
    }

    @Override // defpackage.abiu
    public String d() {
        return this.c;
    }

    @Override // defpackage.abiu
    public cqkl h(cjqm cjqmVar) {
        this.e.a();
        this.b.a().e(this.f);
        return cqkl.a;
    }

    @Override // defpackage.abiu
    public cjtd i() {
        return this.d;
    }

    @Override // defpackage.abql
    public View.OnAttachStateChangeListener j() {
        return null;
    }

    @Override // defpackage.abql
    public cqtd k() {
        return abqk.a();
    }

    @Override // defpackage.abiu
    @dzsi
    public jic l() {
        return a;
    }
}
