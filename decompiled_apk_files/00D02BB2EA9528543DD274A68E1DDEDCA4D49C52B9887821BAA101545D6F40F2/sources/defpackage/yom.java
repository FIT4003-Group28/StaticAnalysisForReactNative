package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: yom  reason: default package */
/* loaded from: classes7.dex */
public class yom extends yob implements ynk {
    public final Activity d;
    public final yis e;
    private final douz f;
    private final yiw g;
    private final dcdc<yoj> h;

    public yom(Activity activity, final cqhn cqhnVar, cqhu cqhuVar, yis yisVar, douz douzVar, yiw yiwVar) {
        this.d = activity;
        this.e = yisVar;
        this.f = douzVar;
        this.g = yiwVar;
        this.h = dcbg.b(ynf.j(douzVar)).s(new dbrn(this, cqhnVar) { // from class: yok
            private final yom a;
            private final cqhn b;

            {
                this.a = this;
                this.b = cqhnVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                yom yomVar = this.a;
                yiq yiqVar = (yiq) obj;
                return new yoj(yomVar.d, this.b, yiqVar, Boolean.valueOf(!yomVar.e.a.contains(yiqVar)), yol.a);
            }
        }).z();
    }

    @Override // defpackage.ynk
    public dcdc<yoj> a() {
        return this.h;
    }

    public yis b() {
        yir bZ = yis.b.bZ();
        dcdc<yoj> dcdcVar = this.h;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            yoj yojVar = dcdcVar.get(i);
            if (!yojVar.b().booleanValue()) {
                bZ.b(yojVar.f());
            }
        }
        return bZ.bK();
    }

    @Override // defpackage.yni
    public cqkl e() {
        this.g.a(null);
        return cqkl.a;
    }

    @Override // defpackage.yni
    public cqkl f() {
        yiw yiwVar = this.g;
        yim bZ = yiv.e.bZ();
        yis b = b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        yiv yivVar = (yiv) bZ.b;
        b.getClass();
        yivVar.b = b;
        yivVar.a |= 1;
        yiwVar.a(bZ.bK());
        return cqkl.a;
    }
}
