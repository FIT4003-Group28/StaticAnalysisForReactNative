package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: mjp  reason: default package */
/* loaded from: classes3.dex */
public final class mjp extends ajsl {
    private final Context a;
    private final ajmy b;
    private final aafo c;
    private final ajrx d;
    private final ajyc e;
    private final ajxz f;
    private final FrameLayout g;
    private final ftb h;
    private mjo i;
    private mjo j;

    public mjp(Context context, ajmy ajmyVar, aafo aafoVar, gem gemVar, ajyc ajycVar, ajxz ajxzVar, ftb ftbVar) {
        context.getClass();
        this.a = context;
        ajmyVar.getClass();
        this.b = ajmyVar;
        aafoVar.getClass();
        this.c = aafoVar;
        this.d = gemVar;
        ajycVar.getClass();
        this.e = ajycVar;
        this.f = ajxzVar;
        this.h = ftbVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.g = frameLayout;
        gemVar.c(frameLayout);
        gemVar.b(true);
    }

    private final mjo f(int i) {
        return new mjo(this.a, this.b, this.c, this.e, i, this.d, this.f, this.h);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.d).b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
        if (r0 != 9) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0151 A[EDGE_INSN: B:99:0x0151->B:94:0x0151 ?: BREAK  , SYNTHETIC] */
    @Override // defpackage.ajsl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ void d(defpackage.ajrs r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mjp.d(ajrs, java.lang.Object):void");
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((arer) obj).m.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        mjo mjoVar = this.j;
        if (mjoVar != null) {
            mjoVar.qZ(ajsaVar);
        }
        mjo mjoVar2 = this.i;
        if (mjoVar2 != null) {
            mjoVar2.qZ(ajsaVar);
        }
    }
}
