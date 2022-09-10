package defpackage;

import android.content.Context;
import android.content.pm.ResolveInfo;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: atxl  reason: default package */
/* loaded from: classes2.dex */
public class atxl implements ajxq {
    final /* synthetic */ ahvq a;
    final /* synthetic */ ResolveInfo b;
    final /* synthetic */ Context c;
    final /* synthetic */ aufc d;
    final /* synthetic */ atxm e;

    public atxl(atxm atxmVar, ahvq ahvqVar, ResolveInfo resolveInfo, Context context, aufc aufcVar) {
        this.e = atxmVar;
        this.a = ahvqVar;
        this.b = resolveInfo;
        this.c = context;
        this.d = aufcVar;
    }

    @Override // defpackage.ajxq
    public Boolean a() {
        return true;
    }

    @Override // defpackage.ajxq
    public cqkl b() {
        this.a.h(this.b);
        this.e.p();
        return cqkl.a;
    }

    @Override // defpackage.ajxq
    public cqsn c() {
        return cqsk.a(this.b.loadLabel(this.c.getPackageManager()));
    }

    @Override // defpackage.ajxq
    public cqtd d() {
        return new atxk(this, new Object[]{this.b});
    }

    @Override // defpackage.ajxq
    public Boolean e() {
        return Boolean.TRUE;
    }

    @Override // defpackage.ajxq
    public Boolean f() {
        return Boolean.TRUE;
    }

    @Override // defpackage.ajxq
    public cqss g() {
        cqss s;
        cqss o;
        if (this.d.b()) {
            s = cqrt.c(R.color.qu_grey_400);
        } else {
            s = ire.s();
        }
        if (this.d.b()) {
            o = cqrt.c(R.color.qu_grey_500);
        } else {
            o = ire.o();
        }
        ArrayList arrayList = new ArrayList(3);
        cqsr.b(o, new int[]{-16842910}, arrayList);
        cqsr.b(s, new int[]{16842910}, arrayList);
        return cqsr.a(arrayList);
    }

    @Override // defpackage.ajxq
    public cjtd h() {
        return cjtd.a(dtxu.dV);
    }
}
