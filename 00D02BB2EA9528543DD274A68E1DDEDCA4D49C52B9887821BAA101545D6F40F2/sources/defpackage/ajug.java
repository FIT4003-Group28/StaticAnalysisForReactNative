package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajug  reason: default package */
/* loaded from: classes2.dex */
public class ajug implements ajxq {
    final /* synthetic */ ajuh a;
    final /* synthetic */ ResolveInfo b;
    final /* synthetic */ Context c;

    public ajug(ajuh ajuhVar, ResolveInfo resolveInfo, Context context) {
        this.a = ajuhVar;
        this.b = resolveInfo;
        this.c = context;
    }

    @Override // defpackage.ajxq
    public Boolean a() {
        return true;
    }

    @Override // defpackage.ajxq
    public cqkl b() {
        ajuh ajuhVar = this.a;
        ResolveInfo resolveInfo = this.b;
        bwfp bwfpVar = ((ajtj) ajuhVar).ai;
        dbsk.s(bwfpVar);
        synchronized (ajuhVar) {
            if (((ajtj) ajuhVar).ae != 0) {
                bvoo.h("Attempted to start a journey share while in state %d", Integer.valueOf(((ajtj) ajuhVar).ae));
            } else if (((fd) ajuhVar).D()) {
                bvoo.h("Attempted to start a SendKit journey share after onSaveInstanceState()", new Object[0]);
            } else {
                ((ajtj) ajuhVar).as = ((ajtj) ajuhVar).aL();
                Intent b = bwfpVar.b(resolveInfo);
                if (b == null) {
                    bvoo.h("Share app unresolvable.", new Object[0]);
                    ((ajtj) ajuhVar).ae = 2;
                    ((ex) ajuhVar).f();
                } else {
                    bwfpVar.c(b);
                    ((ajtj) ajuhVar).aj = b;
                    ((ajtj) ajuhVar).af = resolveInfo.loadLabel(((fd) ajuhVar).H().getPackageManager()).toString();
                    ((ajtj) ajuhVar).ae = 1;
                    ajhx ajhxVar = ((ajtj) ajuhVar).al;
                    String str = ((ajtj) ajuhVar).af;
                    dbsk.s(str);
                    ajhxVar.e(str, false);
                }
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.ajxq
    public cqsn c() {
        return cqsk.a(this.b.loadLabel(this.c.getPackageManager()));
    }

    @Override // defpackage.ajxq
    public cqtd d() {
        return new ajuf(this, new Object[]{this.b});
    }

    @Override // defpackage.ajxq
    public Boolean e() {
        return Boolean.FALSE;
    }

    @Override // defpackage.ajxq
    public Boolean f() {
        return Boolean.FALSE;
    }

    @Override // defpackage.ajxq
    public cqss g() {
        cqss J = irg.J();
        cqss E = irg.E();
        ArrayList arrayList = new ArrayList(3);
        cqsr.b(E, new int[]{-16842910}, arrayList);
        cqsr.b(J, new int[]{16842910}, arrayList);
        return cqsr.a(arrayList);
    }

    @Override // defpackage.ajxq
    public cjtd h() {
        return cjtd.a(dtxu.dn);
    }
}
