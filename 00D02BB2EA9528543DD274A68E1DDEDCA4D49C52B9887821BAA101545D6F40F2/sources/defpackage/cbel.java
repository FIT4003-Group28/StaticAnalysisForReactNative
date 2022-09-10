package defpackage;

import android.app.AlertDialog;
import android.graphics.drawable.ColorDrawable;
import com.google.android.apps.maps.R;
import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: cbel  reason: default package */
/* loaded from: classes4.dex */
final class cbel implements btzi<dijr, dijt> {
    final /* synthetic */ cbep a;

    public cbel(cbep cbepVar) {
        this.a = cbepVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dijr> btzrVar, btzy btzyVar) {
        this.a.k = null;
        cbep cbepVar = this.a;
        int a = dijq.a(btzrVar.a.b);
        if (a == 0) {
            a = 1;
        }
        if (btzyVar != btzy.d) {
            cbepVar.a();
            int i = a != 2 ? R.string.EVENT_EDIT_FAILURE_ERROR : R.string.EVENT_CREATION_FAILURE_NETWORK_ERROR;
            cztz cztzVar = cbepVar.f;
            cztq a2 = cztt.a(cztzVar);
            a2.c = cbepVar.d.getString(i);
            a2.d(cztr.SHORT);
            cztzVar.a(a2.b());
        }
        cbeo cbeoVar = cbepVar.j;
        if (cbeoVar != null) {
            cbeoVar.b();
        }
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dijr> btzrVar, dijt dijtVar) {
        dijt dijtVar2 = dijtVar;
        this.a.k = null;
        cbep cbepVar = this.a;
        cbepVar.a();
        if (dijtVar2 == null) {
            cbep.a.d(Level.SEVERE).t(6755).p("KnowledgeEntityEditResponse is null");
            cbepVar.i.show();
        } else if ((dijtVar2.a & 1) == 0) {
            cbep.a.d(Level.SEVERE).t(6756).q("KnowledgeEntityEditResponse is missing the mid: %s", dijtVar2.toString());
            cbepVar.i.show();
        } else {
            gn g = cbepVar.d.g();
            dbsk.s(g);
            g.f();
            cbepVar.g.a().a(dijtVar2.b, 3);
            cqkf e = cbepVar.e.e(new cbnj());
            AlertDialog create = new AlertDialog.Builder(cbepVar.d).create();
            e.e(new cben(cbepVar, create));
            create.setView(e.c());
            create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            create.show();
            cbeo cbeoVar = cbepVar.j;
            if (cbeoVar == null) {
                return;
            }
            cbeoVar.a(dijtVar2.b);
        }
    }
}
