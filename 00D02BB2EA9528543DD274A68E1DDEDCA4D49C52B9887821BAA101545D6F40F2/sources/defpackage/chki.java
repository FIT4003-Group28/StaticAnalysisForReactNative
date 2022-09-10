package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: chki  reason: default package */
/* loaded from: classes4.dex */
public class chki implements chmn {
    final /* synthetic */ chkn a;

    public chki(chkn chknVar) {
        this.a = chknVar;
    }

    @Override // defpackage.chmn
    public jic a() {
        return this.a.l.get(5).e();
    }

    @Override // defpackage.chmn
    public String b() {
        int size = this.a.l.size() - 5;
        return this.a.h.getQuantityString(R.plurals.TODO_PHOTO_MORE_PHOTOS, size, Integer.valueOf(size));
    }

    @Override // defpackage.chmn
    public cqkl c() {
        if (this.a.v().booleanValue()) {
            return cqkl.a;
        }
        chie chieVar = this.a.k;
        if (chieVar.c) {
            chieVar.bF();
            chieVar.c = false;
        }
        chif.b((chif) chieVar.b);
        cqkx.p(this.a);
        return cqkl.a;
    }

    @Override // defpackage.chmn
    public cjtd d() {
        cjta b = cjtd.b();
        b.g(this.a.b.d());
        b.d = dtyc.y;
        return b.a();
    }
}
