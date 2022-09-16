package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bmcy  reason: default package */
/* loaded from: classes3.dex */
public abstract class bmcy implements bmcu {
    protected final dglo e;
    protected final Resources f;
    protected final dnfc g;
    protected bmct h;

    public bmcy(dglo dgloVar, Resources resources) {
        dnfc bZ = dnfd.d.bZ();
        this.g = bZ;
        this.e = dgloVar;
        this.f = resources;
        this.h = bmct.NOT_SET;
        String str = dgloVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnfd dnfdVar = (dnfd) bZ.b;
        str.getClass();
        dnfdVar.a |= 1;
        dnfdVar.b = str;
    }

    @Override // defpackage.bmcu
    public String a() {
        throw null;
    }

    @Override // defpackage.bmcu
    public cqtd c() {
        bmct bmctVar = bmct.NOT_SET;
        int ordinal = this.h.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return cqrt.f(R.drawable.chip_false);
            }
            return cqrt.f(R.drawable.chip_not_set);
        }
        return cqrt.f(R.drawable.chip_true);
    }

    @Override // defpackage.bmcu
    public cqss d() {
        bmct bmctVar = bmct.NOT_SET;
        int ordinal = this.h.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return irg.a();
        }
        return irg.l();
    }

    @Override // defpackage.bmcu
    public cqtd e() {
        bmct bmctVar = bmct.NOT_SET;
        int ordinal = this.h.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return cqrt.g(2131232810, irg.a());
            }
            return cqrt.g(2131232491, irg.j());
        }
        return cqrt.g(2131232636, irg.a());
    }

    @Override // defpackage.bmcu
    public CharSequence f() {
        bmct bmctVar = bmct.NOT_SET;
        int ordinal = this.h.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return this.f.getString(R.string.EDIT_SCALABLE_ATTRIBUTES_CHIP_LABEL_UNAVAILABLE, a());
            }
            return this.f.getString(R.string.EDIT_SCALABLE_ATTRIBUTES_CHIP_LABEL_UNKNOWN, a());
        }
        return this.f.getString(R.string.EDIT_SCALABLE_ATTRIBUTES_CHIP_LABEL_AVAILABLE, a());
    }
}
