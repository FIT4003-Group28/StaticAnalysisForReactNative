package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: mjr  reason: default package */
/* loaded from: classes3.dex */
public final class mjr extends ajsl {
    private final Context a;
    private final ajmy b;
    private final aafo c;
    private final ajyc d;
    private final ajrp e;
    private final ajxz f;
    private final ajrx g;
    private final FrameLayout h;
    private mjq i;
    private mjq j;

    public mjr(Context context, ajmy ajmyVar, gem gemVar, aafo aafoVar, ajyc ajycVar, ajxz ajxzVar) {
        context.getClass();
        this.a = context;
        ajmyVar.getClass();
        this.b = ajmyVar;
        aafoVar.getClass();
        this.c = aafoVar;
        this.g = gemVar;
        ajycVar.getClass();
        this.d = ajycVar;
        this.f = ajxzVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        gemVar.c(frameLayout);
        this.e = new ajrp(aafoVar, gemVar);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.g).b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0048, code lost:
        if (r0 != 9) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0143  */
    @Override // defpackage.ajsl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ void d(defpackage.ajrs r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mjr.d(ajrs, java.lang.Object):void");
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((arev) obj).l.I();
    }

    final mjq f(int i) {
        return new mjq(this.a, this.b, this.c, this.d, i, this.g, this.f);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.e.c();
    }
}
