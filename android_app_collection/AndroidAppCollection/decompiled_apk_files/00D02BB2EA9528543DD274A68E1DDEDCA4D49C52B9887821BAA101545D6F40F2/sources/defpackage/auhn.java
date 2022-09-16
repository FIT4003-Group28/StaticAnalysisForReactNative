package defpackage;
/* compiled from: PG */
/* renamed from: auhn  reason: default package */
/* loaded from: classes2.dex */
public final class auhn {
    private final auui a;
    private final btwr b;
    private final cjqy c;

    public auhn(auui auuiVar, btwr btwrVar, cjqy cjqyVar) {
        this.a = auuiVar;
        this.b = btwrVar;
        this.c = cjqyVar;
    }

    public final boolean a(@dzsi btlu btluVar, int i) {
        dkpz dkpzVar = this.b.b(btluVar).getNotificationsParameters().s;
        if (dkpzVar == null) {
            dkpzVar = dkpz.b;
        }
        return dcbg.b(dkpzVar.a).s(auhm.a).l(Integer.valueOf(i));
    }

    public final cjsa b(@dzsi String str, int i, @dzsi String str2, @dzsi String str3, boolean z) {
        cjsa c = c(str, i);
        return (!z || c == null) ? new cjsd(this.c.r(new cjsv(dddv.h)), str3, str2) : c;
    }

    @dzsi
    public final cjsa c(@dzsi String str, int i) {
        auug d = this.a.d(auuh.c(str, i));
        if (d == null || d.b() == null) {
            return null;
        }
        return d.b().m;
    }
}
