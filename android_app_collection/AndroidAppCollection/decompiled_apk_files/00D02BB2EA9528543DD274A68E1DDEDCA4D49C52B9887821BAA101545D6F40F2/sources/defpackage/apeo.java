package defpackage;

import android.os.Bundle;
import java.util.BitSet;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: apeo  reason: default package */
/* loaded from: classes2.dex */
public class apeo implements apea {
    private final bwqv b;
    private final aphj c;
    private final gga d;
    private final bwrs<aoyg> e;
    private final bwrs<HashSet<akqi>> f;
    private final aoxr g;

    public apeo(bwqv bwqvVar, aphj aphjVar, gga ggaVar, bwrs<aoyg> bwrsVar, bwrs<HashSet<akqi>> bwrsVar2, aoxr aoxrVar) {
        this.b = bwqvVar;
        this.c = aphjVar;
        this.d = ggaVar;
        this.e = bwrsVar;
        this.f = bwrsVar2;
        this.g = aoxrVar;
    }

    @Override // defpackage.apea
    public cqkl a() {
        gga ggaVar = this.d;
        bwqv bwqvVar = this.b;
        bwrs<aoyg> bwrsVar = this.e;
        bwrs<HashSet<akqi>> bwrsVar2 = this.f;
        aoxr aoxrVar = this.g;
        apav apavVar = new apav();
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "current_visited_places_list_ref", bwrsVar);
        bwqvVar.c(bundle, "removed_places_set_ref", bwrsVar2);
        bundle.putSerializable("currently_sorted_by", aoxrVar);
        aoyg c = bwrsVar.c();
        dbsk.s(c);
        bundle.putSerializable("selected", new BitSet(c.c().size()));
        apavVar.B(bundle);
        ggaVar.D(apavVar);
        return cqkl.a;
    }

    @Override // defpackage.aphw
    public CharSequence c() {
        aoyg c = this.e.c();
        dbsk.s(c);
        dcdc<aoxt> c2 = c.c();
        int size = c2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            HashSet<akqi> c3 = this.f.c();
            dbsk.s(c3);
            if (!c3.contains(c2.get(i2).a().ai())) {
                i++;
            }
        }
        return this.c.b(i, 3);
    }

    @Override // defpackage.aphw
    public Boolean d() {
        return false;
    }

    @Override // defpackage.aphw
    @dzsi
    public CharSequence e() {
        return null;
    }

    @Override // defpackage.aphw
    @dzsi
    public CharSequence f() {
        return null;
    }

    @Override // defpackage.aphw
    public cqkl g() {
        return cqkl.a;
    }

    @Override // defpackage.aphw
    public Boolean h() {
        return true;
    }
}
