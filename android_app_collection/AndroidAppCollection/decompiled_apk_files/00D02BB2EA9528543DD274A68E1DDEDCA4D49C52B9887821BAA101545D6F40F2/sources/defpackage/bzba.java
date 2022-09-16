package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bzba  reason: default package */
/* loaded from: classes4.dex */
public class bzba implements bzaz {
    private final gga a;
    private final Resources b;
    private final dspd c;
    private final String d;

    public bzba(gga ggaVar, Resources resources, dspd dspdVar, String str) {
        this.a = ggaVar;
        this.b = resources;
        this.c = dspdVar;
        this.d = str;
    }

    @Override // defpackage.bzaz
    public zvb a() {
        dspd dspdVar = this.c;
        try {
            dsqa b = dsqa.b();
            dpdy dpdyVar = dpdy.n;
            try {
                dspj s = dspdVar.s();
                dsqw dsqwVar = (dsqw) dpdyVar.cu(4);
                try {
                    dstc b2 = dsst.a.b(dsqwVar);
                    b2.f(dsqwVar, dspk.n(s), b);
                    b2.j(dsqwVar);
                    try {
                        s.b(0);
                        dsqw.cv(dsqwVar);
                        return new zvb(alcf.w((dpdy) dsqwVar, false));
                    } catch (dsrm e) {
                        throw e;
                    }
                } catch (IOException e2) {
                    if (!(e2.getCause() instanceof dsrm)) {
                        throw new dsrm(e2.getMessage());
                    }
                    throw ((dsrm) e2.getCause());
                } catch (RuntimeException e3) {
                    if (e3.getCause() instanceof dsrm) {
                        throw ((dsrm) e3.getCause());
                    }
                    throw e3;
                }
            } catch (dsrm e4) {
                throw e4;
            }
        } catch (dsrm e5) {
            throw new IllegalStateException("Could not parse header content", e5);
        }
    }

    @Override // defpackage.bzaz
    public String b() {
        return this.b.getString(R.string.TRANSIT_GUIDANCE_QUESTIONS_CROWDEDNESS_HEADER, this.d);
    }

    @Override // defpackage.bzaz
    public cqkl c() {
        this.a.g().e();
        return cqkl.a;
    }
}
