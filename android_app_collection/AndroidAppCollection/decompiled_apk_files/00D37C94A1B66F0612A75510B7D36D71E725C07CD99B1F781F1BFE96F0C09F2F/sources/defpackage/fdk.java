package defpackage;

import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: fdk  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fdk implements yuy {
    public final /* synthetic */ SharedPreferences a;
    private final /* synthetic */ int b;

    public /* synthetic */ fdk(SharedPreferences sharedPreferences, int i) {
        this.b = i;
        this.a = sharedPreferences;
    }

    @Override // defpackage.yuy
    public final Object a(Object obj, Object obj2) {
        int i = this.b;
        if (i == 0) {
            return Long.valueOf(this.a.getLong((String) obj, ((Long) obj2).longValue()));
        } else if (i == 1) {
            return Boolean.valueOf(this.a.getBoolean((String) obj, ((Boolean) obj2).booleanValue()));
        } else {
            return this.a.getString((String) obj, (String) obj2);
        }
    }
}
