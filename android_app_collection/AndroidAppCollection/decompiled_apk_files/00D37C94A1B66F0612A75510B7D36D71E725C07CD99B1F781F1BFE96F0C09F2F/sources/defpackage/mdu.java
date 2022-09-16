package defpackage;

import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import java.util.List;
/* compiled from: PG */
/* renamed from: mdu  reason: default package */
/* loaded from: classes3.dex */
public final class mdu {
    private final fud a;
    private final eo b;
    private final azqb c;
    private final akdh d;

    public mdu(fud fudVar, dt dtVar, azqb azqbVar, akdh akdhVar) {
        this.a = fudVar;
        this.b = dtVar.getSupportFragmentManager();
        this.c = azqbVar;
        this.d = akdhVar;
    }

    public final boolean a() {
        if (!eog.aV((aacz) this.c.get())) {
            return false;
        }
        BottomUiContainer a = this.a.a();
        if (a != null && a.getChildCount() > 0) {
            return true;
        }
        List m = this.b.m();
        if (!m.isEmpty()) {
            int size = m.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                dp dpVar = (dp) m.get(size);
                if (!dpVar.G) {
                    if (dpVar instanceof dh) {
                        return true;
                    }
                }
            }
        }
        return this.d.a;
    }
}
