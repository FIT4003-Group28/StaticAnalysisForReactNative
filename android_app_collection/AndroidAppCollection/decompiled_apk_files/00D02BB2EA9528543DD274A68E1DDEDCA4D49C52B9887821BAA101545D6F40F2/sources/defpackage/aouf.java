package defpackage;

import android.app.Application;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aouf  reason: default package */
/* loaded from: classes2.dex */
public class aouf implements auzv {
    private final Application a;
    private final bvjj b;
    private final auhi c;
    private final bsvn d;
    private final bvrb e;
    private final auzu f;
    private final anhu g;
    private boolean h = false;

    public aouf(auzu auzuVar, anhu anhuVar, Application application, bvjj bvjjVar, auhi auhiVar, bsvn bsvnVar, bvrb bvrbVar) {
        this.f = auzuVar;
        this.g = anhuVar;
        this.a = application;
        this.b = bvjjVar;
        this.c = auhiVar;
        this.d = bsvnVar;
        this.e = bvrbVar;
    }

    public static boolean k(bvjj bvjjVar, anhu anhuVar) {
        anhu anhuVar2 = anhu.NO;
        int ordinal = anhuVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return true;
                }
                String valueOf = String.valueOf(anhuVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb.append("Unexpected option: ");
                sb.append(valueOf);
                throw new AssertionError(sb.toString());
            } else if (!bvjjVar.m(bvjk.dN, false)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.auzv
    public cqkl a() {
        this.h = false;
        this.f.w();
        this.c.e(dpyv.TIMELINE_VISIT_CONFIRMATION.dm, aufs.ENABLED);
        this.d.b();
        return cqkl.a;
    }

    @Override // defpackage.auzv
    public cqkl b() {
        this.h = false;
        this.f.aJ();
        this.c.e(dpyv.TIMELINE_VISIT_CONFIRMATION.dm, aufs.DISABLED);
        this.d.b();
        return cqkl.a;
    }

    @Override // defpackage.auzv
    public cjtd c() {
        return cjtd.a(dtyc.as);
    }

    @Override // defpackage.auzv
    public cjtd d() {
        return cjtd.a(dtyc.at);
    }

    @Override // defpackage.auzv
    public cjtd e() {
        return cjtd.a(dtyc.ar);
    }

    @Override // defpackage.auzv
    public CharSequence f() {
        return this.a.getString(R.string.MAPS_ACTIVITY_NOTIFICATIONS_BANNER_TITLE);
    }

    @Override // defpackage.auzv
    public CharSequence g() {
        return this.a.getString(R.string.MAPS_ACTIVITY_NOTIFICATIONS_BANNER_MESSAGE);
    }

    @Override // defpackage.auzv
    public CharSequence h() {
        return this.a.getString(R.string.NOTIFICATION_OPT_OUT_TURN_OFF);
    }

    public void i() {
        this.h = true;
        this.b.S(bvjk.dN, true);
        this.d.b();
        if (this.g != anhu.FORCE) {
            bvrb bvrbVar = this.e;
            final auzu auzuVar = this.f;
            auzuVar.getClass();
            bvrbVar.a(new Runnable(auzuVar) { // from class: aoue
                private final auzu a;

                {
                    this.a = auzuVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.w();
                }
            }, bvrj.UI_THREAD, 15000L);
        }
    }

    public boolean j() {
        return this.h;
    }
}
