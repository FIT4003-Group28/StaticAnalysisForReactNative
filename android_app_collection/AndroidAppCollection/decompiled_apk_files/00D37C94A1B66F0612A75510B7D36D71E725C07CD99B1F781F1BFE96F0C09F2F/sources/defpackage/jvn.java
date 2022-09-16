package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: jvn  reason: default package */
/* loaded from: classes3.dex */
public final class jvn implements aiou {
    public final Activity a;
    public final niw b;
    public final aafo c;
    public final acth d;
    public final ajgz e;
    public aqft f;
    public ajgx g;

    public jvn(Activity activity, niw niwVar, aafo aafoVar, acth acthVar, ajgz ajgzVar) {
        this.a = activity;
        this.b = niwVar;
        this.c = aafoVar;
        this.d = acthVar;
        this.e = ajgzVar;
    }

    @Override // defpackage.aiou
    public final Activity a() {
        return this.a;
    }

    @Override // defpackage.aiou
    public final void b() {
        ajgx ajgxVar = this.g;
        if (ajgxVar != null) {
            ajgxVar.l();
            this.g = null;
        }
    }
}
