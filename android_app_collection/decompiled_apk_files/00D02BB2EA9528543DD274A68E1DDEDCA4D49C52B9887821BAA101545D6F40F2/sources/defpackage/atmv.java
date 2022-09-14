package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
/* compiled from: PG */
/* renamed from: atmv  reason: default package */
/* loaded from: classes2.dex */
public class atmv implements zcr {
    public final btrm a;
    @dzsi
    CharSequence b;
    @dzsi
    public amvh[] c;
    private final Context d;
    private final Resources e;
    private final cqat f;
    private final bvsx g;
    private final bvsw h;
    private dpej i;
    private dcdc<zfq> j;
    private final zfc k = new atmu(this);

    public atmv(Context context, btrm btrmVar, cqat cqatVar, Resources resources, bvsx bvsxVar, bvsw bvswVar) {
        dbsk.s(context);
        this.d = context;
        dbsk.s(btrmVar);
        this.a = btrmVar;
        dbsk.s(resources);
        this.e = resources;
        dbsk.s(cqatVar);
        this.f = cqatVar;
        dbsk.s(bvsxVar);
        this.g = bvsxVar;
        dbsk.s(bvswVar);
        this.h = bvswVar;
        this.i = dpej.DELAY_NODATA;
        this.j = dcdc.e();
    }

    @Override // defpackage.zcr
    public dcdc<zfq> a() {
        return this.j;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(defpackage.atlq r28) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atmv.b(atlq):void");
    }

    @dzsi
    public Spanned c() {
        if (this.j.size() >= 2) {
            return this.j.get(1).a();
        }
        return null;
    }

    @dzsi
    public String d() {
        if (this.j.size() >= 2) {
            return this.j.get(1).e();
        }
        return null;
    }

    public dpej e() {
        return this.i;
    }

    @dzsi
    public CharSequence f() {
        return this.b;
    }
}
