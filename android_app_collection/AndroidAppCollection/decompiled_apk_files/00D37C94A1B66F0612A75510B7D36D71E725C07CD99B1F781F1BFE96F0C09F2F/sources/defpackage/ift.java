package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ift  reason: default package */
/* loaded from: classes3.dex */
public final class ift implements afzf, aegn {
    public final boolean a;
    public final boolean b;
    public final acvf c;
    public final airw d;
    public final apzg e;
    public final igf f;
    public boolean g;
    private final int h;
    private final int i;
    private final int j;
    private final boolean k;
    private final boolean l;
    private final String m;
    private final long n;
    private final snc o;
    private final Executor p;
    private final igh q;
    private final amqo r;
    private final aego s;
    private final aapv t;
    private final afvn u;
    private final long v;
    private aegm w;
    private ift x;
    private final aafd y;

    public ift(long j, apzg apzgVar, igf igfVar, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, String str, long j2, snc sncVar, Executor executor, acvf acvfVar, airw airwVar, igh ighVar, aafd aafdVar, amqo amqoVar, aego aegoVar, aapv aapvVar, afvn afvnVar, byte[] bArr) {
        boolean z5 = true;
        aqxo.p(true);
        aqxo.p(i2 < i3 ? false : z5);
        this.v = j;
        this.e = apzgVar;
        this.f = igfVar;
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = z;
        this.a = z2;
        this.b = z3;
        this.l = z4;
        this.m = str;
        this.n = j2;
        this.o = sncVar;
        this.p = executor;
        this.c = acvfVar;
        this.d = airwVar;
        this.q = ighVar;
        this.y = aafdVar;
        this.r = amqoVar;
        this.s = aegoVar;
        this.t = aapvVar;
        this.u = afvnVar;
    }

    public final void d() {
        this.g = true;
        aegm aegmVar = this.w;
        if (aegmVar != null) {
            aegmVar.a();
            this.w = null;
        }
        ift iftVar = this.x;
        if (iftVar != null) {
            iftVar.d();
            this.x = null;
        }
    }

    @Override // defpackage.aegn
    public final void e() {
        this.w = null;
    }

    @Override // defpackage.aegn
    public final void f() {
        this.w = null;
    }

    @Override // defpackage.aegj
    public final void g(FormatStreamModel formatStreamModel, long j) {
    }

    @Override // defpackage.aegn
    public final void h() {
    }

    @Override // defpackage.aegn
    public final void i(int i) {
        this.w = null;
    }

    @Override // defpackage.aegn
    public final boolean j() {
        return !this.g;
    }

    @Override // defpackage.aegn
    public final void k() {
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x0179 A[LOOP:0: B:91:0x0177->B:92:0x0179, LOOP_END] */
    @Override // defpackage.cfa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void lG(java.lang.Object r37) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ift.lG(java.lang.Object):void");
    }
}
