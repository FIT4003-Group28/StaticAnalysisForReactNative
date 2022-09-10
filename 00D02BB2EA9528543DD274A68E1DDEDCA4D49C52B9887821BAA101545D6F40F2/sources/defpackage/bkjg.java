package defpackage;

import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bkjg  reason: default package */
/* loaded from: classes3.dex */
public class bkjg implements bega {
    private final List<bkje> a = new ArrayList();
    private final bkjf b;

    public bkjg(bkjf bkjfVar) {
        this.b = bkjfVar;
    }

    public List<bkje> a() {
        return this.a;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        if (iloVar == null) {
            u();
        } else if ((iloVar.h().c & ImageMetadata.LENS_APERTURE) != 0) {
            dvwx dvwxVar = iloVar.h().aI;
            if (dvwxVar == null) {
                dvwxVar = dvwx.b;
            }
            for (dvww dvwwVar : dvwxVar.a) {
                if (dvwwVar.b.size() > 0) {
                    bkjf bkjfVar = this.b;
                    bkjf.a(dvwwVar, 1);
                    gga a = bkjfVar.a.a();
                    bkjf.a(a, 2);
                    dzsj<begg> dzsjVar = bkjfVar.b;
                    dzsj<brba> dzsjVar2 = bkjfVar.c;
                    bnjv a2 = bkjfVar.d.a();
                    bkjf.a(a2, 5);
                    this.a.add(new bkje(dvwwVar, a, dzsjVar, dzsjVar2, a2));
                }
            }
        }
    }

    @Override // defpackage.bega
    public void u() {
        this.a.clear();
    }

    @Override // defpackage.bega
    public Boolean w() {
        return Boolean.valueOf(!a().isEmpty());
    }
}
