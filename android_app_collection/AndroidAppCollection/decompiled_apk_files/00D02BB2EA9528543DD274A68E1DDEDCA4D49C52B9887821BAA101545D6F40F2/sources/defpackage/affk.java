package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: affk  reason: default package */
/* loaded from: classes.dex */
public class affk implements affr {
    public final Context h;

    /* JADX WARN: Type inference failed for: r4v4, types: [affj] */
    public affk(Context context) {
        dbsk.s(context);
        this.h = context;
        boolean z = false;
        dbsk.m(affq.a == null, "setIncognitoController() may only be called once.");
        affq.a = this;
        ?? r4 = new Object() { // from class: affj
        };
        dbsk.m(btlu.l == null ? true : z, "setContextProvider() may only be called once.");
        btlu.l = r4;
    }

    @Override // defpackage.afec
    public boolean a() {
        SharedPreferences sharedPreferences = this.h.getSharedPreferences(bvjj.a, 0);
        return sharedPreferences.getBoolean(bvjk.m.toString(), false) && !dbsj.d(sharedPreferences.getString(bvjk.p.toString(), null));
    }

    @Override // defpackage.affr
    public String b() {
        SharedPreferences sharedPreferences = this.h.getSharedPreferences(bvjj.a, 0);
        if (sharedPreferences.getBoolean(bvjk.m.toString(), false)) {
            String string = sharedPreferences.getString(bvjk.p.toString(), null);
            dbsk.m(!dbsj.d(string), "INCOGNITO_ACCOUNT_ID must be non-empty if INCOGNITO_STATE is true!");
            dbsk.s(string);
            return string;
        }
        throw new UnsupportedOperationException("getIncognitoAccountId() only allowed when isIncognito().");
    }

    @Override // defpackage.affr
    public boolean c() {
        return false;
    }

    @Override // defpackage.affr
    public boolean d() {
        return false;
    }

    @Override // defpackage.affr
    public Context e(Context context) {
        return context;
    }
}
