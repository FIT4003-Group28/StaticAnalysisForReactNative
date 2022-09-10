package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Build;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aqrk  reason: default package */
/* loaded from: classes2.dex */
public final class aqrk {
    public final aqck a;
    private final Activity b;
    private final apyx c;
    private final apzy d;
    private final dxio<auhi> e;
    private final dxio<afha> f;
    private final int g;

    public aqrk(Activity activity, apyx apyxVar, apzy apzyVar, aqcl aqclVar, dxio<auhi> dxioVar, dxio<afha> dxioVar2, aujb aujbVar) {
        this.b = activity;
        this.c = apyxVar;
        this.d = apzyVar;
        this.a = aqclVar.a(aujbVar);
        this.e = dxioVar;
        this.f = dxioVar2;
        this.g = aujbVar.a;
    }

    private final boolean g() {
        return this.c.b() && this.g == dpyv.BUSINESS_MESSAGE_FROM_CUSTOMER.dm;
    }

    public final boolean a() {
        return f() != aqcj.ENABLED;
    }

    public final String b() {
        int i = true != g() ? R.string.MESSAGING_ENABLE_NOTIFICATIONS_STATUS_BAR_CONTENT : R.string.MESSAGING_ENABLE_NOTIFICATIONS_STATUS_BAR_CONTENT_MERCHANT;
        if (aqck.b(f())) {
            if (aqck.c()) {
                i = true != g() ? R.string.MESSAGING_ENABLE_NOTIFICATIONS_STATUS_BAR_CONTENT_SETTINGS_INTENT : R.string.MESSAGING_ENABLE_NOTIFICATIONS_STATUS_BAR_CONTENT_SETTINGS_INTENT_MERCHANT;
            } else {
                i = true != g() ? R.string.MESSAGING_ENABLE_NOTIFICATIONS_STATUS_BAR_CONTENT_SETTINGS_LEARN_MORE : R.string.MESSAGING_ENABLE_NOTIFICATIONS_STATUS_BAR_CONTENT_SETTINGS_LEARN_MORE_MERCHANT;
            }
        }
        return this.b.getString(i);
    }

    public final String c() {
        return this.b.getString(aqck.b(f()) ? true != aqck.c() ? R.string.LEARN_MORE : R.string.MESSAGING_ENABLE_NOTIFICATIONS_STATUS_BAR_ACTION_SETTINGS_INTENT : R.string.MESSAGING_ENABLE_NOTIFICATIONS_STATUS_BAR_ACTION);
    }

    public final boolean d() {
        Intent a;
        if (aqck.b(f()) && aqck.c()) {
            if (f() == aqcj.DISABLED_CHANNEL) {
                String b = this.a.a.a().b(0);
                if (dbsj.d(b)) {
                    return false;
                }
                a = ause.b(this.b, b);
            } else {
                a = ause.a(this.b);
            }
            dbsk.l(this.f.a().s());
            dehn<Boolean> f = this.f.a().f(this.b, a, 4);
            if (f.isDone() && ((Boolean) deha.s(f)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        String string;
        if (!aqck.b(f()) || Build.VERSION.SDK_INT >= 26 || !this.d.g()) {
            return false;
        }
        AlertDialog.Builder title = new AlertDialog.Builder(this.b).setTitle(this.b.getString(R.string.MESSAGING_ENABLE_NOTIFICATIONS_STATUS_BAR_LEARN_MORE_DIALOG_TITLE));
        if (Build.VERSION.SDK_INT >= 24) {
            string = this.b.getString(true != g() ? R.string.MESSAGING_ENABLE_NOTIFICATIONS_STATUS_BAR_LEARN_MORE_DIALOG_MESSAGE_N : R.string.MESSAGING_ENABLE_NOTIFICATIONS_STATUS_BAR_LEARN_MORE_DIALOG_MESSAGE_N_MERCHANT);
        } else if (Build.VERSION.SDK_INT >= 23) {
            string = this.b.getString(true != g() ? R.string.MESSAGING_ENABLE_NOTIFICATIONS_STATUS_BAR_LEARN_MORE_DIALOG_MESSAGE_M : R.string.MESSAGING_ENABLE_NOTIFICATIONS_STATUS_BAR_LEARN_MORE_DIALOG_MESSAGE_M_MERCHANT);
        } else {
            string = this.b.getString(true != g() ? R.string.MESSAGING_ENABLE_NOTIFICATIONS_STATUS_BAR_LEARN_MORE_DIALOG_MESSAGE_L : R.string.MESSAGING_ENABLE_NOTIFICATIONS_STATUS_BAR_LEARN_MORE_DIALOG_MESSAGE_L_MERCHANT);
        }
        title.setMessage(string).setPositiveButton(R.string.OK_BUTTON, aqrj.a).show();
        return true;
    }

    public final aqcj f() {
        aqcj a = this.a.a();
        if (!aqck.b(a) || aqck.c()) {
            return a;
        }
        if (Build.VERSION.SDK_INT < 26 && this.d.g()) {
            return a;
        }
        if (this.e.a().t(this.g) == aufs.ENABLED) {
            return aqcj.ENABLED;
        }
        return aqcj.DISABLED_IN_APP;
    }
}
