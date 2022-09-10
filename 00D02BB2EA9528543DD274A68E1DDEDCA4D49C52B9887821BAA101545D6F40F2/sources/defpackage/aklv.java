package defpackage;

import android.app.Activity;
import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: aklv  reason: default package */
/* loaded from: classes2.dex */
public class aklv implements aklg {
    private final djsd a;
    private final dpwr b;
    @dzsi
    private final View.OnClickListener c;
    private cjtd d;
    @dzsi
    private final akky e;
    @dzsi
    private final jic f;
    @dzsi
    private final jic g;
    @dzsi
    private final jic h;
    @dzsi
    private final jic i;
    private final List<jbi> j;
    @dzsi
    private final aklh k;
    @dzsi
    private final ddho l;
    @dzsi
    private final cqss m;
    @dzsi
    private final cqss n;
    @dzsi
    private final cqss o;

    /* JADX WARN: Removed duplicated region for block: B:105:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0222  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public aklv(defpackage.djsd r18, defpackage.dpwr r19, @defpackage.dzsi defpackage.ddho r20, int r21, defpackage.dbsg<defpackage.aaao> r22, android.app.Activity r23, defpackage.akkz r24, defpackage.aklj r25, defpackage.eiq r26, defpackage.dxio<defpackage.afha> r27) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aklv.<init>(djsd, dpwr, ddho, int, dbsg, android.app.Activity, akkz, aklj, eiq, dxio):void");
    }

    private static cjtd q(djsd djsdVar, @dzsi ddho ddhoVar, Integer num) {
        cjta b = cjtd.b();
        b.d = ddhoVar;
        dhxu dhxuVar = djsdVar.b;
        if (dhxuVar == null) {
            dhxuVar = dhxu.s;
        }
        if ((dhxuVar.a & 1) != 0) {
            dhxu dhxuVar2 = djsdVar.b;
            if (dhxuVar2 == null) {
                dhxuVar2 = dhxu.s;
            }
            b.g(dhxuVar2.b);
        }
        b.i(num.intValue());
        return b.a();
    }

    @Override // defpackage.aklb
    public cjtd a() {
        return this.d;
    }

    @Override // defpackage.aklg
    @dzsi
    public akky b() {
        return this.e;
    }

    @Override // defpackage.aklg
    @dzsi
    public jic c() {
        return this.f;
    }

    @Override // defpackage.aklg
    @dzsi
    public jic d() {
        return this.h;
    }

    @Override // defpackage.aklg
    @dzsi
    public jic e() {
        return this.i;
    }

    @Override // defpackage.aklg
    @dzsi
    public cqss f() {
        return this.o;
    }

    @Override // defpackage.aklg
    @dzsi
    public cqss g() {
        return this.m;
    }

    @Override // defpackage.aklg
    @dzsi
    public cqss h() {
        return this.n;
    }

    @Override // defpackage.aklg
    public CharSequence i() {
        dhxu dhxuVar = this.a.b;
        if (dhxuVar == null) {
            dhxuVar = dhxu.s;
        }
        return dhxuVar.f;
    }

    @Override // defpackage.aklg
    public List<jbi> j() {
        return this.j;
    }

    @Override // defpackage.aklg
    @dzsi
    public aklh k() {
        return this.k;
    }

    @Override // defpackage.aklg
    public CharSequence l() {
        dbrz e = dbrz.e("\n");
        dhxu dhxuVar = this.a.b;
        if (dhxuVar == null) {
            dhxuVar = dhxu.s;
        }
        String str = dhxuVar.f;
        dhxu dhxuVar2 = this.a.b;
        if (dhxuVar2 == null) {
            dhxuVar2 = dhxu.s;
        }
        return e.i(str, e.g(dhxuVar2.g), new Object[0]);
    }

    @Override // defpackage.aklg
    @dzsi
    public View.OnClickListener m() {
        return this.c;
    }

    @Override // defpackage.aklg
    public void n(int i) {
        this.d = q(this.a, this.l, Integer.valueOf(i));
    }

    @Override // defpackage.aklg
    @dzsi
    public jic o() {
        return this.g;
    }

    @Override // defpackage.aklg
    public Boolean p() {
        boolean z = false;
        if (this.b == dpwr.HOMESCREEN_EXPLORE_PROMINENT && this.i != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public aklv(djsd djsdVar, dpwr dpwrVar, @dzsi ddho ddhoVar, dbsg<aaao> dbsgVar, Activity activity, akkz akkzVar, aklj akljVar, eiq eiqVar, dxio<afha> dxioVar) {
        this(djsdVar, dpwrVar, ddhoVar, -1, dbsgVar, activity, akkzVar, akljVar, eiqVar, dxioVar);
    }
}
