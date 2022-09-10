package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: chkm  reason: default package */
/* loaded from: classes4.dex */
public final class chkm implements cdfw, btzi {
    @dzsi
    djhs c;
    final /* synthetic */ chkn d;
    public boolean a = false;
    private boolean e = false;
    public boolean b = false;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;

    public chkm(chkn chknVar) {
        this.d = chknVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<djhq> btzrVar, btzy btzyVar) {
        this.f = true;
        c();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr btzrVar, Object obj) {
        this.c = (djhs) obj;
        this.f = true;
        c();
    }

    @Override // defpackage.cdfw
    public final void a() {
        this.g = true;
        chkn chknVar = this.d;
        CharSequence text = chknVar.h.getText(R.string.THANKS_PAGE_FAILED_TO_POST_PHOTOS);
        if (!chknVar.d.isFinishing()) {
            Toast.makeText(chknVar.d, text, 1).show();
        }
        c();
    }

    @Override // defpackage.cdfw
    public final void b() {
        this.g = true;
        chie chieVar = this.d.k;
        if (chieVar.c) {
            chieVar.bF();
            chieVar.c = false;
        }
        chif chifVar = (chif) chieVar.b;
        chif chifVar2 = chif.d;
        chifVar.a |= 2;
        chifVar.c = true;
        c();
    }

    public final void c() {
        djgl djglVar;
        chkn chknVar = this.d;
        if (chknVar.n != this) {
            return;
        }
        boolean z = this.g;
        boolean z2 = true;
        boolean z3 = z && !((chif) chknVar.k.b).c;
        boolean z4 = z && ((chif) chknVar.k.b).c;
        boolean z5 = this.f;
        boolean z6 = z5 && this.c == null;
        boolean z7 = z5 && this.c != null;
        boolean z8 = this.a && !this.e;
        boolean z9 = !z6 && !z3;
        if (z8 && z9) {
            this.e = true;
            chknVar.j.i(4, new Runnable(this) { // from class: chkl
                private final chkm a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    chkm chkmVar = this.a;
                    chkmVar.b = true;
                    chkmVar.c();
                }
            });
        }
        boolean z10 = this.b && !this.h;
        boolean z11 = (z6 && z4) || (z7 && !z3);
        if (z10 && z11) {
            this.h = true;
            chmu chmuVar = this.d.j;
            djhs djhsVar = this.c;
            if (djhsVar == null) {
                djglVar = djgl.g;
            } else {
                djglVar = djhsVar.b;
                if (djglVar == null) {
                    djglVar = djgl.g;
                }
            }
            chmuVar.h(djglVar, 3);
        }
        if (!this.h && !z3) {
            z2 = false;
        }
        if (!this.a) {
            return;
        }
        if ((this.e && !this.b) || !z2) {
            return;
        }
        chkn chknVar2 = this.d;
        chknVar2.n = null;
        cqkx.p(chknVar2);
        if (!this.e || this.h) {
            return;
        }
        this.d.j.i(3, null);
    }
}
