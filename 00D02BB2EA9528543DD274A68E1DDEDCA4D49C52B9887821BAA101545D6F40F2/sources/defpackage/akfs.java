package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: akfs  reason: default package */
/* loaded from: classes2.dex */
public class akfs implements akfy {
    @dzsi
    public final akey a;
    public final Runnable b;
    public final Activity c;
    public final awoe d;
    public final akfc e;
    private final Runnable f;
    private final dxio<akfa> g;
    private final boolean h;

    public akfs(Activity activity, dxio<akfa> dxioVar, awoe awoeVar, akfc akfcVar, @dzsi akey akeyVar, Runnable runnable, Runnable runnable2, boolean z) {
        this.c = activity;
        this.g = dxioVar;
        this.d = awoeVar;
        this.e = akfcVar;
        this.a = akeyVar;
        this.b = runnable;
        this.f = runnable2;
        this.h = z;
    }

    @Override // defpackage.akfy
    public List<akfw> a() {
        dccx F = dcdc.F();
        List<String> s = this.g.a().s();
        if (s != null) {
            for (String str : s) {
                F.g(new akfr(this, str));
            }
        }
        F.g(new akfq(this));
        return F.f();
    }

    @Override // defpackage.akfy
    public cqkl b() {
        this.f.run();
        return cqkl.a;
    }

    @Override // defpackage.akfy
    public Boolean c() {
        return Boolean.valueOf(this.h);
    }

    @Override // defpackage.akfy
    public CharSequence d() {
        return this.c.getString(R.string.CANCEL_BUTTON);
    }
}
