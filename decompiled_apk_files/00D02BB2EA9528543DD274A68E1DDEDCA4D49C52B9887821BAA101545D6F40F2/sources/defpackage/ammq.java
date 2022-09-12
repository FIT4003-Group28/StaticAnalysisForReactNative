package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ammq  reason: default package */
/* loaded from: classes.dex */
public final class ammq {
    public static final float[] a = {0.0f, 0.1f, 0.22f, 0.5f, 0.78f, 0.9f};
    public final cqat d;
    public final cjvm e;
    private final ckcw n;
    public final int[] b = new int[6];
    public final ArrayList<alyh> c = new ArrayList<>();
    public long f = 0;
    public int m = 1;
    public long g = 0;
    public long h = 0;
    public float i = 0.0f;
    public float j = 0.0f;
    public boolean k = false;
    public boolean l = false;

    public ammq(cqat cqatVar, ckcw ckcwVar, cjvm cjvmVar) {
        this.d = cqatVar;
        this.n = ckcwVar;
        this.e = cjvmVar;
    }

    public final void a(long j) {
        this.m = 1;
        long j2 = this.g;
        long j3 = this.h;
        long j4 = (j - j2) - j3;
        long j5 = 0;
        if (this.k) {
            this.k = false;
            if (j4 != 0) {
                j5 = (this.i / ((float) j4)) * 100.0f;
            }
            ((ckcp) this.n.a(ckkr.g)).a(j4);
            ((ckcp) this.n.a(ckkr.h)).a(j5);
            return;
        }
        long j6 = j3 == 0 ? 0L : (this.i / ((float) j3)) * 100.0f;
        if (j3 != 0) {
            j5 = (this.j / ((float) j3)) * 100.0f;
        }
        ((ckcp) this.n.a(ckkr.c)).a(j6);
        ((ckcp) this.n.a(ckkr.e)).a(j5);
        ((ckcp) this.n.a(ckkr.f)).a(j4);
        ((ckcp) this.n.a(ckkr.d)).a(this.h);
    }
}
