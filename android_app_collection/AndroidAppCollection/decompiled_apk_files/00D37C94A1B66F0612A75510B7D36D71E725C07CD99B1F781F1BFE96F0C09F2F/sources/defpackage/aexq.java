package defpackage;

import android.os.Handler;
import com.google.android.exoplayer2.Format;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aexq  reason: default package */
/* loaded from: classes.dex */
public final class aexq extends atu {
    private aevn d;

    public aexq() {
        this(null, null, new pky[0]);
    }

    @Override // defpackage.plv, defpackage.pkd
    public final boolean I() {
        if (!super.I()) {
            return false;
        }
        this.d.e();
        return true;
    }

    @Override // defpackage.plv, defpackage.phj, defpackage.pkb
    public final void ad(int i, Object obj) {
        if (i == 10001) {
            aevn aevnVar = (aevn) obj;
            if (aevnVar == null) {
                aevnVar = aevn.a;
            }
            this.d = aevnVar;
            return;
        }
        super.ad(i, obj);
    }

    @Override // defpackage.plv, defpackage.phj
    public final void af() {
        super.af();
        this.d.f();
    }

    @Override // defpackage.plv
    protected final pmw f(String str, Format format, Format format2) {
        int i = format.y != format2.y ? 4096 : 0;
        if (format.z != format2.z) {
            i |= 8192;
        }
        int i2 = i;
        return new pmw(str, format, format2, i2 == 0 ? 3 : 0, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.plv, defpackage.phj
    public final void q(boolean z, boolean z2) {
        super.q(z, z2);
        this.d.c();
    }

    public aexq(pli pliVar, Handler handler, pky... pkyVarArr) {
        super(handler, pliVar, pkyVarArr);
        this.d = aevn.a;
    }
}
