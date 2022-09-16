package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: abge  reason: default package */
/* loaded from: classes.dex */
abstract class abge implements afzs {
    private final SharedPreferences a;
    private final azqb b;

    /* JADX INFO: Access modifiers changed from: protected */
    public abge(SharedPreferences sharedPreferences, azqb azqbVar) {
        this.b = azqbVar;
        this.a = sharedPreferences;
    }

    @Override // defpackage.afzs
    public final void a(String str) {
        if (this.a.getString("visitor_id", null) == null && !str.contains("visitor_id")) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(asgd asgdVar) {
        arpa arpaVar = asgdVar.b;
        if (arpaVar == null) {
            arpaVar = arpa.a;
        }
        String str = arpaVar.c;
        if (!TextUtils.isEmpty(str)) {
            this.a.edit().putString("visitor_id", str).apply();
        }
    }

    protected abstract void c();

    public final void d(int i) {
        aopa createBuilder = apnj.a.createBuilder();
        createBuilder.copyOnWrite();
        apnj apnjVar = (apnj) createBuilder.instance;
        apnjVar.c = i - 1;
        apnjVar.b |= 1;
        arrf a = arrh.a();
        a.copyOnWrite();
        ((arrh) a.instance).cd((apnj) createBuilder.mo39build());
        ((acrq) this.b.get()).a((arrh) a.mo39build());
    }
}
