package defpackage;

import android.util.SparseArray;
/* compiled from: PG */
/* renamed from: lfv  reason: default package */
/* loaded from: classes3.dex */
public final class lfv {
    private final agcp a;
    private final ces b;
    private final afvn c;
    private final SparseArray d;
    private final SparseArray e;

    public lfv(ces cesVar, agcp agcpVar, afvn afvnVar) {
        this.b = cesVar;
        this.a = agcpVar;
        this.c = afvnVar;
        SparseArray sparseArray = new SparseArray();
        this.d = sparseArray;
        this.e = new SparseArray();
        sparseArray.put(20, "video_notifications_enabled");
        sparseArray.put(36, "com.google.android.libraries.youtube.notification.pref.notification_sound_enabled");
    }

    public final String a(int i) {
        String str = (String) this.d.get(i);
        if (str != null) {
            return str;
        }
        String str2 = (String) this.e.get(i);
        if (str2 == null) {
            return null;
        }
        return zhn.q(str2, this.c.c().d());
    }

    public final void b(int i) {
        if (i == 20) {
            agel.b(this.a);
        } else if (i != 9) {
        } else {
            this.b.b();
        }
    }
}
