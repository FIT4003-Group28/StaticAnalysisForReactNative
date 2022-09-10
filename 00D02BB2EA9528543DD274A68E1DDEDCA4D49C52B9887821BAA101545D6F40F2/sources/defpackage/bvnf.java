package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvnf  reason: default package */
/* loaded from: classes4.dex */
public final class bvnf {
    public final alp a = alp.a();
    public final Executor b;
    public final bvnb c;
    public final gga d;
    public final dxio<awwq> e;
    public final cjqy f;
    private final cqkj g;
    private final btvo h;
    private final dxio<afha> i;
    private final cjqq j;

    public bvnf(cqkj cqkjVar, btvo btvoVar, Executor executor, bvnb bvnbVar, gga ggaVar, dxio<afha> dxioVar, dxio<awwq> dxioVar2, cjqy cjqyVar, cjqq cjqqVar) {
        this.g = cqkjVar;
        this.h = btvoVar;
        this.b = executor;
        this.c = bvnbVar;
        this.d = ggaVar;
        this.i = dxioVar;
        this.e = dxioVar2;
        this.f = cjqyVar;
        this.j = cjqqVar;
    }

    public final dehn<bvns> a(btlu btluVar, String str, String str2, String str3, ddho ddhoVar) {
        final deig d = deig.d();
        AlertDialog create = new AlertDialog.Builder(this.d, 2132018255).create();
        cqkf c = this.g.c(new bvnp(), null);
        c.e(new bvne(this, new bvmz(this.d, this.h, this.i, str3, true), str2, create, d, btluVar, str, ddhoVar));
        View c2 = c.c();
        final cjql d2 = this.j.f(c2).d(cjtd.a(dtxu.dj));
        create.setView(c2);
        create.setCancelable(true);
        create.setOnCancelListener(new DialogInterface.OnCancelListener(this, d2, d) { // from class: bvnc
            private final bvnf a;
            private final cjql b;
            private final deig c;

            {
                this.a = this;
                this.b = d2;
                this.c = d;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                bvnf bvnfVar = this.a;
                cjql cjqlVar = this.b;
                deig deigVar = this.c;
                bvnfVar.f.j(cjqlVar, cjtd.a(dtxu.dk));
                deigVar.j(bvns.BLOCK_ACTION_CANCELLED);
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
