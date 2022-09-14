package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: abel  reason: default package */
/* loaded from: classes2.dex */
public class abel implements abdw {
    private final CharSequence a;
    private final dcdc<abdr> b;

    public abel(dqpw dqpwVar, final abcy abcyVar) {
        this.a = dqpwVar.a;
        this.b = dcbg.b(dqpwVar.c).s(new dbrn(abcyVar) { // from class: abek
            private final abcy a;

            {
                this.a = abcyVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return new abee((dqps) obj, this.a);
            }
        }).z();
    }

    @Override // defpackage.abdw
    public CharSequence a() {
        return this.a;
    }

    @Override // defpackage.abdw
    public List<abdr> b() {
        return this.b;
    }
}
