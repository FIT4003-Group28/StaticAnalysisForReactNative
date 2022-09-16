package com.google.android.apps.youtube.app.extensions.appindexing;

import android.content.Context;
import com.google.android.apps.youtube.app.extensions.appindexing.WatchVideoIndexer;
import com.google.firebase.appindexing.internal.MutateRequest;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class WatchVideoIndexer implements f, airt, ynl {
    private final gpi a;
    private final agbu b;
    private final anwy c;
    private final anws d;
    private final yni e;
    private final airw f;
    private final aypf g;
    private final aacz h;

    public WatchVideoIndexer(gpi gpiVar, agbu agbuVar, Context context, yni yniVar, airw airwVar, aacz aaczVar) {
        anwy a = anwy.a(context);
        anws a2 = anws.a(context);
        this.b = agbuVar;
        this.a = gpiVar;
        this.c = a;
        this.d = a2;
        this.e = yniVar;
        this.f = airwVar;
        this.h = aaczVar;
        this.g = new aypf();
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().b.aa(new ayqb() { // from class: gpj
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                WatchVideoIndexer.this.i((ahhw) obj);
            }
        }, fzc.o)};
    }

    public final void h() {
        if (!this.b.b()) {
            return;
        }
        this.d.c(new MutateRequest(4, null, null, null, null, null, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(defpackage.ahhw r18) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.extensions.appindexing.WatchVideoIndexer.i(ahhw):void");
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                i((ahhw) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahhw.class};
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        if (eog.aq(this.h)) {
            this.g.c();
        } else {
            this.e.m(this);
        }
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        if (eog.aq(this.h)) {
            this.g.c();
            this.g.g(g(this.f));
            return;
        }
        this.e.g(this);
    }
}
