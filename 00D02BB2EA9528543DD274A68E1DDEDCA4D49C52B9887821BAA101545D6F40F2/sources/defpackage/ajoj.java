package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import com.google.android.apps.gmm.locationsharing.api.Profile;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ajoj  reason: default package */
/* loaded from: classes2.dex */
public final class ajoj {
    public final gga a;
    public final ajsm b;
    public final cjqy c;
    public final Executor d;
    private final cqkj e;
    private final ajot f;
    private final cjqq g;

    public ajoj(gga ggaVar, cqkj cqkjVar, ajot ajotVar, ajsm ajsmVar, cjqy cjqyVar, cjqq cjqqVar, Executor executor) {
        this.a = ggaVar;
        this.e = cqkjVar;
        this.f = ajotVar;
        this.b = ajsmVar;
        this.c = cjqyVar;
        this.g = cjqqVar;
        this.d = executor;
    }

    public final dehn<Boolean> a(btlu btluVar, Profile profile) {
        final deig d = deig.d();
        AlertDialog create = new AlertDialog.Builder(this.a).create();
        cqkf c = this.e.c(new ajpc(), null);
        ajot ajotVar = this.f;
        ajot.a(profile, 1);
        Resources a = ajotVar.a.a();
        ajot.a(a, 3);
        aikp a2 = ajotVar.b.a();
        ajot.a(a2, 4);
        ajot.a(ajotVar.c.a(), 5);
        c.e(new ajoi(this, new ajos(profile, a, a2), create, btluVar, profile, d));
        View c2 = c.c();
        final cjql d2 = this.g.f(c2).d(cjtd.a(dtxu.ey));
        create.setView(c2);
        create.setCancelable(true);
        create.setOnCancelListener(new DialogInterface.OnCancelListener(this, d2, d) { // from class: ajog
            private final ajoj a;
            private final cjql b;
            private final deig c;

            {
                this.a = this;
                this.b = d2;
                this.c = d;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ajoj ajojVar = this.a;
                cjql cjqlVar = this.b;
                deig deigVar = this.c;
                ajojVar.c.j(cjqlVar, cjtd.a(dtxu.eA));
                deigVar.j(false);
            }
        });
        if (create.getWindow() != null) {
            Window window = create.getWindow();
            dbsk.s(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        create.show();
        return d;
    }
}
