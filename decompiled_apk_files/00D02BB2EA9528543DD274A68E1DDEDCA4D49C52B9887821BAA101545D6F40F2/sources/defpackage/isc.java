package defpackage;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import com.google.android.apps.maps.R;
import java.lang.reflect.Field;
import java.util.List;
/* compiled from: PG */
/* renamed from: isc  reason: default package */
/* loaded from: classes6.dex */
public final class isc extends PopupMenu {
    public final Context a;
    public final cjqy b;
    public PopupMenu.OnMenuItemClickListener c;

    public isc(View view, cjqy cjqyVar) {
        super(new ContextThemeWrapper(view.getContext(), (int) R.style.GmmPopupMenuTheme), view);
        this.a = view.getContext();
        this.b = cjqyVar;
    }

    public final void a(List<jho> list) {
        MenuItem add;
        Menu menu = getMenu();
        menu.clear();
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z = false;
        for (int i = 0; i < list.size(); i++) {
            jho jhoVar = list.get(i);
            StringBuilder sb = new StringBuilder(27);
            sb.append("Element ");
            sb.append(i);
            sb.append(" is null");
            dbsk.t(jhoVar, sb.toString());
            if (jhoVar.a(this.a) != null) {
                int i2 = jhoVar.f;
                if (i2 != 0) {
                    add = menu.add(0, i2, i, jhoVar.a(this.a));
                } else {
                    add = menu.add(0, 0, i, jhoVar.a(this.a));
                }
                cqtd cqtdVar = jhoVar.b;
                if (cqtdVar != null) {
                    add.setIcon(cqrt.i(cqtdVar, irg.b()).a(this.a));
                    z = true;
                }
                if (Boolean.valueOf(jhoVar.d).booleanValue()) {
                    add.setCheckable(true);
                    try {
                        add.setChecked(jhoVar.e.call().booleanValue());
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
                add.setEnabled(jhoVar.g);
                add.setActionProvider(new isb(this, this.a, jhoVar.c, add, jhoVar));
            }
        }
        if (!z) {
            return;
        }
        try {
            Field declaredField = PopupMenu.class.getDeclaredField("mPopup");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            obj.getClass().getDeclaredMethod("setForceShowIcon", Boolean.TYPE).invoke(obj, true);
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    @Override // android.widget.PopupMenu
    public final void setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener onMenuItemClickListener) {
        this.c = onMenuItemClickListener;
    }
}
