package defpackage;

import android.app.Activity;
import android.view.View;
/* compiled from: PG */
/* renamed from: cexq  reason: default package */
/* loaded from: classes4.dex */
public class cexq implements cetf {
    public final Activity a;
    public final cqkp b;
    public final int c;
    public int d;
    public int k;
    private final String l;
    private final cqfd m = new cexo(this);
    private final View.OnTouchListener n = new cexp(this);
    public int e = 0;
    public int f = 0;
    public float g = 0.0f;
    public float h = 0.0f;
    public float i = 0.0f;
    public boolean j = false;

    public cexq(Activity activity, cqkp cqkpVar, String str) {
        this.k = 1;
        this.a = activity;
        this.b = cqkpVar;
        this.l = str;
        this.c = cqrp.d(15.0d).e(activity);
        this.d = activity.getResources().getConfiguration().orientation;
        if (str.isEmpty()) {
            this.k = 5;
        }
    }

    @Override // defpackage.cetf
    public cqtv a() {
        return this.k == 1 ? cqrp.d(265.0d) : cqrp.c(this.f);
    }

    @Override // defpackage.cetf
    public cqtv b() {
        return cqrp.c(this.g);
    }

    @Override // defpackage.cetf
    public cqtv c() {
        return cqrp.c(this.h);
    }

    @Override // defpackage.cetf
    public cqtv d() {
        return cqrp.c(this.i);
    }

    @Override // defpackage.cetf
    public Boolean e() {
        return Boolean.valueOf(this.j);
    }

    @Override // defpackage.cetf
    public String f() {
        return this.l;
    }

    @Override // defpackage.cetf
    public Integer g() {
        int i = this.k;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0 || i2 == 1 || i2 == 2) {
                return 4;
            }
            return i2 != 3 ? 8 : 0;
        }
        throw null;
    }

    @Override // defpackage.cetf
    public cqfd h() {
        return this.m;
    }

    @Override // defpackage.cetf
    public View.OnTouchListener i() {
        return this.n;
    }
}
