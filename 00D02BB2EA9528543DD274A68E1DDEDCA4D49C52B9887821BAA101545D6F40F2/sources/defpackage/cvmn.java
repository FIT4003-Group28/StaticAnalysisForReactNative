package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: cvmn  reason: default package */
/* loaded from: classes5.dex */
public final class cvmn implements cvmk {
    private final Context a;
    private final cvjs b;
    private final cvmm c;

    public cvmn(Context context, cvjs cvjsVar, cvmm cvmmVar) {
        this.a = context;
        this.b = cvjsVar;
        this.c = cvmmVar;
    }

    @Override // defpackage.cvmk
    public final synchronized String a() {
        String g;
        czhz.c();
        try {
            g = FirebaseInstanceId.getInstance(cvmo.a(this.a, this.c, this.b)).g(this.b.c(), "");
            if (TextUtils.isEmpty(g)) {
                throw new cvml();
            }
            if (!g.equals(b())) {
                cvlw.a("FirebaseManagerImpl", "New registration ID doesn't match the previously stored one.", new Object[0]);
                this.a.getSharedPreferences("com.google.android.libraries.notifications.GCM", 0).edit().putString("reg_id", g).commit();
            }
        } catch (IOException e) {
            e = e;
            cvlw.f("FirebaseManagerImpl", "Exception during register with IID.", new Object[0]);
            throw new cvml(e);
        } catch (AssertionError e2) {
            e = e2;
            cvlw.f("FirebaseManagerImpl", "Exception during register with IID.", new Object[0]);
            throw new cvml(e);
        } catch (NullPointerException e3) {
            e = e3;
            cvlw.f("FirebaseManagerImpl", "Exception during register with IID.", new Object[0]);
            throw new cvml(e);
        }
        return g;
    }

    @Override // defpackage.cvmk
    public final String b() {
        return this.a.getSharedPreferences("com.google.android.libraries.notifications.GCM", 0).getString("reg_id", null);
    }
}
