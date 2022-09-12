package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: abtd  reason: default package */
/* loaded from: classes2.dex */
public class abtd implements abiu {
    private final Activity a;
    private final dxio<ache> b;

    public abtd(Activity activity, dxio<ache> dxioVar) {
        this.a = activity;
        this.b = dxioVar;
    }

    @Override // defpackage.abiu
    public String d() {
        return this.a.getString(R.string.SEND_FEEDBACK);
    }

    @Override // defpackage.abiu
    public cqkl h(cjqm cjqmVar) {
        this.b.a().k(false, true, achc.LOCAL_DISCOVERY, null);
        return cqkl.a;
    }

    @Override // defpackage.abiu
    public cjtd i() {
        return cjtd.b;
    }

    @Override // defpackage.abiu
    public jic l() {
        return null;
    }
}
