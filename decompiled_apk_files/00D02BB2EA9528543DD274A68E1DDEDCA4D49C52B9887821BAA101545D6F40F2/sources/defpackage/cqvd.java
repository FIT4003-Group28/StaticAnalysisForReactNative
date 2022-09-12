package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqvd  reason: default package */
/* loaded from: classes5.dex */
public final class cqvd extends cqtd implements cqur {
    private final cqvc[] a;

    public cqvd(cqvc[] cqvcVarArr) {
        super(cqvcVarArr);
        this.a = cqvcVarArr;
    }

    @Override // defpackage.cqsj, defpackage.cqur
    public final boolean NJ() {
        return cqvl.c(this.a);
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        cqvc[] cqvcVarArr;
        PorterDuffColorFilter porterDuffColorFilter;
        cqvb cqvbVar = new cqvb();
        for (cqvc cqvcVar : this.a) {
            Drawable a = cqvcVar.c().a(context);
            cqss d = cqvcVar.d();
            if (d != null) {
                int b = d.b(context);
                PorterDuff.Mode e = cqvcVar.e();
                dbsk.s(e);
                porterDuffColorFilter = new PorterDuffColorFilter(b, e);
            } else {
                porterDuffColorFilter = null;
            }
            cqvbVar.a(cqvcVar.a().a, a, porterDuffColorFilter);
        }
        return cqvbVar;
    }
}
