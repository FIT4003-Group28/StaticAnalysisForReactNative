package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
/* compiled from: PG */
/* renamed from: aikb  reason: default package */
/* loaded from: classes2.dex */
public final class aikb {
    public final cqat a;
    public final ahvi b;
    public final btvo c;

    public aikb(cqat cqatVar, ahvi ahviVar, btvo btvoVar) {
        this.a = cqatVar;
        this.b = ahviVar;
        this.c = btvoVar;
    }

    public final aikc a(doep doepVar) {
        bvrj.UI_THREAD.c();
        return new aikc(PersonId.a(doepVar), doepVar, true, dcdc.e(), this.a, this.b, this.c);
    }

    public final aikc b(dcdc<dqzv> dcdcVar) {
        bvrj.UI_THREAD.c();
        dbsk.a(!dcdcVar.isEmpty());
        int i = 0;
        PersonId b = PersonId.b(dcdcVar.get(0));
        if (b != null) {
            int size = dcdcVar.size();
            while (i < size) {
                int i2 = i + 1;
                if (!b.equals(PersonId.b(dcdcVar.get(i)))) {
                    throw new IllegalStateException("Cannot create sharer with share acl for another sharer.");
                }
                i = i2;
            }
            return new aikc(b, doep.i, false, dcdcVar, this.a, this.b, this.c);
        }
        throw new IllegalStateException("Cannot create sharer with share acl with an unknown ID.");
    }
}
