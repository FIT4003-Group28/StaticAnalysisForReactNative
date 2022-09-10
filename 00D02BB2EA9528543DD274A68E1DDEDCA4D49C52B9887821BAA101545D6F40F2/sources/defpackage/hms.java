package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: hms  reason: default package */
/* loaded from: classes.dex */
public final class hms extends cqiw<jbv> {
    public final cqut a;
    public final cqut b;

    public hms() {
        this(ibm.x(), irg.q(), irg.c(), irg.e(), cqrp.d(dcyn.a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<jbv> a() {
        return cqgr.gg(cqgr.aI(hmm.a), cqgr.Z(R.style.Widget_AppCompat_ProgressBar_Horizontal), iue.c(hmn.a), cqgr.bs(hmo.a), cqgr.cd(-1), cqgr.ec(new cqlc(this) { // from class: hmp
            private final hms a;

            {
                this.a = this;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                hms hmsVar = this.a;
                return ((jbv) cqkpVar).l().booleanValue() ? hmsVar.b : hmsVar.a;
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.ea(hmq.a), cqgr.cw(hmr.a));
    }

    public hms(cqss cqssVar, cqss cqssVar2, cqss cqssVar3, cqss cqssVar4, cqrp cqrpVar) {
        super(cqssVar, cqssVar2, cqssVar3, cqssVar4);
        this.a = new cqut(cqssVar2, cqssVar, cqrpVar);
        this.b = new cqut(cqssVar4, cqssVar3, cqrpVar);
    }
}
