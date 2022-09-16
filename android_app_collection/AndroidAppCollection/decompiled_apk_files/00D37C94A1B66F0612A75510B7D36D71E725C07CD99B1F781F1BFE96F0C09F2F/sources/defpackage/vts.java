package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: vts  reason: default package */
/* loaded from: classes4.dex */
public final class vts extends ouo {
    private final vue a;
    private final vvl b;
    private final vvs c;
    private final long d;
    private long e;
    private boolean f;

    public vts(Context context, vue vueVar, vvl vvlVar) {
        this.a = vueVar;
        vvlVar.getClass();
        this.b = vvlVar;
        vvm vvmVar = (vvm) vvlVar;
        this.c = vvmVar.c;
        Resources resources = context.getResources();
        this.d = (resources.getDimension(R.dimen.preview_renderer_focus_area_width) / resources.getDisplayMetrics().widthPixels) * ((float) vvmVar.a.g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final long b() {
        return -3L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final long c() {
        return -2L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final MediaFormat d(int i) {
        return MediaFormat.i(null, "application/octet-stream", -2L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final void e(long j, long j2) {
        this.e = j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final void f() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final void g(long j) {
        otb otbVar = this.a.n;
        if ((otbVar == null || !otbVar.o()) && Math.abs(j - this.e) >= 1000) {
            boolean z = true;
            vvg g = this.c.g(j, true);
            if (g == null) {
                g = this.c.i(j);
            }
            if (g != null) {
                if (((vvm) this.b).a.g(j) != g.a) {
                    z = false;
                }
                vue vueVar = this.a;
                g.c();
                vueVar.post(new vuc(vueVar, g, z));
                g.d();
            }
            if (this.f) {
                this.f = false;
                if (j == 0) {
                    return;
                }
            }
            vvl vvlVar = this.b;
            long j2 = this.d / 2;
            long j3 = j - j2;
            long j4 = j + j2;
            vvc vvcVar = (vvc) ((vvm) vvlVar).b.a;
            if (vvcVar == null) {
                return;
            }
            vvcVar.d.b(j3, j4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final boolean h() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final boolean i() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final boolean j() {
        this.f = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final int pN() {
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final void pO(int i, long j, boolean z) {
        this.e = j;
    }
}
