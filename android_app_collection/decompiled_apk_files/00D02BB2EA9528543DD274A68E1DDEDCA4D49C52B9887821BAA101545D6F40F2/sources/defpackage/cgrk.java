package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cgrk  reason: default package */
/* loaded from: classes4.dex */
public abstract class cgrk implements cgrd<dwhd> {
    protected final btpc a;
    protected final Activity b;
    protected final cgrc c;
    @dzsi
    protected cgsh d = null;
    protected final buwz e;

    public cgrk(btpc btpcVar, Activity activity, buwz buwzVar, cgrc cgrcVar) {
        this.a = btpcVar;
        this.b = activity;
        this.e = buwzVar;
        this.c = cgrcVar;
    }

    public final void d(cgsh cgshVar, dwgz dwgzVar) {
        this.d = cgshVar;
        if (!this.a.i()) {
            cgshVar.i();
            jmw.g(this.b, R.string.AAP_TITLE, R.string.AAP_NOT_AVAILABLE_OFFLINE);
            return;
        }
        cgre.m(this.c, this.e, dwgzVar, e());
    }

    public final String e() {
        String canonicalName = getClass().getCanonicalName();
        dbsk.s(canonicalName);
        return canonicalName;
    }
}
