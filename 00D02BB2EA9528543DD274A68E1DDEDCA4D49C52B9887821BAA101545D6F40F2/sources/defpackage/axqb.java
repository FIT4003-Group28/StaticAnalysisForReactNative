package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: axqb  reason: default package */
/* loaded from: classes3.dex */
final class axqb implements crzp<axoj> {
    final /* synthetic */ axqe a;

    public axqb(axqe axqeVar) {
        this.a = axqeVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<axoj> crzmVar) {
        String string;
        axoj l = crzmVar.l();
        dbsk.s(l);
        axqe axqeVar = this.a;
        axqeVar.d = l.b;
        axqeVar.e = l.a;
        axqeVar.c.a(axqeVar.d);
        axqe axqeVar2 = this.a;
        if (!axqeVar2.e && axqeVar2.f) {
            axqeVar2.f = false;
            Iterator<View> it = cqkx.n(axqeVar2).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                View a = cqhu.a(it.next(), axnd.a);
                if (a != null) {
                    cpv cpvVar = axqeVar2.b;
                    dfqe dfqeVar = dfqe.UNDEFINED_STATE;
                    dfqe b = dfqe.b(axqeVar2.d.b);
                    if (b == null) {
                        b = dfqe.UNDEFINED_STATE;
                    }
                    int ordinal = b.ordinal();
                    if (ordinal == 2) {
                        string = axqeVar2.a.getString(R.string.PEOPLE_FOLLOWING_FOLLOW_BUTTON_REQUESTED_STATE_TITLE);
                    } else if (ordinal == 3 || ordinal == 4) {
                        string = axqeVar2.a.getString(R.string.PEOPLE_FOLLOWING_FOLLOW_BUTTON_FOLLOWING_STATE_TITLE);
                    } else {
                        string = axqeVar2.a.getString(R.string.PEOPLE_FOLLOWING_FOLLOW_BUTTON_NOT_FOLLOW_STATE_TITLE);
                    }
                    cpvVar.b(a, string);
                }
            }
        }
        cqkx.p(this.a);
    }
}
