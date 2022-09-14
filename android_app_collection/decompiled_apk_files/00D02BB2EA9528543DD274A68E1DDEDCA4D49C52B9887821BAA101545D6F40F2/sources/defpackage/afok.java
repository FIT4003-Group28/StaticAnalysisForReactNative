package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Map;
/* compiled from: PG */
/* renamed from: afok  reason: default package */
/* loaded from: classes2.dex */
public final class afok extends itb {
    private final Activity b;
    public final Map<String, afom> a = dcjz.h();
    private SharedPreferences c = null;

    public afok(Activity activity) {
        this.b = activity;
    }

    private final void e() {
        if (this.c == null) {
            this.c = PreferenceManager.getDefaultSharedPreferences(this.b);
        }
        if (!w()) {
            return;
        }
        for (afom afomVar : this.a.values()) {
            afomVar.c();
        }
    }

    @Override // defpackage.itb
    public final void Ns() {
        super.Ns();
        e();
    }

    @Override // defpackage.itb
    public final void Nt() {
        super.Nt();
        e();
    }

    @Override // defpackage.itb
    public final void Nu() {
        this.a.clear();
        super.Nu();
    }
}
