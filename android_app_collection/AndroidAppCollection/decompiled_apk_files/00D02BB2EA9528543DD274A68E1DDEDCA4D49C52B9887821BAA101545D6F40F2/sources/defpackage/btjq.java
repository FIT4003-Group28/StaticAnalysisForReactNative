package defpackage;

import android.content.Context;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceGroup;
/* compiled from: PG */
/* renamed from: btjq  reason: default package */
/* loaded from: classes4.dex */
public final class btjq {
    public final PreferenceCategory a;
    public boolean b = false;
    private final btrm c;
    private final dcdc<btjs> d;

    public btjq(Context context, btrm btrmVar, int i, dcdc<btjs> dcdcVar) {
        this.c = btrmVar;
        this.d = dcdcVar;
        btjp btjpVar = new btjp(context);
        this.a = btjpVar;
        btjpVar.t(i);
        ((PreferenceGroup) btjpVar).c = false;
    }

    public final void a(PreferenceGroup preferenceGroup) {
        preferenceGroup.aj(this.a);
        dcdc<btjs> dcdcVar = this.d;
        int size = dcdcVar.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            btjs btjsVar = dcdcVar.get(i);
            int i3 = i2 + 1;
            btjsVar.b().r(i2);
            PreferenceGroup preferenceGroup2 = btjsVar.b().B;
            if (preferenceGroup2 != null) {
                preferenceGroup2.ak(btjsVar.b());
            }
            btjsVar.a(this.a);
            i++;
            i2 = i3;
        }
    }

    public final void b() {
        dcdc<btjs> dcdcVar = this.d;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            btjs btjsVar = dcdcVar.get(i);
            btjsVar.d(this.c);
            btjsVar.c();
        }
        this.b = true;
    }

    public final void c() {
        dcdc<btjs> dcdcVar = this.d;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dcdcVar.get(i).e(this.c);
        }
        this.b = false;
    }

    public final void d(int i) {
        this.a.r(i);
    }
}
