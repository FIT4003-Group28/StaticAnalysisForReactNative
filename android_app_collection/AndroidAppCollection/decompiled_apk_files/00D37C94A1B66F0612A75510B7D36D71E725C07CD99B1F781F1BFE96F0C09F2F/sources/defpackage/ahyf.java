package defpackage;

import android.content.Context;
import android.view.View;
/* compiled from: PG */
/* renamed from: ahyf  reason: default package */
/* loaded from: classes.dex */
public abstract class ahyf implements ahyh, ahyl {
    private final Context a;
    private ahym b;

    public ahyf(Context context) {
        context.getClass();
        this.a = context;
    }

    public final synchronized ahym V() {
        if (this.b == null) {
            ahyk kS = kS(this.a);
            this.b = new ahym(kS.i, kS.j, kS.h, kS.b, kS.a, kS.d, kS.c, kS.e, kS.f, kS.g);
        }
        return this.b;
    }

    public final void W() {
        ahym V = V();
        if (V.i()) {
            V.b();
            return;
        }
        V.g(4);
        V.a(24);
        V.d();
    }

    public final void X() {
        V().e(0);
    }

    public final void Y(int i) {
        V().e(i);
    }

    public final void Z() {
        ahym V = V();
        if (V.k()) {
            V.b();
            return;
        }
        V.g(12);
        V.a(16);
        V.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean aa(int i) {
        return V().l(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ahyk kS(Context context) {
        ahyk ahykVar = new ahyk(context, this);
        ahykVar.h = new ahye(this);
        return ahykVar;
    }

    public void kT() {
        ahym V = V();
        if (V.i()) {
            V.b();
            return;
        }
        V.g(20);
        V.a(8);
        V.d();
    }

    public void kU() {
        ahym V = V();
        if (V.k()) {
            V.b();
            return;
        }
        V.g(28);
        V.d();
    }

    @Override // defpackage.aizf
    public View kZ() {
        ahym V = V();
        if (!V.j()) {
            String valueOf = String.valueOf(V.b);
            String valueOf2 = String.valueOf(V);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35 + String.valueOf(valueOf2).length());
            sb.append("Forcefully created overlay:");
            sb.append(valueOf);
            sb.append(" helper:");
            sb.append(valueOf2);
            zep.l(sb.toString());
            V.c();
        }
        return V.e;
    }

    @Override // defpackage.ahyh
    public boolean nI() {
        return V().j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void na(int i) {
    }

    @Override // defpackage.ahyh
    public final void ns(ahyg ahygVar) {
        ahym V = V();
        aqxo.y(V.g == null);
        V.g = ahygVar;
    }
}
