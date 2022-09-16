package defpackage;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: fhg  reason: default package */
/* loaded from: classes3.dex */
public final class fhg implements ajzs {
    public final SwipeRefreshLayout a;
    public int b;
    public final azpq c;
    private final fhe e;
    private final List f;
    private ajwb g;
    private final sdb h;

    public fhg(sdb sdbVar, SwipeRefreshLayout swipeRefreshLayout, byte[] bArr) {
        fhe fheVar = new fhe(this);
        this.e = fheVar;
        this.f = new ArrayList(2);
        this.h = sdbVar;
        this.a = swipeRefreshLayout;
        this.b = 2;
        swipeRefreshLayout.setEnabled(true);
        this.c = azpq.e();
        swipeRefreshLayout.a = new bmp() { // from class: fhd
            @Override // defpackage.bmp
            public final void a() {
                fhg.this.a();
            }
        };
        sdbVar.a(fheVar);
    }

    public final void a() {
        ajwb ajwbVar = this.g;
        if (ajwbVar == null) {
            this.a.l(false);
            this.c.c(fhf.b(false));
            return;
        }
        ajwbVar.ll();
        this.c.c(fhf.b(true));
    }

    public final void b() {
        this.h.b(this.e);
        this.c.sm();
    }

    @Override // defpackage.ajzs
    public final void c(int i) {
        this.b = i;
        this.a.l(i == 2);
        e();
    }

    public final void d(ajzq ajzqVar) {
        this.g = ajzqVar;
        this.f.add(ajzqVar.f60J);
        e();
    }

    public final void e() {
        this.a.setEnabled(this.b != 3);
    }
}
