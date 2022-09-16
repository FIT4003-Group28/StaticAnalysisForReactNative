package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: xhw  reason: default package */
/* loaded from: classes4.dex */
public final class xhw extends xhx {
    public aalc a;
    private final ajnj b;
    private aoyu f;

    public xhw(ImageView imageView, ajnj ajnjVar, Drawable drawable, float f) {
        super(imageView, drawable, f);
        this.b = ajnjVar;
        this.a = null;
    }

    @Override // defpackage.xhx
    public final void a() {
        super.a();
        aoyu aoyuVar = this.f;
        avhn avhnVar = null;
        if (aoyuVar != null && (aoyuVar.b & 1) != 0 && (avhnVar = aoyuVar.c) == null) {
            avhnVar = avhn.a;
        }
        if (avhnVar != null) {
            this.b.k(avhnVar);
            return;
        }
        aalc aalcVar = this.a;
        if (aalcVar == null) {
            this.b.a();
        } else {
            this.b.j(aalcVar);
        }
    }

    public final void b() {
        this.a = null;
        c(null);
        a();
    }

    public final void c(aoyu aoyuVar) {
        this.f = aoyuVar;
        aoyj aoyjVar = null;
        if (aoyuVar != null && (aoyuVar.b & 2) != 0) {
            aoyv aoyvVar = aoyuVar.d;
            if (aoyvVar == null) {
                aoyvVar = aoyv.a;
            }
            aoyjVar = aoyvVar.c;
            if (aoyjVar == null) {
                aoyjVar = aoyj.a;
            }
        }
        this.d = aoyjVar;
    }
}
