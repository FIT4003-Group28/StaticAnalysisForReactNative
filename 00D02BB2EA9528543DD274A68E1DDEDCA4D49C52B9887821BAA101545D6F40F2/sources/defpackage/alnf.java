package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: alnf  reason: default package */
/* loaded from: classes2.dex */
public final class alnf extends alrg implements akvp {
    public final boolean a;
    public final akra b;

    public alnf(aktp aktpVar, int i, amxg amxgVar, boolean z, akra akraVar) {
        super(aktpVar, i, amxgVar);
        this.a = z;
        this.b = new akra(akraVar);
    }

    @Override // defpackage.alrg, defpackage.akvp
    /* renamed from: c */
    public final aktp a() {
        return (aktp) this.c;
    }

    @Override // defpackage.alrg
    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            alnf alnfVar = (alnf) obj;
            if (a().equals(alnfVar.a()) && this.d == alnfVar.d && this.e.equals(alnfVar.e) && this.a == alnfVar.a && this.b.equals(alnfVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.alrg
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), Boolean.valueOf(this.a), this.b});
    }
}
