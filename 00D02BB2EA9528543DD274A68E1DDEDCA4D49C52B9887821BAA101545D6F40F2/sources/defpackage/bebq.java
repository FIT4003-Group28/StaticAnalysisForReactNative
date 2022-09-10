package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bebq  reason: default package */
/* loaded from: classes3.dex */
public class bebq implements bdzv {
    private final gga a;
    private cjtd b;
    private final bwqv c;
    private final ilo d;
    private final akfa e;

    public bebq(ilo iloVar, gga ggaVar, bwqv bwqvVar, akfa akfaVar) {
        this.a = ggaVar;
        this.c = bwqvVar;
        this.d = iloVar;
        this.e = akfaVar;
        cjta c = cjtd.c(iloVar.bZ());
        c.d = dtxy.iJ;
        this.b = c.a();
    }

    @Override // defpackage.bdzv
    public CharSequence a() {
        return this.a.getString(R.string.BUSINESS_MESSAGING_QUOTE_ENTRYPOINT_LABEL);
    }

    @Override // defpackage.bdzv
    public cjtd b() {
        cjtd cjtdVar = this.b;
        if (cjtdVar != null) {
            return cjtdVar;
        }
        cjta c = cjtd.c(this.d.bZ());
        c.d = dtxy.iJ;
        cjtd a = c.a();
        this.b = a;
        return a;
    }

    @Override // defpackage.bdzv
    public cqkl c() {
        if (!this.e.j().l()) {
            this.a.D(akef.g(this.c, new bebp(this.d)));
        } else {
            bkfq aR = bkfq.aR(this.d);
            if (this.a.K() instanceof befx) {
                ges gesVar = (ges) this.a.K();
                dbsk.s(gesVar);
                gesVar.aZ(aR);
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.bdzv
    public Boolean d() {
        return true;
    }

    @Override // defpackage.bdzv
    public CharSequence e() {
        return this.a.getString(R.string.BUSINESS_MESSAGING_QUOTE_ENTRYPOINT_DESCRIPTION);
    }

    @Override // defpackage.bdzv
    public jic f() {
        return null;
    }
}
