package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: atoi  reason: default package */
/* loaded from: classes2.dex */
public abstract class atoi {
    private final atom a;
    private final atvp b;
    private final atwl c;
    @dzsi
    private final attz d;

    public atoi(atom atomVar, atvp atvpVar, atwl atwlVar, @dzsi attz attzVar) {
        this.a = atomVar;
        this.b = atvpVar;
        this.c = atwlVar;
        this.d = attzVar;
    }

    @dzsi
    protected abstract atxz b(crqw crqwVar);

    @dzsi
    public final atxz c(crqw crqwVar, @dzsi atxu atxuVar) {
        atxz a = this.a.a(crqwVar, atxuVar, false);
        if (a != null) {
            return a;
        }
        if (crqwVar instanceof crrd) {
            crrd crrdVar = (crrd) crqwVar;
            if (crrdVar.d) {
                atwl atwlVar = this.c;
                btrm a2 = atwlVar.a.a();
                atwl.a(a2, 1);
                cref a3 = atwlVar.b.a();
                atwl.a(a3, 2);
                Context a4 = atwlVar.c.a();
                atwl.a(a4, 3);
                cqat a5 = atwlVar.d.a();
                atwl.a(a5, 4);
                cjqy a6 = atwlVar.e.a();
                atwl.a(a6, 5);
                cjqq a7 = atwlVar.f.a();
                atwl.a(a7, 6);
                dehq a8 = atwlVar.g.a();
                atwl.a(a8, 7);
                Executor a9 = atwlVar.h.a();
                atwl.a(a9, 8);
                atsr a10 = atwlVar.i.a();
                atwl.a(a10, 9);
                Boolean a11 = atwlVar.j.a();
                atwl.a(a11, 10);
                boolean booleanValue = a11.booleanValue();
                cqhn a12 = atwlVar.k.a();
                atwl.a(a12, 11);
                crfl a13 = atwlVar.l.a();
                btvo a14 = atwlVar.m.a();
                atwl.a(a14, 13);
                bvjj a15 = atwlVar.n.a();
                atwl.a(a15, 14);
                atwl.a(crrdVar, 15);
                return new atwk(a2, a3, a4, a5, a6, a7, a8, a9, a10, booleanValue, a12, a13, a14, a15, crrdVar);
            }
            atvp atvpVar = this.b;
            btrm a16 = atvpVar.a.a();
            atvp.a(a16, 1);
            cref a17 = atvpVar.b.a();
            atvp.a(a17, 2);
            Context a18 = atvpVar.c.a();
            atvp.a(a18, 3);
            cqat a19 = atvpVar.d.a();
            atvp.a(a19, 4);
            cjqy a20 = atvpVar.e.a();
            atvp.a(a20, 5);
            cjqq a21 = atvpVar.f.a();
            atvp.a(a21, 6);
            dehq a22 = atvpVar.g.a();
            atvp.a(a22, 7);
            Executor a23 = atvpVar.h.a();
            atvp.a(a23, 8);
            atsr a24 = atvpVar.i.a();
            atvp.a(a24, 9);
            amfi a25 = atvpVar.j.a();
            atvp.a(a25, 10);
            bvsl a26 = atvpVar.k.a();
            atvp.a(a26, 11);
            Boolean a27 = atvpVar.l.a();
            atvp.a(a27, 12);
            boolean booleanValue2 = a27.booleanValue();
            atvp.a(atvpVar.m.a(), 13);
            btvo a28 = atvpVar.n.a();
            atvp.a(a28, 14);
            atvp.a(crrdVar, 15);
            return new atvo(a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, booleanValue2, a28, crrdVar);
        } else if (!(crqwVar instanceof crqh)) {
            return b(crqwVar);
        } else {
            attz attzVar = this.d;
            if (attzVar == null) {
                return null;
            }
            crqh crqhVar = (crqh) crqwVar;
            Context context = (Context) ((dxjd) attzVar.a).a;
            attz.a(context, 1);
            vtn a29 = attzVar.b.a();
            attz.a(a29, 2);
            btrm a30 = attzVar.c.a();
            attz.a(a30, 3);
            btvo a31 = attzVar.d.a();
            attz.a(a31, 4);
            cref a32 = attzVar.e.a();
            attz.a(a32, 5);
            cqat a33 = attzVar.f.a();
            attz.a(a33, 6);
            cjqy a34 = attzVar.g.a();
            attz.a(a34, 7);
            cjqq a35 = attzVar.h.a();
            attz.a(a35, 8);
            dehq a36 = attzVar.i.a();
            attz.a(a36, 9);
            Executor a37 = attzVar.j.a();
            attz.a(a37, 10);
            atsr a38 = attzVar.k.a();
            attz.a(a38, 11);
            Boolean a39 = attzVar.l.a();
            attz.a(a39, 12);
            boolean booleanValue3 = a39.booleanValue();
            cqhn a40 = attzVar.m.a();
            attz.a(a40, 13);
            attz.a(crqhVar, 14);
            return new atty(context, a29, a30, a31, a32, a33, a34, a35, a36, a37, a38, booleanValue3, a40, crqhVar);
        }
    }
}
