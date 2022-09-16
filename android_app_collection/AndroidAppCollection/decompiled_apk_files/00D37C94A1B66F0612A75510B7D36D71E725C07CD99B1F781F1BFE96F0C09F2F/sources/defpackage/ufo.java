package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: ufo  reason: default package */
/* loaded from: classes4.dex */
public final class ufo implements ufl {
    private final ufk a;
    private final Context b;
    private final ucj c;

    public ufo(Context context, ucj ucjVar, ufk ufkVar) {
        this.b = context;
        this.c = ucjVar;
        this.a = ufkVar;
    }

    @Override // defpackage.ufl
    public final String a() {
        return this.b.getSharedPreferences("com.google.android.libraries.notifications.GCM", 0).getString("reg_id", null);
    }

    @Override // defpackage.ufl
    public final synchronized String b() {
        String f;
        uwp.e();
        ucj ucjVar = this.c;
        String str = ucjVar.b;
        try {
            f = this.a.b(ufp.a(this.b, this.a, ucjVar)).f(str, "");
            if (TextUtils.isEmpty(f)) {
                throw new ufm();
            }
            if (!f.equals(a())) {
                uev.e("FirebaseManagerImpl", "New registration ID doesn't match the previously stored one.", new Object[0]);
                this.b.getSharedPreferences("com.google.android.libraries.notifications.GCM", 0).edit().putString("reg_id", f).commit();
            }
        } catch (IOException e) {
            e = e;
            uev.g("FirebaseManagerImpl", "Exception during register with IID.", new Object[0]);
            throw new ufm(e);
        } catch (AssertionError e2) {
            e = e2;
            uev.g("FirebaseManagerImpl", "Exception during register with IID.", new Object[0]);
            throw new ufm(e);
        } catch (NullPointerException e3) {
            e = e3;
            uev.g("FirebaseManagerImpl", "Exception during register with IID.", new Object[0]);
            throw new ufm(e);
        }
        return f;
    }
}
