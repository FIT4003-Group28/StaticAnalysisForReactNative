package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bgdn  reason: default package */
/* loaded from: classes3.dex */
public final class bgdn extends cqiw<bnif> {
    public static final /* synthetic */ int a = 0;
    private final cqss b;

    public bgdn() {
        this(irg.J());
    }

    public static <T extends cqkp> cqmj<T> e(cqlc<T, Boolean> cqlcVar, cqlc<T, View.OnClickListener> cqlcVar2, cqlc<T, cqtd> cqlcVar3, cqlc<T, CharSequence> cqlcVar4, final cqlc<T, cqss> cqlcVar5, cqlc<T, cjtd> cqlcVar6) {
        return grc.e(cqlcVar, cqlcVar2, cqlcVar3, cqlcVar4, irn.m(), new cqlc(cqlcVar5) { // from class: bgdm
            private final cqlc a;

            {
                this.a = cqlcVar5;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar7 = this.a;
                int i = bgdn.a;
                return (cqss) ((cqlb) cqlcVar7).a;
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }, cqlcVar6, new cqmp[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bnif> a() {
        return e(bgdh.a, acly.a(bgdi.a), bgdj.a, bgdk.a, cqkz.a(this.b), bgdl.a);
    }

    public bgdn(cqss cqssVar) {
        super(cqssVar);
        this.b = cqssVar;
    }
}
