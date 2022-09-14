package b.a.a.a.a.f;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import b.a.a.a.i;
/* compiled from: PreferenceStoreImpl.java */
/* loaded from: classes.dex */
public class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f1191a;

    /* renamed from: b  reason: collision with root package name */
    private final String f1192b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f1193c;

    public d(Context context, String str) {
        if (context == null) {
            throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
        }
        this.f1193c = context;
        this.f1192b = str;
        this.f1191a = this.f1193c.getSharedPreferences(this.f1192b, 0);
    }

    @Deprecated
    public d(i iVar) {
        this(iVar.getContext(), iVar.getClass().getName());
    }

    @Override // b.a.a.a.a.f.c
    public SharedPreferences a() {
        return this.f1191a;
    }

    @Override // b.a.a.a.a.f.c
    public SharedPreferences.Editor b() {
        return this.f1191a.edit();
    }

    @Override // b.a.a.a.a.f.c
    @TargetApi(9)
    public boolean a(SharedPreferences.Editor editor) {
        if (Build.VERSION.SDK_INT >= 9) {
            editor.apply();
            return true;
        }
        return editor.commit();
    }
}
