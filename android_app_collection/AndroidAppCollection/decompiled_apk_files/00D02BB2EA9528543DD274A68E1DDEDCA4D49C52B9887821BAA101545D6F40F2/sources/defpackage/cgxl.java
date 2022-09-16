package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: cgxl  reason: default package */
/* loaded from: classes4.dex */
public class cgxl implements cgvl {
    private final Activity a;
    private final List<dwpp> b;
    private final jic c;
    private final String d;

    public cgxl(Activity activity, List<dwpp> list, dnmo dnmoVar) {
        this.a = activity;
        this.b = list;
        this.c = new jic(dnmoVar.a, ckqc.FULLY_QUALIFIED, 0);
        this.d = dnmoVar.b;
    }

    @Override // defpackage.cgvb
    public void a(cqiv cqivVar) {
        cqivVar.a(new cghf(), this);
    }

    @Override // defpackage.cgvl
    public jic b() {
        return this.c;
    }

    @Override // defpackage.cgvl
    public String c() {
        return this.d;
    }

    @Override // defpackage.cgvl
    public Boolean d() {
        return Boolean.valueOf(!this.b.isEmpty());
    }

    @Override // defpackage.cgvl
    public String e() {
        return d().booleanValue() ? this.a.getString(R.string.UGC_TASK_CARD_FOLLOW_UP_QUESTION) : "";
    }
}
