package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: PG */
/* renamed from: jxh  reason: default package */
/* loaded from: classes3.dex */
public abstract class jxh extends ahyf implements ahih, fgd {
    private final Set a;
    public ezx d;
    public auaz e;
    public boolean f;
    public long g;
    public long h;

    public jxh(Context context) {
        super(context);
        this.a = new CopyOnWriteArraySet();
    }

    @Override // defpackage.aizf
    public ViewGroup.LayoutParams c() {
        throw null;
    }

    public void d(Context context, View view) {
        throw null;
    }

    public final void g(ahig ahigVar) {
        Set set = this.a;
        ahigVar.getClass();
        set.add(ahigVar);
    }

    @Override // defpackage.fgd
    public final void h(ezx ezxVar) {
        if (this.d != ezxVar) {
            this.d = ezxVar;
            Y(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j() {
        for (ahig ahigVar : this.a) {
            ahigVar.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k() {
        for (ahig ahigVar : this.a) {
            ahigVar.q(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ahyf
    public ahyk kS(Context context) {
        ahyk kS = super.kS(context);
        kS.e = false;
        return kS;
    }

    @Override // defpackage.ahyf
    public final void kT() {
        this.e = null;
        super.W();
    }

    @Override // defpackage.ahih
    public final void l(auaz auazVar, boolean z) {
        kU();
        if (!akzj.f(this.e, auazVar) || this.f != z) {
            this.e = auazVar;
            this.f = z;
            Y(1);
        }
    }

    @Override // defpackage.ahih
    public final void m(long j, long j2) {
        if (this.g == j && this.h == j2) {
            return;
        }
        this.g = j;
        this.h = j2;
        Y(2);
    }

    public boolean mY(ezx ezxVar) {
        throw null;
    }

    @Override // defpackage.ahyl
    public final boolean mZ() {
        return this.e != null;
    }
}
