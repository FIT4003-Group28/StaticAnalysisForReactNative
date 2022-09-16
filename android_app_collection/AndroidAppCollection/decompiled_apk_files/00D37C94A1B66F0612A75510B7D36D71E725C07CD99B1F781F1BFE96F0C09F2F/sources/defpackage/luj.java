package defpackage;

import android.app.Activity;
import android.view.MenuItem;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: luj  reason: default package */
/* loaded from: classes3.dex */
public final class luj implements fry {
    private final Activity a;
    private final amqo b;
    private final eyj c;

    public luj(Activity activity, eyj eyjVar, amqo amqoVar) {
        this.a = activity;
        eyjVar.getClass();
        this.c = eyjVar;
        this.b = amqoVar;
    }

    @Override // defpackage.fry
    public final int g() {
        return R.id.menu_help;
    }

    @Override // defpackage.fry
    public final int h() {
        return R.menu.menu_help;
    }

    @Override // defpackage.fry
    public final frx i() {
        return null;
    }

    @Override // defpackage.fry
    public final void j(MenuItem menuItem) {
    }

    @Override // defpackage.fry
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.fry
    public final boolean l() {
        return true;
    }

    @Override // defpackage.fry
    public final boolean m() {
        this.c.a(this.a, (String) this.b.get());
        return true;
    }
}
