package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: bfuc  reason: default package */
/* loaded from: classes3.dex */
public class bfuc implements bftz, bega {
    private final gga a;
    private final bwqv b;
    @dzsi
    private List<dqws> c;
    @dzsi
    private bfub d;
    private boolean e;
    @dzsi
    private bwrs<ilo> f;

    public bfuc(gga ggaVar, bwqv bwqvVar) {
        this.a = ggaVar;
        this.b = bwqvVar;
    }

    private final void d() {
        this.f = null;
        this.c = null;
        this.d = null;
        this.e = false;
    }

    @Override // defpackage.bftz
    @dzsi
    public bfub a() {
        return this.d;
    }

    @Override // defpackage.bftz
    public Boolean b() {
        boolean z = false;
        if (w().booleanValue() && this.e) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bftz
    public cqkl c() {
        gga ggaVar = this.a;
        bwqv bwqvVar = this.b;
        bwrs<ilo> bwrsVar = this.f;
        bftj bftjVar = new bftj();
        bftjVar.B(bftj.w(bwqvVar, bwrsVar));
        ggaVar.C(bftjVar, gfu.ACTIVITY_FRAGMENT, new gfs[0]);
        return cqkl.a;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        ilo c = bwrsVar.c();
        if (c == null || !c.bV()) {
            d();
            return;
        }
        this.f = bwrsVar;
        List<dqws> bU = c.bU();
        ArrayList arrayList = new ArrayList();
        Iterator<dqws> it = bU.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            dqws next = it.next();
            int i = next.a;
            if ((i & 4) != 0 && (i & 2) != 0 && (i & 1) != 0 && next.c) {
                if (arrayList.size() >= 4) {
                    this.e = true;
                    break;
                }
                arrayList.add(next);
            }
        }
        this.c = arrayList;
        this.d = new bfue(this.c);
    }

    @Override // defpackage.bega
    public void u() {
        d();
    }

    @Override // defpackage.bega
    public Boolean w() {
        List<dqws> list;
        bfub bfubVar;
        boolean z = false;
        if (this.f != null && (list = this.c) != null && !list.isEmpty() && (bfubVar = this.d) != null && !bfubVar.a().isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
