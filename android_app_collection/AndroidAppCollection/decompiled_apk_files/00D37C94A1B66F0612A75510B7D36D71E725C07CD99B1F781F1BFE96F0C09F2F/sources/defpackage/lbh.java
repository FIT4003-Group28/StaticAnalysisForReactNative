package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: lbh  reason: default package */
/* loaded from: classes3.dex */
public final class lbh extends akhm {
    public final aadd a;
    private final SharedPreferences k;
    private final Context l;
    private final lmr m;

    public lbh(SharedPreferences sharedPreferences, Context context, aadd aaddVar) {
        sharedPreferences.getClass();
        this.k = sharedPreferences;
        this.l = context;
        this.a = aaddVar;
        this.m = new lmr();
    }

    @Override // defpackage.akhm
    public final String a() {
        int m = zew.m(this.l);
        return (m == 3 || m == 4) ? "youtube-android-pb-tablet" : this.d;
    }

    @Override // defpackage.akhm
    public final String b() {
        aupg aupgVar = this.a.a().n;
        if (aupgVar == null) {
            aupgVar = aupg.a;
        }
        return aupgVar.b;
    }

    @Override // defpackage.akhm
    public final boolean c() {
        return !this.e && this.k.getBoolean("dogfood_suggest_send_visitor_id_signed_out", false);
    }

    @Override // defpackage.akhm
    public final boolean d() {
        if (c()) {
            return true;
        }
        return this.g;
    }

    @Override // defpackage.akhm
    public final lmr e() {
        if (c()) {
            return this.m;
        }
        return null;
    }
}
