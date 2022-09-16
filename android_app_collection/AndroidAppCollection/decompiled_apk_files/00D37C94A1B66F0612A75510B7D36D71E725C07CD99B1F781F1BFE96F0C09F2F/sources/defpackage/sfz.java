package defpackage;

import android.graphics.Path;
import android.graphics.PathEffect;
import android.view.View;
/* compiled from: PG */
/* renamed from: sfz  reason: default package */
/* loaded from: classes4.dex */
final class sfz extends sbp {
    public final Path e;
    public final Path f;
    public final Path g;
    public final Path h;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public PathEffect m;
    public int n;
    public boolean o;
    public boolean p;
    public int q;
    public sgc r;
    private final scs s;
    private final scs t;

    /* JADX WARN: Type inference failed for: r0v5, types: [scs, sco] */
    public sfz() {
        super(new sct());
        this.e = new Path();
        this.f = new Path();
        this.g = new Path();
        this.h = new Path();
        this.s = this.c;
        this.t = new scv();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0188 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void e(boolean r30, android.graphics.Path r31, defpackage.scs r32, int r33, int r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sfz.e(boolean, android.graphics.Path, scs, int, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [scs, sco] */
    public final synchronized void d(View view) {
        if (this.d) {
            int paddingLeft = view.getPaddingLeft();
            int width = view.getWidth() - view.getPaddingRight();
            int paddingTop = view.getPaddingTop();
            int height = view.getHeight() - view.getPaddingBottom();
            this.e.rewind();
            ?? r11 = this.c;
            int l = r11.l();
            if (this.k && l > 0) {
                e(false, this.e, r11, paddingLeft, width, paddingTop, height);
            }
            this.h.rewind();
            this.f.rewind();
            if (this.q != 1) {
                for (int i = 0; i < l; i++) {
                    float round = Math.round(r11.h(i));
                    if (r11.r(i) != null) {
                        float round2 = Math.round(r11.j(i));
                        if (round >= paddingLeft && round <= width && round2 >= paddingTop && round2 <= height) {
                            this.f.addCircle(round, round2, this.n, Path.Direction.CW);
                        }
                    }
                }
            }
            this.g.rewind();
            if (this.o && l > 0) {
                e(true, this.g, r11, paddingLeft, width, paddingTop, height);
                this.g.close();
            }
            this.d = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [scs, sco] */
    /* JADX WARN: Type inference failed for: r0v1, types: [scs] */
    /* JADX WARN: Type inference failed for: r0v3 */
    @Override // defpackage.sbp
    public final synchronized void c(set setVar, set setVar2, sgt sgtVar, sgp sgpVar, boolean z) {
        ?? r0 = this.c;
        scs scsVar = z ? this.s : this.t;
        if (scsVar != r0) {
            scsVar.b(r0.a());
            this.c = scsVar;
            r0 = scsVar;
        }
        if (setVar != null) {
            r0.c((int) setVar.c());
        }
        super.c(setVar, setVar2, sgtVar, sgpVar, z);
    }
}
