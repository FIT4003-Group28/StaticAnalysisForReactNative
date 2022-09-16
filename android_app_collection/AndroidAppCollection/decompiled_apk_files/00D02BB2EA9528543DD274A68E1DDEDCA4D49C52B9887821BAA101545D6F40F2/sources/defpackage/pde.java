package defpackage;

import android.app.Application;
import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: pde  reason: default package */
/* loaded from: classes7.dex */
final class pde extends ckqk {
    final /* synthetic */ deig a;
    final /* synthetic */ augc b;
    final /* synthetic */ Application c;

    public pde(deig deigVar, augc augcVar, Application application) {
        this.a = deigVar;
        this.b = augcVar;
        this.c = application;
    }

    @Override // defpackage.ckqk
    public final void a(Bitmap bitmap) {
        deig deigVar = this.a;
        augc augcVar = this.b;
        this.c.getResources();
        int i = pdf.a;
        augcVar.m = bitmap;
        deigVar.j(augcVar.a());
    }

    @Override // defpackage.ckqk
    public final void b() {
        this.a.j(this.b.a());
    }
}
