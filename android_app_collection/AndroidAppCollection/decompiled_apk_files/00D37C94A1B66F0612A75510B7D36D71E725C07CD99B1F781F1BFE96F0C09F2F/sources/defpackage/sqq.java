package defpackage;

import android.content.Context;
import android.provider.Settings;
/* compiled from: PG */
/* renamed from: sqq  reason: default package */
/* loaded from: classes4.dex */
public final class sqq implements sqh {
    public final Context a;
    private final sqk b;
    private ampq c = amon.a;
    private final Object d = new Object();

    public sqq(Context context, sqk sqkVar) {
        this.a = context;
        this.b = sqkVar;
    }

    @Override // defpackage.sqh
    public final boolean a() {
        boolean booleanValue;
        synchronized (this.d) {
            booleanValue = this.c.h() ? ((Boolean) this.c.c()).booleanValue() : b();
        }
        return booleanValue;
    }

    public final boolean b() {
        boolean z;
        synchronized (this.d) {
            try {
                try {
                    z = true;
                    if (Settings.Global.getInt(this.b.a.getContentResolver(), "multi_cb") != 1) {
                        z = false;
                    }
                    this.c = ampq.j(Boolean.valueOf(z));
                } catch (Settings.SettingNotFoundException unused) {
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
