package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
/* compiled from: PG */
/* renamed from: bgze  reason: default package */
/* loaded from: classes3.dex */
public abstract class bgze implements bgyr {
    public static final Interpolator a = new LinearInterpolator();
    public static final Interpolator b = pq.a(0.5f, 0.0f, 0.0f, 1.0f);
    public final cqkp c;
    public boolean d;
    private boolean e;
    private boolean f;

    /* JADX INFO: Access modifiers changed from: protected */
    public bgze(cqkp cqkpVar) {
        this.c = cqkpVar;
    }

    @Override // defpackage.bgyr
    @dzsi
    public String g() {
        throw null;
    }

    @Override // defpackage.bgyr
    @dzsi
    public cjtd h() {
        throw null;
    }

    @Override // defpackage.bgyr
    public cqkl i() {
        throw null;
    }

    @Override // defpackage.bgyr
    public Boolean j() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void l(View view) {
        throw null;
    }

    @Override // defpackage.bgyr
    public Boolean m() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.bgyr
    @dzsi
    public cqfc n() {
        if (!this.f) {
            return null;
        }
        this.f = false;
        return new bgzd(this);
    }

    public void o() {
        if (!this.e) {
            this.f = true;
            this.e = true;
            this.d = true;
            cqkx.p(this);
        }
    }

    public void p() {
        if (this.e) {
            this.f = true;
            this.d = false;
            cqkx.p(this);
            this.e = false;
        }
    }
}
