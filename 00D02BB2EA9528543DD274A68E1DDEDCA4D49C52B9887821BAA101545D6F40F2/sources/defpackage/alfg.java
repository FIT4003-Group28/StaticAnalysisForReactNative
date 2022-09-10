package defpackage;
/* compiled from: PG */
/* renamed from: alfg  reason: default package */
/* loaded from: classes2.dex */
public final class alfg extends algb {
    public alfg(akrk akrkVar) {
        super(akrkVar);
    }

    public static dbsl<dmpn> a(final dcep<Long> dcepVar) {
        return new dbsl(dcepVar) { // from class: alff
            private final dcep a;

            {
                this.a = dcepVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                dcep dcepVar2 = this.a;
                dmpn dmpnVar = (dmpn) obj;
                if (akxf.e(dmpnVar).longValue() != 0) {
                    return dcepVar2.contains(akxf.e(dmpnVar));
                }
                return false;
            }
        };
    }
}
