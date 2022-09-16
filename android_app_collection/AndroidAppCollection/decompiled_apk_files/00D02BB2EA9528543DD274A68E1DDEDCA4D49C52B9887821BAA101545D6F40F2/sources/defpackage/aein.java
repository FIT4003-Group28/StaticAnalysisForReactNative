package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aein  reason: default package */
/* loaded from: classes.dex */
public class aein implements abiu {
    private final Activity a;
    private final aeim b;
    private final cjtd c;

    public aein(Activity activity, aeim aeimVar, cjtd cjtdVar) {
        this.a = activity;
        this.b = aeimVar;
        this.c = cjtdVar;
    }

    @Override // defpackage.abiu
    public String d() {
        return this.a.getString(R.string.HOTEL_CAROUSEL_MORE_LINK_TEXT);
    }

    @Override // defpackage.abiu
    public cqkl h(cjqm cjqmVar) {
        this.b.a(cjqmVar);
        return cqkl.a;
    }

    @Override // defpackage.abiu
    public cjtd i() {
        return this.c;
    }

    @Override // defpackage.abiu
    public jic l() {
        return null;
    }
}
