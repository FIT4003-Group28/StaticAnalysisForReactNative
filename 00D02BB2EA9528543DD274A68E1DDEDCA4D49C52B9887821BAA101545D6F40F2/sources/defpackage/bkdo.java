package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bkdo  reason: default package */
/* loaded from: classes3.dex */
public class bkdo implements abiu {
    private final Activity a;
    private final bkdc b;
    private dgis c;

    public bkdo(Activity activity, bkdc bkdcVar, dgis dgisVar) {
        this.a = activity;
        this.b = bkdcVar;
        this.c = dgisVar;
    }

    public void a(dgis dgisVar) {
        this.c = dgisVar;
    }

    @Override // defpackage.abiu
    public String d() {
        return this.a.getString(R.string.IMAGE_CAROUSEL_VIEW_ALL);
    }

    @Override // defpackage.abiu
    public cqkl h(cjqm cjqmVar) {
        if (bkdc.a(this.c)) {
            this.b.b(this.c);
        }
        return cqkl.a;
    }

    @Override // defpackage.abiu
    public cjtd i() {
        return cjtd.a(dtxy.oA);
    }

    @Override // defpackage.abiu
    public jic l() {
        return null;
    }
}
