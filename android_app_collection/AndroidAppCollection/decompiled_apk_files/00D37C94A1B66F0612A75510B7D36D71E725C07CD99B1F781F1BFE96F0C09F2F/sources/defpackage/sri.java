package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.litho.ComponentTree;
/* compiled from: PG */
/* renamed from: sri  reason: default package */
/* loaded from: classes4.dex */
public final class sri extends FrameLayout {
    public final tdz a;
    private final dci b;
    private byte[] c;
    private aypf d;
    private boolean e;

    public sri(Context context, tdz tdzVar) {
        super(context);
        context.getClass();
        this.a = tdzVar;
        dci dciVar = new dci(context);
        this.b = dciVar;
        super.addView(dciVar, new FrameLayout.LayoutParams(-1, -1));
    }

    private final void b() {
        aypf aypfVar = this.d;
        if (aypfVar != null) {
            aypfVar.qr();
            this.d = null;
        }
        this.b.K();
        this.b.G(null);
        this.b.y = null;
    }

    private final void c() {
        final byte[] bArr = this.c;
        if (!this.e || bArr == null) {
            return;
        }
        this.b.y = null;
        final aypf aypfVar = new aypf();
        this.d = aypfVar;
        tdu tduVar = this.a.c;
        tfd tfdVar = tfd.b;
        aflw aflwVar = new aflw();
        aflwVar.g(tdt.class, new tdt("0"));
        cyv cyvVar = new cyv(getContext(), this.a.b, new tha(tcm.a), aflwVar, (byte[]) null);
        tgb a = tgd.a(cyvVar);
        tcz a2 = tda.a();
        a2.p = this.a;
        a2.a = this.b;
        a2.d = tfdVar;
        a.f(a2.a());
        a.e(new tfm() { // from class: srh
            @Override // defpackage.tfm
            public final cyr a(cyv cyvVar2, tda tdaVar) {
                sri sriVar = sri.this;
                return ((tdx) sriVar.a.a).a.a(cyvVar2, tdaVar, bArr, null, aypfVar);
            }
        });
        czf c = ComponentTree.c(cyvVar, a.a());
        c.d = this.a.e;
        this.b.G(c.a());
    }

    public final void a(byte[] bArr) {
        b();
        this.c = bArr;
        c();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        throw new UnsupportedOperationException("ElementsView does not support addView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        b();
        super.onAttachedToWindow();
        this.e = true;
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.e = false;
        b();
        super.onDetachedFromWindow();
    }
}
