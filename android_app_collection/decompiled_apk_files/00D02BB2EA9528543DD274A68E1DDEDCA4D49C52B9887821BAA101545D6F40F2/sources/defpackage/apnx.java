package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.widget.SeekBar;
/* compiled from: PG */
/* renamed from: apnx  reason: default package */
/* loaded from: classes2.dex */
public class apnx extends apob implements apoa, apqb {
    public final Activity a;
    public boolean b;
    public boolean c;
    public boolean d;
    @dzsi
    public clot e;
    private final cqhn k;
    private final Handler l;
    private final dxio<apnh> m;
    private final Runnable n;
    private final clof o;

    public apnx(Activity activity, cqhn cqhnVar, dxio<apnh> dxioVar, long j) {
        super(activity);
        this.l = new Handler();
        this.n = new Runnable(this) { // from class: apnt
            private final apnx a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
            }
        };
        new apnv(this);
        this.o = new apnw(this);
        this.e = null;
        this.a = activity;
        this.f = j;
        this.k = cqhnVar;
        dbud.a(apnu.a);
        this.m = dxioVar;
    }

    @Override // defpackage.apoa
    public String a() {
        throw null;
    }

    @Override // defpackage.apoa
    public String b() {
        throw null;
    }

    @Override // defpackage.apoa
    public cqkl c() {
        throw null;
    }

    @Override // defpackage.apoa
    public cqkl d() {
        throw null;
    }

    @Override // defpackage.apoa
    public SeekBar.OnSeekBarChangeListener e() {
        throw null;
    }

    @Override // defpackage.apob, defpackage.apoa
    public String f() {
        throw null;
    }

    @Override // defpackage.apob, defpackage.apoa
    public CharSequence g() {
        throw null;
    }

    @Override // defpackage.apob, defpackage.apoa
    public CharSequence h() {
        throw null;
    }

    @Override // defpackage.apqb
    public boolean i(clot clotVar) {
        bvrj.UI_THREAD.c();
        return false;
    }

    public void j(boolean z) {
        this.g = false;
        cqkx.p(this);
    }
}
