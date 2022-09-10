package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aoto  reason: default package */
/* loaded from: classes2.dex */
public class aoto implements aosm {
    private final Activity a;
    private final bsvm b;
    private final ache c;
    private final Runnable d;

    public aoto(Activity activity, bsvm bsvmVar, ache acheVar, Runnable runnable) {
        this.a = activity;
        this.b = bsvmVar;
        this.c = acheVar;
        this.d = runnable;
    }

    @Override // defpackage.aosm
    public CharSequence a() {
        return this.a.getResources().getString(R.string.INFO_DIALOG_BODY_V2);
    }

    @Override // defpackage.aosm
    public CharSequence b() {
        return this.a.getResources().getString(R.string.ACTIVITY_CONTROLS_LINK);
    }

    @Override // defpackage.aosm
    public cqkl c() {
        this.d.run();
        this.b.j();
        return cqkl.a;
    }

    @Override // defpackage.aosm
    public cjtd d() {
        return cjtd.a(dtyc.ah);
    }

    @Override // defpackage.aosm
    public cjtd e() {
        return cjtd.a(dtyc.ae);
    }

    public cqkl f() {
        this.c.q("location_history");
        return cqkl.a;
    }
}
