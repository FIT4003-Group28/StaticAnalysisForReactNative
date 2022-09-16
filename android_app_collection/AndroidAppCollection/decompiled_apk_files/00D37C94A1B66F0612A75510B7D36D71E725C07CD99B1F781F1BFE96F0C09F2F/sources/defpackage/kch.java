package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewConfiguration;
/* compiled from: PG */
/* renamed from: kch  reason: default package */
/* loaded from: classes3.dex */
public final class kch extends zbm {
    public final Rect a;
    private final kcg b;
    private final int d;
    private final int e;
    private final boolean f;
    private final int g;
    private final Rect h;
    private boolean i;
    private boolean j;
    private boolean k;
    private float l;
    private float m;

    public kch(Context context, aacz aaczVar, kce kceVar, aynx aynxVar) {
        this.d = ViewConfiguration.get(context).getScaledTouchSlop();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        asxj asxjVar = aaczVar.b().e;
        this.e = zew.i(displayMetrics, (asxjVar == null ? asxj.a : asxjVar).cv);
        asxj asxjVar2 = aaczVar.b().e;
        this.f = (asxjVar2 == null ? asxj.a : asxjVar2).bq;
        this.b = kceVar;
        this.j = true;
        asxj asxjVar3 = aaczVar.b().e;
        this.g = (asxjVar3 == null ? asxj.a : asxjVar3).bK;
        this.a = new Rect();
        this.h = new Rect();
        aynxVar.Z(new ayqb() { // from class: kcf
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                kch.this.a.set(((zaw) obj).a.a);
            }
        });
    }

    private final void e(View view, boolean z) {
        if (this.i == z) {
            return;
        }
        this.i = z;
        if (view == null || view.getParent() == null) {
            return;
        }
        view.getParent().requestDisallowInterceptTouchEvent(this.i);
    }

    private final void f(View view) {
        ampq j;
        if (this.i) {
            kce kceVar = (kce) this.b;
            if (!kceVar.x()) {
                acti actiVar = kceVar.m;
                acte acteVar = new acte(actj.PLAYER_SEEK_OUTSIDE_SCRUBBER);
                long j2 = kceVar.v;
                long c = kceVar.a.c();
                if (!eog.aS(kceVar.x)) {
                    j = amon.a;
                } else {
                    aopa createBuilder = asjt.a.createBuilder();
                    auqn auqnVar = auqn.SEEK_SOURCE_SLIDE_ON_PLAYER;
                    createBuilder.copyOnWrite();
                    asjt asjtVar = (asjt) createBuilder.instance;
                    asjtVar.c = auqnVar.n;
                    asjtVar.b |= 1;
                    createBuilder.copyOnWrite();
                    asjt asjtVar2 = (asjt) createBuilder.instance;
                    asjtVar2.b |= 2;
                    asjtVar2.d = (int) j2;
                    createBuilder.copyOnWrite();
                    asjt asjtVar3 = (asjt) createBuilder.instance;
                    asjtVar3.b |= 4;
                    asjtVar3.e = (int) c;
                    asjt asjtVar4 = (asjt) createBuilder.mo39build();
                    aopa createBuilder2 = asjj.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    asjj asjjVar = (asjj) createBuilder2.instance;
                    asjtVar4.getClass();
                    asjjVar.G = asjtVar4;
                    asjjVar.c |= 67108864;
                    j = ampq.j((asjj) createBuilder2.mo39build());
                }
                actiVar.H(3, acteVar, (asjj) j.f());
                kceVar.a.l();
                kceVar.y();
            }
        }
        e(view, false);
        this.j = true;
        this.k = false;
    }

    @Override // defpackage.zbr
    public final void c() {
        e(null, false);
        this.j = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006d, code lost:
        if (r5 < (r6 - r11.a.bottom)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
        if (r2 != 3) goto L21;
     */
    @Override // defpackage.zbr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(android.view.View r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kch.d(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // defpackage.zbm, defpackage.zbr
    public final boolean nu() {
        return this.f && this.c;
    }
}
