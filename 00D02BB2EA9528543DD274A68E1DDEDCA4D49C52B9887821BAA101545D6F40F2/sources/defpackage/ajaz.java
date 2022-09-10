package defpackage;

import android.content.Context;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajaz  reason: default package */
/* loaded from: classes2.dex */
public class ajaz implements ajxq {
    final /* synthetic */ ajvd a;
    final /* synthetic */ ResolveInfo b;
    final /* synthetic */ Context c;
    final /* synthetic */ ddho d;

    public ajaz(ajvd ajvdVar, ResolveInfo resolveInfo, Context context, ddho ddhoVar) {
        this.a = ajvdVar;
        this.b = resolveInfo;
        this.c = context;
        this.d = ddhoVar;
    }

    @Override // defpackage.ajxq
    public Boolean a() {
        return Boolean.TRUE;
    }

    @Override // defpackage.ajxq
    public cqkl b() {
        this.a.g(this.b);
        return cqkl.a;
    }

    @Override // defpackage.ajxq
    public cqsn c() {
        return cqsk.a(this.b.loadLabel(this.c.getPackageManager()));
    }

    @Override // defpackage.ajxq
    public cqtd d() {
        return new ajay(this, new Object[]{this.b});
    }

    @Override // defpackage.ajxq
    public Boolean e() {
        return Boolean.TRUE;
    }

    @Override // defpackage.ajxq
    public Boolean f() {
        return Boolean.FALSE;
    }

    @Override // defpackage.ajxq
    public cqss g() {
        ArrayList arrayList = new ArrayList(3);
        cqsr.b(irg.E(), new int[]{-16842910}, arrayList);
        cqsr.b(irg.J(), new int[]{16842910}, arrayList);
        return cqsr.a(arrayList);
    }

    @Override // defpackage.ajxq
    public cjtd h() {
        cjta b = cjtd.b();
        b.d = this.d;
        ddjk bZ = ddjl.c.bZ();
        ResolveInfo resolveInfo = this.b;
        dbsk.s(resolveInfo);
        String str = resolveInfo.activityInfo.name;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddjl ddjlVar = (ddjl) bZ.b;
        str.getClass();
        ddjlVar.a |= 1;
        ddjlVar.b = str;
        b.p(bZ.bK());
        return b.a();
    }
}
