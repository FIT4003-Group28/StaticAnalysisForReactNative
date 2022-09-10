package defpackage;

import android.content.Context;
import android.net.Uri;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ctlf  reason: default package */
/* loaded from: classes5.dex */
public final class ctlf extends apl {
    public final dbrn a;
    public final Uri i;
    final Uri j;
    final String[] k;
    final String l;
    final String[] m;
    final String n;
    final String o;
    public boolean p;
    final /* synthetic */ ctlg q;
    private final ctle r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctlf(ctlg ctlgVar, Context context, dbrn dbrnVar, Uri uri) {
        super(context);
        this.q = ctlgVar;
        this.p = false;
        this.a = dbrnVar;
        this.i = uri;
        dcdc<String> b = ctlgVar.b.b();
        dcdc<String> d = ctlgVar.b.d();
        this.j = ctlgVar.b.a();
        String[] strArr = null;
        this.k = b == null ? null : (String[]) b.toArray(new String[b.size()]);
        this.l = ctlgVar.b.c();
        this.m = d != null ? (String[]) d.toArray(new String[d.size()]) : strArr;
        this.n = ctlgVar.b.e();
        this.o = ctlg.e(ctlgVar.b.g(), ctlgVar.b.f());
        ctle ctleVar = new ctle(this);
        this.r = ctleVar;
        ctlq.a().b(uri, ctleVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.apl
    public final void a() {
        if (this.p) {
            return;
        }
        this.p = true;
        new ctld(this).executeOnExecutor(this.q.a, new Void[0]);
    }

    @Override // defpackage.apl
    protected final void i() {
        boolean z = this.f;
        this.f = false;
        this.g |= z;
        if (z || !this.q.h().a()) {
            a();
        }
    }
}
