package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bqwc  reason: default package */
/* loaded from: classes4.dex */
public class bqwc extends bquc<Integer> implements bqsy {
    public bqwc(btvo btvoVar) {
        super(0);
        if (btvoVar.getUgcParameters().bk() != 0) {
            return;
        }
        throw null;
    }

    @Override // defpackage.jbc
    public Float a() {
        return Float.valueOf(k().intValue());
    }

    @Override // defpackage.jbc
    public jez b() {
        return new jez(this) { // from class: bqwb
            private final bqwc a;

            {
                this.a = this;
            }

            @Override // defpackage.jez
            public final void a(cjqm cjqmVar, float f) {
                this.a.o(Integer.valueOf((int) f));
            }
        };
    }

    @Override // defpackage.jbc
    public cjtd c() {
        return cjtd.a(dtyf.D);
    }

    @Override // defpackage.bquc
    protected final dbsg<Integer> h(docg docgVar) {
        return (docgVar.a & 512) != 0 ? dbsg.i(Integer.valueOf(docgVar.q)) : dbpy.a;
    }
}
