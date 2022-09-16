package defpackage;

import com.google.android.exoplayer.MediaFormat;
/* compiled from: PG */
/* renamed from: ovw  reason: default package */
/* loaded from: classes4.dex */
public final class ovw {
    public final boolean a;
    public final ovd b;
    public owm c;
    public ovy d;
    public MediaFormat e;
    public final long f;
    public long g;
    public int h;

    public ovw(ovx ovxVar, long j, long j2, owm owmVar) {
        this.f = j;
        this.g = j2;
        this.c = owmVar;
        String str = owmVar.e.b;
        boolean m = ovx.m(str);
        this.a = m;
        this.b = m ? null : new ovd(ovxVar.l(str));
        this.d = owmVar.h();
    }

    public final int a() {
        return this.d.b(this.g);
    }

    public final long b(int i) {
        return c(i) + this.d.d(i - this.h, this.g);
    }

    public final long c(int i) {
        return this.d.e(i - this.h) + this.f;
    }

    public final owj d(int i) {
        return this.d.f(i - this.h);
    }

    public final boolean e(int i) {
        int a = a();
        return a != -1 && i > a + this.h;
    }
}
