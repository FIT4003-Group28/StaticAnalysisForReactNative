package defpackage;

import android.view.ContextThemeWrapper;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: ansy  reason: default package */
/* loaded from: classes2.dex */
public final class ansy extends iui {
    private final answ a;

    public ansy(ff ffVar, cqhw cqhwVar, cjqy cjqyVar, dehq dehqVar, bvjj bvjjVar, answ answVar, ite iteVar) {
        super(new ContextThemeWrapper(ffVar, (int) R.style.MapsActivityTimelineTheme), ffVar, cqhwVar, dehqVar, cjqyVar, bvjjVar, iteVar);
        this.a = answVar;
    }

    @Override // defpackage.iui, defpackage.cqqh, defpackage.cqie
    protected final void a(List<cqkv> list) {
        list.add(new ansx(this.a));
        super.a(list);
    }
}
