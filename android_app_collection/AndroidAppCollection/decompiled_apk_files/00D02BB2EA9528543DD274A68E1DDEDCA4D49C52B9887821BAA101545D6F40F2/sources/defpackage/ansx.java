package defpackage;

import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: ansx  reason: default package */
/* loaded from: classes2.dex */
public final class ansx implements cqkv {
    final answ a;

    public ansx(answ answVar) {
        this.a = answVar;
    }

    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof ansv) {
            ansv ansvVar = ansv.a;
            if (((ansv) cqkuVar).ordinal() == 0 && (view instanceof Toolbar) && (obj instanceof List)) {
                List list = (List) obj;
                ansu ansuVar = this.a.a;
                Menu f = ((Toolbar) view).f();
                if (f.size() != list.size()) {
                    f.clear();
                    for (int i = 0; i < list.size(); i++) {
                        f.add("");
                    }
                }
                for (int i2 = 0; i2 < list.size(); i2++) {
                    MenuItem item = f.getItem(i2);
                    jho jhoVar = (jho) list.get(i2);
                    cqtd cqtdVar = jhoVar.b;
                    item.setTitle(jhoVar.a(ansuVar.a)).setEnabled(jhoVar.g).setOnMenuItemClickListener(new anst(ansuVar, jhoVar)).setShowAsAction(jhoVar.e().intValue());
                    if (cqtdVar != null) {
                        item.setIcon(cqtdVar.a(ansuVar.a));
                    } else {
                        item.setIcon(0);
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cqkv
    public final boolean b(cqku cqkuVar, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        return false;
    }
}
