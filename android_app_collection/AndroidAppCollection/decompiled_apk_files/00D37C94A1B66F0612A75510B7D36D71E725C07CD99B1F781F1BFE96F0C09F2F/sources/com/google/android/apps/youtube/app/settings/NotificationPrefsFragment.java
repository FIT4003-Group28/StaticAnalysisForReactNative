package com.google.android.apps.youtube.app.settings;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.preference.Preference;
import com.google.android.apps.youtube.app.settings.NotificationPrefsFragment;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class NotificationPrefsFragment extends lfk {
    private aypg ae;
    public acth c;
    public akjl d;
    public SettingsDataAccess e;

    private final void aK(CharSequence charSequence) {
        Preference ov = ov(charSequence);
        if (ov != null) {
            o().af(ov);
        }
    }

    @Override // defpackage.dp
    public final void R(Bundle bundle) {
        super.R(bundle);
        this.ae = this.e.g(new Runnable() { // from class: lfx
            @Override // java.lang.Runnable
            public final void run() {
                aurd aurdVar;
                arag aragVar;
                NotificationPrefsFragment notificationPrefsFragment = NotificationPrefsFragment.this;
                if (!notificationPrefsFragment.ap()) {
                    return;
                }
                Iterator it = notificationPrefsFragment.e.i().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        aurdVar = null;
                        break;
                    }
                    Object next = it.next();
                    if (next instanceof aurd) {
                        aurdVar = (aurd) next;
                        break;
                    }
                }
                if (aurdVar == null) {
                    return;
                }
                dt mJ = notificationPrefsFragment.mJ();
                if ((aurdVar.b & 1) != 0) {
                    aragVar = aurdVar.c;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                } else {
                    aragVar = null;
                }
                mJ.setTitle(ajgl.b(aragVar));
                notificationPrefsFragment.d.d(notificationPrefsFragment, aurdVar.d);
                notificationPrefsFragment.s(null);
            }
        });
    }

    @Override // defpackage.dp
    public final void U() {
        azof.f((AtomicReference) this.ae);
        super.U();
        aK("daily_digest_notification_preference");
        aK("quiet_hours_notification_preference");
    }

    @Override // defpackage.bjr
    public final void aG() {
        this.a.g("youtube");
        this.c.oi().d(acuo.a(57173), null, null);
    }

    @Override // defpackage.bjr
    public final RecyclerView n(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView n = super.n(layoutInflater, viewGroup, bundle);
        n.af(null);
        return n;
    }
}
